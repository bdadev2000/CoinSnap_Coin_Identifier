package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public enum rkt {
    NO_WRAP(0, "nowrap"),
    WRAP(1, "wrap"),
    WRAP_REVERSE(2, "wrap_reverse");

    private final int AlY;
    private final String wN;

    rkt(int i10, String str) {
        this.AlY = i10;
        this.wN = str;
    }

    public int YFl() {
        return this.AlY;
    }

    public static rkt YFl(int i10) {
        if (i10 == 0) {
            return NO_WRAP;
        }
        if (i10 == 1) {
            return WRAP;
        }
        if (i10 == 2) {
            return WRAP_REVERSE;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static rkt YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c10 = 1;
                    break;
                }
                break;
            case 491642861:
                if (str.equals("wrap_reverse")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return NO_WRAP;
            case 1:
                return WRAP;
            case 2:
                return WRAP_REVERSE;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
