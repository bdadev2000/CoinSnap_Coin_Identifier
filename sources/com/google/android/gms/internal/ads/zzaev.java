package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaev implements zzadu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadx zzf;
    private zzafa zzg;

    public zzaev(int i9, int i10, String str) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int i9 = this.zze;
        if (i9 != 1) {
            if (i9 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzafa zzafaVar = this.zzg;
        zzafaVar.getClass();
        int zza = zzaey.zza(zzafaVar, zzadvVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzf = zzadxVar;
        zzafa zzw = zzadxVar.zzw(1024, 4);
        this.zzg = zzw;
        zzal zzalVar = new zzal();
        zzalVar.zzX(this.zzc);
        zzw.zzl(zzalVar.zzad());
        this.zzf.zzD();
        this.zzf.zzO(new zzaew(C.TIME_UNSET));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j7, long j9) {
        if (j7 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        boolean z8;
        if (this.zza != -1 && this.zzb != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        zzfu zzfuVar = new zzfu(this.zzb);
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, this.zzb, false);
        if (zzfuVar.zzq() == this.zza) {
            return true;
        }
        return false;
    }
}
