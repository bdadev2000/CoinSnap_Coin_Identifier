package com.google.android.gms.internal.ads;

import a4.j;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcdr zzd;

    public zzcdp(zzcdr zzcdrVar, String str, String str2, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j3;
        this.zzd = zzcdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap q10 = j.q(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        q10.put("src", this.zza);
        q10.put("cachedSrc", this.zzb);
        q10.put("totalDuration", Long.toString(this.zzc));
        zzcdr.zze(this.zzd, "onPrecacheEvent", q10);
    }
}
