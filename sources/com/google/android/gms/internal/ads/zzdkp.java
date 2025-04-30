package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdkp implements zzblp {
    private final WeakReference zza;

    public /* synthetic */ zzdkp(zzdkq zzdkqVar, zzdko zzdkoVar) {
        this.zza = new WeakReference(zzdkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzdkq zzdkqVar = (zzdkq) this.zza.get();
        if (zzdkqVar == null) {
            return;
        }
        zzdkq.zzc(zzdkqVar).zza();
    }
}
