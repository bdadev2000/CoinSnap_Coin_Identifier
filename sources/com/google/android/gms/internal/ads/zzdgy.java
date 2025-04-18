package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class zzdgy extends zzcte {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdfe zze;
    private final zzdik zzf;
    private final zzctz zzg;
    private final zzfrk zzh;
    private final zzcyn zzi;
    private final zzcah zzj;
    private boolean zzk;

    public zzdgy(zzctd zzctdVar, Context context, zzcfo zzcfoVar, zzdfe zzdfeVar, zzdik zzdikVar, zzctz zzctzVar, zzfrk zzfrkVar, zzcyn zzcynVar, zzcah zzcahVar) {
        super(zzctdVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfoVar);
        this.zze = zzdfeVar;
        this.zzf = zzdikVar;
        this.zzg = zzctzVar;
        this.zzh = zzfrkVar;
        this.zzi = zzcynVar;
        this.zzj = zzcahVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfo zzcfoVar = (zzcfo) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgw)).booleanValue()) {
                if (!this.zzk && zzcfoVar != null) {
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfo.this.destroy();
                        }
                    });
                }
            } else if (zzcfoVar != null) {
                zzcfoVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z2, Activity activity) {
        zzfgh zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaH)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcfo zzcfoVar = (zzcfo) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlw)).booleanValue() || zzcfoVar == null || (zzD = zzcfoVar.zzD()) == null || !zzD.zzar || zzD.zzas == this.zzj.zzb()) {
            if (this.zzk) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfie.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z2, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdij e) {
                    this.zzi.zzc(e);
                }
            }
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfie.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }
}
