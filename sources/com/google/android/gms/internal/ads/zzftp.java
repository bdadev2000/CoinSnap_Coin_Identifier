package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzftp extends zzgcy {
    Object zza;

    public zzftp(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final boolean zzd(Throwable th2) {
        return super.zzd(th2);
    }
}
