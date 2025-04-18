package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes3.dex */
final class zzaod {
    private final List zza;
    private final zzadx[] zzb;

    public zzaod(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    public final void zza(long j3, zzed zzedVar) {
        if (zzedVar.zzb() >= 9) {
            int zzg = zzedVar.zzg();
            int zzg2 = zzedVar.zzg();
            int zzm = zzedVar.zzm();
            if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
                zzacd.zzb(j3, zzedVar, this.zzb);
            }
        }
    }

    public final void zzb(zzacu zzacuVar, zzaoa zzaoaVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzaoaVar.zzc();
            zzadx zzw = zzacuVar.zzw(zzaoaVar.zza(), 3);
            zzad zzadVar = (zzad) this.zza.get(i10);
            String str = zzadVar.zzo;
            boolean z10 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z10 = false;
            }
            zzdb.zze(z10, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzab zzabVar = new zzab();
            zzabVar.zzL(zzaoaVar.zzb());
            zzabVar.zzZ(str);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzx(zzadVar.zzH);
            zzabVar.zzM(zzadVar.zzr);
            zzw.zzl(zzabVar.zzaf());
            this.zzb[i10] = zzw;
        }
    }
}
