public class Program5 {
    public static void main(String[] args) {
        // Data of the vehicles
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        // Averages calculating
        double royaleAvg = (double) royaleMiles / royaleGallons;
        double koopaKingAvg = (double) koopaKingMiles / koopaKingGallons;
        double pipeFrameAvg = (double) pipeFrameMiles / pipeFrameGallons;
        double badwagonAvg = (double) badwagonMiles / badwagonGallons;
        //Print statements
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + Math.round(royaleAvg * 10.0) / 10.0 + " m/g");
        System.out.println("Koopa King averaged " + Math.round(koopaKingAvg * 10.0) / 10.0 + " m/g");
        System.out.println("Pipe Frame averaged " + Math.round(pipeFrameAvg * 10.0) / 10.0 + " m/g");
        System.out.println("Badwagon averaged " + Math.round(badwagonAvg * 10.0) / 10.0 + " m/g");
    }
}
