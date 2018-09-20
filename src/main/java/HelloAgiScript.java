import org.asteriskjava.fastagi.*;

public class HelloAgiScript extends BaseAgiScript {

    @Override
    public void service(AgiRequest request, AgiChannel channel) throws AgiException {

        answer();

        streamFile("welcome");
        streamFile("tt-monkeys");

        hangup();

    }

}