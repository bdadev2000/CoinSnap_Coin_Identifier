package com.vungle.ads.internal.load;

import U4.RunnableC0311g;
import c7.C0620c;
import c7.C0665z;
import c7.EnumC0618b;
import com.vungle.ads.C2137s;
import com.vungle.ads.C2139t;
import com.vungle.ads.g1;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class e implements com.vungle.ads.internal.downloader.i {
    final /* synthetic */ j this$0;

    public e(j jVar) {
        this.this$0 = jVar;
    }

    public static /* synthetic */ void a(File file, e eVar, com.vungle.ads.internal.downloader.n nVar, j jVar) {
        m50onSuccess$lambda1(file, eVar, nVar, jVar);
    }

    /* renamed from: onError$lambda-0 */
    public static final void m49onError$lambda0(com.vungle.ads.internal.downloader.d dVar, j jVar, com.vungle.ads.internal.downloader.n nVar) {
        List list;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        List list2;
        G7.j.e(jVar, "this$0");
        G7.j.e(nVar, "$downloadRequest");
        if (dVar != null) {
            list2 = jVar.errors;
            list2.add(dVar);
        } else {
            list = jVar.errors;
            list.add(new com.vungle.ads.internal.downloader.d(-1, new IOException("Downloaded file not found!"), com.vungle.ads.internal.downloader.c.Companion.getREQUEST_ERROR()));
        }
        if (nVar.getAsset().isRequired()) {
            atomicLong2 = jVar.downloadRequiredCount;
            if (atomicLong2.decrementAndGet() <= 0) {
                jVar.onAdLoadFailed(new C2139t());
                jVar.cancel();
                return;
            }
        }
        atomicLong = jVar.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            jVar.onAdLoadFailed(new C2139t());
        }
    }

    /* renamed from: onSuccess$lambda-1 */
    public static final void m50onSuccess$lambda1(File file, e eVar, com.vungle.ads.internal.downloader.n nVar, j jVar) {
        g1 g1Var;
        g1 g1Var2;
        String str;
        String str2;
        AtomicLong atomicLong;
        List list;
        AtomicLong atomicLong2;
        List list2;
        boolean processTemplate;
        List list3;
        g1 g1Var3;
        g1 g1Var4;
        String str3;
        String str4;
        G7.j.e(file, "$file");
        G7.j.e(eVar, "this$0");
        G7.j.e(nVar, "$downloadRequest");
        G7.j.e(jVar, "this$1");
        if (!file.exists()) {
            eVar.onError(new com.vungle.ads.internal.downloader.d(-1, new IOException("Downloaded file not found!"), com.vungle.ads.internal.downloader.c.Companion.getFILE_NOT_FOUND_ERROR()), nVar);
            return;
        }
        C0620c asset = nVar.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(EnumC0618b.DOWNLOAD_SUCCESS);
        String str5 = null;
        if (nVar.isTemplate()) {
            nVar.stopRecord();
            g1Var3 = jVar.templateSizeMetric;
            g1Var3.setValue(Long.valueOf(file.length()));
            C2137s c2137s = C2137s.INSTANCE;
            g1Var4 = jVar.templateSizeMetric;
            String referenceId = jVar.getAdRequest().getPlacement().getReferenceId();
            C0665z advertisement$vungle_ads_release = jVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release != null) {
                str3 = advertisement$vungle_ads_release.getCreativeId();
            } else {
                str3 = null;
            }
            C0665z advertisement$vungle_ads_release2 = jVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release2 != null) {
                str4 = advertisement$vungle_ads_release2.eventId();
            } else {
                str4 = null;
            }
            c2137s.logMetric$vungle_ads_release(g1Var4, referenceId, str3, str4, asset.getServerPath());
        } else if (nVar.isMainVideo()) {
            g1Var = jVar.mainVideoSizeMetric;
            g1Var.setValue(Long.valueOf(file.length()));
            C2137s c2137s2 = C2137s.INSTANCE;
            g1Var2 = jVar.mainVideoSizeMetric;
            String referenceId2 = jVar.getAdRequest().getPlacement().getReferenceId();
            C0665z advertisement$vungle_ads_release3 = jVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release3 != null) {
                str = advertisement$vungle_ads_release3.getCreativeId();
            } else {
                str = null;
            }
            C0665z advertisement$vungle_ads_release4 = jVar.getAdvertisement$vungle_ads_release();
            if (advertisement$vungle_ads_release4 != null) {
                str2 = advertisement$vungle_ads_release4.eventId();
            } else {
                str2 = null;
            }
            c2137s2.logMetric$vungle_ads_release(g1Var2, referenceId2, str, str2, asset.getServerPath());
        }
        C0665z advertisement$vungle_ads_release5 = jVar.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release5 != null) {
            advertisement$vungle_ads_release5.updateAdAssetPath(asset);
        }
        if (nVar.isTemplate()) {
            jVar.injectOMIfNeeded(jVar.getAdvertisement$vungle_ads_release());
            processTemplate = jVar.processTemplate(asset, jVar.getAdvertisement$vungle_ads_release());
            if (!processTemplate) {
                list3 = jVar.errors;
                list3.add(new com.vungle.ads.internal.downloader.d(-1, new C2139t(), com.vungle.ads.internal.downloader.c.Companion.getINTERNAL_ERROR()));
            }
        }
        if (asset.isRequired()) {
            atomicLong2 = jVar.downloadRequiredCount;
            if (atomicLong2.decrementAndGet() <= 0) {
                list2 = jVar.errors;
                if (list2.isEmpty()) {
                    jVar.onAdReady();
                } else {
                    jVar.onAdLoadFailed(new C2139t());
                    jVar.cancel();
                    return;
                }
            }
        }
        atomicLong = jVar.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            list = jVar.errors;
            if (list.isEmpty()) {
                b adRequest = jVar.getAdRequest();
                C0665z advertisement$vungle_ads_release6 = jVar.getAdvertisement$vungle_ads_release();
                if (advertisement$vungle_ads_release6 != null) {
                    str5 = advertisement$vungle_ads_release6.eventId();
                }
                jVar.onDownloadCompleted(adRequest, str5);
                return;
            }
            jVar.onAdLoadFailed(new C2139t());
        }
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onError(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n nVar) {
        Integer num;
        G7.j.e(nVar, "downloadRequest");
        u uVar = v.Companion;
        StringBuilder sb = new StringBuilder("onError called: reason ");
        Throwable th = null;
        if (dVar != null) {
            num = Integer.valueOf(dVar.getReason());
        } else {
            num = null;
        }
        sb.append(num);
        sb.append("; cause ");
        if (dVar != null) {
            th = dVar.getCause();
        }
        sb.append(th);
        uVar.e("BaseAdLoader", sb.toString());
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new RunnableC0311g(dVar, this.this$0, nVar, 8));
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onSuccess(File file, com.vungle.ads.internal.downloader.n nVar) {
        G7.j.e(file, "file");
        G7.j.e(nVar, "downloadRequest");
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new I2.f(file, this, nVar, this.this$0, 7));
    }
}
