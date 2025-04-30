package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgen extends zzgep {
    public zzgen(f4.c cVar, zzgfa zzgfaVar) {
        super(cVar, zzgfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgfa zzgfaVar = (zzgfa) obj;
        f4.c zza = zzgfaVar.zza(obj2);
        zzfyg.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgfaVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final /* synthetic */ void zzf(Object obj) {
        zzs((f4.c) obj);
    }
}
