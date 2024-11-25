package org.avejorros.graphics;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Loader {

	public static BufferedImage ImageLoader(String path) {
		Path path_abs = Paths.get(path);
		try {
			return ImageIO.read(path_abs.toFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Font loadFont(String path, int size) {
		try {
			Path path_abs = Paths.get(path);
			return Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(path_abs.toFile())).deriveFont(Font.PLAIN, size);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Clip loadSound(String path) {
		try {
			Clip clip = AudioSystem.getClip();
			Path path_abs = Paths.get(path);
			clip.open(AudioSystem.getAudioInputStream(path_abs.toFile()));
			return clip;
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
		return null;
	}

}
