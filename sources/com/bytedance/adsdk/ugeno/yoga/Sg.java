package com.bytedance.adsdk.ugeno.yoga;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
public enum Sg {
    AUTO(0, DebugKt.DEBUG_PROPERTY_VALUE_AUTO),
    FLEX_START(1, "flex_start"),
    CENTER(2, TtmlNode.CENTER),
    FLEX_END(3, "flex_end"),
    STRETCH(4, "stretch"),
    BASELINE(5, "baseline"),
    SPACE_BETWEEN(6, "space_between"),
    SPACE_AROUND(7, "space_around");

    private final int NjR;

    /* renamed from: nc, reason: collision with root package name */
    private final String f10299nc;

    Sg(int i10, String str) {
        this.NjR = i10;
        this.f10299nc = str;
    }

    public int YFl() {
        return this.NjR;
    }

    public static Sg YFl(int i10) {
        switch (i10) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
        }
    }

    public static Sg YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 2;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c10 = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return STRETCH;
            case 1:
                return BASELINE;
            case 2:
                return CENTER;
            case 3:
                return SPACE_AROUND;
            case 4:
                return AUTO;
            case 5:
                return FLEX_START;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return FLEX_END;
            default:
                throw new IllegalArgumentException("Unknown enum value: ".concat(str));
        }
    }
}
