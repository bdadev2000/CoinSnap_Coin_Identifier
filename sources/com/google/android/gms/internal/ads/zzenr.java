package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class zzenr implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzdih zza;

    public zzenr(zzens zzensVar, zzdih zzdihVar) {
        this.zza = zzdihVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
