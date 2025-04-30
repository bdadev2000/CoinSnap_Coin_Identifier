package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcfp zzk;

    public zzcfk(zzcfp zzcfpVar, String str, String str2, long j7, long j9, long j10, long j11, long j12, boolean z8, int i9, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = z8;
        this.zzi = i9;
        this.zzj = i10;
        this.zzk = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        m.put("src", this.zza);
        m.put("cachedSrc", this.zzb);
        m.put("bufferedDuration", Long.toString(this.zzc));
        m.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue()) {
            m.put("qoeLoadedBytes", Long.toString(this.zze));
            m.put("qoeCachedBytes", Long.toString(this.zzf));
            m.put("totalBytes", Long.toString(this.zzg));
            m.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        }
        if (true != this.zzh) {
            str = "0";
        } else {
            str = "1";
        }
        m.put("cacheReady", str);
        m.put("playerCount", Integer.toString(this.zzi));
        m.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcfp.zze(this.zzk, "onPrecacheEvent", m);
    }
}
