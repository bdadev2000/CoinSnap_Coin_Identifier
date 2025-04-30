package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.media.MediaFormat;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class MediaFormatUtil {
    private MediaFormatUtil() {
    }

    public static void maybeSetByteBuffer(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void maybeSetColorInfo(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            maybeSetInteger(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            maybeSetInteger(mediaFormat, "color-standard", colorInfo.colorSpace);
            maybeSetInteger(mediaFormat, "color-range", colorInfo.colorRange);
            maybeSetByteBuffer(mediaFormat, "hdr-static-info", colorInfo.hdrStaticInfo);
        }
    }

    public static void maybeSetFloat(MediaFormat mediaFormat, String str, float f9) {
        if (f9 != -1.0f) {
            mediaFormat.setFloat(str, f9);
        }
    }

    public static void maybeSetInteger(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static void setCsdBuffers(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(o.h(i9, "csd-"), ByteBuffer.wrap(list.get(i9)));
        }
    }

    public static void setString(MediaFormat mediaFormat, String str, String str2) {
        mediaFormat.setString(str, str2);
    }
}
