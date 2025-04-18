package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdoa implements zzbjr {
    final /* synthetic */ zzdoc zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjr zzd;

    public /* synthetic */ zzdoa(zzdoc zzdocVar, WeakReference weakReference, String str, zzbjr zzbjrVar, zzdob zzdobVar) {
        this.zza = zzdocVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbjrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
