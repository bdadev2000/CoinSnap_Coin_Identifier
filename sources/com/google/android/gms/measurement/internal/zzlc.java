package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* loaded from: classes4.dex */
final class zzlc implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ Uri zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzkz zze;

    public zzlc(zzkz zzkzVar, boolean z2, Uri uri, String str, String str2) {
        this.zza = z2;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzkzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkz.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
