package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbbb extends zzcao {
    final /* synthetic */ zzbbh zza;

    public zzbbb(zzbbh zzbbhVar) {
        this.zza = zzbbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcao, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzbbh.zze(this.zza);
        return super.cancel(z10);
    }
}
