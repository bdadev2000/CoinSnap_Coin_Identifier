package com.applovin.impl;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class sd {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, r3 r3Var) {
        if (r3Var != null) {
            a(mediaFormat, "color-transfer", r3Var.f26258c);
            a(mediaFormat, "color-standard", r3Var.f26256a);
            a(mediaFormat, "color-range", r3Var.f26257b);
            a(mediaFormat, "hdr-static-info", r3Var.d);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void a(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(android.support.v4.media.d.i("csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }
}
