package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcna implements zzgee {
    final /* synthetic */ zzflr zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcnb zzc;

    public zzcna(zzcnb zzcnbVar, zzflr zzflrVar, String str) {
        this.zza = zzflrVar;
        this.zzb = str;
        this.zzc = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(final Throwable th2) {
        zzges zzgesVar;
        zzgesVar = this.zzc.zzg;
        zzgesVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmy
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjW)).booleanValue();
                zzcna zzcnaVar = zzcna.this;
                Throwable th3 = th2;
                if (booleanValue) {
                    zzcnb zzcnbVar = zzcnaVar.zzc;
                    context2 = zzcnbVar.zzc;
                    zzcnbVar.zzb = zzbuj.zzc(context2);
                    zzcnaVar.zzc.zzb.zzh(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcnb zzcnbVar2 = zzcnaVar.zzc;
                    context = zzcnbVar2.zzc;
                    zzcnbVar2.zza = zzbuj.zza(context);
                    zzcnaVar.zzc.zza.zzh(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzcnaVar.zza.zzc(zzcnaVar.zzb, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzges zzgesVar;
        final String str = (String) obj;
        zzgesVar = this.zzc.zzg;
        zzgesVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmz
            @Override // java.lang.Runnable
            public final void run() {
                zzcna.this.zza.zzc(str, null);
            }
        });
    }
}
