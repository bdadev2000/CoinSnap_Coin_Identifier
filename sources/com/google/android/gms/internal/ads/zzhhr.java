package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class zzhhr extends zzhhp implements zzarp {
    private int zzg;

    public zzhhr(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaro.zzc(byteBuffer.get());
        zzaro.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
