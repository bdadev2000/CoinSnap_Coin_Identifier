package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcoo implements zzgfk {
    final /* synthetic */ zzfng zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcop zzc;

    public zzcoo(zzcop zzcopVar, zzfng zzfngVar, String str) {
        this.zza = zzfngVar;
        this.zzb = str;
        this.zzc = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(final Throwable th) {
        zzgfz zzgfzVar;
        zzgfzVar = this.zzc.zzg;
        zzgfzVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcom
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjU)).booleanValue();
                zzcoo zzcooVar = zzcoo.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcop zzcopVar = zzcooVar.zzc;
                    context2 = zzcopVar.zzc;
                    zzcopVar.zzb = zzbup.zzc(context2);
                    zzcooVar.zzc.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcop zzcopVar2 = zzcooVar.zzc;
                    context = zzcopVar2.zzc;
                    zzcopVar2.zza = zzbup.zza(context);
                    zzcooVar.zzc.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzcooVar.zza.zzc(zzcooVar.zzb, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgfz zzgfzVar;
        final String str = (String) obj;
        zzgfzVar = this.zzc.zzg;
        zzgfzVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcon
            @Override // java.lang.Runnable
            public final void run() {
                zzcoo.this.zza.zzc(str, null);
            }
        });
    }
}
