package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class zzcfj implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcfp zze;

    public zzcfj(zzcfp zzcfpVar, String str, String str2, int i9, int i10, boolean z8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        m.put("src", this.zza);
        m.put("cachedSrc", this.zzb);
        m.put("bytesLoaded", Integer.toString(this.zzc));
        m.put("totalBytes", Integer.toString(this.zzd));
        m.put("cacheReady", "0");
        zzcfp.zze(this.zze, "onPrecacheEvent", m);
    }
}
