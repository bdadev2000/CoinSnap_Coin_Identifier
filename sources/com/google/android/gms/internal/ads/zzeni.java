package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzeni implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzfhf zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ zzeno zzd;
    final /* synthetic */ zzenj zze;

    public zzeni(zzenj zzenjVar, zzccn zzccnVar, zzfhf zzfhfVar, zzfgt zzfgtVar, zzeno zzenoVar) {
        this.zza = zzccnVar;
        this.zzb = zzfhfVar;
        this.zzc = zzfgtVar;
        this.zzd = zzenoVar;
        this.zze = zzenjVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzens zzensVar;
        zzeno zzenoVar = this.zzd;
        zzensVar = this.zze.zzd;
        this.zza.zzc(zzensVar.zza(this.zzb, this.zzc, view, zzenoVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
