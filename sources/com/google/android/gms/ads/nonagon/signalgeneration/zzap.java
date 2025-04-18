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
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbue;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzcvu;
import com.google.android.gms.internal.ads.zzdcd;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffm;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzfko;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzfwh;
import com.google.android.gms.internal.ads.zzfxf;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgdz;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzges;
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
import o.a;
import o.h;
import org.json.JSONObject;
import ua.b;

/* loaded from: classes3.dex */
public final class zzap extends zzbzg {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbds zzI;
    private final zzj zzJ;
    private final zza zzK;
    private final zzchk zzf;
    private Context zzg;
    private final zzavc zzh;
    private final zzffs zzi;
    private final zzfgn zzj;
    private final zzges zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbue zzm;
    private final zzdsr zzp;
    private final zzflr zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgV)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgU)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgX)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgZ)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgY);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzha);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhb);

    public zzap(zzchk zzchkVar, Context context, zzavc zzavcVar, zzfgn zzfgnVar, zzges zzgesVar, ScheduledExecutorService scheduledExecutorService, zzdsr zzdsrVar, zzflr zzflrVar, VersionInfoParcel versionInfoParcel, zzbds zzbdsVar, zzffs zzffsVar, zzj zzjVar, zza zzaVar) {
        List list;
        this.zzf = zzchkVar;
        this.zzg = context;
        this.zzh = zzavcVar;
        this.zzi = zzffsVar;
        this.zzj = zzfgnVar;
        this.zzk = zzgesVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdsrVar;
        this.zzq = zzflrVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdsVar;
        this.zzJ = zzjVar;
        this.zzK = zzaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhc)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhd));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhe));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhf));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhg));
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
        if (!TextUtils.isEmpty(str)) {
            return zzZ(uri, "nas", str);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzx zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, Bundle bundle) {
        char c10;
        zzffm zzffmVar = new zzffm();
        if ("REWARDED".equals(str2)) {
            zzffmVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzffmVar.zzp().zza(3);
        }
        zzw zzp = this.zzf.zzp();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzffmVar.zzt(str);
        if (zzmVar == null) {
            zzmVar = new com.google.android.gms.ads.internal.client.zzn().zza();
        }
        zzffmVar.zzH(zzmVar);
        if (zzsVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1 && c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            zzsVar = new com.google.android.gms.ads.internal.client.zzs();
                        } else {
                            zzsVar = com.google.android.gms.ads.internal.client.zzs.zzb();
                        }
                    } else {
                        zzsVar = com.google.android.gms.ads.internal.client.zzs.zzc();
                    }
                } else {
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zzd();
                }
            } else {
                zzsVar = new com.google.android.gms.ads.internal.client.zzs(context, AdSize.BANNER);
            }
        }
        zzffmVar.zzs(zzsVar);
        zzffmVar.zzz(true);
        zzffmVar.zzA(bundle);
        zzcvuVar.zzi(zzffmVar.zzJ());
        zzp.zza(zzcvuVar.zzj());
        zzas zzasVar = new zzas();
        zzasVar.zza(str2);
        zzp.zzb(new zzau(zzasVar, null));
        new zzdcd();
        return zzp.zzc();
    }

    private final b zzS(final String str) {
        final zzdoc[] zzdocVarArr = new zzdoc[1];
        b zzn = zzgei.zzn(this.zzj.zza(), new zzgdp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final b zza(Object obj) {
                return zzap.this.zzv(zzdocVarArr, str, (zzdoc) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
            @Override // java.lang.Runnable
            public final void run() {
                zzap.this.zzJ(zzdocVarArr);
            }
        }, this.zzk);
        return (zzgdz) zzgei.zze((zzgdz) zzgei.zzm((zzgdz) zzgei.zzo(zzgdz.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhn)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfwh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                int i10 = zzap.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfwh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                int i10 = zzap.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        b zzb2;
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            this.zzJ.zzb();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkK)).booleanValue()) {
            zzb2 = zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                @Override // com.google.android.gms.internal.ads.zzgdo
                public final b zza() {
                    return zzap.this.zzu();
                }
            }, zzcaj.zza);
        } else {
            zzb2 = zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
        }
        zzgei.zzr(zzb2, new zzao(this), this.zzf.zzC());
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjg)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjj)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjn)).booleanValue() || !this.zzF.getAndSet(true)) {
                    zzT();
                }
            }
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbtv zzbtvVar, boolean z10) {
        b zzb2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhm)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbtvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzO(uri)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzgei.zzh(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzap.this.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb2 = zzgei.zzn(zzb2, new zzgdp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                        @Override // com.google.android.gms.internal.ads.zzgdp
                        public final b zza(Object obj) {
                            b zzm;
                            zzm = zzgei.zzm(r0.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfwh(r0, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = r2;
                                }

                                @Override // com.google.android.gms.internal.ads.zzfwh
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
            }
            arrayList.add(zzb2);
        }
        zzgei.zzr(zzgei.zzd(arrayList), new zzan(this, zzbtvVar, z10), this.zzf.zzC());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbtv zzbtvVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhm)).booleanValue()) {
            try {
                zzbtvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                return;
            }
        }
        b zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzap.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb2 = zzgei.zzn(zzb2, new zzgdp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final b zza(Object obj) {
                    return zzap.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgei.zzr(zzb2, new zzam(this, zzbtvVar, z10), this.zzf.zzC());
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
        zzbue zzbueVar = this.zzm;
        return (zzbueVar == null || (map = zzbueVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfxf.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfkl zzr(b bVar, zzbzl zzbzlVar) {
        String str;
        if (!zzfko.zza() || !((Boolean) zzbeg.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfkl zza2 = ((zzx) zzgei.zzp(bVar)).zza();
            zza2.zzd(new ArrayList(Collections.singletonList(zzbzlVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbzlVar.zzd;
            if (zzmVar == null) {
                str = "";
            } else {
                str = zzmVar.zzp;
            }
            zza2.zzb(str);
            zza2.zzf(zzbzlVar.zzd.zzm);
            return zza2;
        } catch (ExecutionException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
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

    public final /* synthetic */ void zzJ(zzdoc[] zzdocVarArr) {
        zzdoc zzdocVar = zzdocVarArr[0];
        if (zzdocVar != null) {
            this.zzj.zzb(zzgei.zzh(zzdocVar));
        }
    }

    public final boolean zzO(@NonNull Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    public final boolean zzP(@NonNull Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjt)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (h) ObjectWrapper.unwrap(iObjectWrapper2), str, (a) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbzl zzbzlVar, zzbze zzbzeVar) {
        b zzh;
        b zzb2;
        b bVar;
        b bVar2;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
            bundle.putLong(zzdrv.PUBLIC_API_CALL.zza(), zzbzlVar.zzd.zzz);
            e.m(bundle, zzdrv.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfka zza2 = zzfjz.zza(context, 22);
        zza2.zzi();
        if ("UNKNOWN".equals(zzbzlVar.zzb)) {
            List arrayList = new ArrayList();
            zzbce zzbceVar = zzbcn.zzhl;
            if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).split(","));
            }
            if (arrayList.contains(zzv.zzc(zzbzlVar.zzd))) {
                bVar2 = zzgei.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                bVar = zzgei.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzgei.zzr(bVar, new zzal(this, bVar2, zzbzlVar, zzbzeVar, zza2), this.zzf.zzC());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkK)).booleanValue()) {
            zzges zzgesVar = zzcaj.zza;
            zzh = zzgesVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzap.this.zzq(zzbzlVar, bundle);
                }
            });
            zzb2 = zzgei.zzn(zzh, new zzgdp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final b zza(Object obj) {
                    return ((zzx) obj).zzb();
                }
            }, zzgesVar);
        } else {
            zzx zzR = zzR(this.zzg, zzbzlVar.zza, zzbzlVar.zzb, zzbzlVar.zzc, zzbzlVar.zzd, bundle);
            zzh = zzgei.zzh(zzR);
            zzb2 = zzR.zzb();
        }
        b bVar3 = zzh;
        bVar = zzb2;
        bVar2 = bVar3;
        zzgei.zzr(bVar, new zzal(this, bVar2, zzbzlVar, zzbzeVar, zza2), this.zzf.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbue zzbueVar) {
        this.zzm = zzbueVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) {
        zzV(list, iObjectWrapper, zzbtvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) {
        zzW(list, iObjectWrapper, zzbtvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjf)).booleanValue()) {
            zzbce zzbceVar = zzbcn.zzhk;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            final zze zzeVar = new zze(webView, this.zzK, zzcaj.zze);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzeVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjp)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzs();
            }
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                zzcaj.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zze.this.zzb();
                    }
                }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjq)).intValue(), TimeUnit.MILLISECONDS);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzk(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhm)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
        zzbue zzbueVar = this.zzm;
        if (zzbueVar == null) {
            view = null;
        } else {
            view = zzbueVar.zza;
        }
        this.zzn = zzbu.zza(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzn;
        obtain.setLocation(point.x, point.y);
        this.zzh.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) {
        zzV(list, iObjectWrapper, zzbtvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtv zzbtvVar) {
        zzW(list, iObjectWrapper, zzbtvVar, false);
    }

    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzffs zzffsVar;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlI)).booleanValue() && (zzffsVar = this.zzi) != null) {
                uri = zzffsVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            } else {
                uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
            }
        } catch (zzavd e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzx zzq(zzbzl zzbzlVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzbzlVar.zza, zzbzlVar.zzb, zzbzlVar.zzc, zzbzlVar.zzd, bundle);
    }

    public final /* synthetic */ b zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    public final /* synthetic */ b zzv(zzdoc[] zzdocVarArr, String str, zzdoc zzdocVar) throws Exception {
        zzdocVarArr[0] = zzdocVar;
        Context context = this.zzg;
        zzbue zzbueVar = this.zzm;
        Map map = zzbueVar.zzb;
        JSONObject zzd2 = zzbu.zzd(context, map, map, zzbueVar.zza, null);
        JSONObject zzg = zzbu.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbu.zzf(this.zzm.zza);
        JSONObject zze2 = zzbu.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbu.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdocVar.zzg(str, jSONObject);
    }

    public final /* synthetic */ b zzw(final ArrayList arrayList) throws Exception {
        return zzgei.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfwh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return zzap.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
