package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdc extends zzccn {
    final /* synthetic */ zzbdi zza;

    public zzbdc(zzbdi zzbdiVar) {
        this.zza = zzbdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccn, java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        zzbdi.zze(this.zza);
        return super.cancel(z8);
    }
}
