package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzsj extends zzea {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzgd.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzea, com.google.android.gms.internal.ads.zzdz
    public final ByteBuffer zzb() {
        int i9;
        if (super.zzh() && (i9 = this.zzi) > 0) {
            zzj(i9).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        if (i9 != 0) {
            int min = Math.min(i9, this.zzg);
            this.zzj += min / this.zzb.zze;
            this.zzg -= min;
            byteBuffer.position(position + min);
            if (this.zzg <= 0) {
                int i10 = i9 - min;
                int length = (this.zzi + i10) - this.zzh.length;
                ByteBuffer zzj = zzj(length);
                int max = Math.max(0, Math.min(length, this.zzi));
                zzj.put(this.zzh, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i10));
                byteBuffer.limit(byteBuffer.position() + max2);
                zzj.put(byteBuffer);
                byteBuffer.limit(limit);
                int i11 = i10 - max2;
                int i12 = this.zzi - max;
                this.zzi = i12;
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, max, bArr, 0, i12);
                byteBuffer.get(this.zzh, this.zzi, i11);
                this.zzi += i11;
                zzj.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzea, com.google.android.gms.internal.ads.zzdz
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdx zzi(zzdx zzdxVar) throws zzdy {
        if (zzdxVar.zzd == 2) {
            this.zzf = true;
            if (this.zzd == 0 && this.zze == 0) {
                return zzdx.zza;
            }
            return zzdxVar;
        }
        throw new zzdy("Unhandled input format:", zzdxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i9 = this.zze;
            int i10 = this.zzb.zze;
            this.zzh = new byte[i9 * i10];
            this.zzg = this.zzd * i10;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzm() {
        this.zzh = zzgd.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i9, int i10) {
        this.zzd = i9;
        this.zze = i10;
    }
}
