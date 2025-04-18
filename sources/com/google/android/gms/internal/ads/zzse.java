package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzse extends zzhm {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzse() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhm, com.google.android.gms.internal.ads.zzhg
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

    public final void zzo(int i10) {
        this.zzi = i10;
    }

    public final boolean zzp(zzhm zzhmVar) {
        ByteBuffer byteBuffer;
        zzdb.zzd(!zzhmVar.zzd(1073741824));
        zzdb.zzd(!zzhmVar.zzd(268435456));
        zzdb.zzd(!zzhmVar.zzd(4));
        if (zzq()) {
            if (this.zzh < this.zzi) {
                ByteBuffer byteBuffer2 = zzhmVar.zzc;
                if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.zzh;
        this.zzh = i10 + 1;
        if (i10 == 0) {
            this.zze = zzhmVar.zze;
            if (zzhmVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhmVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhmVar.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
