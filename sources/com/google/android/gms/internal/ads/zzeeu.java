package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzeeu {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfet zzc;

    @Nullable
    private final zzcfk zzd;
    private final zzdsm zze;

    @Nullable
    private zzfnh zzf;

    public zzeeu(Context context, VersionInfoParcel versionInfoParcel, zzfet zzfetVar, @Nullable zzcfk zzcfkVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfetVar;
        this.zzd = zzcfkVar;
        this.zze = zzdsmVar;
    }

    public final synchronized void zza(View view) {
        zzfnh zzfnhVar = this.zzf;
        if (zzfnhVar != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzfnhVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcfk zzcfkVar;
        if (this.zzf != null && (zzcfkVar = this.zzd) != null) {
            zzcfkVar.zzd("onSdkImpression", zzfzr.zzd());
        }
    }

    public final synchronized void zzc() {
        zzcfk zzcfkVar;
        zzfnh zzfnhVar = this.zzf;
        if (zzfnhVar != null && (zzcfkVar = this.zzd) != null) {
            Iterator it = zzcfkVar.zzV().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzv.zzB().zzh(zzfnhVar, (View) it.next());
            }
            this.zzd.zzd("onSdkLoaded", zzfzr.zzd());
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z10) {
        String str;
        if (this.zzc.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfb)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        zzfnh zze = com.google.android.gms.ads.internal.zzv.zzB().zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzff)).booleanValue()) {
                            zzdsm zzdsmVar = this.zze;
                            if (zze != null) {
                                str = "1";
                            } else {
                                str = "0";
                            }
                            zzdsl zza = zzdsmVar.zza();
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

    public final synchronized void zzf(zzcfz zzcfzVar) {
        zzfnh zzfnhVar = this.zzf;
        if (zzfnhVar != null && this.zzd != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzm(zzfnhVar, zzcfzVar);
            this.zzf = null;
            this.zzd.zzas(null);
        }
    }
}
