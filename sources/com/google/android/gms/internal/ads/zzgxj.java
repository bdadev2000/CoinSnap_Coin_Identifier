package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxj extends zzgxm {
    private final int zzc;
    private final int zzd;

    public zzgxj(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgxp.zzq(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final byte zza(int i10) {
        zzgxp.zzy(i10, this.zzd);
        return ((zzgxm) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final byte zzb(int i10) {
        return ((zzgxm) this).zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxm
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxm, com.google.android.gms.internal.ads.zzgxp
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzgxm) this).zza, this.zzc + i10, bArr, i11, i12);
    }
}
