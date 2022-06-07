package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.ComponentScanConfig;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.util.UserInputService;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDAO studentDao = context.getBean(StudentDAO.class);
        UserInputService userInputService = context.getBean(UserInputService.class);



    }
}
