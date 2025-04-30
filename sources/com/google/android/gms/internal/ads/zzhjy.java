package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzhjy extends zzhjw implements zzasr {
    private int zza;

    public zzhjy(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzasq.zzc(byteBuffer.get());
        zzasq.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
