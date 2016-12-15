package common.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	
	/**
     * Gets all files under the path. 
     *
     * @return  all files which take path mapped file as parent file or the file
     * 			that the path mapped itself. the return object is the same as argument
     * 			files.
     */
	public static List<File> getAllNormalFile(String fileAbsolutePath, List<File> files) {
	
		File rootFile = new File(fileAbsolutePath);
		if(rootFile.exists() && rootFile.isDirectory()){
			File[] fs = rootFile.listFiles();
			for(File f : fs){
				if(f.isFile()){
					files.add(f);
				}else{
					String childPath = f.getAbsolutePath();
					getAllNormalFile(childPath, files);
				}
			}
		}else if(rootFile.exists() && rootFile.isFile()){
			files.add(rootFile);
		}else {
			String msg = "the argument path not mapped a exists file";
			throw new IllegalArgumentException(msg);
		}
		return files;
	}
	
	public static List<File> getAllDirectory(String path, List<File> files){
		
		if(files == null){
			String msg = "the argument files is null";
			throw new IllegalArgumentException(msg);
		}
		
		File rootFile = new File(path);
		if(rootFile.exists() && rootFile.isDirectory()){
			File[] fs = rootFile.listFiles();
			for(File f : fs){
				if(f.isDirectory()){
					files.add(f);
					String childPath = f.getAbsolutePath();
					getAllDirectory(childPath, files);
				}
			}
		}else if(!rootFile.exists() || !rootFile.isFile()){
			String msg = "the argument path is a file but not a directory : " + path;
			throw new IllegalArgumentException(msg);
		}
		return files;
		
	}
	
	public static void main(String[] args){
		List<File> fList = new ArrayList<File>();
		List<File> fs = getAllNormalFile("C:\\Test\\GZ", fList);
		for(File f : fs){
			System.out.println(f);
		}
	}

}
