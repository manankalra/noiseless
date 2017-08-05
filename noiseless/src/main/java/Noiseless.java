/**
 * Noiseless
 * @author manankalra
 */

import ie.corballis.sox.WrongParametersException;

import java.io.IOException;

public class Noiseless{
    public static void main(String... args) throws WrongParametersException, IOException {
        Effect effect = new Effect();
        effect.reduceNoise("input.wav", "reduced.wav");
        effect.gain("reduced.wav", "output.wav");
    }
}


// sox input.wav -n noiseprof noise.prof
// sox input.wav reduced.wav noisered noise.prof 0.5
// sox reduced.wav output.wav gain 10