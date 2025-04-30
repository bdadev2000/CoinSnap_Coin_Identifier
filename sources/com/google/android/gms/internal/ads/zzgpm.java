package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzgpm {
    public static final zzgze zza = zzgze.zzb(new byte[0]);

    public static final zzgze zza(int i9) {
        return zzgze.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i9).array());
    }

    public static final zzgze zzb(int i9) {
        return zzgze.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i9).array());
    }
}
