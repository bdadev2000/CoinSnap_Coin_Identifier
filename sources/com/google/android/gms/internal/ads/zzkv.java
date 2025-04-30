package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkv implements zzlu {
    private final Object zza;
    private final zzvq zzb;
    private zzdc zzc;

    public zzkv(Object obj, zzvj zzvjVar) {
        this.zza = obj;
        this.zzb = zzvjVar;
        this.zzc = zzvjVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzdc zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzdc zzdcVar) {
        this.zzc = zzdcVar;
    }
}
