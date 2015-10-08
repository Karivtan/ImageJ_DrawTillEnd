import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;
import ij.plugin.frame.*;

public class draw_till_end implements PlugIn {
public int Sizeinframes;
public static int t;

	public void run(String arg) {
		ImagePlus imp = IJ.getImage();
		int Sizeinframes = imp.getNSlices();
		for (t=0;t<Sizeinframes;t++){
			IJ.run(imp, "Draw", "slice");
			IJ.run(imp, "Next Slice [>]", "");
		}	
	}

}
