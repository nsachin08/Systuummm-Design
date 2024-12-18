
public class Main{

    File file = new ReadOnlyFile();
    file.read(); // works fine
    file.write() ; // throwing an exception , violation of LSP.
}