/**
 * Effect
 * @author manankalra
 */

import ie.corballis.sox.Sox;
import ie.corballis.sox.WrongParametersException;

import java.io.IOException;

/**
 * SoX can be used to invoke  a  number of audio ‘effects’.Applying  multiple  effects  in  real-time  (i.e.  when
 * playingaudio) is likely to require a high performance computer
 */

public class Effect {

    public Sox sox = new Sox("/home/manankalra/sox-14.4.2/src/sox");

    public void reduceNoise(String inputFile, String outputFile) throws WrongParametersException, IOException{
        sox.inputFile(inputFile).argument("-n", "noiseprof").outputFile("noise.prof").execute();
        sox.inputFile(inputFile).outputFile(outputFile).argument("noisered", "noise.prof", "0.5").execute();
    }

    public void gain(String inputFile, String outputFile) throws WrongParametersException, IOException{
        sox.inputFile(inputFile).outputFile(outputFile).argument("gain", "10").execute();
    }

    public void contrast(String inputFile, String outputFile) throws WrongParametersException, IOException{
        sox.inputFile(inputFile).outputFile(outputFile).argument("contrast", "50");
    }
}
