package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgzm extends zzgzq {
    private final int zzc;
    private final int zzd;

    public zzgzm(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzgzs.zzq(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final byte zza(int i2) {
        zzgzs.zzy(i2, this.zzd);
        return ((zzgzq) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final byte zzb(int i2) {
        return ((zzgzq) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzq, com.google.android.gms.internal.ads.zzgzs
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(((zzgzq) this).zza, this.zzc + i2, bArr, i3, i4);
    }
}
