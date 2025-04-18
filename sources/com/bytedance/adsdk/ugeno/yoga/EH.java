package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum EH {
    STATIC(0, "static"),
    RELATIVE(1, "relative"),
    ABSOLUTE(2, "absolute");

    private final int AlY;
    private final String wN;

    EH(int i10, String str) {
        this.AlY = i10;
        this.wN = str;
    }

    public int YFl() {
        return this.AlY;
    }

    public static EH YFl(int i10) {
        if (i10 == 0) {
            return STATIC;
        }
        if (i10 == 1) {
            return RELATIVE;
        }
        if (i10 == 2) {
            return ABSOLUTE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static EH YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    c10 = 0;
                    break;
                }
                break;
            case -554435892:
                if (str.equals("relative")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1728122231:
                if (str.equals("absolute")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return STATIC;
            case 1:
                return RELATIVE;
            case 2:
                return ABSOLUTE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
