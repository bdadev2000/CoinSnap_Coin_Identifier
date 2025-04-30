package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzdig extends zzcup {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgm zze;
    private final zzdjp zzf;
    private final zzcvk zzg;
    private final zzfrp zzh;
    private final zzczy zzi;
    private final zzccc zzj;
    private boolean zzk;

    public zzdig(zzcuo zzcuoVar, Context context, zzchd zzchdVar, zzdgm zzdgmVar, zzdjp zzdjpVar, zzcvk zzcvkVar, zzfrp zzfrpVar, zzczy zzczyVar, zzccc zzcccVar) {
        super(zzcuoVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzchdVar);
        this.zze = zzdgmVar;
        this.zzf = zzdjpVar;
        this.zzg = zzcvkVar;
        this.zzh = zzfrpVar;
        this.zzi = zzczyVar;
        this.zzj = zzcccVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzchd zzchdVar = (zzchd) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgU)).booleanValue()) {
                if (!this.zzk && zzchdVar != null) {
                    zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdif
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzchd.this.destroy();
                        }
                    });
                }
            } else if (zzchdVar != null) {
                zzchdVar.destroy();
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
    public final boolean zzc(boolean z8, Activity activity) {
        zzfgt zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaD)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzchd zzchdVar = (zzchd) this.zzd.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlQ)).booleanValue() && zzchdVar != null && (zzD = zzchdVar.zzD()) != null && zzD.zzas && zzD.zzat != this.zzj.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfiq.zzd(12, "The consent form has already been shown.", null));
        } else {
            if (this.zzk) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfiq.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z8, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdjo e4) {
                    this.zzi.zzc(e4);
                }
            }
        }
        return false;
    }
}
