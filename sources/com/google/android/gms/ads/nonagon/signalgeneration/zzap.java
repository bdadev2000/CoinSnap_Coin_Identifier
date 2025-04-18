package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.applovin.impl.adview.t;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzp;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzcxi;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdpt;
import com.google.android.gms.internal.ads.zzdtm;
import com.google.android.gms.internal.ads.zzdui;
import com.google.android.gms.internal.ads.zzfha;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzfxq;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzgeu;
import com.google.android.gms.internal.ads.zzgev;
import com.google.android.gms.internal.ads.zzgff;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfz;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzap extends zzbzk {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbdw zzI;
    private final zzj zzJ;
    private final zza zzK;
    private final zzcho zzf;
    private Context zzg;
    private final zzavn zzh;
    private final zzfhg zzi;
    private final zzfib zzj;
    private final zzgfz zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbuk zzm;
    private final zzdui zzp;
    private final zzfng zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgT)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgS)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgV)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgX)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgW);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgY);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgZ);

    public zzap(zzcho zzchoVar, Context context, zzavn zzavnVar, zzfib zzfibVar, zzgfz zzgfzVar, ScheduledExecutorService scheduledExecutorService, zzdui zzduiVar, zzfng zzfngVar, VersionInfoParcel versionInfoParcel, zzbdw zzbdwVar, zzfhg zzfhgVar, zzj zzjVar, zza zzaVar) {
        List list;
        this.zzf = zzchoVar;
        this.zzg = context;
        this.zzh = zzavnVar;
        this.zzi = zzfhgVar;
        this.zzj = zzfibVar;
        this.zzk = zzgfzVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzduiVar;
        this.zzq = zzfngVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdwVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzha)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhb));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhc));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhd));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhe));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzap zzapVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzapVar.zzO((Uri) it.next())) {
                zzapVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzx zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        char c2;
        zzfha zzfhaVar = new zzfha();
        if (BrandSafetyUtils.f29188k.equals(str2)) {
            zzfhaVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfhaVar.zzp().zza(3);
        }
        zzw zzp = this.zzf.zzp();
        zzcxi zzcxiVar = new zzcxi();
        zzcxiVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfhaVar.zzt(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzfhaVar.zzH(zzmVar);
        if (zzsVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 543046670:
                    if (str2.equals(BrandSafetyUtils.f29188k)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals(BrandSafetyUtils.f29190m)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            zzsVar = c2 != 0 ? (c2 == 1 || c2 == 2) ? com.google.android.gms.ads.internal.client.zzs.zzd() : c2 != 3 ? c2 != 4 ? new com.google.android.gms.ads.internal.client.zzs() : com.google.android.gms.ads.internal.client.zzs.zzb() : com.google.android.gms.ads.internal.client.zzs.zzc() : new com.google.android.gms.ads.internal.client.zzs(context, AdSize.BANNER);
        }
        zzfhaVar.zzs(zzsVar);
        zzfhaVar.zzz(true);
        zzfhaVar.zzA(bundle);
        zzcxiVar.zzi(zzfhaVar.zzJ());
        zzp.zza(zzcxiVar.zzj());
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzp.zzb(new zzau(zzasVar, null));
        new zzdds();
        return zzp.zzc();
    }

    private final ListenableFuture zzS(final String str) {
        final zzdpt[] zzdptVarArr = new zzdpt[1];
        ListenableFuture zzn = zzgfo.zzn(this.zzj.zza(), new zzgev() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzap.this.zzv(zzdptVarArr, str, (zzdpt) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
            @Override // java.lang.Runnable
            public final void run() {
                zzap.this.zzJ(zzdptVarArr);
            }
        }, this.zzk);
        return (zzgff) zzgfo.zze((zzgff) zzgfo.zzm((zzgff) zzgfo.zzo(zzgff.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhl)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfxq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                int i2 = zzap.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfxq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                int i2 = zzap.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            this.zzJ.zzb();
        } else {
            zzgfo.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkJ)).booleanValue() ? zzgfo.zzk(new zzgeu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                @Override // com.google.android.gms.internal.ads.zzgeu
                public final ListenableFuture zza() {
                    return zzap.this.zzu();
                }
            }, zzcan.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb(), new zzao(this), this.zzf.zzC());
        }
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzje)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjh)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjl)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbub zzbubVar, boolean z2) {
        ListenableFuture zzb2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbubVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i2++;
            }
        }
        if (i2 > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzap.this.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb2 = zzgfo.zzn(zzb2, new zzgev() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                        @Override // com.google.android.gms.internal.ads.zzgev
                        public final ListenableFuture zza(Object obj) {
                            ListenableFuture zzm;
                            zzm = zzgfo.zzm(r0.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfxq(r0, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = r2;
                                }

                                @Override // com.google.android.gms.internal.ads.zzfxq
                                public final Object apply(Object obj2) {
                                    return zzap.zzQ(this.zza, (String) obj2);
                                }
                            }, zzap.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzgfo.zzh(uri);
            }
            arrayList.add(zzb2);
        }
        zzgfo.zzr(zzgfo.zzd(arrayList), new zzan(this, zzbubVar, z2), this.zzf.zzC());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbub zzbubVar, boolean z2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhk)).booleanValue()) {
            try {
                zzbubVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        ListenableFuture zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzap.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb2 = zzgfo.zzn(zzb2, new zzgev() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzap.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgfo.zzr(zzb2, new zzam(this, zzbubVar, z2), this.zzf.zzC());
    }

    private static boolean zzX(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbuk zzbukVar = this.zzm;
        return (zzbukVar == null || (map = zzbukVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i2 = indexOf + 1;
        return Uri.parse(uri2.substring(0, i2) + str + ImpressionLog.R + str2 + "&" + uri2.substring(i2));
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfyo.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfma zzr(ListenableFuture listenableFuture, zzbzp zzbzpVar) {
        if (!zzfmd.zza() || !((Boolean) zzbek.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfma zza2 = ((zzx) zzgfo.zzp(listenableFuture)).zza();
            zza2.zzd(new ArrayList(Collections.singletonList(zzbzpVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbzpVar.zzd;
            zza2.zzb(zzmVar == null ? "" : zzmVar.zzp);
            zza2.zzf(zzbzpVar.zzd.zzm);
            return zza2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", zzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ void zzJ(zzdpt[] zzdptVarArr) {
        zzdpt zzdptVar = zzdptVarArr[0];
        if (zzdptVar != null) {
            this.zzj.zzb(zzgfo.zzh(zzdptVar));
        }
    }

    @VisibleForTesting
    public final boolean zzO(@NonNull Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    @VisibleForTesting
    public final boolean zzP(@NonNull Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjr)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbzp zzbzpVar, zzbzi zzbziVar) {
        ListenableFuture zzh;
        ListenableFuture zzb2;
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue()) {
            bundle.putLong(zzdtm.PUBLIC_API_CALL.zza(), zzbzpVar.zzd.zzz);
            t.t(bundle, zzdtm.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzflp zza2 = zzflo.zza(context, 22);
        zza2.zzi();
        if ("UNKNOWN".equals(zzbzpVar.zzb)) {
            List arrayList = new ArrayList();
            zzbcm zzbcmVar = zzbcv.zzhj;
            if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(zzbzpVar.zzd))) {
                ListenableFuture zzg = zzgfo.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFuture2 = zzg;
                listenableFuture = zzgfo.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgfo.zzr(listenableFuture, new zzal(this, listenableFuture2, zzbzpVar, zzbziVar, zza2), this.zzf.zzC());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkJ)).booleanValue()) {
            zzgfz zzgfzVar = zzcan.zza;
            zzh = zzgfzVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzap.this.zzq(zzbzpVar, bundle);
                }
            });
            zzb2 = zzgfo.zzn(zzh, new zzgev() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return ((zzx) obj).zzb();
                }
            }, zzgfzVar);
        } else {
            zzx zzR = zzR(this.zzg, zzbzpVar.zza, zzbzpVar.zzb, zzbzpVar.zzc, zzbzpVar.zzd, bundle);
            zzh = zzgfo.zzh(zzR);
            zzb2 = zzR.zzb();
        }
        listenableFuture = zzb2;
        listenableFuture2 = zzh;
        zzgfo.zzr(listenableFuture, new zzal(this, listenableFuture2, zzbzpVar, zzbziVar, zza2), this.zzf.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzg(zzbuk zzbukVar) {
        this.zzm = zzbukVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) {
        zzV(list, iObjectWrapper, zzbubVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) {
        zzW(list, iObjectWrapper, zzbubVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjd)).booleanValue()) {
            zzbcm zzbcmVar = zzbcv.zzhi;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            final zze zzeVar = new zze(webView, this.zzK, zzcan.zze);
            AdMobNetworkBridge.onAddedJavascriptInterface(webView, new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzs();
            }
            if (((Boolean) zzbew.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                zzcan.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zze.this.zzb();
                    }
                }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjo)).intValue(), TimeUnit.MILLISECONDS);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhk)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbuk zzbukVar = this.zzm;
            this.zzn = zzbv.zza(motionEvent, zzbukVar == null ? null : zzbukVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            obtain.setLocation(point.x, point.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) {
        zzV(list, iObjectWrapper, zzbubVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzl
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbub zzbubVar) {
        zzW(list, iObjectWrapper, zzbubVar, false);
    }

    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfhg zzfhgVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlC)).booleanValue() || (zzfhgVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfhgVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzavo e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzx zzq(zzbzp zzbzpVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzbzpVar.zza, zzbzpVar.zzb, zzbzpVar.zzc, zzbzpVar.zzd, bundle);
    }

    public final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    public final /* synthetic */ ListenableFuture zzv(zzdpt[] zzdptVarArr, String str, zzdpt zzdptVar) throws Exception {
        zzdptVarArr[0] = zzdptVar;
        Context context = this.zzg;
        zzbuk zzbukVar = this.zzm;
        Map map = zzbukVar.zzb;
        JSONObject zzd2 = zzbv.zzd(context, map, map, zzbukVar.zza, null);
        JSONObject zzg = zzbv.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbv.zzf(this.zzm.zza);
        JSONObject zze2 = zzbv.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdptVar.zzg(str, jSONObject);
    }

    public final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzgfo.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfxq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return zzap.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
