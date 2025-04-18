package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes3.dex */
final class zzaae implements zzabi {
    final /* synthetic */ zzaai zza;

    public zzaae(zzaai zzaaiVar) {
        this.zza = zzaaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zza(zzabl zzablVar) {
        Surface surface;
        zzaai zzaaiVar = this.zza;
        surface = zzaaiVar.zzq;
        if (surface != null) {
            zzaaiVar.zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzb(zzabl zzablVar) {
        Surface surface;
        zzaai zzaaiVar = this.zza;
        surface = zzaaiVar.zzq;
        if (surface != null) {
            zzaaiVar.zzaR(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzc(zzabl zzablVar, zzci zzciVar) {
    }
}
