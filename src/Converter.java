import java.io.UnsupportedEncodingException;

public class Converter {

    //convert a ISO-8859-1 to UTF
    public static String isoToUTF(String iso_word) throws UnsupportedEncodingException {

        byte input_iso_word[] = iso_word.getBytes("ISO-8859-1");
        String outout_utf_word = new String(input_iso_word, "UTF-8");
        return outout_utf_word;
    }
    //convert UTF-8 to ISO-8859-1
    public static String utfToiso(String utf_word) throws UnsupportedEncodingException {

        byte inout_utf_word_[] = utf_word.getBytes("UTF-8");
        String output_iso_word = new String(inout_utf_word_, "ISO-8859-1");
        return output_iso_word;

    }
}
