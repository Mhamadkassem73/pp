package file;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.io.File;
public class FichierTxt {
public static void main(String [] args){
try{
	String filename="C:\\Users\\Lenovo\\Desktop\\gagsag.txt";
File ff=new File(filename); // d�finir l'arborescence
//ff.createNewFile();
FileWriter ffw=new FileWriter(ff,true);
File(new File(filename).toPath(), Charset.defaultCharset());

 
ffw.write("ffw ");  // �crire une ligne dans le fichier resultat.txt
ffw.write("\n"); // forcer le passage � la ligne
ffw.close(); // fermer le fichier � la fin des traitements
} catch (Exception e) {}
}

private static void File(Path path, Charset defaultCharset) {
	// TODO Auto-generated method stub
	
}
}