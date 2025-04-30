package com.applovin.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nd {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, p3 p3Var) {
        if (p3Var != null) {
            a(mediaFormat, "color-transfer", p3Var.f9970c);
            a(mediaFormat, "color-standard", p3Var.f9969a);
            a(mediaFormat, "color-range", p3Var.b);
            a(mediaFormat, "hdr-static-info", p3Var.f9971d);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f9) {
        if (f9 != -1.0f) {
            mediaFormat.setFloat(str, f9);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static void a(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(com.mbridge.msdk.foundation.entity.o.h(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }
}
