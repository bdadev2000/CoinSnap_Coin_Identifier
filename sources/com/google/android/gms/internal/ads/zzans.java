package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzans implements zzaoa {
    private zzaf zza;
    private zzer zzb;
    private zzaeh zzc;

    public zzans(String str) {
        zzad zzadVar = new zzad();
        zzadVar.zzZ(str);
        this.zza = zzadVar.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zzb);
        int i2 = zzeu.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze == -9223372036854775807L || zzf == -9223372036854775807L) {
            return;
        }
        zzaf zzafVar = this.zza;
        if (zzf != zzafVar.zzs) {
            zzad zzb = zzafVar.zzb();
            zzb.zzad(zzf);
            zzaf zzaf = zzb.zzaf();
            this.zza = zzaf;
            this.zzc.zzl(zzaf);
        }
        int zzb2 = zzekVar.zzb();
        this.zzc.zzq(zzekVar, zzb2);
        this.zzc.zzs(zze, 1, zzb2, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaoa
    public final void zzb(zzer zzerVar, zzade zzadeVar, zzaon zzaonVar) {
        this.zzb = zzerVar;
        zzaonVar.zzc();
        zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
