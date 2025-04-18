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

/* loaded from: classes3.dex */
public final class zzdrr implements zzdbg, com.google.android.gms.ads.internal.client.zza, zzcxg, zzcwq {
    private final Context zza;
    private final zzfgg zzb;
    private final zzdsm zzc;
    private final zzfff zzd;
    private final zzfet zze;
    private final zzedp zzf;
    private final String zzg;

    @Nullable
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgH)).booleanValue();

    public zzdrr(Context context, zzfgg zzfggVar, zzdsm zzdsmVar, zzfff zzfffVar, zzfet zzfetVar, zzedp zzedpVar, String str) {
        this.zza = context;
        this.zzb = zzfggVar;
        this.zzc = zzdsmVar;
        this.zzd = zzfffVar;
        this.zze = zzfetVar;
        this.zzf = zzedpVar;
        this.zzg = str;
    }

    private final zzdsl zzd(String str) {
        String str2;
        zzffe zzffeVar = this.zzd.zzb;
        zzdsl zza = this.zzc.zza();
        zza.zzd(zzffeVar.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z10 = false;
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzai) {
            if (true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza)) {
                str2 = "offline";
            } else {
                str2 = o.a.ONLINE_EXTRAS_KEY;
            }
            zza.zzb("device_connectivity", str2);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgO)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(this.zzd.zza.zza) != 1) {
                z10 = true;
            }
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzmVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdsl zzdslVar) {
        if (this.zze.zzai) {
            this.zzf.zzd(new zzedr(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdslVar.zze(), 2));
            return;
        }
        zzdslVar.zzf();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbz);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzp(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z10 = false;
                    if (str2 != null && str != null) {
                        try {
                            z10 = Pattern.matches(str2, str);
                        } catch (RuntimeException e2) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzai) {
            zze(zzd(CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzi) {
            return;
        }
        zzdsl zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i10 = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i10 = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i10 >= 0) {
            zzd.zzb("arec", String.valueOf(i10));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        if (!this.zzi) {
            return;
        }
        zzdsl zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc(zzdgu zzdguVar) {
        if (!this.zzi) {
            return;
        }
        zzdsl zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdguVar.getMessage())) {
            zzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdguVar.getMessage());
        }
        zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (!zzf() && !this.zze.zzai) {
            return;
        }
        zze(zzd("impression"));
    }
}
