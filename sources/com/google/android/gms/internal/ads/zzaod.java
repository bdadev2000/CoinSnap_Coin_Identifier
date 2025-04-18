package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzaod {
    private final List zza;
    private final zzaeh[] zzb;
    private final zzfw zzc = new zzfw(new zzfu() { // from class: com.google.android.gms.internal.ads.zzaoc
        @Override // com.google.android.gms.internal.ads.zzfu
        public final void zza(long j2, zzek zzekVar) {
            zzaod.this.zzd(j2, zzekVar);
        }
    });

    public zzaod(List list) {
        this.zza = list;
        this.zzb = new zzaeh[list.size()];
    }

    public final void zza(long j2, zzek zzekVar) {
        this.zzc.zzb(j2, zzekVar);
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
            String str2 = zzafVar.zza;
            if (str2 == null) {
                str2 = zzaonVar.zzb();
            }
            zzad zzadVar = new zzad();
            zzadVar.zzL(str2);
            zzadVar.zzZ(str);
            zzadVar.zzab(zzafVar.zze);
            zzadVar.zzP(zzafVar.zzd);
            zzadVar.zzx(zzafVar.zzG);
            zzadVar.zzM(zzafVar.zzq);
            zzw.zzl(zzadVar.zzaf());
            this.zzb[i2] = zzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    public final /* synthetic */ void zzd(long j2, zzek zzekVar) {
        zzacn.zza(j2, zzekVar, this.zzb);
    }

    public final void zze(int i2) {
        this.zzc.zzd(i2);
    }
}
