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

/* loaded from: classes3.dex */
public final class zzbrs extends zzbre {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbrs(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
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
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzs();
    }

    @Nullable
    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzf() throws RemoteException {
        return zzbru.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbru zzg() throws RemoteException {
        return zzbru.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, zzbri zzbriVar) throws RemoteException {
        char c10;
        AdFormat adFormat;
        try {
            zzbrq zzbrqVar = new zzbrq(this, zzbriVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    adFormat = AdFormat.BANNER;
                    MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 1:
                    adFormat = AdFormat.INTERSTITIAL;
                    MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 2:
                    adFormat = AdFormat.REWARDED;
                    MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22 = new ArrayList();
                    arrayList22.add(mediationConfiguration22);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList22, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 3:
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList222 = new ArrayList();
                    arrayList222.add(mediationConfiguration222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList222, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 4:
                    adFormat = AdFormat.NATIVE;
                    MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2222 = new ArrayList();
                    arrayList2222.add(mediationConfiguration2222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList2222, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 5:
                    adFormat = AdFormat.APP_OPEN_AD;
                    MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList22222 = new ArrayList();
                    arrayList22222.add(mediationConfiguration22222);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList22222, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                    return;
                case 6:
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlz)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList222222, bundle, com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbrqVar);
                        return;
                    }
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error generating signals for RTB", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqq zzbqqVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrp(this, zzbqqVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render app open ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpm zzbpmVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new zzbrk(this, zzbqtVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render banner ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqt zzbqtVar, zzbpm zzbpmVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new zzbrl(this, zzbqtVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render interscroller ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqw zzbqwVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrm(this, zzbqwVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render interstitial ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqz zzbqzVar, zzbpm zzbpmVar) throws RemoteException {
        zzn(str, str2, zzmVar, iObjectWrapper, zzbqzVar, zzbpmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqz zzbqzVar, zzbpm zzbpmVar, zzbfn zzbfnVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbfnVar), new zzbrn(this, zzbqzVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render native ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                try {
                    this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbfnVar), new zzbro(this, zzbqzVar, zzbpmVar));
                    return;
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render native ad.", th3);
                    zzbpd.zza(iObjectWrapper, th3, "adapter.loadRtbNativeAd");
                    throw new RemoteException();
                }
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrr(this, zzbrcVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render rewarded interstitial ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrc zzbrcVar, zzbpm zzbpmVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrr(this, zzbrcVar, zzbpmVar));
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Adapter failed to render rewarded ad.", th2);
            zzbpd.zza(iObjectWrapper, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd != null) {
            try {
                mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.showRtbAppOpenAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.showRtbInterstitialAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return true;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.showRtbRewardedAd");
                return true;
            }
        }
        return false;
    }
}
