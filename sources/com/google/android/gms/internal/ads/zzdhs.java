package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdhs implements zzbjr {
    private final WeakReference zza;

    public /* synthetic */ zzdhs(zzdhu zzdhuVar, zzdht zzdhtVar) {
        this.zza = new WeakReference(zzdhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzdhu zzdhuVar = (zzdhu) this.zza.get();
        if (zzdhuVar == null) {
            return;
        }
        zzdhu.zzc(zzdhuVar).zza();
    }
}
