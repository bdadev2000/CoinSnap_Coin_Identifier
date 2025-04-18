package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import eb.j;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzdw {
    public static void zza(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(j.i("csd-", i10), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
