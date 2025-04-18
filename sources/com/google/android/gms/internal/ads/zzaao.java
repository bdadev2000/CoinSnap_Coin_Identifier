package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes3.dex */
final class zzaao implements zzabs {
    final /* synthetic */ zzaas zza;

    public zzaao(zzaas zzaasVar) {
        this.zza = zzaasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zza(zzabv zzabvVar) {
        Surface surface;
        zzaas zzaasVar = this.zza;
        surface = zzaasVar.zzq;
        if (surface != null) {
            zzaasVar.zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzb(zzabv zzabvVar) {
        Surface surface;
        zzaas zzaasVar = this.zza;
        surface = zzaasVar.zzq;
        if (surface != null) {
            zzaasVar.zzaR(0, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzc(zzabv zzabvVar, zzcp zzcpVar) {
    }
}
