package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgcv extends zzgcx {
    public zzgcv(ua.b bVar, Class cls, zzgdp zzgdpVar) {
        super(bVar, cls, zzgdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th2) throws Exception {
        zzgdp zzgdpVar = (zzgdp) obj;
        ua.b zza = zzgdpVar.zza(th2);
        zzfwq.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdpVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ua.b) obj);
    }
}
