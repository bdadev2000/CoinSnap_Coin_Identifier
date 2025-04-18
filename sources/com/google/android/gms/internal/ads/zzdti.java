package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.ads.MobileAds;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzdti implements zzdcv, com.google.android.gms.ads.internal.client.zza, zzcyu, zzcye {
    private final Context zza;
    private final zzfhu zzb;
    private final zzdud zzc;
    private final zzfgt zzd;
    private final zzfgh zze;
    private final zzeey zzf;
    private final String zzg;

    @Nullable
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgC)).booleanValue();

    public zzdti(Context context, zzfhu zzfhuVar, zzdud zzdudVar, zzfgt zzfgtVar, zzfgh zzfghVar, zzeey zzeeyVar, String str) {
        this.zza = context;
        this.zzb = zzfhuVar;
        this.zzc = zzdudVar;
        this.zzd = zzfgtVar;
        this.zze = zzfghVar;
        this.zzf = zzeeyVar;
        this.zzg = str;
    }

    private final zzduc zzd(String str) {
        zzfgs zzfgsVar = this.zzd.zzb;
        zzduc zza = this.zzc.zza();
        zza.zzd(zzfgsVar.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzai) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgK)).booleanValue()) {
            boolean z2 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z2));
            if (z2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzmVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zze(zzduc zzducVar) {
        if (!this.zze.zzai) {
            zzducVar.zzf();
            return;
        }
        this.zzf.zzd(new zzefa(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzducVar.zze(), 2));
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbw);
                    com.google.android.gms.ads.internal.zzu.zzp();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z2 = false;
                    if (str2 != null && str != null) {
                        try {
                            z2 = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z2);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzai) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzduc zzd = zzd("ifts");
            zzd.zzb("reason", "adapter");
            int i2 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i2 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i2 >= 0) {
                zzd.zzb("arec", String.valueOf(i2));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzd.zzb("areec", zza);
            }
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzb() {
        if (this.zzi) {
            zzduc zzd = zzd("ifts");
            zzd.zzb("reason", "blocked");
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzc(zzdij zzdijVar) {
        if (this.zzi) {
            zzduc zzd = zzd("ifts");
            zzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdijVar.getMessage())) {
                zzd.zzb(SDKConstants.PARAM_DEBUG_MESSAGE, zzdijVar.getMessage());
            }
            zzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
        if (zzf() || this.zze.zzai) {
            zze(zzd("impression"));
        }
    }
}
