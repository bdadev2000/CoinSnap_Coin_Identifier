package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgzu extends zzgzy {
    private final int zzc;
    private final int zzd;

    public zzgzu(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzhac.zzq(i9, i9 + i10, bArr.length);
        this.zzc = i9;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy, com.google.android.gms.internal.ads.zzhac
    public final byte zza(int i9) {
        zzhac.zzz(i9, this.zzd);
        return this.zza[this.zzc + i9];
    }

    @Override // com.google.android.gms.internal.ads.zzgzy, com.google.android.gms.internal.ads.zzhac
    public final byte zzb(int i9) {
        return this.zza[this.zzc + i9];
    }

    @Override // com.google.android.gms.internal.ads.zzgzy
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy, com.google.android.gms.internal.ads.zzhac
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgzy, com.google.android.gms.internal.ads.zzhac
    public final void zze(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.zza, this.zzc + i9, bArr, i10, i11);
    }
}
