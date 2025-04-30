package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.L;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcfp zzj;

    public zzcfl(zzcfp zzcfpVar, String str, String str2, int i9, int i10, long j7, long j9, boolean z8, int i11, int i12) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = j7;
        this.zzf = j9;
        this.zzg = z8;
        this.zzh = i11;
        this.zzi = i12;
        this.zzj = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap m = L.m(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        m.put("src", this.zza);
        m.put("cachedSrc", this.zzb);
        m.put("bytesLoaded", Integer.toString(this.zzc));
        m.put("totalBytes", Integer.toString(this.zzd));
        m.put("bufferedDuration", Long.toString(this.zze));
        m.put("totalDuration", Long.toString(this.zzf));
        if (true != this.zzg) {
            str = "0";
        } else {
            str = "1";
        }
        m.put("cacheReady", str);
        m.put("playerCount", Integer.toString(this.zzh));
        m.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcfp.zze(this.zzj, "onPrecacheEvent", m);
    }
}
