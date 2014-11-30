package to2.dice.messaging;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResponseTest {

    @Test
    public void testIsSuccess() throws Exception {
        Response successful = new Response(Response.Type.SUCCESS);
        Response failed = new Response(Response.Type.FAILURE);

        assertTrue("Response with type set to SUCCESS is successful", successful.isSuccess());
        assertFalse("Response with type set to FAILURE is unsuccessful", failed.isSuccess());
    }

    @Test
    public void testConstructors() throws Exception {
        String message = "Successful message";
        Response one = new Response(Response.Type.SUCCESS, message);
        Response two = new Response();
        two.message = message;

        assertTrue("Message is correctly assigned", one.message.equals(two.message));
    }
}