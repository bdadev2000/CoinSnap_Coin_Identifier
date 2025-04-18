package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzsk extends zzhq {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzsk() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzhk
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(@IntRange int i2) {
        this.zzi = i2;
    }

    public final boolean zzp(zzhq zzhqVar) {
        ByteBuffer byteBuffer;
        zzdi.zzd(!zzhqVar.zzd(Ints.MAX_POWER_OF_TWO));
        zzdi.zzd(!zzhqVar.zzd(268435456));
        zzdi.zzd(!zzhqVar.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhqVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.zzh;
        this.zzh = i2 + 1;
        if (i2 == 0) {
            this.zze = zzhqVar.zze;
            if (zzhqVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhqVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhqVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
