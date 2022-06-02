package se.lexicon;

public class App
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigFileName.class);

        StudentDao studentDao = context.getBean(StudentDao.class);



    }
}
