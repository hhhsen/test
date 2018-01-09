package shopping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo002 {
private final String filePath = "D://1.bin";
	
	public static void main(String[] args){
		Demo002 d = new Demo002();
		d.load();
		d.init();
		d.load();
		
	}
	
	public void init(){
		Scanner scan = new Scanner(System.in);
		List<Order> list = new ArrayList<>();
		while(true){
			System.out.println("产品名称：");
			String productName = scan.next();
		
			System.out.println("价格：");
		
			double price = scan.nextDouble();
	
			System.out.println("数量：");
			int num = scan.nextInt();

			Order order = new Order(productName,price,num);
			list.add(order);
			System.out.println("是否继续录入？Y/N");
			String yesOrNo = scan.next();
			if("N".equals(yesOrNo)){
				break;
			}
		}
		
		save(list);
	}
	
	public void save(List<Order> orderList){
		File file = new File(filePath);
		OutputStream output = null;
		ObjectOutputStream objOutput = null;
		
		try {
			if(!file.exists()){
				file.createNewFile();
			}
			output = new FileOutputStream(file);
			objOutput = new ObjectOutputStream(output);
			objOutput.writeObject(orderList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(objOutput != null){
					objOutput.close();
				}
				if(output != null){
					output.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void load(){
		File file = new File(filePath);
		InputStream input = null;
		ObjectInputStream objInput = null;
		try {
			if(!file.exists()){
				System.out.println("=====无购买记录======");
				return;
			}
			input = new FileInputStream(file);
			objInput = new ObjectInputStream(input);
			List<Order> orderList = (List<Order>)objInput.readObject();
			double allPrice = 0;
			for(Order order : orderList){
				System.out.println("名称："+order.getProductName()+",价格："+order.getPrice()+",数量："+order.getNum());
				allPrice += (order.getPrice()*order.getNum());
			}
			System.out.println("总价格为："+allPrice);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(objInput != null){
					objInput.close();
				}
				if(input != null){
					input.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}
}
