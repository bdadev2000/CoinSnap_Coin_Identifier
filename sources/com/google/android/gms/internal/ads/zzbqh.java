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

/* loaded from: classes3.dex */
public final class zzbqh extends zzbpi {
    private final Object zza;
    private zzbqj zzb;
    private zzbwu zzc;
    private IObjectWrapper zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = "";

    public zzbqh(@NonNull Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.zza.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    private final Bundle zzW(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) throws RemoteException {
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
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            throw new RemoteException();
        }
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzs();
    }

    @Nullable
    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbqf(this, zzbpmVar));
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                zzbpd.zza(iObjectWrapper, e2, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzA(this.zzd, zzmVar, str, new zzbqk((Adapter) obj, this.zzc));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.zza).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbqf(this, zzbpmVar));
                return;
            } catch (Exception e2) {
                zzbpd.zza(iObjectWrapper, e2, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzE() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzF() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzG(boolean z10) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Show app open ad from adapter.");
            MediationAppOpenAd mediationAppOpenAd = this.zzk;
            if (mediationAppOpenAd != null) {
                try {
                    mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    return;
                } catch (RuntimeException e2) {
                    zzbpd.zza(iObjectWrapper, e2, "adapter.appOpen.showAd");
                    throw e2;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzI() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.zza).showInterstitial();
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
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
            } catch (RuntimeException e2) {
                zzbpd.zza(iObjectWrapper, e2, "adapter.interstitial.showAd");
                throw e2;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation interstitial ad.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    return;
                } catch (RuntimeException e2) {
                    zzbpd.zza(iObjectWrapper, e2, "adapter.rewarded.showAd");
                    throw e2;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzL() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd != null) {
                try {
                    mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzd));
                    return;
                } catch (RuntimeException e2) {
                    zzbpd.zza(this.zzd, e2, "adapter.showVideo");
                    throw e2;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
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

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbpr zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbps zzP() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zzh() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbgs zzi() {
        zzbqj zzbqjVar = this.zzb;
        if (zzbqjVar == null) {
            return null;
        }
        zzbgt zzc = zzbqjVar.zzc();
        if (zzc instanceof zzbgt) {
            return zzc.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbpp zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbqi(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbpv zzk() {
        UnifiedNativeAdMapper zza;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbqj zzbqjVar = this.zzb;
            if (zzbqjVar != null && (zza = zzbqjVar.zza()) != null) {
                return new zzbqn(zza);
            }
            return null;
        }
        if (obj instanceof Adapter) {
            NativeAdMapper nativeAdMapper = this.zzh;
            if (nativeAdMapper != null) {
                return new zzbql(nativeAdMapper);
            }
            UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
            if (unifiedNativeAdMapper != null) {
                return new zzbqn(unifiedNativeAdMapper);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbru zzl() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbru.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    @Nullable
    public final zzbru zzm() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbru.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final IObjectWrapper zzn() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return ObjectWrapper.wrap(this.zze);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzo() throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwu zzbwuVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            Object obj2 = this.zza;
            com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        this.zzd = iObjectWrapper;
        this.zzc = zzbwuVar;
        zzbwuVar.zzl(ObjectWrapper.wrap(this.zza));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0072. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzq(IObjectWrapper iObjectWrapper, zzblt zzbltVar, List list) throws RemoteException {
        char c10;
        if (this.zza instanceof Adapter) {
            zzbqa zzbqaVar = new zzbqa(this, zzbltVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzblz zzblzVar = (zzblz) it.next();
                String str = zzblzVar.zza;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1167692200:
                        if (str.equals("app_open")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1778294298:
                        if (str.equals("app_open_ad")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                AdFormat adFormat = null;
                switch (c10) {
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
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlz)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                        break;
                }
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzblzVar.zzb));
                }
            }
            ((Adapter) this.zza).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbqaVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwu zzbwuVar, List list) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        zzB(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) this.zza).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, null), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), ""), new zzbqg(this, zzbpmVar));
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                zzbpd.zza(iObjectWrapper, e2, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        zzv(iObjectWrapper, zzsVar, zzmVar, str, null, zzbpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
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
        if (zzsVar.zzn) {
            zzc = com.google.android.gms.ads.zzb.zzd(zzsVar.zze, zzsVar.zzb);
        } else {
            zzc = com.google.android.gms.ads.zzb.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.zza;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzmVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j3 = zzmVar.zzb;
                if (j3 == -1) {
                    date = null;
                } else {
                    date = new Date(j3);
                }
                zzbpy zzbpyVar = new zzbpy(date, zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle2 = zzmVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqj(zzbpmVar), zzW(str, zzmVar, str2), adSize, zzbpyVar, bundle);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), adSize, this.zzl), new zzbqb(this, zzbpmVar));
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th3);
                zzbpd.zza(iObjectWrapper, th3, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.zza;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), com.google.android.gms.ads.zzb.zze(zzsVar.zze, zzsVar.zzb), ""), new zzbpz(this, zzbpmVar, adapter));
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                zzbpd.zza(iObjectWrapper, e2, "adapter.loadInterscrollerAd");
                throw new RemoteException();
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpm zzbpmVar) throws RemoteException {
        zzy(iObjectWrapper, zzmVar, str, null, zzbpmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar) throws RemoteException {
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
                List list = zzmVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j3 = zzmVar.zzb;
                if (j3 == -1) {
                    date = null;
                } else {
                    date = new Date(j3);
                }
                zzbpy zzbpyVar = new zzbpy(date, zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle2 = zzmVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzbqj(zzbpmVar), zzW(str, zzmVar, str2), zzbpyVar, bundle);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzbqc(this, zzbpmVar));
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th3);
                zzbpd.zza(iObjectWrapper, th3, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpm zzbpmVar, zzbfn zzbfnVar, List list) throws RemoteException {
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
                List list2 = zzmVar.zze;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                long j3 = zzmVar.zzb;
                if (j3 == -1) {
                    date = null;
                } else {
                    date = new Date(j3);
                }
                zzbqm zzbqmVar = new zzbqm(date, zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbfnVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle2 = zzmVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.zzb = new zzbqj(zzbpmVar);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzb, zzW(str, zzmVar, str2), zzbqmVar, bundle);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th2);
                zzbpd.zza(iObjectWrapper, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbfnVar), new zzbqe(this, zzbpmVar));
            } catch (Throwable th3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", th3);
                zzbpd.zza(iObjectWrapper, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                    try {
                        ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zzW(str, zzmVar, str2), zzV(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbfnVar), new zzbqd(this, zzbpmVar));
                        return;
                    } catch (Throwable th4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", th4);
                        zzbpd.zza(iObjectWrapper, th4, "adapter.loadNativeAd");
                        throw new RemoteException();
                    }
                }
                throw new RemoteException();
            }
        }
    }

    public zzbqh(@NonNull MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
