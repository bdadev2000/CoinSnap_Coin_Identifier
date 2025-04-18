package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzanq {
    private final List zza;
    private final zzadx[] zzb;
    private final zzft zzc = new zzft(new zzfr() { // from class: com.google.android.gms.internal.ads.zzanp
        @Override // com.google.android.gms.internal.ads.zzfr
        public final void zza(long j3, zzed zzedVar) {
            zzanq.this.zzd(j3, zzedVar);
        }
    });

    public zzanq(List list) {
        this.zza = list;
        this.zzb = new zzadx[list.size()];
    }

    public final void zza(long j3, zzed zzedVar) {
        this.zzc.zzb(j3, zzedVar);
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
            String str2 = zzadVar.zza;
            if (str2 == null) {
                str2 = zzaoaVar.zzb();
            }
            zzab zzabVar = new zzab();
            zzabVar.zzL(str2);
            zzabVar.zzZ(str);
            zzabVar.zzab(zzadVar.zze);
            zzabVar.zzP(zzadVar.zzd);
            zzabVar.zzx(zzadVar.zzH);
            zzabVar.zzM(zzadVar.zzr);
            zzw.zzl(zzabVar.zzaf());
            this.zzb[i10] = zzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    public final /* synthetic */ void zzd(long j3, zzed zzedVar) {
        zzacd.zza(j3, zzedVar, this.zzb);
    }

    public final void zze(int i10) {
        this.zzc.zzd(i10);
    }
}
