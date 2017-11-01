import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo{
    String path();}
@Retention(value = RetentionPolicy.RUNTIME)
    @interface Saver{
    }



@SaveTo(path = "c:\\file.txt")
class TextContainer {
    String file = "text";

    @Saver
    public void save(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.close();

        try {
            fileWriter.write(file);
        } catch (IOException e) {
            fileWriter.close();
        }

    }
}

        public class Container {
    public static void main(String args[]) throws InvocationTargetException, IllegalAccessException {
        TextContainer textContainer = new TextContainer();
        Class<?> aClass = textContainer.getClass();
        if (!aClass.isAnnotationPresent(SaveTo.class)){
            System.out.print("Error");

            return ;
        }
        SaveTo saveTo = aClass.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method:methods){
            if(method.isAnnotationPresent(Saver.class)){
                method.invoke(textContainer, path);
            break;
            }
        }
    System.out.println("Saved");
    }}

