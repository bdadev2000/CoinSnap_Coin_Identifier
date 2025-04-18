package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzub implements zzwn {
    public final zzwn zza;
    final /* synthetic */ zzuc zzb;
    private boolean zzc;

    public zzub(zzuc zzucVar, zzwn zzwnVar) {
        this.zzb = zzucVar;
        this.zza = zzwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zza(zzkm zzkmVar, zzhq zzhqVar, int i2) {
        zzuc zzucVar = this.zzb;
        if (zzucVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhqVar.zzc(4);
            return -4;
        }
        long zzb = zzucVar.zzb();
        int zza = this.zza.zza(zzkmVar, zzhqVar, i2);
        if (zza != -5) {
            long j2 = this.zzb.zzb;
            if (j2 == Long.MIN_VALUE || ((zza != -4 || zzhqVar.zze < j2) && !(zza == -3 && zzb == Long.MIN_VALUE && !zzhqVar.zzd))) {
                return zza;
            }
            zzhqVar.zzb();
            zzhqVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        zzaf zzafVar = zzkmVar.zza;
        zzafVar.getClass();
        int i3 = zzafVar.zzE;
        if (i3 == 0) {
            if (zzafVar.zzF != 0) {
                i3 = 0;
            }
            return -5;
        }
        int i4 = this.zzb.zzb == Long.MIN_VALUE ? zzafVar.zzF : 0;
        zzad zzb2 = zzafVar.zzb();
        zzb2.zzG(i3);
        zzb2.zzH(i4);
        zzkmVar.zza = zzb2.zzaf();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final int zzb(long j2) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j2);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
