package com.java.test;

import java.io.File;

/**
 * @author qkliang 
 * @see ������������ʱ����ĳ��Ŀ¼�µ��ļ�����
 * 
 * */

public class UpdateFileName {

	public static void main(String[] args) {		
		System.out.println(System.currentTimeMillis());		
		String url = "";
		url = "D:\\Users\\liangqiankun\\Desktop\\20310208";
		File file = new File(url);
		if (file.exists() && file.isDirectory()) {
			File[] childFiles = file.listFiles();
			String path = file.getAbsolutePath();
			for (File childFile : childFiles) {
				if (childFile.isFile()) {
					String oldName = childFile.getName();
					String newName = oldName.replace("20180621.dat", "20321009.dat");
					childFile.renameTo(new File(path + "\\" + newName));
				}
			}
		}
		System.out.println("���ĳɹ�");

	}
}
