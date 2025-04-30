package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzaeh implements zzadv {
    private final zzadv zza;

    public zzaeh(zzadv zzadvVar) {
        this.zza = zzadvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        return this.zza.zza(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzb(byte[] bArr, int i9, int i10) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzc(int i9) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzg(int i9) throws IOException {
        ((zzadi) this.zza).zzl(i9, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzh(byte[] bArr, int i9, int i10) throws IOException {
        ((zzadi) this.zza).zzm(bArr, i9, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzi(byte[] bArr, int i9, int i10) throws IOException {
        ((zzadi) this.zza).zzn(bArr, i9, i10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzk(int i9) throws IOException {
        ((zzadi) this.zza).zzo(i9, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzm(byte[] bArr, int i9, int i10, boolean z8) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzn(byte[] bArr, int i9, int i10, boolean z8) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
