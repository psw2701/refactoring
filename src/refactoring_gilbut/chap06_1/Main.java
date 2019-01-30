package refactoring_gilbut.chap06_1;

import refactoring_gilbut.chap06_1.after.Media;
import refactoring_gilbut.chap06_1.after.Music;
import refactoring_gilbut.chap06_1.after.PlayerAfter;
import refactoring_gilbut.chap06_1.after.Video;
import refactoring_gilbut.chap06_1.before.PlayerBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();
	}

	private static void after() {
		Media music = new Music("좋니");
		Media video = new Video("효리네민박");
		PlayerAfter musicPlayer = new PlayerAfter();
		musicPlayer.setMedia(music);
		PlayerAfter videoPlayer = new PlayerAfter();
		videoPlayer.setMedia(video);
		play(musicPlayer);
		play(videoPlayer);
	}

	private static void play(PlayerAfter player) {
		// TODO Auto-generated method stub
		player.play();
		player.loop();
		player.stop();
	}

	private static void before() {
		PlayerBefore musicPlayer = new PlayerBefore();
		musicPlayer.setCurrentMedia(true);
		PlayerBefore videoPlayer = new PlayerBefore();
		videoPlayer.setCurrentMedia(false);
		play(musicPlayer);
		play(videoPlayer);
	}

	private static void play(PlayerBefore player) {
		// TODO Auto-generated method stub
		player.play();
		player.loop();
		player.stop();
	}

}
