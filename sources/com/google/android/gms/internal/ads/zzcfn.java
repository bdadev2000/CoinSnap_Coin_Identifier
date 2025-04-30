package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcfp zzd;

    public zzcfn(zzcfp zzcfpVar, String str, String str2, long j7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        m.put("src", this.zza);
        m.put("cachedSrc", this.zzb);
        m.put("totalDuration", Long.toString(this.zzc));
        zzcfp.zze(this.zzd, "onPrecacheEvent", m);
    }
}
