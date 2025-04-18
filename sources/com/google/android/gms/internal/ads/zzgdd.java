package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgdd extends zzgdf {
    public zzgdd(ua.b bVar, zzgdp zzgdpVar) {
        super(bVar, zzgdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgdp zzgdpVar = (zzgdp) obj;
        ua.b zza = zzgdpVar.zza(obj2);
        zzfwq.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdpVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ua.b) obj);
    }
}
