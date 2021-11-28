import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokans = scanner.nextLine().split("_");
            String type = tokans[0];
            String name = tokans[1];
            String duration = tokans[2];

            Song song = new Song(type, name, duration);
            songs.add(song);
        }
        String type = scanner.nextLine();
        if (type.equals("all")) {
            for (Song song : songs) {
                System.out.println(song);
            }
        }else{
            for (Song song : songs) {
                if (song.getType().equals(type)) {
                    System.out.println(song);
                }
            }
        }
    }

    public static class Song {
        private String type;
        private String name;
        private String duration;

        public Song(String type, String name, String duration) {
            this.type = type;
            this.name = name;
            this.duration = duration;
        }

        public String getType() {
            return this.type;
        }

        public String toString() {
            return this.name;
        }
    }
}
