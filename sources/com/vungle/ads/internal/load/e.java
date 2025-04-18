package com.vungle.ads.internal.load;

import bh.z;
import com.vungle.ads.f3;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements com.vungle.ads.internal.downloader.i {
    final /* synthetic */ j this$0;

    public e(j jVar) {
        this.this$0 = jVar;
    }

    public static /* synthetic */ void a(File file, e eVar, com.vungle.ads.internal.downloader.n nVar, j jVar) {
        m30onSuccess$lambda1(file, eVar, nVar, jVar);
    }

    /* renamed from: onError$lambda-0 */
    public static final void m29onError$lambda0(com.vungle.ads.internal.downloader.d dVar, j this$0, com.vungle.ads.internal.downloader.n downloadRequest) {
        List list;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        List list2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        if (dVar != null) {
            list2 = this$0.errors;
            list2.add(dVar);
        } else {
            list = this$0.errors;
            list.add(new com.vungle.ads.internal.downloader.d(-1, new IOException("Downloaded file not found!"), com.vungle.ads.internal.downloader.c.Companion.getREQUEST_ERROR()));
        }
        if (downloadRequest.getAsset().isRequired()) {
            atomicLong2 = this$0.downloadRequiredCount;
            if (atomicLong2.decrementAndGet() <= 0) {
                this$0.onAdLoadFailed(new com.vungle.ads.t());
                this$0.cancel();
                return;
            }
        }
        atomicLong = this$0.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            this$0.onAdLoadFailed(new com.vungle.ads.t());
        }
    }

    /* renamed from: onSuccess$lambda-1 */
    public static final void m30onSuccess$lambda1(File file, e this$0, com.vungle.ads.internal.downloader.n downloadRequest, j this$1) {
        f3 f3Var;
        f3 f3Var2;
        AtomicLong atomicLong;
        List list;
        AtomicLong atomicLong2;
        List list2;
        boolean processTemplate;
        List list3;
        f3 f3Var3;
        f3 f3Var4;
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.onError(new com.vungle.ads.internal.downloader.d(-1, new IOException("Downloaded file not found!"), com.vungle.ads.internal.downloader.c.Companion.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        bh.c asset = downloadRequest.getAsset();
        asset.setFileSize(file.length());
        asset.setStatus(bh.b.DOWNLOAD_SUCCESS);
        if (downloadRequest.isTemplate()) {
            downloadRequest.stopRecord();
            f3Var3 = this$1.templateSizeMetric;
            f3Var3.setValue(Long.valueOf(file.length()));
            com.vungle.ads.s sVar = com.vungle.ads.s.INSTANCE;
            f3Var4 = this$1.templateSizeMetric;
            String referenceId = this$1.getAdRequest().getPlacement().getReferenceId();
            z advertisement$vungle_ads_release = this$1.getAdvertisement$vungle_ads_release();
            String creativeId = advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getCreativeId() : null;
            z advertisement$vungle_ads_release2 = this$1.getAdvertisement$vungle_ads_release();
            sVar.logMetric$vungle_ads_release(f3Var4, referenceId, creativeId, advertisement$vungle_ads_release2 != null ? advertisement$vungle_ads_release2.eventId() : null, asset.getServerPath());
        } else if (downloadRequest.isMainVideo()) {
            f3Var = this$1.mainVideoSizeMetric;
            f3Var.setValue(Long.valueOf(file.length()));
            com.vungle.ads.s sVar2 = com.vungle.ads.s.INSTANCE;
            f3Var2 = this$1.mainVideoSizeMetric;
            String referenceId2 = this$1.getAdRequest().getPlacement().getReferenceId();
            z advertisement$vungle_ads_release3 = this$1.getAdvertisement$vungle_ads_release();
            String creativeId2 = advertisement$vungle_ads_release3 != null ? advertisement$vungle_ads_release3.getCreativeId() : null;
            z advertisement$vungle_ads_release4 = this$1.getAdvertisement$vungle_ads_release();
            sVar2.logMetric$vungle_ads_release(f3Var2, referenceId2, creativeId2, advertisement$vungle_ads_release4 != null ? advertisement$vungle_ads_release4.eventId() : null, asset.getServerPath());
        }
        z advertisement$vungle_ads_release5 = this$1.getAdvertisement$vungle_ads_release();
        if (advertisement$vungle_ads_release5 != null) {
            advertisement$vungle_ads_release5.updateAdAssetPath(asset);
        }
        if (downloadRequest.isTemplate()) {
            this$1.injectOMIfNeeded(this$1.getAdvertisement$vungle_ads_release());
            processTemplate = this$1.processTemplate(asset, this$1.getAdvertisement$vungle_ads_release());
            if (!processTemplate) {
                list3 = this$1.errors;
                list3.add(new com.vungle.ads.internal.downloader.d(-1, new com.vungle.ads.t(), com.vungle.ads.internal.downloader.c.Companion.getINTERNAL_ERROR()));
            }
        }
        if (asset.isRequired()) {
            atomicLong2 = this$1.downloadRequiredCount;
            if (atomicLong2.decrementAndGet() <= 0) {
                list2 = this$1.errors;
                if (list2.isEmpty()) {
                    this$1.onAdReady();
                } else {
                    this$1.onAdLoadFailed(new com.vungle.ads.t());
                    this$1.cancel();
                    return;
                }
            }
        }
        atomicLong = this$1.downloadCount;
        if (atomicLong.decrementAndGet() <= 0) {
            list = this$1.errors;
            if (list.isEmpty()) {
                b adRequest = this$1.getAdRequest();
                z advertisement$vungle_ads_release6 = this$1.getAdvertisement$vungle_ads_release();
                this$1.onDownloadCompleted(adRequest, advertisement$vungle_ads_release6 != null ? advertisement$vungle_ads_release6.eventId() : null);
                return;
            }
            this$1.onAdLoadFailed(new com.vungle.ads.t());
        }
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onError(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n downloadRequest) {
        Integer num;
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        u uVar = v.Companion;
        StringBuilder sb2 = new StringBuilder("onError called: reason ");
        Throwable th2 = null;
        if (dVar != null) {
            num = Integer.valueOf(dVar.getReason());
        } else {
            num = null;
        }
        sb2.append(num);
        sb2.append("; cause ");
        if (dVar != null) {
            th2 = dVar.getCause();
        }
        sb2.append(th2);
        uVar.e("BaseAdLoader", sb2.toString());
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new androidx.emoji2.text.n(19, dVar, this.this$0, downloadRequest));
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onSuccess(File file, com.vungle.ads.internal.downloader.n downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        ((com.vungle.ads.internal.executor.f) this.this$0.getSdkExecutors()).getBackgroundExecutor().execute(new c3.b(11, file, this, downloadRequest, this.this$0));
    }
}
