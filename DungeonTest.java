package chap14;
import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DungeonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DugeonGame d = new DugeonGame();
		System.out.println(d.getX() + d.getY() + d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			FileInputStream fis = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (DugeonGame) ois.readObject();
			ois.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(d.getX() + d.getY() + d.getZ());
	}

}
