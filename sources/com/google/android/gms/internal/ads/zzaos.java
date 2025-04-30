package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzaos implements zzapb {
    private zzan zza;
    private zzgb zzb;
    private zzafa zzc;

    public zzaos(String str) {
        zzal zzalVar = new zzal();
        zzalVar.zzX(str);
        this.zza = zzalVar.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfu zzfuVar) {
        zzeq.zzb(this.zzb);
        int i9 = zzgd.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze != C.TIME_UNSET && zzf != C.TIME_UNSET) {
            zzan zzanVar = this.zza;
            if (zzf != zzanVar.zzr) {
                zzal zzb = zzanVar.zzb();
                zzb.zzab(zzf);
                zzan zzad = zzb.zzad();
                this.zza = zzad;
                this.zzc.zzl(zzad);
            }
            int zzb2 = zzfuVar.zzb();
            this.zzc.zzq(zzfuVar, zzb2);
            this.zzc.zzs(zze, 1, zzb2, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzgb zzgbVar, zzadx zzadxVar, zzapo zzapoVar) {
        this.zzb = zzgbVar;
        zzapoVar.zzc();
        zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
