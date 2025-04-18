package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzgoa {
    public static final zzgwu zza = zzgwu.zzb(new byte[0]);

    public static final zzgwu zza(int i10) {
        return zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzgwu zzb(int i10) {
        return zzgwu.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
