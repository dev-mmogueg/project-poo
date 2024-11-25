package org.avejorros.graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

import javax.sound.sampled.Clip;

public class Assets {

	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 57;

	public static BufferedImage player;
	public static BufferedImage doubleGunPlayer;

	/* ---- EFFECTS ---- */
	public static BufferedImage speed;
	public static BufferedImage[] shieldEffect = new BufferedImage[3];

	/* ---- EXPLOSICION ---- */
	public static BufferedImage[] exp = new BufferedImage[9];

	/* ---- LASERS ---- */
	public static BufferedImage blueLaser, greenLaser, redLaser;

	/* ---- METEORS ---- */
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];

	/* ---- UFO ---- */
	public static BufferedImage ufo;

	/* ---- NUMBERS ---- */
	public static BufferedImage[] numbers = new BufferedImage[11];
	public static BufferedImage life;

	/* ---- FONTS ---- */
	public static Font fontBig;
	public static Font fontMed;

	/* ---- MUSIC ---- */
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, ufoShoot, powerUp;

	/* ---- UI ---- */
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;

	/* ---- POWER UPS ---- */
	public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;

	public static void init() {
		player = loadImage("src/org/avejorros/res/ships/player.png");
		doubleGunPlayer = loadImage("src/org/avejorros/res/ships/doubleGunPlayer.png");
		speed = loadImage("src/org/avejorros/res/effects/fire08.png");
		blueLaser = loadImage("src/org/avejorros/res/lasers/laserBlue01.png");
		greenLaser = loadImage("src/org/avejorros/res/lasers/laserGreen11.png");
		redLaser = loadImage("src/org/avejorros/res/lasers/laserRed01.png");
		ufo = loadImage("src/org/avejorros/res/ships/ufo.png");
		life = loadImage("src/org/avejorros/res/others/life.png");
		fontBig = loadFont("src/org/avejorros/res/fonts/futureFont.ttf", 42);
		fontMed = loadFont("src/org/avejorros/res/fonts/futureFont.ttf", 20);

		for (int i = 0; i < 3; i++)
			shieldEffect[i] = loadImage("src/org/avejorros/res/effects/shield" + (i + 1) + ".png");

		for (int i = 0; i < bigs.length; i++)
			bigs[i] = loadImage("src/org/avejorros/res/meteors/big" + (i + 1) + ".png");

		for (int i = 0; i < meds.length; i++)
			meds[i] = loadImage("src/org/avejorros/res/meteors/med" + (i + 1) + ".png");

		for (int i = 0; i < smalls.length; i++)
			smalls[i] = loadImage("src/org/avejorros/res/meteors/small" + (i + 1) + ".png");

		for (int i = 0; i < tinies.length; i++)
			tinies[i] = loadImage("src/org/avejorros/res/meteors/tiny" + (i + 1) + ".png");

		for (int i = 0; i < exp.length; i++)
			exp[i] = loadImage("src/org/avejorros/res/explosion/" + i + ".png");

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = loadImage("src/org/avejorros/res/numbers/" + i + ".png");

		backgroundMusic = loadSound("src/org/avejorros/res/sounds/backgroundMusic.wav");
		explosion = loadSound("src/org/avejorros/res/sounds/explosion.wav");
		playerLoose = loadSound("src/org/avejorros/res/sounds/playerLoose.wav");
		playerShoot = loadSound("src/org/avejorros/res/sounds/playerShoot.wav");
		ufoShoot = loadSound("src/org/avejorros/res/sounds/ufoShoot.wav");
		powerUp = loadSound("src/org/avejorros/res/sounds/powerUp.wav");

		greyBtn = loadImage("src/org/avejorros/res/ui/grey_button.png");
		blueBtn = loadImage("src/org/avejorros/res/ui/blue_button.png");

		orb = loadImage("src/org/avejorros/res/powers/orb.png");
		doubleScore = loadImage("src/org/avejorros/res/powers/doubleScore.png");
		doubleGun = loadImage("src/org/avejorros/res/powers/doubleGun.png");
		fastFire = loadImage("src/org/avejorros/res/powers/fastFire.png");
		star = loadImage("src/org/avejorros/res/powers/star.png");
		shield = loadImage("src/org/avejorros/res/powers/shield.png");

		loaded = true;
	}

	public static BufferedImage loadImage(String path) {
		count++;
		return Loader.ImageLoader(path);
	}

	public static Font loadFont(String path, int size) {
		count++;
		return Loader.loadFont(path, size);
	}

	public static Clip loadSound(String path) {
		count++;
		return Loader.loadSound(path);
	}

}
