package com.bytedance.sdk.openadsdk.core.QR.KS;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class jU {
    public static final List<String> zp = Arrays.asList(MimeTypes.VIDEO_MP4, MimeTypes.VIDEO_H263);

    public static double zp(int i9, double d2, int i10, int i11, int i12, @Nullable String str) {
        double zp2 = zp(i9, d2, i10, i11);
        return (1.0d / ((zp2 + 1.0d) + zp(i12))) * zp(str);
    }

    private static double zp(int i9, double d2, int i10, int i11) {
        return (d2 > 0.0d ? Math.abs(d2 - (i11 > 0 ? i10 / i11 : 0.0d)) : 0.0d) + (i9 > 0 ? Math.abs((i9 - i10) / i9) : 0.0d);
    }

    private static double zp(int i9) {
        int max = Math.max(i9, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(1500 - max) / 1500.0f);
        }
        return 0.0d;
    }

    private static double zp(String str) {
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            return (hashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }
}
