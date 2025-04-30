package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Locale;
import java.util.regex.Pattern;
import u.C2732a;

/* loaded from: classes2.dex */
public final class zzduh implements zzded, com.google.android.gms.ads.internal.client.zza, zzdaf, zzczp {
    private final Context zza;
    private final zzfig zzb;
    private final zzdvc zzc;
    private final zzfhf zzd;
    private final zzfgt zze;
    private final zzefz zzf;
    private final String zzg;

    @Nullable
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzha)).booleanValue();

    public zzduh(Context context, zzfig zzfigVar, zzdvc zzdvcVar, zzfhf zzfhfVar, zzfgt zzfgtVar, zzefz zzefzVar, String str) {
        this.zza = context;
        this.zzb = zzfigVar;
        this.zzc = zzdvcVar;
        this.zzd = zzfhfVar;
        this.zze = zzfgtVar;
        this.zzf = zzefzVar;
        this.zzg = str;
    }

    private final zzdvb zzd(String str) {
        String str2;
        zzdvb zza = this.zzc.zza();
        zza.zzd(this.zzd.zzb.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z8 = false;
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            if (true != com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza)) {
                str2 = "offline";
            } else {
                str2 = C2732a.ONLINE_EXTRAS_KEY;
            }
            zza.zzb("device_connectivity", str2);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzf(this.zzd.zza.zza) != 1) {
                z8 = true;
            }
            zza.zzb("scar", String.valueOf(z8));
            if (z8) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzlVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(zzlVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdvb zzdvbVar) {
        if (this.zze.zzaj) {
            this.zzf.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdvbVar.zze(), 2));
            return;
        }
        zzdvbVar.zzf();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbu);
                    com.google.android.gms.ads.internal.zzu.zzp();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z8 = false;
                    if (str2 != null && str != null) {
                        try {
                            z8 = Pattern.matches(str2, str);
                        } catch (RuntimeException e4) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z8);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zze.zzaj) {
            return;
        }
        zze(zzd(CampaignEx.JSON_NATIVE_VIDEO_CLICK));
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzi) {
            return;
        }
        zzdvb zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i9 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i9 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i9 >= 0) {
            zzd.zzb("arec", String.valueOf(i9));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzb() {
        if (!this.zzi) {
            return;
        }
        zzdvb zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzc(zzdjo zzdjoVar) {
        if (!this.zzi) {
            return;
        }
        zzdvb zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdjoVar.getMessage())) {
            zzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdjoVar.getMessage());
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (!zzf() && !this.zze.zzaj) {
            return;
        }
        zze(zzd("impression"));
    }
}
