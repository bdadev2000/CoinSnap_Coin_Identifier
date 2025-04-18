package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzegd {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfgh zzc;

    @Nullable
    private final zzcfo zzd;
    private final zzdud zze;

    @Nullable
    private zzfot zzf;

    public zzegd(Context context, VersionInfoParcel versionInfoParcel, zzfgh zzfghVar, @Nullable zzcfo zzcfoVar, zzdud zzdudVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfghVar;
        this.zzd = zzcfoVar;
        this.zze = zzdudVar;
    }

    public final synchronized void zza(View view) {
        zzfot zzfotVar = this.zzf;
        if (zzfotVar != null) {
            com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfotVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcfo zzcfoVar;
        if (this.zzf == null || (zzcfoVar = this.zzd) == null) {
            return;
        }
        zzcfoVar.zzd("onSdkImpression", zzgba.zzd());
    }

    public final synchronized void zzc() {
        zzcfo zzcfoVar;
        try {
            zzfot zzfotVar = this.zzf;
            if (zzfotVar == null || (zzcfoVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcfoVar.zzV().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzu.zzA().zzh(zzfotVar, (View) it.next());
            }
            this.zzd.zzd("onSdkLoaded", zzgba.zzd());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z2) {
        if (this.zzc.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeU)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        zzfot zze = com.google.android.gms.ads.internal.zzu.zzA().zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeY)).booleanValue()) {
                            zzdud zzdudVar = this.zze;
                            String str = zze != null ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            zzduc zza = zzdudVar.zza();
                            zza.zzb("omid_js_session_success", str);
                            zza.zzf();
                        }
                        if (zze == null) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Created omid javascript session service.");
                        this.zzf = zze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcgd zzcgdVar) {
        zzfot zzfotVar = this.zzf;
        if (zzfotVar == null || this.zzd == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzm(zzfotVar, zzcgdVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
