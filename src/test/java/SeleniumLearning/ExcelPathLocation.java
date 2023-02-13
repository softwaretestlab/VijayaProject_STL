package SeleniumLearning;

import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;

public class ExcelPathLocation {
    @Test
    public void pathlocs() throws IOException {
        System.out.println("C:\\Users\\softw\\IdeaProjects\\PrasadProject_STL\\src\\main\\java\\Resources\\TestDataHN1.xlsx");
        System.out.println(System.getProperty("user.dir")+ ReadPropertiesFile.PropFile("ExcelLocation"));

    }

}