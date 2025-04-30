package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzens {
    private final zzdjh zza;

    public zzens(zzdjh zzdjhVar) {
        this.zza = zzdjhVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, View view, zzeno zzenoVar) {
        zzenq zzenqVar = new zzenq(this, new zzdjp() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z8, Context context, zzczy zzczyVar) {
            }
        });
        zzdih zze = this.zza.zze(new zzcvf(zzfhfVar, zzfgtVar, null), zzenqVar);
        zzenoVar.zzd(new zzenr(this, zze));
        return zze.zzg();
    }
}
