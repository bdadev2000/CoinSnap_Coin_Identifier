package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zztu implements zzwg {
    public final zzwg zza;
    final /* synthetic */ zztv zzb;
    private boolean zzc;

    public zztu(zztv zztvVar, zzwg zzwgVar) {
        this.zzb = zztvVar;
        this.zza = zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zza(zzkj zzkjVar, zzhm zzhmVar, int i10) {
        zztv zztvVar = this.zzb;
        if (zztvVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhmVar.zzc(4);
            return -4;
        }
        long zzb = zztvVar.zzb();
        int zza = this.zza.zza(zzkjVar, zzhmVar, i10);
        if (zza == -5) {
            zzad zzadVar = zzkjVar.zza;
            zzadVar.getClass();
            int i11 = zzadVar.zzF;
            int i12 = 0;
            if (i11 == 0) {
                if (zzadVar.zzG != 0) {
                    i11 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i12 = zzadVar.zzG;
            }
            zzab zzb2 = zzadVar.zzb();
            zzb2.zzG(i11);
            zzb2.zzH(i12);
            zzkjVar.zza = zzb2.zzaf();
            return -5;
        }
        long j3 = this.zzb.zzb;
        if (j3 != Long.MIN_VALUE && ((zza == -4 && zzhmVar.zze >= j3) || (zza == -3 && zzb == Long.MIN_VALUE && !zzhmVar.zzd))) {
            zzhmVar.zzb();
            zzhmVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final int zzb(long j3) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j3);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
