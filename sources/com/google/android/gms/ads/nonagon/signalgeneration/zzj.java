package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdsr zzd;
    private final ExecutorService zze;

    public zzj(Context context, zzdsr zzdsrVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdsrVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z10) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z10);
        if (!map.containsKey(valueOf)) {
            this.zzb.put(valueOf, new ArrayList());
            this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.zzc(z10);
                }
            });
        }
    }

    private final void zzi(zzl zzlVar, Pair pair, boolean z10) {
        zzlVar.zzd();
        QueryInfo zzb = zzlVar.zzb();
        if (zzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzc());
        }
        zzdsr zzdsrVar = this.zzd;
        Pair[] pairArr = new Pair[7];
        boolean z11 = false;
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z10));
        if (zzlVar.zzb() != null) {
            z11 = true;
        }
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(z11));
        zzv.zzd(zzdsrVar, null, "sgpcr", pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd(boolean z10, boolean z11) {
        Boolean valueOf;
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z10);
        Map map = this.zza;
        Boolean valueOf2 = Boolean.valueOf(z10);
        zzl zzlVar = (zzl) map.get(valueOf2);
        int i10 = 0;
        if (z11 && zzlVar != null) {
            i10 = zzlVar.zza() + 1;
        }
        int i11 = i10;
        zzl zzlVar2 = (zzl) this.zza.get(valueOf2);
        if (zzlVar2 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(zzlVar2.zzf());
        }
        final zzk zzkVar = new zzk(this, z10, i11, valueOf, this.zzd);
        final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkK)).booleanValue()) {
            this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzj.this.zza(build, zzkVar);
                }
            });
        } else {
            QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzkVar);
        }
    }

    public final /* synthetic */ Object zza(AdRequest adRequest, zzk zzkVar) throws Exception {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzkVar);
        return Boolean.TRUE;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    public final /* synthetic */ void zzc(boolean z10) {
        zzd(z10, false);
    }

    public final /* synthetic */ void zze(Object obj, Pair pair) {
        boolean z10 = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zzc);
            if (zza != null) {
                z10 = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z10);
        zzl zzlVar = (zzl) map.get(valueOf);
        if (zzlVar != null && !zzlVar.zze()) {
            zzi(zzlVar, pair, true);
            return;
        }
        List list = (List) this.zzb.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(valueOf, list);
        }
        list.add(pair);
    }

    public final synchronized void zzf(final boolean z10, zzl zzlVar) {
        Integer num;
        final boolean z11;
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z10);
        zzl zzlVar2 = (zzl) map.get(valueOf);
        if (zzlVar2 == null || zzlVar2.zze() || zzlVar2.zzb() == null || zzlVar.zzb() != null) {
            this.zza.put(valueOf, zzlVar);
        }
        if (zzlVar.zzb() != null) {
            num = (Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjA);
        } else {
            num = (Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjB);
        }
        int intValue = num.intValue();
        if (zzlVar.zzb() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzcaj.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzd(z10, z11);
            }
        }, intValue, TimeUnit.SECONDS);
        List list = (List) this.zzb.get(valueOf);
        this.zzb.put(valueOf, new ArrayList());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi(zzlVar, (Pair) it.next(), false);
            }
        }
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zze(obj, pair);
            }
        });
    }
}
