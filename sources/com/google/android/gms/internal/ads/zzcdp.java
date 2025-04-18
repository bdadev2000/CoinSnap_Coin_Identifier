package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import com.safedk.android.analytics.events.MaxEvent;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class zzcdp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcdv zze;

    public zzcdp(zzcdv zzcdvVar, String str, String str2, int i2, int i3, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzcdvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(MaxEvent.f29810a, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        zzcdv.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
