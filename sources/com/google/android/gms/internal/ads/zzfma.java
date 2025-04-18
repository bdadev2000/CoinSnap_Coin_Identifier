package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzfma implements Runnable {
    private final zzfmd zzb;
    private String zzc;
    private String zze;
    private zzfgs zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfmg zzd = zzfmg.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfma(zzfmd zzfmdVar) {
        this.zzb = zzfmdVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfma zza(zzflp zzflpVar) {
        try {
            if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzflpVar.zzj();
                list.add(zzflpVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcan.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziq)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfma zzb(String str) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue() && zzflz.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfma zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfma zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.zzi = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                    this.zzi = 6;
                                }
                            }
                            this.zzi = 5;
                        }
                        this.zzi = 8;
                    }
                    this.zzi = 4;
                }
                this.zzi = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfma zze(String str) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfma zzf(Bundle bundle) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfma zzg(zzfgs zzfgsVar) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            this.zzf = zzfgsVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                for (zzflp zzflpVar : this.zza) {
                    int i2 = this.zzi;
                    if (i2 != 2) {
                        zzflpVar.zzn(i2);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzflpVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzflpVar.zzl()) {
                        zzflpVar.zzd(this.zze);
                    }
                    zzfgs zzfgsVar = this.zzf;
                    if (zzfgsVar != null) {
                        zzflpVar.zzb(zzfgsVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzflpVar.zza(zzeVar);
                        }
                    }
                    zzflpVar.zzf(this.zzd);
                    this.zzb.zzb(zzflpVar.zzm());
                }
                this.zza.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfma zzi(int i2) {
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            this.zzi = i2;
        }
        return this;
    }
}
