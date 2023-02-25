package kr.goldenmine.inumodelloader.inumodelloader.util;

public enum Align {
    LEFT, CENTER, RIGHT;

    public static Align getAlignFromString(String text) {
        switch(text.toLowerCase()) {
            case "0":
            case "left":
            case "start":
            case "l":
                return LEFT;

            case "1":
            case "center":
            case "mid":
            case "middle":
            case "c":
                return CENTER;

            case "2":
            case "right":
            case "end":
            case "r":
                return RIGHT;
        }

        throw new RuntimeException("no align about recevied text: " + text);
    }

    public Align getFliped() {
        switch(this) {
            case LEFT: return RIGHT;
            case RIGHT: return LEFT;
            case CENTER: return CENTER;
        }

        return null;
    }
}
