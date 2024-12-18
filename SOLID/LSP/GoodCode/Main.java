public class Main {

    public static void readAnyFile(ReadableFile file){
        file.read();
    }

    public static void main(){
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WriteableFile writeableFile = new WritableFile();
        writeableFile.read();
        writeableFile.write();

        readAnyFile(readableFile);
        readAnyFile(writeableFile);
    }
}