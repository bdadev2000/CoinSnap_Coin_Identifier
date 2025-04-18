package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class zzemr {
    private final zzdic zza;

    public zzemr(zzdic zzdicVar) {
        this.zza = zzdicVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfgt zzfgtVar, zzfgh zzfghVar, View view, zzemn zzemnVar) {
        zzemp zzempVar = new zzemp(this, new zzdik() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzdik
            public final void zza(boolean z2, Context context, zzcyn zzcynVar) {
            }
        });
        zzdgz zze = this.zza.zze(new zzctu(zzfgtVar, zzfghVar, null), zzempVar);
        zzemnVar.zzd(new zzemq(this, zze));
        return zze.zzg();
    }
}
