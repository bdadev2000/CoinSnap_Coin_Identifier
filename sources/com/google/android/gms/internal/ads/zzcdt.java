package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.events.MaxEvent;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdt implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcdv zzd;

    public zzcdt(zzcdv zzcdvVar, String str, String str2, long j2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = zzcdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(MaxEvent.f29810a, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcdv.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
