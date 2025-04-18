package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public final class zzanf implements zzann {
    private zzad zza;
    private zzek zzb;
    private zzadx zzc;

    public zzanf(String str) {
        zzab zzabVar = new zzab();
        zzabVar.zzZ(str);
        this.zza = zzabVar.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zza(zzed zzedVar) {
        zzdb.zzb(this.zzb);
        int i10 = zzen.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze != C.TIME_UNSET && zzf != C.TIME_UNSET) {
            zzad zzadVar = this.zza;
            if (zzf != zzadVar.zzt) {
                zzab zzb = zzadVar.zzb();
                zzb.zzad(zzf);
                zzad zzaf = zzb.zzaf();
                this.zza = zzaf;
                this.zzc.zzl(zzaf);
            }
            int zzb2 = zzedVar.zzb();
            this.zzc.zzq(zzedVar, zzb2);
            this.zzc.zzs(zze, 1, zzb2, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final void zzb(zzek zzekVar, zzacu zzacuVar, zzaoa zzaoaVar) {
        this.zzb = zzekVar;
        zzaoaVar.zzc();
        zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
