import com.sun.security.jgss.GSSUtil;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringDuplicatorTest {


    StringDuplicator SUT;

    @Before
    public void setUp(){
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned()throws Exception{
        String result = SUT.duplicator("");
        assertThat(result,is(""));
    }

    @Test
    public void duplicate_singleCharacter_doubleCharacterReturned()throws Exception{
        String result = SUT.duplicator("D");
        assertThat(result,is("DD"));
    }

    @Test
    public void duplicate_fullString_duplicateStringReturned(){
        String result = SUT.duplicator("Darnell");
        assertThat(result,is("DarnellDarnell"));
    }
}