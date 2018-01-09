package file;

import java.io.*;


public class Test3 
{

	public static void main(String[] args) throws IOException 
	{
		String oldPath = "D:\\Test\\2.txt";
		String newPath = "D:\\Test1\\2.txt";
		Test3 fm = new Test3();
		File file = new File(oldPath);		
		//fm.getFileName();        		 	//查询文件夹和文件
		//fm.mkdir(file);           		//创建文件夹
		//fm.createFile(oldPath);   		//创建文件
		//fm.findFile(file);	    		//读取文件内容
		fm.copyFile(oldPath, newPath);		//复制单个文件
	}	
	
	//查询磁盘或文件夹里的子文件夹和子文件
	public void getFileName()
	{
		String path = "D:\\";
		File f = new File(path);
		File fi[] = f.listFiles();
		for(int i = 0;i < fi.length;i++)
		{
			File fil = fi[i];
			if(fil.isDirectory())
			{
				System.out.println(" [目录]" + fil.getName());
			}else 
			{
                System.out.println(" [文件]" + fil.getName());
            }
		}
	}
	
	
	//创建文件夹
	public void mkdir(File file) throws IOException
	{
		if(!file.exists())
		{
			file.mkdirs();
			System.out.println("创建成功");
		}else
		{
			System.out.println("文件夹已存在");
		}
	}
	
	//创建文件
	public boolean createFile(String path)
	{
		boolean flag = false;
		File newF = new File(path);
		if(!newF.exists())
		{
			try
			{
				newF.createNewFile();
			}catch(IOException e)
			{
				e.printStackTrace();
				
			}
			flag = true;
			System.out.println("创建成功");
		}else
		{
			System.out.println("文件已存在");
		}
		return flag;
	}
	
	
	//读取文件内容
	public void findFile(File file) throws IOException
	{
		try
		{
			if(file.isFile() && file.exists())
			{
				String encoding = "gbk";
				InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
				BufferedReader buff =new BufferedReader(read);
				String lineTxt = null;
				while((lineTxt = buff.readLine()) != null)
				{
					System.out.println(lineTxt);
				}
				read.close();
			}else
			{
				System.out.println("找不到文件");
			}
		}catch(Exception e)
		{
			System.out.println("读取失败");
			e.printStackTrace();
		}
	}
	
	
	//复制单个文件
	public void copyFile(String oldPath,String newPath)
	{
		try
		{
			int byteread = 0;
			File oldfile =new File(oldPath);
			if(oldfile.exists())  //文件存在时
			{
				InputStream inStream = new FileInputStream(oldfile);  //读入原文件
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[124];
				while((byteread = inStream.read(buffer)) != -1)
				{
					fs.write(buffer, 0, byteread);
				}
				inStream.close();
				System.out.println("复制成功");
			}else
			{
				System.out.println("文件不存在，复制失败");
			}
		}catch(Exception e)
		{
			System.out.println("复制出错");
			e.printStackTrace();
		}
	}
}
