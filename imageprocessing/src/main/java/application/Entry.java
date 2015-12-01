package application;


import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;

public class Entry {
	
	static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME);}
	public static void main(String[] args) {
		Mat m = new Mat(5,10,CvType.CV_8UC1, new Scalar(0));
		System.out.println("OpenCV mat : "+m.dump());
		
	}

}
