package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzur implements zzxf {
    public final zzxf zza;
    final /* synthetic */ zzus zzb;
    private boolean zzc;

    public zzur(zzus zzusVar, zzxf zzxfVar) {
        this.zzb = zzusVar;
        this.zza = zzxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zza(zzlj zzljVar, zzin zzinVar, int i9) {
        zzus zzusVar = this.zzb;
        if (zzusVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzinVar.zzc(4);
            return -4;
        }
        long zzb = zzusVar.zzb();
        int zza = this.zza.zza(zzljVar, zzinVar, i9);
        if (zza == -5) {
            zzan zzanVar = zzljVar.zza;
            zzanVar.getClass();
            int i10 = zzanVar.zzD;
            int i11 = 0;
            if (i10 == 0) {
                if (zzanVar.zzE != 0) {
                    i10 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i11 = zzanVar.zzE;
            }
            zzal zzb2 = zzanVar.zzb();
            zzb2.zzF(i10);
            zzb2.zzG(i11);
            zzljVar.zza = zzb2.zzad();
            return -5;
        }
        long j7 = this.zzb.zzb;
        if (j7 != Long.MIN_VALUE && ((zza == -4 && zzinVar.zze >= j7) || (zza == -3 && zzb == Long.MIN_VALUE && !zzinVar.zzd))) {
            zzinVar.zzb();
            zzinVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j7) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j7);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        if (!this.zzb.zzq() && this.zza.zze()) {
            return true;
        }
        return false;
    }
}
