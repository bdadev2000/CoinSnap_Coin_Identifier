package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes2.dex */
final class zzapr {
    private final List zza;
    private final zzafa[] zzb;

    public zzapr(List list) {
        this.zza = list;
        this.zzb = new zzafa[list.size()];
    }

    public final void zza(long j7, zzfu zzfuVar) {
        if (zzfuVar.zzb() >= 9) {
            int zzg = zzfuVar.zzg();
            int zzg2 = zzfuVar.zzg();
            int zzm = zzfuVar.zzm();
            if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
                zzadf.zzb(j7, zzfuVar, this.zzb);
            }
        }
    }

    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        for (int i9 = 0; i9 < this.zzb.length; i9++) {
            zzapoVar.zzc();
            zzafa zzw = zzadxVar.zzw(zzapoVar.zza(), 3);
            zzan zzanVar = (zzan) this.zza.get(i9);
            String str = zzanVar.zzn;
            boolean z8 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z8 = false;
            }
            zzeq.zze(z8, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzal zzalVar = new zzal();
            zzalVar.zzK(zzapoVar.zzb());
            zzalVar.zzX(str);
            zzalVar.zzZ(zzanVar.zzf);
            zzalVar.zzO(zzanVar.zze);
            zzalVar.zzw(zzanVar.zzF);
            zzalVar.zzL(zzanVar.zzp);
            zzw.zzl(zzalVar.zzad());
            this.zzb[i9] = zzw;
        }
    }
}
