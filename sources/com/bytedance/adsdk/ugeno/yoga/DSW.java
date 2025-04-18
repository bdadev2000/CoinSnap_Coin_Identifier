package com.bytedance.adsdk.ugeno.yoga;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public enum DSW {
    FLEX_START(0, "flex_start"),
    CENTER(1, TtmlNode.CENTER),
    FLEX_END(2, "flex_end"),
    SPACE_BETWEEN(3, "space_between"),
    SPACE_AROUND(4, "space_around"),
    SPACE_EVENLY(5, "space_evenly");

    private final int DSW;
    private final String qsH;

    DSW(int i10, String str) {
        this.DSW = i10;
        this.qsH = str;
    }

    public int YFl() {
        return this.DSW;
    }

    public static DSW YFl(int i10) {
        if (i10 == 0) {
            return FLEX_START;
        }
        if (i10 == 1) {
            return CENTER;
        }
        if (i10 == 2) {
            return FLEX_END;
        }
        if (i10 == 3) {
            return SPACE_BETWEEN;
        }
        if (i10 == 4) {
            return SPACE_AROUND;
        }
        if (i10 == 5) {
            return SPACE_EVENLY;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
    }

    public static DSW YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c10 = 1;
                    break;
                }
                break;
            case -814425728:
                if (str.equals("space_evenly")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return CENTER;
            case 1:
                return SPACE_AROUND;
            case 2:
                return SPACE_EVENLY;
            case 3:
                return FLEX_START;
            case 4:
                return SPACE_BETWEEN;
            case 5:
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
