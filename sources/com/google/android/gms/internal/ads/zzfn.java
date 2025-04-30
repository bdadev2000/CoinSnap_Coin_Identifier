package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import com.mbridge.msdk.foundation.entity.o;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfn {
    public static void zza(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(o.h(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }
}
