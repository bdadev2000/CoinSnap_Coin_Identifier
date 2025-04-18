package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzbbk extends zzcas {
    final /* synthetic */ zzbbq zza;

    public zzbbk(zzbbq zzbbqVar) {
        this.zza = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        zzbbq.zze(this.zza);
        return super.cancel(z2);
    }
}
