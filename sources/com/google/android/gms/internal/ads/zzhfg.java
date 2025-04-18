package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class zzhfg extends zzhfe {
    private int zzg;

    public zzhfg(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzarb.zzc(byteBuffer.get());
        zzarb.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
