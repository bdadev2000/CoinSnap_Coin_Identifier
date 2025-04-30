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
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import f4.c;
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
import u.AbstractC2736e;
import u.C2732a;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzaj extends zzcbf {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbfq zzI;
    private final zze zzJ;
    private final zzcjd zzf;
    private Context zzg;
    private final zzaxd zzh;
    private final zzfhs zzi;
    private final zzfin zzj;
    private final zzgge zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbwe zzm;
    private final zzdvh zzp;
    private final zzfoe zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhu)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzht)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhw)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhy)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhx);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhz);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhA);

    public zzaj(zzcjd zzcjdVar, Context context, zzaxd zzaxdVar, zzfin zzfinVar, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzdvh zzdvhVar, zzfoe zzfoeVar, VersionInfoParcel versionInfoParcel, zzbfq zzbfqVar, zzfhs zzfhsVar, zze zzeVar) {
        List list;
        this.zzf = zzcjdVar;
        this.zzg = context;
        this.zzh = zzaxdVar;
        this.zzi = zzfhsVar;
        this.zzj = zzfinVar;
        this.zzk = zzggeVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdvhVar;
        this.zzq = zzfoeVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbfqVar;
        this.zzJ = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhB)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhC));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhD));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhE));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhF));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzaj zzajVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzajVar.zzO((Uri) it.next())) {
                zzajVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zzZ(uri, "nas", str);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzr zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, Bundle bundle) {
        char c9;
        zzfhm zzfhmVar = new zzfhm();
        if ("REWARDED".equals(str2)) {
            zzfhmVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfhmVar.zzp().zza(3);
        }
        zzq zzp = this.zzf.zzp();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfhmVar.zzt(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfhmVar.zzH(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 != 0) {
                if (c9 != 1 && c9 != 2) {
                    if (c9 != 3) {
                        if (c9 != 4) {
                            zzqVar = new com.google.android.gms.ads.internal.client.zzq();
                        } else {
                            zzqVar = com.google.android.gms.ads.internal.client.zzq.zzb();
                        }
                    } else {
                        zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
                    }
                } else {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                }
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            }
        }
        zzfhmVar.zzs(zzqVar);
        zzfhmVar.zzz(true);
        zzfhmVar.zzA(bundle);
        zzcytVar.zzi(zzfhmVar.zzJ());
        zzp.zza(zzcytVar.zzj());
        zzam zzamVar = new zzam();
        zzamVar.zza(str2);
        zzp.zzb(new zzao(zzamVar, null));
        new zzdfa();
        return zzp.zzc();
    }

    private final c zzS(final String str) {
        final zzdqs[] zzdqsVarArr = new zzdqs[1];
        c zzn = zzgft.zzn(this.zzj.zza(), new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final c zza(Object obj) {
                return zzaj.this.zzv(zzdqsVarArr, str, (zzdqs) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzaj.this.zzJ(zzdqsVarArr);
            }
        }, this.zzk);
        return zzgft.zze(zzgft.zzm((zzgfk) zzgft.zzo(zzgfk.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhL)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                int i9 = zzaj.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                int i9 = zzaj.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        c zzb2;
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlb)).booleanValue()) {
            zzb2 = zzgft.zzk(new zzgez() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // com.google.android.gms.internal.ads.zzgez
                public final c zza() {
                    return zzaj.this.zzu();
                }
            }, zzcci.zza);
        } else {
            zzb2 = zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
        }
        zzgft.zzr(zzb2, new zzai(this), this.zzf.zzB());
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjB)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjE)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjI)).booleanValue() || !this.zzF.getAndSet(true)) {
                    zzT();
                }
            }
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbvv zzbvvVar, boolean z8) {
        c zzb2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbvvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                return;
            }
        }
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i9++;
            }
        }
        if (i9 > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzO(uri)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzgft.zzh(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaj.this.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb2 = zzgft.zzn(zzb2, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzx
                        @Override // com.google.android.gms.internal.ads.zzgfa
                        public final c zza(Object obj) {
                            c zzm;
                            zzm = zzgft.zzm(r0.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                                @Override // com.google.android.gms.internal.ads.zzfxu
                                public final Object apply(Object obj2) {
                                    return zzaj.zzQ(r2, (String) obj2);
                                }
                            }, zzaj.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzgft.zzr(zzgft.zzd(arrayList), new zzah(this, zzbvvVar, z8), this.zzf.zzB());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbvv zzbvvVar, boolean z8) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            try {
                zzbvvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                return;
            }
        }
        c zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaj.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb2 = zzgft.zzn(zzb2, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final c zza(Object obj) {
                    return zzaj.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgft.zzr(zzb2, new zzag(this, zzbvvVar, z8), this.zzf.zzB());
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
        zzbwe zzbweVar = this.zzm;
        if (zzbweVar != null && (map = zzbweVar.zzb) != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i9 = indexOf + 1;
            StringBuilder sb = new StringBuilder(uri2.substring(0, i9));
            AbstractC2914a.j(sb, str, "=", str2, "&");
            sb.append(uri2.substring(i9));
            return Uri.parse(sb.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfyv.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfmn zzr(c cVar, zzcbk zzcbkVar) {
        String str;
        if (!zzfmq.zza() || !((Boolean) zzbgd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfmn zza2 = ((zzr) zzgft.zzp(cVar)).zza();
            zza2.zze(new ArrayList(Collections.singletonList(zzcbkVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcbkVar.zzd;
            if (zzlVar == null) {
                str = "";
            } else {
                str = zzlVar.zzp;
            }
            zza2.zzb(str);
            zza2.zzg(zzcbkVar.zzd.zzm);
            return zza2;
        } catch (ExecutionException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzZ(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String str;
        if (this.zzh.zzc() != null) {
            str = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzP(uri)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzZ(uri, "ms", str));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    public final /* synthetic */ void zzJ(zzdqs[] zzdqsVarArr) {
        zzdqs zzdqsVar = zzdqsVarArr[0];
        if (zzdqsVar != null) {
            this.zzj.zzb(zzgft.zzh(zzdqsVar));
        }
    }

    public final boolean zzO(@NonNull Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    public final boolean zzP(@NonNull Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjL)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (AbstractC2736e) ObjectWrapper.unwrap(iObjectWrapper2), str, (C2732a) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(IObjectWrapper iObjectWrapper, final zzcbk zzcbkVar, zzcbd zzcbdVar) {
        c zzh;
        c zzb2;
        c cVar;
        c cVar2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            bundle.putLong(zzdul.PUBLIC_API_CALL.zza(), zzcbkVar.zzd.zzz);
            bundle.putLong(zzdul.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfmc zza2 = zzfmb.zza(context, zzfmu.CUI_NAME_SCAR_SIGNALS);
        zza2.zzj();
        if ("UNKNOWN".equals(zzcbkVar.zzb)) {
            List arrayList = new ArrayList();
            zzbeg zzbegVar = zzbep.zzhJ;
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).split(","));
            }
            if (arrayList.contains(zzp.zzc(zzcbkVar.zzd))) {
                c zzg = zzgft.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                cVar2 = zzg;
                cVar = zzgft.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgft.zzr(cVar, new zzaf(this, cVar2, zzcbkVar, zzcbdVar, zza2), this.zzf.zzB());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlb)).booleanValue()) {
            zzgge zzggeVar = zzcci.zza;
            zzh = zzggeVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaj.this.zzq(zzcbkVar, bundle);
                }
            });
            zzb2 = zzgft.zzn(zzh, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final c zza(Object obj) {
                    return ((zzr) obj).zzb();
                }
            }, zzggeVar);
        } else {
            zzr zzR = zzR(this.zzg, zzcbkVar.zza, zzcbkVar.zzb, zzcbkVar.zzc, zzcbkVar.zzd, bundle);
            zzh = zzgft.zzh(zzR);
            zzb2 = zzR.zzb();
        }
        cVar = zzb2;
        cVar2 = zzh;
        zzgft.zzr(cVar, new zzaf(this, cVar2, zzcbkVar, zzcbdVar, zza2), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zzbwe zzbweVar) {
        this.zzm = zzbweVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzV(list, iObjectWrapper, zzbvvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzW(list, iObjectWrapper, zzbvvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjA)).booleanValue()) {
            zzbeg zzbegVar = zzbep.zzhI;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjK)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzs();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
        zzbwe zzbweVar = this.zzm;
        if (zzbweVar == null) {
            view = null;
        } else {
            view = zzbweVar.zza;
        }
        this.zzn = zzbz.zza(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzn;
        obtain.setLocation(point.x, point.y);
        this.zzh.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzV(list, iObjectWrapper, zzbvvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzW(list, iObjectWrapper, zzbvvVar, false);
    }

    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfhs zzfhsVar;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() && (zzfhsVar = this.zzi) != null) {
                uri = zzfhsVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            } else {
                uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            }
        } catch (zzaxe e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e4);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzr zzq(zzcbk zzcbkVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzcbkVar.zza, zzcbkVar.zzb, zzcbkVar.zzc, zzcbkVar.zzd, bundle);
    }

    public final /* synthetic */ c zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    public final /* synthetic */ c zzv(zzdqs[] zzdqsVarArr, String str, zzdqs zzdqsVar) throws Exception {
        zzdqsVarArr[0] = zzdqsVar;
        Context context = this.zzg;
        zzbwe zzbweVar = this.zzm;
        Map map = zzbweVar.zzb;
        JSONObject zzd2 = zzbz.zzd(context, map, map, zzbweVar.zza, null);
        JSONObject zzg = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbz.zzf(this.zzm.zza);
        JSONObject zze2 = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdqsVar.zzg(str, jSONObject);
    }

    public final /* synthetic */ c zzw(final ArrayList arrayList) throws Exception {
        return zzgft.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return zzaj.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
