package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class zzti extends zzin {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzti() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzin, com.google.android.gms.internal.ads.zzih
    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzl() {
        return this.zzh;
    }

    public final long zzm() {
        return this.zzg;
    }

    public final void zzn(int i9) {
        this.zzi = i9;
    }

    public final boolean zzo(zzin zzinVar) {
        ByteBuffer byteBuffer;
        zzeq.zzd(!zzinVar.zzd(1073741824));
        zzeq.zzd(!zzinVar.zzd(268435456));
        zzeq.zzd(!zzinVar.zzd(4));
        if (zzp()) {
            if (this.zzh < this.zzi) {
                ByteBuffer byteBuffer2 = zzinVar.zzc;
                if (byteBuffer2 != null && (byteBuffer = this.zzc) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i9 = this.zzh;
        this.zzh = i9 + 1;
        if (i9 == 0) {
            this.zze = zzinVar.zze;
            if (zzinVar.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzinVar.zzc;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzinVar.zze;
        return true;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }
}
