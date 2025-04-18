package com.bytedance.sdk.openadsdk.core.YoT.tN;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AlY {
    public static final List<String> YFl = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);

    public static double YFl(int i10, double d10, int i11, int i12, int i13, @Nullable String str) {
        double YFl2 = YFl(i10, d10, i11, i12);
        return (1.0d / ((YFl2 + 1.0d) + YFl(i13))) * YFl(str);
    }

    private static double YFl(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? i11 / i12 : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double YFl(int i10) {
        int max = Math.max(i10, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f);
        }
        return 0.0d;
    }

    private static double YFl(String str) {
        char c10;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals(MimeTypes.VIDEO_H263)) {
                c10 = 1;
            }
            c10 = 65535;
        }
        return c10 != 0 ? 1.0d : 1.5d;
    }
}
