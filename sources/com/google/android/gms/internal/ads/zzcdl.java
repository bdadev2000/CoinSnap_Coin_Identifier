package com.google.android.gms.internal.ads;

import a4.j;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcdl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcdr zze;

    public zzcdl(zzcdr zzcdrVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzcdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap q10 = j.q(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        q10.put("src", this.zza);
        q10.put("cachedSrc", this.zzb);
        q10.put("bytesLoaded", Integer.toString(this.zzc));
        q10.put("totalBytes", Integer.toString(this.zzd));
        q10.put("cacheReady", "0");
        zzcdr.zze(this.zze, "onPrecacheEvent", q10);
    }
}
