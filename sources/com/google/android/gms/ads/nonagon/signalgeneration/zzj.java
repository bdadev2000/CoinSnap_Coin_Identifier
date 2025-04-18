package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.facebook.internal.ServerProtocol;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdui;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdui zzd;
    private final ExecutorService zze;

    public zzj(Context context, zzdui zzduiVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzduiVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z2) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z2);
        if (map.containsKey(valueOf)) {
            return;
        }
        this.zzb.put(valueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzc(z2);
            }
        });
    }

    private final void zzi(zzl zzlVar, Pair pair, boolean z2) {
        zzlVar.zzd();
        QueryInfo zzb = zzlVar.zzb();
        if (zzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzc());
        }
        zzdui zzduiVar = this.zzd;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z2));
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(zzlVar.zzb() != null));
        zzv.zzd(zzduiVar, null, "sgpcr", pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd(boolean z2, boolean z3) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z2);
            Map map = this.zza;
            Boolean valueOf = Boolean.valueOf(z2);
            zzl zzlVar = (zzl) map.get(valueOf);
            int i2 = 0;
            if (z3 && zzlVar != null) {
                i2 = zzlVar.zza() + 1;
            }
            int i3 = i2;
            zzl zzlVar2 = (zzl) this.zza.get(valueOf);
            final zzk zzkVar = new zzk(this, z2, i3, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zzf()), this.zzd);
            final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkJ)).booleanValue()) {
                this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzj.this.zza(build, zzkVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzkVar);
            }
        } catch (Throwable th) {
            throw th;
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

    public final /* synthetic */ void zzc(boolean z2) {
        zzd(z2, false);
    }

    public final /* synthetic */ void zze(Object obj, Pair pair) {
        boolean z2 = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zzc);
            if (zza != null) {
                z2 = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z2);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0029, B:14:0x002f, B:15:0x0048, B:18:0x0056, B:24:0x0078, B:25:0x007c, B:27:0x0082, B:31:0x003c, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0029, B:14:0x002f, B:15:0x0048, B:18:0x0056, B:24:0x0078, B:25:0x007c, B:27:0x0082, B:31:0x003c, B:32:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x001b, B:12:0x0029, B:14:0x002f, B:15:0x0048, B:18:0x0056, B:24:0x0078, B:25:0x007c, B:27:0x0082, B:31:0x003c, B:32:0x0024), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzf(final boolean r9, com.google.android.gms.ads.nonagon.signalgeneration.zzl r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Map r0 = r8.zza     // Catch: java.lang.Throwable -> L22
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.nonagon.signalgeneration.zzl r0 = (com.google.android.gms.ads.nonagon.signalgeneration.zzl) r0     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            boolean r2 = r0.zze()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L24
            com.google.android.gms.ads.query.QueryInfo r0 = r0.zzb()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            com.google.android.gms.ads.query.QueryInfo r0 = r10.zzb()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L29
            goto L24
        L22:
            r9 = move-exception
            goto L8e
        L24:
            java.util.Map r0 = r8.zza     // Catch: java.lang.Throwable -> L22
            r0.put(r1, r10)     // Catch: java.lang.Throwable -> L22
        L29:
            com.google.android.gms.ads.query.QueryInfo r0 = r10.zzb()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjy     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L22
            goto L48
        L3c:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzjz     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L22
        L48:
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.query.QueryInfo r2 = r10.zzb()     // Catch: java.lang.Throwable -> L22
            r3 = 0
            if (r2 != 0) goto L55
            r2 = 1
            goto L56
        L55:
            r2 = r3
        L56:
            java.util.concurrent.ScheduledExecutorService r4 = com.google.android.gms.internal.ads.zzcan.zzd     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r5 = new com.google.android.gms.ads.nonagon.signalgeneration.zzg     // Catch: java.lang.Throwable -> L22
            r5.<init>()     // Catch: java.lang.Throwable -> L22
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L22
            r4.schedule(r5, r6, r9)     // Catch: java.lang.Throwable -> L22
            java.util.Map r9 = r8.zzb     // Catch: java.lang.Throwable -> L22
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Throwable -> L22
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L22
            java.util.Map r0 = r8.zzb     // Catch: java.lang.Throwable -> L22
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            if (r9 != 0) goto L78
            goto L8c
        L78:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L22
        L7c:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L22
            android.util.Pair r0 = (android.util.Pair) r0     // Catch: java.lang.Throwable -> L22
            r8.zzi(r10, r0, r3)     // Catch: java.lang.Throwable -> L22
            goto L7c
        L8c:
            monitor-exit(r8)
            return
        L8e:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzj.zzf(boolean, com.google.android.gms.ads.nonagon.signalgeneration.zzl):void");
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zze(obj, pair);
            }
        });
    }
}
