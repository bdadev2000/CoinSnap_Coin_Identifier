package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzgpr {
    public static final zzgyx zza = zzgyx.zzb(new byte[0]);

    public static final zzgyx zza(int i2) {
        return zzgyx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i2).array());
    }

    public static final zzgyx zzb(int i2) {
        return zzgyx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i2).array());
    }
}
