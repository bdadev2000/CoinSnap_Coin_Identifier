package com.google.android.gms.internal.ads;

import a4.j;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcdn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzcdr zzj;

    public zzcdn(zzcdr zzcdrVar, String str, String str2, int i10, int i11, long j3, long j10, boolean z10, int i12, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j3;
        this.zzf = j10;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
        this.zzj = zzcdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap q10 = j.q(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        q10.put("src", this.zza);
        q10.put("cachedSrc", this.zzb);
        q10.put("bytesLoaded", Integer.toString(this.zzc));
        q10.put("totalBytes", Integer.toString(this.zzd));
        q10.put("bufferedDuration", Long.toString(this.zze));
        q10.put("totalDuration", Long.toString(this.zzf));
        if (true != this.zzg) {
            str = "0";
        } else {
            str = "1";
        }
        q10.put("cacheReady", str);
        q10.put("playerCount", Integer.toString(this.zzh));
        q10.put("playerPreparedCount", Integer.toString(this.zzi));
        zzcdr.zze(this.zzj, "onPrecacheEvent", q10);
    }
}
