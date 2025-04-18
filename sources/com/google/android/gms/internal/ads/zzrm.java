package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzrm extends zzcu {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzeu.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final ByteBuffer zzb() {
        int i2;
        if (super.zzh() && (i2 = this.zzi) > 0) {
            zzj(i2).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg <= 0) {
            int i3 = i2 - min;
            int length = (this.zzi + i3) - this.zzh.length;
            ByteBuffer zzj = zzj(length);
            int max = Math.max(0, Math.min(length, this.zzi));
            zzj.put(this.zzh, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i3));
            byteBuffer.limit(byteBuffer.position() + max2);
            zzj.put(byteBuffer);
            byteBuffer.limit(limit);
            int i4 = i3 - max2;
            int i5 = this.zzi - max;
            this.zzi = i5;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, max, bArr, 0, i5);
            byteBuffer.get(this.zzh, this.zzi, i4);
            this.zzi += i4;
            zzj.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) throws zzcs {
        if (zzcrVar.zzd != 2) {
            throw new zzcs("Unhandled input format:", zzcrVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcr.zza : zzcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i2 = this.zze;
            int i3 = this.zzb.zze;
            this.zzh = new byte[i2 * i3];
            this.zzg = this.zzd * i3;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzl() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zzh = zzeu.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }
}
