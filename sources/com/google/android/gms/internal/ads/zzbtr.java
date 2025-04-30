package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbtr extends zzbtd {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbtr(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private static final Bundle zzw(String str) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (!zzlVar.zzf) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzs()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Nullable
    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzf() throws RemoteException {
        return zzbtt.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzg() throws RemoteException {
        return zzbtt.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbth zzbthVar) throws RemoteException {
        char c9;
        AdFormat adFormat;
        try {
            zzbtp zzbtpVar = new zzbtp(this, zzbthVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22 = new ArrayList();
                    arrayList22.add(mediationConfiguration22);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList22, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList222 = new ArrayList();
                    arrayList222.add(mediationConfiguration222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList222, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2222 = new ArrayList();
                    arrayList2222.add(mediationConfiguration2222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList2222, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22222 = new ArrayList();
                    arrayList22222.add(mediationConfiguration22222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList22222, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                    return;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlN)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList222222, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), zzbtpVar);
                        return;
                    }
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error generating signals for RTB", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsp zzbspVar, zzbrl zzbrlVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbto(this, zzbspVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render app open ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbtj(this, zzbssVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render banner ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.zze), new zzbtk(this, zzbssVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render interscroller ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, zzbrl zzbrlVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbtl(this, zzbsvVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render interstitial ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar) throws RemoteException {
        zzn(str, str2, zzlVar, iObjectWrapper, zzbsyVar, zzbrlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar, zzbhk zzbhkVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze, zzbhkVar), new zzbtm(this, zzbsyVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render native ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                try {
                    this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze, zzbhkVar), new zzbtn(this, zzbsyVar, zzbrlVar));
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render native ad.", th2);
                    zzbrc.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                    throw new RemoteException();
                }
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbtq(this, zzbtbVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render rewarded interstitial ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzlVar), zzx(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzy(str2, zzlVar), this.zze), new zzbtq(this, zzbtbVar, zzbrlVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render rewarded ad.", th);
            zzbrc.zza(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.showRtbRewardedAd");
                return true;
            }
        }
        return false;
    }
}
