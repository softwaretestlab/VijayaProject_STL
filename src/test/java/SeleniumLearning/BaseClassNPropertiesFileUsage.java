package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class BaseClassNPropertiesFileUsage {

    @Test
    public void Nav() throws IOException {
        //enter url directly in below code
       // OpenBrowser.NavToWeb("https://www.google.com");
        OpenBrowser.NavToWeb(ReadPropertiesFile.PropFile("googleUrl"));
    }
}
