package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzdfj extends zzcrq {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddp zze;
    private final zzdgv zzf;
    private final zzcsl zzg;
    private final zzfqa zzh;
    private final zzcwz zzi;
    private final zzcad zzj;
    private boolean zzk;

    public zzdfj(zzcrp zzcrpVar, Context context, zzcfk zzcfkVar, zzddp zzddpVar, zzdgv zzdgvVar, zzcsl zzcslVar, zzfqa zzfqaVar, zzcwz zzcwzVar, zzcad zzcadVar) {
        super(zzcrpVar);
        this.zzk = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfkVar);
        this.zze = zzddpVar;
        this.zzf = zzdgvVar;
        this.zzg = zzcslVar;
        this.zzh = zzfqaVar;
        this.zzi = zzcwzVar;
        this.zzj = zzcadVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfk zzcfkVar = (zzcfk) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgB)).booleanValue()) {
                if (!this.zzk && zzcfkVar != null) {
                    zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdfi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfk.this.destroy();
                        }
                    });
                }
            } else if (zzcfkVar != null) {
                zzcfkVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        zzfet zzD;
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaJ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaK)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        zzcfk zzcfkVar = (zzcfk) this.zzd.get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlC)).booleanValue() && zzcfkVar != null && (zzD = zzcfkVar.zzD()) != null && zzD.zzar && zzD.zzas != this.zzj.zzb()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial consent form has been shown.");
            this.zzi.zza(zzfgq.zzd(12, "The consent form has already been shown.", null));
        } else {
            if (this.zzk) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The interstitial ad has been shown.");
                this.zzi.zza(zzfgq.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzk) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    this.zzf.zza(z10, activity2, this.zzi);
                    this.zze.zza();
                    this.zzk = true;
                    return true;
                } catch (zzdgu e2) {
                    this.zzi.zzc(e2);
                }
            }
        }
        return false;
    }
}
