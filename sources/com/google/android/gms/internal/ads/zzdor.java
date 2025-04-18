package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzdor extends zzcrq {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgv zze;
    private final zzddp zzf;
    private final zzcwz zzg;
    private final zzcyg zzh;
    private final zzcsl zzi;
    private final zzbwz zzj;
    private final zzfqa zzk;
    private final zzffh zzl;
    private boolean zzm;

    public zzdor(zzcrp zzcrpVar, Context context, @Nullable zzcfk zzcfkVar, zzdgv zzdgvVar, zzddp zzddpVar, zzcwz zzcwzVar, zzcyg zzcygVar, zzcsl zzcslVar, zzfet zzfetVar, zzfqa zzfqaVar, zzffh zzffhVar) {
        super(zzcrpVar);
        String str;
        int i10;
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdgvVar;
        this.zzd = new WeakReference(zzcfkVar);
        this.zzf = zzddpVar;
        this.zzg = zzcwzVar;
        this.zzh = zzcygVar;
        this.zzi = zzcslVar;
        this.zzk = zzfqaVar;
        zzbwv zzbwvVar = zzfetVar.zzl;
        if (zzbwvVar != null) {
            str = zzbwvVar.zza;
        } else {
            str = "";
        }
        if (zzbwvVar != null) {
            i10 = zzbwvVar.zzb;
        } else {
            i10 = 1;
        }
        this.zzj = new zzbxt(str, i10);
        this.zzl = zzffhVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfk zzcfkVar = (zzcfk) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgB)).booleanValue()) {
                if (!this.zzm && zzcfkVar != null) {
                    zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoq
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

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwz zzc() {
        return this.zzj;
    }

    public final zzffh zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfk zzcfkVar = (zzcfk) this.zzd.get();
        if (zzcfkVar != null && !zzcfkVar.zzaG()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z10, @Nullable Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaJ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzG(this.zzc)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaK)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfgq.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z10, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdgu e2) {
            this.zzg.zzc(e2);
            return false;
        }
    }
}
