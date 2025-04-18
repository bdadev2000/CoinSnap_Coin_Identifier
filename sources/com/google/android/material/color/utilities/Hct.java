package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes4.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i2) {
        setInternalState(i2);
    }

    public static Hct from(double d, double d2, double d3) {
        return new Hct(HctSolver.solveToInt(d, d2, d3));
    }

    public static Hct fromInt(int i2) {
        return new Hct(i2);
    }

    private void setInternalState(int i2) {
        this.argb = i2;
        Cam16 fromInt = Cam16.fromInt(i2);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i2);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 fromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(fromXyzInViewingConditions.getHue(), fromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(xyzInViewingConditions[1]));
    }

    public void setChroma(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, d, this.tone));
    }

    public void setHue(double d) {
        setInternalState(HctSolver.solveToInt(d, this.chroma, this.tone));
    }

    public void setTone(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d));
    }

    public int toInt() {
        return this.argb;
    }
}
