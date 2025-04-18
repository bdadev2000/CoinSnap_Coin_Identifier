package com.google.android.gms.internal.ads;

import a4.j;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdm implements Runnable {
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
    final /* synthetic */ zzcdr zzk;

    public zzcdm(zzcdr zzcdrVar, String str, String str2, long j3, long j10, long j11, long j12, long j13, boolean z10, int i10, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j3;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = zzcdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap q10 = j.q(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        q10.put("src", this.zza);
        q10.put("cachedSrc", this.zzb);
        q10.put("bufferedDuration", Long.toString(this.zzc));
        q10.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue()) {
            q10.put("qoeLoadedBytes", Long.toString(this.zze));
            q10.put("qoeCachedBytes", Long.toString(this.zzf));
            q10.put("totalBytes", Long.toString(this.zzg));
            q10.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        }
        if (true != this.zzh) {
            str = "0";
        } else {
            str = "1";
        }
        q10.put("cacheReady", str);
        q10.put("playerCount", Integer.toString(this.zzi));
        q10.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcdr.zze(this.zzk, "onPrecacheEvent", q10);
    }
}
