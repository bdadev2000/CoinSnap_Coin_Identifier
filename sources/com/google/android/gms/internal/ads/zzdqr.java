package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdqr implements zzblp {
    final /* synthetic */ zzdqs zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzblp zzd;

    public /* synthetic */ zzdqr(zzdqs zzdqsVar, WeakReference weakReference, String str, zzblp zzblpVar, zzdqq zzdqqVar) {
        this.zza = zzdqsVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzblpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzn(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
