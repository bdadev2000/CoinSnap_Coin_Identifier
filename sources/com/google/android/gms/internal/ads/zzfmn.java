package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzfmn implements Runnable {
    private final zzfmq zzb;
    private String zzd;
    private String zzf;
    private zzfhe zzg;
    private com.google.android.gms.ads.internal.client.zze zzh;
    private Future zzi;
    private final List zza = new ArrayList();
    private zzfmw zzc = zzfmw.FORMAT_UNKNOWN;
    private zzfnc zze = zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfmn(zzfmq zzfmqVar) {
        this.zzb = zzfmqVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzi();
    }

    public final synchronized zzfmn zza(zzfmc zzfmcVar) {
        try {
            if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfmcVar.zzk();
                list.add(zzfmcVar);
                Future future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzi = zzcci.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziN)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfmn zzb(String str) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue() && zzfmm.zzf(str)) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfmn zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            this.zzh = zzeVar;
        }
        return this;
    }

    public final synchronized zzfmn zzd(zzfmw zzfmwVar) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            this.zzc = zzfmwVar;
        }
        return this;
    }

    public final synchronized zzfmn zze(ArrayList arrayList) {
        try {
            if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.zzc = zzfmw.FORMAT_APP_OPEN;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.zzc = zzfmw.FORMAT_REWARDED_INTERSTITIAL;
                                }
                            }
                            this.zzc = zzfmw.FORMAT_REWARDED;
                        }
                        this.zzc = zzfmw.FORMAT_NATIVE;
                    }
                    this.zzc = zzfmw.FORMAT_INTERSTITIAL;
                }
                this.zzc = zzfmw.FORMAT_BANNER;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfmn zzf(String str) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            this.zzf = str;
        }
        return this;
    }

    public final synchronized zzfmn zzg(Bundle bundle) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            this.zze = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfmn zzh(zzfhe zzfheVar) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            this.zzg = zzfheVar;
        }
        return this;
    }

    public final synchronized void zzi() {
        try {
            if (!((Boolean) zzbgd.zzc.zze()).booleanValue()) {
                return;
            }
            Future future = this.zzi;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfmc zzfmcVar : this.zza) {
                zzfmw zzfmwVar = this.zzc;
                if (zzfmwVar != zzfmw.FORMAT_UNKNOWN) {
                    zzfmcVar.zzd(zzfmwVar);
                }
                if (!TextUtils.isEmpty(this.zzd)) {
                    zzfmcVar.zzf(this.zzd);
                }
                if (!TextUtils.isEmpty(this.zzf) && !zzfmcVar.zzm()) {
                    zzfmcVar.zze(this.zzf);
                }
                zzfhe zzfheVar = this.zzg;
                if (zzfheVar != null) {
                    zzfmcVar.zzb(zzfheVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzh;
                    if (zzeVar != null) {
                        zzfmcVar.zza(zzeVar);
                    }
                }
                zzfmcVar.zzg(this.zze);
                this.zzb.zzb(zzfmcVar.zzn());
            }
            this.zza.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
