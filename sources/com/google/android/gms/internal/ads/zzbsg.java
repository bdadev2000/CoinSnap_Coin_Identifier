package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbsg extends zzbrh {
    private final Object zza;
    private zzbsi zzb;
    private zzbys zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbsg(@NonNull Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzl zzlVar, String str2) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zze("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzl zzlVar) {
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
    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbse(this, zzbrlVar));
                return;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                zzbrc.zza(iObjectWrapper, e4, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzlVar, str, new zzbsj((Adapter) obj, this.zzc));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbse(this, zzbrlVar));
                return;
            } catch (Exception e4) {
                zzbrc.zza(iObjectWrapper, e4, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzG(boolean z8) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z8);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzk;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    return;
                } catch (RuntimeException e4) {
                    zzbrc.zza(iObjectWrapper, e4, "adapter.appOpen.showAd");
                    throw e4;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzI();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                return;
            } catch (RuntimeException e4) {
                zzbrc.zza(iObjectWrapper, e4, "adapter.interstitial.showAd");
                throw e4;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation interstitial ad.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    return;
                } catch (RuntimeException e4) {
                    zzbrc.zza(iObjectWrapper, e4, "adapter.rewarded.showAd");
                    throw e4;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                    return;
                } catch (RuntimeException e4) {
                    zzbrc.zza(this.zzd, e4, "adapter.showVideo");
                    throw e4;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzN() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (this.zzc != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbrq zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbrr zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbip zzi() {
        zzbsi zzbsiVar = this.zzb;
        if (zzbsiVar != null) {
            zzbiq zzc = zzbsiVar.zzc();
            if (zzc instanceof zzbiq) {
                return zzc.zza();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbro zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbsh(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbru zzk() {
        UnifiedNativeAdMapper zza;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbsi zzbsiVar = this.zzb;
            if (zzbsiVar != null && (zza = zzbsiVar.zza()) != null) {
                return new zzbsm(zza);
            }
            return null;
        }
        if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbsk(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbsm(unifiedNativeAdMapper);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbtt zzl() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbtt.zza(((Adapter) obj).getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    @Nullable
    public final zzbtt zzm() {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbtt.zza(((Adapter) obj).getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbys zzbysVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbysVar;
        zzbysVar.zzl(ObjectWrapper.wrap(this.zza));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0072. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzq(IObjectWrapper iObjectWrapper, zzbnr zzbnrVar, List list) throws RemoteException {
        char c9;
        if (this.zza instanceof Adapter) {
            zzbrz zzbrzVar = new zzbrz(this, zzbnrVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbnx zzbnxVar = (zzbnx) it.next();
                String str = zzbnxVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c9 = 4;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            c9 = 5;
                            break;
                        }
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c9 = 6;
                            break;
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c9 = 3;
                            break;
                        }
                        break;
                }
                c9 = 65535;
                AdFormat adFormat = null;
                switch (c9) {
                    case 0:
                        adFormat = AdFormat.BANNER;
                        break;
                    case 1:
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    case 2:
                        adFormat = AdFormat.REWARDED;
                        break;
                    case 3:
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        adFormat = AdFormat.NATIVE;
                        break;
                    case 5:
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    case 6:
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlN)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbnxVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrzVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzr(IObjectWrapper iObjectWrapper, zzbys zzbysVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzB(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, null), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), ""), new zzbsf(this, zzbrlVar));
                return;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                zzbrc.zza(iObjectWrapper, e4, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        zzv(iObjectWrapper, zzqVar, zzlVar, str, null, zzbrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        AdSize zzc;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting banner ad from adapter.");
        if (zzqVar.zzn) {
            zzc = com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j7 = zzlVar.zzb;
                if (j7 == -1) {
                    date = null;
                } else {
                    date = new Date(j7);
                }
                zzbrx zzbrxVar = new zzbrx(date, zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsi(zzbrlVar), zzW(str, zzlVar, str2), adSize, zzbrxVar, bundle);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), adSize, this.zzl), new zzbsa(this, zzbrlVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbrc.zza(iObjectWrapper, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new zzbry(this, zzbrlVar, adapter));
                return;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                zzbrc.zza(iObjectWrapper, e4, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        zzy(iObjectWrapper, zzlVar, str, null, zzbrlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j7 = zzlVar.zzb;
                if (j7 == -1) {
                    date = null;
                } else {
                    date = new Date(j7);
                }
                zzbrx zzbrxVar = new zzbrx(date, zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbsi(zzbrlVar), zzW(str, zzlVar, str2), zzbrxVar, bundle);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl), new zzbsb(this, zzbrlVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbrc.zza(iObjectWrapper, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar, zzbhk zzbhkVar, List list) throws RemoteException {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting native ad from adapter.");
        Object obj2 = this.zza;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.zze;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                long j7 = zzlVar.zzb;
                if (j7 == -1) {
                    date = null;
                } else {
                    date = new Date(j7);
                }
                zzbsl zzbslVar = new zzbsl(date, zzlVar.zzd, hashSet, zzlVar.zzk, zzX(zzlVar), zzlVar.zzg, zzbhkVar, list, zzlVar.zzr, zzlVar.zzt, zzY(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.zzb = new zzbsi(zzbrlVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzW(str, zzlVar, str2), zzbslVar, bundle);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th);
                zzbrc.zza(iObjectWrapper, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl, zzbhkVar), new zzbsd(this, zzbrlVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbrc.zza(iObjectWrapper, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                    try {
                        ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzlVar, str2), zzV(zzlVar), zzX(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, zzY(str, zzlVar), this.zzl, zzbhkVar), new zzbsc(this, zzbrlVar));
                        return;
                    } catch (Throwable th3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", th3);
                        zzbrc.zza(iObjectWrapper, th3, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }

    public zzbsg(@NonNull MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
