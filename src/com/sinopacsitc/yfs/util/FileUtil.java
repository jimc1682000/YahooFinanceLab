package com.sinopacsitc.yfs.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.commons.io.FileUtils;

public class FileUtil {

	public FileUtil() {
	}

	public static void saveFile(byte[] fileBytes, String savePath) {

	}

	// �p�G�S���ۦP�ɮסA�^��-1�A���ۦP�ɮסA�^�ǸӯS�w��
	public static int checkSameNameFile(String srcFileName, String destFileName) {
		int flag = -1;
		if (srcFileName.equals(destFileName)) {
			flag = 0;
		}
		return flag;
	}

	public static void copyFolder(String srcPath, String destPath)
			throws IOException {
		File srcDir = new File(srcPath);
		File destDir = new File(destPath);
		if (srcDir.exists()) {
			FileUtils.copyDirectory(srcDir, destDir);
		}
	}

	public static void createFile(String filePath, String dataStr)
			throws IOException {
		File f = new File(filePath);
		FileUtils.writeStringToFile(f, dataStr, "UTF-8");
	}

	public static void createFolder(File folder) {
		if (!folder.exists()) {
			// mkdir()�إ߸�Ƨ��ɡA����Ƨ��n�s�b�Amkdirs()�|�@���إߤU�h
			folder.mkdirs();
		} else {
		}
	}

	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		createFolder(folder);
	}

	public static void deleteFile(String filePath) {
		if (filePath != null && !(filePath.isEmpty())) {
			File file = new File(filePath);
			if (file.exists()) {
				file.delete();
			}
		}
	}

	public static void deleteFolder(String path) throws IOException {
		File dir = new File(path);
		if (dir.exists()) {
			FileUtils.deleteDirectory(dir);
		} else {
			// doNothing
		}
	}

	public static void moveFolder(String srcPath, String destPath)
			throws IOException {
		// Copy&Remove Folder/File to fileList
		File srcDir = new File(srcPath);
		File destDir = new File(destPath);
		if (srcDir.exists()) {
			FileUtils.copyDirectory(srcDir, destDir);
			FileUtils.deleteDirectory(srcDir);
		}
	}

	public static void moveParentFolder(String srcPath, String destPath)
			throws IOException {
		// Copy&Remove Folder/File to fileList
		File srcDir = new File(srcPath);
		File srcDirParent = new File(srcDir.getParent());
		File destDir = new File(destPath);
		File destDirParent = new File(destDir.getParent());
		if (srcDirParent.exists()) {
			FileUtils.copyDirectory(srcDirParent, destDirParent);
			FileUtils.deleteDirectory(srcDirParent);
		}
	}

	public static void appendStringToFile(String fileath, String str)
			throws IOException {
		// �`�N�n��java7�H�W��nio���O
		Files.write(
				// ���o���檺���T���k
				// System.getProperty("line.separator").toString()
				Paths.get(fileath), (System.getProperty("line.separator")
						.toString() + str).getBytes(),
				StandardOpenOption.APPEND);

		// Method2 Using FileWriter
		/*
		 * String filename = "D:/testFile2.txt"; FileWriter fw = null; try { fw
		 * = new FileWriter(filename, true); fw.write("add a line" +
		 * System.getProperty("line.separator").toString()); } catch
		 * (IOException e) { e.printStackTrace(); } finally { try { if (fw !=
		 * null) { fw.close(); } } catch (IOException e) { e.printStackTrace();
		 * } }
		 */

		// Method3 Using Apache.FileUtils
		// FileUtils.write(new File("D:/testFile3.txt"), "test", "UTF-8", true);
	}
}
