package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjt implements zzku {
    private final Object zza;
    private zzbv zzb;

    public zzjt(Object obj, zzum zzumVar) {
        this.zza = obj;
        this.zzb = zzumVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzbv zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbv zzbvVar) {
        this.zzb = zzbvVar;
    }
}
