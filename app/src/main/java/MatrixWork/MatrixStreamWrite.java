package MatrixWork;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MatrixStreamWrite {
    public void setMatrixStream(String str)
    {
        String text = str; // строка для записи
        try (FileOutputStream out = new FileOutputStream("matrix_stream.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
