package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzged extends zzgef {
    public zzged(f4.c cVar, Class cls, zzgfa zzgfaVar) {
        super(cVar, cls, zzgfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgfa zzgfaVar = (zzgfa) obj;
        f4.c zza = zzgfaVar.zza(th);
        zzfyg.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgfaVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final /* synthetic */ void zzf(Object obj) {
        zzs((f4.c) obj);
    }
}
