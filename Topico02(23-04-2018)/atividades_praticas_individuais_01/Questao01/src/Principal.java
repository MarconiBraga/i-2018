import java.io.NotSerializableException;
import java.net.Socket;

public class Principal {

    @Test
    public void testNonSerializableArg() throws Exception {
        TestRpcC rpc = mock(TestRpcC.class);

        HekateTestNode client = prepareClientAndServer(rpc).client();

        TestRpcC proxy = client.rpc().clientFor(TestRpcC.class).build();

        repeat(3, i -> {
            RpcException err = expect(RpcException.class, () -> proxy.callC(1, new NonSerializable()));

            String stackTrace = ErrorUtils.stackTrace(err);

            assertTrue(stackTrace, ErrorUtils.isCausedBy(CodecException.class, err));
            assertTrue(stackTrace, stackTrace.contains(NotSerializableException.class.getName()));
            assertTrue(stackTrace, stackTrace.contains(Socket.class.getName()));

            verifyNoMoreInteractions(rpc);
            reset(rpc);
        });
    }
}
