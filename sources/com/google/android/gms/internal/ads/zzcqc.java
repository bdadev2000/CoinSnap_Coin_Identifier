package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcqc implements zzgfp {
    final /* synthetic */ zzfoe zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcqd zzc;

    public zzcqc(zzcqd zzcqdVar, zzfoe zzfoeVar, String str) {
        this.zza = zzfoeVar;
        this.zzb = str;
        this.zzc = zzcqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(final Throwable th) {
        zzgge zzggeVar;
        zzggeVar = this.zzc.zzg;
        final zzfoe zzfoeVar = this.zza;
        final String str = this.zzb;
        zzggeVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzko)).booleanValue();
                zzcqc zzcqcVar = zzcqc.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcqd zzcqdVar = zzcqcVar.zzc;
                    context2 = zzcqdVar.zzc;
                    zzcqdVar.zzb = zzbwj.zzc(context2);
                    zzcqcVar.zzc.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcqd zzcqdVar2 = zzcqcVar.zzc;
                    context = zzcqdVar2.zzc;
                    zzcqdVar2.zza = zzbwj.zza(context);
                    zzcqcVar.zzc.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzfoeVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgge zzggeVar;
        zzcqd zzcqdVar = this.zzc;
        final zzfoe zzfoeVar = this.zza;
        final String str = (String) obj;
        zzggeVar = zzcqdVar.zzg;
        zzggeVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqb
            @Override // java.lang.Runnable
            public final void run() {
                zzfoe.this.zzc(str, null);
            }
        });
    }
}
