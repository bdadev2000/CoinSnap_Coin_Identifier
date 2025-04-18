package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.events.MaxEvent;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcds implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcdv zzd;

    public zzcds(zzcdv zzcdvVar, String str, String str2, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = zzcdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(MaxEvent.f29810a, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", Integer.toString(this.zzc));
        zzcdv.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
