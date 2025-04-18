package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfkl implements Runnable {
    private final zzfko zzb;
    private String zzc;
    private String zze;
    private zzffe zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfkq zzd = zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfkl(zzfko zzfkoVar) {
        this.zzb = zzfkoVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfkl zza(zzfka zzfkaVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfkaVar.zzj();
            list.add(zzfkaVar);
            Future future = this.zzh;
            if (future != null) {
                future.cancel(false);
            }
            this.zzh = zzcaj.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzis)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfkl zzb(String str) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue() && zzfkk.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfkl zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfkl zzd(ArrayList arrayList) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
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
        return this;
    }

    public final synchronized zzfkl zze(String str) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfkl zzf(Bundle bundle) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfkl zzg(zzffe zzffeVar) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzf = zzffeVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        if (!((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            return;
        }
        Future future = this.zzh;
        if (future != null) {
            future.cancel(false);
        }
        for (zzfka zzfkaVar : this.zza) {
            int i10 = this.zzi;
            if (i10 != 2) {
                zzfkaVar.zzn(i10);
            }
            if (!TextUtils.isEmpty(this.zzc)) {
                zzfkaVar.zze(this.zzc);
            }
            if (!TextUtils.isEmpty(this.zze) && !zzfkaVar.zzl()) {
                zzfkaVar.zzd(this.zze);
            }
            zzffe zzffeVar = this.zzf;
            if (zzffeVar != null) {
                zzfkaVar.zzb(zzffeVar);
            } else {
                com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                if (zzeVar != null) {
                    zzfkaVar.zza(zzeVar);
                }
            }
            zzfkaVar.zzf(this.zzd);
            this.zzb.zzb(zzfkaVar.zzm());
        }
        this.zza.clear();
    }

    public final synchronized zzfkl zzi(int i10) {
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            this.zzi = i10;
        }
        return this;
    }
}
