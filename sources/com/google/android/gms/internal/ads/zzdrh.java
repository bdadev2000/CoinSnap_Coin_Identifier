package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zzdrh extends zzcup {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjp zze;
    private final zzdgm zzf;
    private final zzczy zzg;
    private final zzdbf zzh;
    private final zzcvk zzi;
    private final zzbyx zzj;
    private final zzfrp zzk;
    private final zzfhh zzl;
    private boolean zzm;

    public zzdrh(zzcuo zzcuoVar, Context context, @Nullable zzchd zzchdVar, zzdjp zzdjpVar, zzdgm zzdgmVar, zzczy zzczyVar, zzdbf zzdbfVar, zzcvk zzcvkVar, zzfgt zzfgtVar, zzfrp zzfrpVar, zzfhh zzfhhVar) {
        super(zzcuoVar);
        String str;
        int i9;
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdjpVar;
        this.zzd = new WeakReference(zzchdVar);
        this.zzf = zzdgmVar;
        this.zzg = zzczyVar;
        this.zzh = zzdbfVar;
        this.zzi = zzcvkVar;
        this.zzk = zzfrpVar;
        zzbyt zzbytVar = zzfgtVar.zzm;
        if (zzbytVar != null) {
            str = zzbytVar.zza;
        } else {
            str = "";
        }
        if (zzbytVar != null) {
            i9 = zzbytVar.zzb;
        } else {
            i9 = 1;
        }
        this.zzj = new zzbzr(str, i9);
        this.zzl = zzfhhVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzchd zzchdVar = (zzchd) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgU)).booleanValue()) {
                if (!this.zzm && zzchdVar != null) {
                    zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrg
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

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbyx zzc() {
        return this.zzj;
    }

    public final zzfhh zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzchd zzchdVar = (zzchd) this.zzd.get();
        if (zzchdVar != null && !zzchdVar.zzaG()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z8, @Nullable Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaD)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfiq.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z8, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdjo e4) {
            this.zzg.zzc(e4);
            return false;
        }
    }
}
