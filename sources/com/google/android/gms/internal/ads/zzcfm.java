package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcfp zzd;

    public zzcfm(zzcfp zzcfpVar, String str, String str2, int i9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i9;
        this.zzd = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        m.put("src", this.zza);
        m.put("cachedSrc", this.zzb);
        m.put("totalBytes", Integer.toString(this.zzc));
        zzcfp.zze(this.zzd, "onPrecacheEvent", m);
    }
}
