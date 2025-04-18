package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzaoq {
    private final List zza;
    private final zzaeh[] zzb;

    public zzaoq(List list) {
        this.zza = list;
        this.zzb = new zzaeh[list.size()];
    }

    public final void zza(long j2, zzek zzekVar) {
        if (zzekVar.zzb() < 9) {
            return;
        }
        int zzg = zzekVar.zzg();
        int zzg2 = zzekVar.zzg();
        int zzm = zzekVar.zzm();
        if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
            zzacn.zzb(j2, zzekVar, this.zzb);
        }
    }

    public final void zzb(zzade zzadeVar, zzaon zzaonVar) {
        for (int i2 = 0; i2 < this.zzb.length; i2++) {
            zzaonVar.zzc();
            zzaeh zzw = zzadeVar.zzw(zzaonVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.zza.get(i2);
            String str = zzafVar.zzn;
            boolean z2 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z2 = false;
            }
            zzdi.zze(z2, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzad zzadVar = new zzad();
            zzadVar.zzL(zzaonVar.zzb());
            zzadVar.zzZ(str);
            zzadVar.zzab(zzafVar.zze);
            zzadVar.zzP(zzafVar.zzd);
            zzadVar.zzx(zzafVar.zzG);
            zzadVar.zzM(zzafVar.zzq);
            zzw.zzl(zzadVar.zzaf());
            this.zzb[i2] = zzw;
        }
    }
}
