package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdwh extends com.google.android.gms.ads.internal.client.zzdt {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvv zzd;
    private final zzges zze;
    private zzdvk zzf;

    public zzdwh(Context context, WeakReference weakReference, zzdvv zzdvvVar, zzdwi zzdwiVar, zzges zzgesVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvvVar;
        this.zze = zzgesVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdy zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else if (obj instanceof NativeAd) {
            responseInfo = ((NativeAd) obj).getResponseInfo();
        } else {
            return "";
        }
        if (responseInfo != null && (zzc = responseInfo.zzc()) != null) {
            try {
                return zzc.zzh();
            } catch (RemoteException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgei.zzr(this.zzf.zzb(str), new zzdwf(this, str2), this.zze);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgei.zzr(this.zzf.zzb(str), new zzdwg(this, str2), this.zze);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Object obj = this.zza.get(str);
            if (obj != null) {
                this.zza.remove(str);
            }
            if (obj instanceof AdView) {
                zzdwi.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzdwi.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }

    public final void zzf(zzdvk zzdvkVar) {
        this.zzf = zzdvkVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c10;
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                return;
                            }
                            RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdwd(this, str, str3));
                            return;
                        }
                        RewardedAd.load(zzj(), str, zzk(), new zzdwc(this, str, str3));
                        return;
                    }
                    AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                    builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvw
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd) {
                            zzdwh.this.zzg(str, nativeAd, str3);
                        }
                    });
                    builder.withAdListener(new zzdwe(this, str3));
                    builder.build().loadAd(zzk());
                    return;
                }
                InterstitialAd.load(zzj(), str, zzk(), new zzdwb(this, str, str3));
                return;
            }
            AdView adView = new AdView(zzj());
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new zzdwa(this, str, adView, str3));
            adView.loadAd(zzk());
            return;
        }
        AppOpenAd.load(zzj(), str, zzk(), 1, new zzdvz(this, str, str3));
    }

    public final synchronized void zzi(String str, String str2) {
        Object obj;
        Activity zzg = this.zzd.zzg();
        if (zzg != null && (obj = this.zza.get(str)) != null) {
            zzbce zzbceVar = zzbcn.zziY;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzg);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzg);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvx
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvy
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzj = zzj();
                intent.setClassName(zzj, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(zzj, intent);
            }
        }
    }
}
