import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
public class BasicFileAttributesSample {

    //представляем пример приложения, которое извлекает BasicFileAttributesиз файла и выводит различные
    // метаданные о файле:
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Kosty\\OCP8BufferedReader\\src\\Zoo.csv");
        BasicFileAttributes data = Files.readAttributes(path,
                BasicFileAttributes.class);
        System.out.println("Is path a directory? "+data.isDirectory());
        System.out.println("Is path a regular file? "+data.isRegularFile());
        System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
        System.out.println("Path not a file, directory, nor symbolic link? "+    data.isOther());

        System.out.println("Size (in bytes): "+data.size());

        System.out.println("Creation date/time: "+data.creationTime());
        System.out.println("Last modified date/time: "+data.lastModifiedTime());
        System.out.println("Last accessed date/time: "+data.lastAccessTime());
        System.out.println("Unique file identifier (if available): "+          data.fileKey());

        //Вывод
        // Is path a directory? false
        //Is path a regular file? true
        //Is path a symbolic link? false
        //Path not a file, directory, nor symbolic link? false
        //Size (in bytes): 18
        //Creation date/time: 2020-10-12T14:00:07.695746Z
        //Last modified date/time: 2020-10-12T14:00:52.005769Z
        //Last accessed date/time: 2020-10-12T14:00:52.005769Z
        //Unique file identifier (if available): null

        //Большинство из этих атрибутов должны быть вам знакомы,
        // так как они были рассмотрены в предыдущем разделе этой главы. Только те ,
        // которые являются новыми являются isOther(), lastAccessTime(), creationTime(), и fileKey().
        // Этот isOther()метод используется для проверки путей, которые не являются файлами,
        // каталогами или символическими ссылками, например путей, которые ссылаются на ресурсы или устройства
        // в некоторых файловых системах. lastAccessTime()И creationTime()методы возвращают другую дату /
        // время информации о файле. fileKey()Метод возвращает значение системного файла ,
        // который представляет собой уникальный идентификатор файла в файловой системе или ,
        // nullесли он не поддерживается файловой системой.
    }
}
