package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzehe {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfgt zzc;

    @Nullable
    private final zzchd zzd;

    @Nullable
    private zzfou zze;

    public zzehe(Context context, VersionInfoParcel versionInfoParcel, zzfgt zzfgtVar, @Nullable zzchd zzchdVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfgtVar;
        this.zzd = zzchdVar;
    }

    public final synchronized void zza(View view) {
        zzfou zzfouVar = this.zze;
        if (zzfouVar != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfouVar, view);
        }
    }

    public final synchronized void zzb() {
        zzchd zzchdVar;
        if (this.zze != null && (zzchdVar = this.zzd) != null) {
            zzchdVar.zzd("onSdkImpression", zzgbf.zzd());
        }
    }

    public final synchronized void zzc() {
        zzchd zzchdVar;
        try {
            zzfou zzfouVar = this.zze;
            if (zzfouVar != null && (zzchdVar = this.zzd) != null) {
                Iterator it = zzchdVar.zzV().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfouVar, (View) it.next());
                }
                this.zzd.zzd("onSdkLoaded", zzgbf.zzd());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.zze != null;
    }

    public final synchronized boolean zze(boolean z8) {
        if (this.zzc.zzU) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && this.zzd != null) {
                    if (this.zze != null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzW.zzb()) {
                        zzfou zze = com.google.android.gms.ads.internal.zzu.zzA().zze(this.zzb, this.zzd.zzG(), true);
                        if (zze == null) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Created omid javascript session service.");
                        this.zze = zze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzchs zzchsVar) {
        zzfou zzfouVar = this.zze;
        if (zzfouVar != null && this.zzd != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzm(zzfouVar, zzchsVar);
            this.zze = null;
            this.zzd.zzas(null);
        }
    }
}
