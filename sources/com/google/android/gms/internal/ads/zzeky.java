package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
final class zzeky implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzcao zza;
    final /* synthetic */ zzfff zzb;
    final /* synthetic */ zzfet zzc;
    final /* synthetic */ zzele zzd;
    final /* synthetic */ zzekz zze;

    public zzeky(zzekz zzekzVar, zzcao zzcaoVar, zzfff zzfffVar, zzfet zzfetVar, zzele zzeleVar) {
        this.zza = zzcaoVar;
        this.zzb = zzfffVar;
        this.zzc = zzfetVar;
        this.zzd = zzeleVar;
        this.zze = zzekzVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
        zzeli zzeliVar;
        zzele zzeleVar = this.zzd;
        zzeliVar = this.zze.zzd;
        this.zza.zzc(zzeliVar.zza(this.zzb, this.zzc, view, zzeleVar));
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
