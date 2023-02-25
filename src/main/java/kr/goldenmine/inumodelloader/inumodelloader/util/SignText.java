package kr.goldenmine.inumodelloader.inumodelloader.util;

import java.awt.*;

public class SignText {
    private final Point point;
    private final String text;
    private final Align align;
    private final int color;
    private final float multiplier;

    public SignText(Point point, String text, float multiplier, int color, Align align) {
        this.point = point;
        this.text = text;
        this.multiplier = multiplier;
        this.color = color;
        this.align = align;
    }

    public SignText(Point point, String text, float multiplier, Color color, Align align) {
        this(point, text, multiplier, color.getRGB(), align);
    }

    public int getColor() {
        return color;
    }

    public float getMultiplier() {
        return multiplier;
    }

    public Point getPoint() {
        return point;
    }

    public String getText() {
        return text;
    }

    public Align getAlign() {
        return align;
    }

    @Override
    public String toString() {
        return "SignText{" +
                "point=" + point +
                ", text='" + text + '\'' +
                ", align=" + align +
                ", color=" + color +
                ", multiplier=" + multiplier +
                '}';
    }
}
