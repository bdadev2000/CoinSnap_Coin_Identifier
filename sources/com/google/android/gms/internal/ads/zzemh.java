package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
final class zzemh implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzfgt zzb;
    final /* synthetic */ zzfgh zzc;
    final /* synthetic */ zzemn zzd;
    final /* synthetic */ zzemi zze;

    public zzemh(zzemi zzemiVar, zzcas zzcasVar, zzfgt zzfgtVar, zzfgh zzfghVar, zzemn zzemnVar) {
        this.zza = zzcasVar;
        this.zzb = zzfgtVar;
        this.zzc = zzfghVar;
        this.zzd = zzemnVar;
        this.zze = zzemiVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzemr zzemrVar;
        zzemn zzemnVar = this.zzd;
        zzemrVar = this.zze.zzd;
        this.zza.zzc(zzemrVar.zza(this.zzb, this.zzc, view, zzemnVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
