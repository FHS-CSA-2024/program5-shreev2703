public class Program5 {
    public static void main(String[] args) {
        // Declare variables for each vehicle
        int royaleMiles = 286;
        int royaleGallons = 9;
        int koopaKingMiles = 412;
        int koopaKingGallons = 40;
        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        
        // Calculate miles per gallon for each vehicle
        double royaleMPG = (double) royaleMiles / royaleGallons;
        double koopaKingMPG = (double) koopaKingMiles / koopaKingGallons;
        double pipeFrameMPG = (double) pipeFrameMiles / pipeFrameGallons;
        double badwagonMPG = (double) badwagonMiles / badwagonGallons;
        
        // Multiply by 10 to prepare for rounding
        royaleMPG = royaleMPG * 10;
        koopaKingMPG = koopaKingMPG * 10;
        pipeFrameMPG = pipeFrameMPG * 10;
        badwagonMPG = badwagonMPG * 10;
        
        // Round to the nearest whole number
        royaleMPG = ((int) (royaleMPG + 0.5));
        koopaKingMPG = ((int) (koopaKingMPG + 0.5));
        pipeFrameMPG = ((int) (pipeFrameMPG + 0.5));
        badwagonMPG = ((int) (badwagonMPG + 0.5));
        
        // Divide by 10 to get the final MPG rounded to the nearest 10th
        royaleMPG = royaleMPG / 10;
        koopaKingMPG = koopaKingMPG / 10;
        pipeFrameMPG = pipeFrameMPG / 10;
        badwagonMPG = badwagonMPG / 10;
        
        // Print out the results
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + royaleMPG + " m/g");
        System.out.println("Koopa King averaged " + koopaKingMPG + " m/g");
        System.out.println("Pipe Frame averaged " + pipeFrameMPG + " m/g");
        System.out.println("Badwagon averaged " + badwagonMPG + " m/g");
    }
}
