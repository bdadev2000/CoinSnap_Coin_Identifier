package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdxy extends com.google.android.gms.ads.internal.client.zzdt {

    @VisibleForTesting
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdxm zzd;
    private final zzgfz zze;
    private zzdxb zzf;

    public zzdxy(Context context, WeakReference weakReference, zzdxm zzdxmVar, zzdxz zzdxzVar, zzgfz zzgfzVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdxmVar;
        this.zze = zzgfzVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static AdRequest zzk() {
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, androidx.compose.foundation.text.input.a.c("request_origin", "inspector_ooct")).build();
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
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgfo.zzr(this.zzf.zzb(str), new zzdxw(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgfo.zzr(this.zzf.zzb(str), new zzdxx(this, str2), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof AdView) {
            zzdxz.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdxz.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdxb zzdxbVar) {
        this.zzf = zzdxbVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    public final synchronized void zzh(final String str, String str2, final String str3) {
        char c2;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1372958932:
                    if (str2.equals("INTERSTITIAL")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 543046670:
                    if (str2.equals(BrandSafetyUtils.f29188k)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals(BrandSafetyUtils.f29190m)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                AppOpenAd.load(zzj(), str, zzk(), 1, new zzdxq(this, str, str3));
                return;
            }
            if (c2 == 1) {
                AdView adView = new AdView(zzj());
                adView.setAdSize(AdSize.BANNER);
                adView.setAdUnitId(str);
                adView.setAdListener(new zzdxr(this, str, adView, str3));
                adView.loadAd(zzk());
                return;
            }
            if (c2 == 2) {
                InterstitialAd.load(zzj(), str, zzk(), new zzdxs(this, str, str3));
                return;
            }
            if (c2 == 3) {
                AdLoader.Builder builder = new AdLoader.Builder(zzj(), str);
                builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdxn
                    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                    public final void onNativeAdLoaded(NativeAd nativeAd) {
                        zzdxy.this.zzg(str, nativeAd, str3);
                    }
                });
                builder.withAdListener(new zzdxv(this, str3));
                builder.build().loadAd(zzk());
                return;
            }
            if (c2 == 4) {
                RewardedAd.load(zzj(), str, zzk(), new zzdxt(this, str, str3));
            } else {
                if (c2 != 5) {
                    return;
                }
                RewardedInterstitialAd.load(zzj(), str, zzk(), new zzdxu(this, str, str3));
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003e, B:24:0x0049, B:27:0x0050, B:29:0x0054, B:32:0x005b, B:34:0x005f, B:37:0x006b, B:39:0x006f, B:42:0x007b, B:44:0x008b, B:46:0x008f, B:48:0x0093, B:51:0x0039), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003e, B:24:0x0049, B:27:0x0050, B:29:0x0054, B:32:0x005b, B:34:0x005f, B:37:0x006b, B:39:0x006f, B:42:0x007b, B:44:0x008b, B:46:0x008f, B:48:0x0093, B:51:0x0039), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzi(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdxm r0 = r4.zzd     // Catch: java.lang.Throwable -> L36
            android.app.Activity r0 = r0.zzg()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto Lb
            goto Lae
        Lb:
            java.util.Map r1 = r4.zza     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto Lae
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zziW     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r3.zza(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L39
            boolean r3 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L39
            boolean r3 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L39
            boolean r3 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L39
            boolean r3 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L3e
            goto L39
        L36:
            r5 = move-exception
            goto Lb0
        L39:
            java.util.Map r3 = r4.zza     // Catch: java.lang.Throwable -> L36
            r3.remove(r5)     // Catch: java.lang.Throwable -> L36
        L3e:
            java.lang.String r3 = zzl(r1)     // Catch: java.lang.Throwable -> L36
            r4.zzn(r3, r6)     // Catch: java.lang.Throwable -> L36
            boolean r6 = r1 instanceof com.google.android.gms.ads.appopen.AppOpenAd     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L50
            com.google.android.gms.ads.appopen.AppOpenAd r1 = (com.google.android.gms.ads.appopen.AppOpenAd) r1     // Catch: java.lang.Throwable -> L36
            r1.show(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L50:
            boolean r6 = r1 instanceof com.google.android.gms.ads.interstitial.InterstitialAd     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L5b
            com.google.android.gms.ads.interstitial.InterstitialAd r1 = (com.google.android.gms.ads.interstitial.InterstitialAd) r1     // Catch: java.lang.Throwable -> L36
            r1.show(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L5b:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewarded.RewardedAd     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L6b
            com.google.android.gms.ads.rewarded.RewardedAd r1 = (com.google.android.gms.ads.rewarded.RewardedAd) r1     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzdxo r5 = new com.google.android.gms.internal.ads.zzdxo     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            r1.show(r0, r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L6b:
            boolean r6 = r1 instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L7b
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd r1 = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) r1     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzdxp r5 = new com.google.android.gms.internal.ads.zzdxp     // Catch: java.lang.Throwable -> L36
            r5.<init>()     // Catch: java.lang.Throwable -> L36
            r1.show(r0, r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L7b:
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r6.zza(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L36
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lae
            boolean r6 = r1 instanceof com.google.android.gms.ads.AdView     // Catch: java.lang.Throwable -> L36
            if (r6 != 0) goto L93
            boolean r6 = r1 instanceof com.google.android.gms.ads.nativead.NativeAd     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto Lae
        L93:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L36
            android.content.Context r0 = r4.zzj()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "com.google.android.gms.ads.OutOfContextTestingActivity"
            r6.setClassName(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "adUnit"
            r6.putExtra(r1, r5)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.ads.internal.util.zzt.zzT(r0, r6)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        Lae:
            monitor-exit(r4)
            return
        Lb0:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxy.zzi(java.lang.String, java.lang.String):void");
    }
}
