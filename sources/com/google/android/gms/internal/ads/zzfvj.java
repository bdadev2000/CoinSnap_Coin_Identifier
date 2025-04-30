package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvj extends zzgeh {
    Object zza;

    public zzfvj(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        Object obj = this.zza;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
