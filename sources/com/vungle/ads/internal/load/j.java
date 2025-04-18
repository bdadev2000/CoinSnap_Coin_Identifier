package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import bh.j1;
import bh.z;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.b1;
import com.vungle.ads.e3;
import com.vungle.ads.f3;
import com.vungle.ads.g3;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.f0;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.n3;
import com.vungle.ads.v1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class j {
    public static final c Companion = new c(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<bh.c> adAssets;
    private a adLoaderCallback;
    private final b adRequest;
    private z advertisement;
    private g3 assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final AtomicLong downloadRequiredCount;
    private final com.vungle.ads.internal.downloader.p downloader;
    private final List<com.vungle.ads.internal.downloader.d> errors;
    private f3 mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final dh.d omInjector;
    private final x pathProvider;
    private final com.vungle.ads.internal.executor.a sdkExecutors;
    private f3 templateSizeMetric;
    private final y vungleApiClient;

    public j(Context context, y vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, dh.d omInjector, com.vungle.ads.internal.downloader.p downloader, x pathProvider, b adRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = sdkExecutors;
        this.omInjector = omInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
        this.adRequest = adRequest;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.errors = Collections.synchronizedList(new ArrayList());
        this.mainVideoSizeMetric = new f3(com.vungle.ads.internal.protos.n.ASSET_FILE_SIZE);
        this.templateSizeMetric = new f3(com.vungle.ads.internal.protos.n.TEMPLATE_ZIP_SIZE);
        this.assetDownloadDurationMetric = new g3(com.vungle.ads.internal.protos.n.ASSET_DOWNLOAD_DURATION_MS);
    }

    public static /* synthetic */ void a(j jVar, a aVar) {
        m33loadAd$lambda0(jVar, aVar);
    }

    private final void downloadAssets(z zVar) {
        this.assetDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AtomicLong atomicLong = this.downloadRequiredCount;
        List<bh.c> list = this.adAssets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bh.c) obj).isRequired()) {
                arrayList.add(obj);
            }
        }
        atomicLong.set(arrayList.size());
        for (bh.c cVar : this.adAssets) {
            com.vungle.ads.internal.downloader.n nVar = new com.vungle.ads.internal.downloader.n(getAssetPriority(cVar), cVar, this.adRequest.getPlacement().getReferenceId(), zVar.getCreativeId(), zVar.eventId());
            if (nVar.isTemplate()) {
                nVar.startRecord();
            }
            ((com.vungle.ads.internal.downloader.l) this.downloader).download(nVar, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, bh.c cVar) {
        return file.exists() && file.length() == cVar.getFileSize();
    }

    private final com.vungle.ads.internal.downloader.i getAssetDownloadListener() {
        return new e(this);
    }

    private final com.vungle.ads.internal.downloader.m getAssetPriority(bh.c cVar) {
        if (cVar.isRequired()) {
            return com.vungle.ads.internal.downloader.m.CRITICAL;
        }
        return com.vungle.ads.internal.downloader.m.HIGHEST;
    }

    private final File getDestinationDir(z zVar) {
        return this.pathProvider.getDownloadsDirForAd(zVar.eventId());
    }

    private final d getErrorInfo(z zVar) {
        int i10;
        Integer num;
        Integer errorCode;
        bh.g adUnit = zVar.adUnit();
        if (adUnit != null && (errorCode = adUnit.getErrorCode()) != null) {
            i10 = errorCode.intValue();
        } else {
            i10 = 212;
        }
        int i11 = i10;
        bh.g adUnit2 = zVar.adUnit();
        String str = null;
        if (adUnit2 != null) {
            num = adUnit2.getSleep();
        } else {
            num = null;
        }
        bh.g adUnit3 = zVar.adUnit();
        if (adUnit3 != null) {
            str = adUnit3.getInfo();
        }
        if (i11 != 10001 && i11 != 10002 && i11 != 20001 && i11 != 30001 && i11 != 30002) {
            return new d(212, "Response error: " + num, vd.e.e("Request failed with error: 212, ", str), false, 8, null);
        }
        return new d(i11, "Response error: " + num, "Request failed with error: " + i11 + ", " + str, false, 8, null);
    }

    /* renamed from: handleAdMetaData$lambda-3 */
    private static final eh.b m31handleAdMetaData$lambda3(Lazy<eh.b> lazy) {
        return lazy.getValue();
    }

    /* renamed from: handleAdMetaData$lambda-6 */
    private static final com.vungle.ads.internal.signals.j m32handleAdMetaData$lambda6(Lazy<com.vungle.ads.internal.signals.j> lazy) {
        return lazy.getValue();
    }

    public final boolean injectOMIfNeeded(z zVar) {
        if (zVar == null) {
            return false;
        }
        if (zVar.omEnabled()) {
            try {
                File destinationDir = getDestinationDir(zVar);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    this.omInjector.injectJsFiles(destinationDir);
                    return true;
                }
                onAdLoadFailed(new com.vungle.ads.t());
                return false;
            } catch (IOException unused) {
                onAdLoadFailed(new com.vungle.ads.t());
                return false;
            }
        }
        return true;
    }

    private final boolean isUrlValid(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    /* renamed from: loadAd$lambda-0 */
    public static final void m33loadAd$lambda0(j this$0, a adLoaderCallback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adLoaderCallback, "$adLoaderCallback");
        o.INSTANCE.downloadJs(this$0.pathProvider, this$0.downloader, ((com.vungle.ads.internal.executor.f) this$0.sdkExecutors).getBackgroundExecutor(), new h(this$0, adLoaderCallback));
    }

    public final void onAdReady() {
        z zVar = this.advertisement;
        if (zVar != null && !this.notifyFailed.get() && this.notifySuccess.compareAndSet(false, true)) {
            onAdLoadReady();
            a aVar = this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(zVar);
            }
        }
    }

    public final boolean processTemplate(bh.c cVar, z zVar) {
        boolean z10;
        if (zVar == null || cVar.getStatus() != bh.b.DOWNLOAD_SUCCESS) {
            return false;
        }
        if (cVar.getLocalPath().length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        File file = new File(cVar.getLocalPath());
        if (!fileIsValid(file, cVar)) {
            return false;
        }
        if (cVar.getFileType() == bh.a.ZIP && !unzipFile(zVar, file)) {
            return false;
        }
        return true;
    }

    private final boolean unzipFile(z zVar, File file) {
        ArrayList arrayList = new ArrayList();
        for (bh.c cVar : this.adAssets) {
            if (cVar.getFileType() == bh.a.ASSET) {
                arrayList.add(cVar.getLocalPath());
            }
        }
        File destinationDir = getDestinationDir(zVar);
        if (destinationDir != null && destinationDir.isDirectory()) {
            try {
                f0 f0Var = f0.INSTANCE;
                String path = file.getPath();
                String path2 = destinationDir.getPath();
                Intrinsics.checkNotNullExpressionValue(path2, "destinationDir.path");
                f0Var.unzip(path, path2, new i(arrayList));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(destinationDir.getPath());
                String str = File.separator;
                sb2.append(str);
                sb2.append("index.html");
                if (!new File(sb2.toString()).exists()) {
                    com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(115, "Failed to retrieve indexFileUrl from the Ad.", this.adRequest.getPlacement().getReferenceId(), zVar.getCreativeId(), zVar.eventId());
                    return false;
                }
                if (Intrinsics.areEqual(file.getName(), "template")) {
                    File file2 = new File(destinationDir.getPath() + str + "mraid.js");
                    if (!file2.exists() && !file2.createNewFile()) {
                        throw new IOException("mraid.js can not be created");
                    }
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                    com.vungle.ads.internal.ui.j.INSTANCE.apply(this.pathProvider, printWriter);
                    printWriter.close();
                }
                com.vungle.ads.internal.util.n.printDirectoryTree(destinationDir);
                com.vungle.ads.internal.util.n.delete(file);
                return true;
            } catch (Exception e2) {
                com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(109, "Unzip failed: " + e2.getMessage(), this.adRequest.getPlacement().getReferenceId(), zVar.getCreativeId(), zVar.eventId());
                return false;
            }
        }
        throw new IOException("Unable to access Destination Directory");
    }

    private final d validateAdMetadata(z zVar) {
        Integer num;
        String str;
        String str2;
        bh.q qVar;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        String str4;
        String str5;
        bh.g adUnit = zVar.adUnit();
        if (adUnit != null) {
            num = adUnit.getSleep();
        } else {
            num = null;
        }
        if (num != null) {
            return getErrorInfo(zVar);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        z zVar2 = this.advertisement;
        if (zVar2 != null) {
            str = zVar2.placementId();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(referenceId, str)) {
            return new d(215, "The ad response is missing placement reference id.", null, false, 12, null);
        }
        List<String> supportedTemplateTypes = this.adRequest.getPlacement().getSupportedTemplateTypes();
        z zVar3 = this.advertisement;
        if (zVar3 != null) {
            str2 = zVar3.templateType();
        } else {
            str2 = null;
        }
        if (!CollectionsKt.contains(supportedTemplateTypes, str2)) {
            return new d(216, "The ad response has an unexpected template type.", null, false, 12, null);
        }
        bh.g adUnit2 = zVar.adUnit();
        if (adUnit2 != null) {
            qVar = adUnit2.getTemplateSettings();
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return new d(113, "Missing assets URLs", null, false, 12, null);
        }
        Map<String, bh.j> cacheableReplacements = qVar.getCacheableReplacements();
        if (zVar.isNativeTemplateType()) {
            if (cacheableReplacements != null) {
                bh.j jVar = cacheableReplacements.get(v1.TOKEN_MAIN_IMAGE);
                if (jVar != null) {
                    str4 = jVar.getUrl();
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    return new d(600, "Unable to load main image.", null, false, 12, null);
                }
                bh.j jVar2 = cacheableReplacements.get(v1.TOKEN_VUNGLE_PRIVACY_ICON_URL);
                if (jVar2 != null) {
                    str5 = jVar2.getUrl();
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    return new d(600, "Unable to load privacy image.", null, false, 12, null);
                }
            }
        } else {
            bh.g adUnit3 = zVar.adUnit();
            if (adUnit3 != null) {
                str3 = adUnit3.getTemplateURL();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return new d(105, "Failed to prepare URL for template download.", null, false, 12, null);
            }
            if (!isUrlValid(str3)) {
                return new d(112, "Failed to load template asset.", null, false, 12, null);
            }
        }
        if (zVar.hasExpired()) {
            return new d(304, "The ad markup has expired for playback.", null, false, 12, null);
        }
        String eventId = zVar.eventId();
        if (eventId != null && eventId.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return new d(200, "Event id is invalid.", null, false, 12, null);
        }
        if (cacheableReplacements != null) {
            Iterator<Map.Entry<String, bh.j>> it = cacheableReplacements.entrySet().iterator();
            while (it.hasNext()) {
                String url = it.next().getValue().getUrl();
                if (url != null && url.length() != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (z12) {
                    return new d(111, vd.e.e("Invalid asset URL ", url), null, false, 12, null);
                }
                if (!isUrlValid(url)) {
                    return new d(112, vd.e.e("Invalid asset URL ", url), null, false, 12, null);
                }
            }
        }
        return null;
    }

    public final void cancel() {
        ((com.vungle.ads.internal.downloader.l) this.downloader).cancelAll();
    }

    public final b getAdRequest() {
        return this.adRequest;
    }

    public final z getAdvertisement$vungle_ads_release() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }

    public final com.vungle.ads.internal.executor.a getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final y getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData(z advertisement) {
        List<String> loadAdUrls;
        String configExt;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.advertisement = advertisement;
        d validateAdMetadata = validateAdMetadata(advertisement);
        if (validateAdMetadata != null) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(validateAdMetadata.getReason(), validateAdMetadata.getDescription(), this.adRequest.getPlacement().getReferenceId(), advertisement.getCreativeId(), advertisement.eventId());
            onAdLoadFailed(new b1(validateAdMetadata.getReason(), validateAdMetadata.getDescriptionExternal()));
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        Context context = this.context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new f(context));
        j1 configExt2 = advertisement.configExt();
        if (configExt2 != null && (configExt = configExt2.getConfigExt()) != null) {
            com.vungle.ads.internal.f0.INSTANCE.updateConfigExtension(configExt);
            m31handleAdMetaData$lambda3(lazy).put("config_extension", configExt).apply();
        }
        File destinationDir = getDestinationDir(advertisement);
        if (destinationDir != null && destinationDir.isDirectory() && destinationDir.exists()) {
            Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new g(this.context));
            bh.g adUnit = advertisement.adUnit();
            if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
                com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(this.vungleApiClient, advertisement.placementId(), advertisement.getCreativeId(), advertisement.eventId(), ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getIoExecutor(), this.pathProvider, m32handleAdMetaData$lambda6(lazy2));
                Iterator<T> it = loadAdUrls.iterator();
                while (it.hasNext()) {
                    lVar.sendTpat((String) it.next(), ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getJobExecutor());
                }
            }
            if (!this.adAssets.isEmpty()) {
                this.adAssets.clear();
            }
            this.adAssets.addAll(advertisement.getDownloadableAssets(destinationDir));
            downloadAssets(advertisement);
            return;
        }
        onAdLoadFailed(new com.vungle.ads.t());
    }

    public final void loadAd(a adLoaderCallback) {
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.adLoaderCallback = adLoaderCallback;
        ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getBackgroundExecutor().execute(new jb.j(12, this, adLoaderCallback));
    }

    public final void onAdLoadFailed(n3 error) {
        a aVar;
        Intrinsics.checkNotNullParameter(error, "error");
        if (!this.notifySuccess.get() && this.notifyFailed.compareAndSet(false, true) && (aVar = this.adLoaderCallback) != null) {
            aVar.onFailure(error);
        }
    }

    public abstract void onAdLoadReady();

    public void onDownloadCompleted(b request, String str) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(request, "request");
        v.Companion.d(TAG, "download completed " + request);
        z zVar = this.advertisement;
        if (zVar != null) {
            zVar.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        z zVar2 = this.advertisement;
        String str4 = null;
        if (zVar2 != null) {
            str2 = zVar2.placementId();
        } else {
            str2 = null;
        }
        z zVar3 = this.advertisement;
        if (zVar3 != null) {
            str3 = zVar3.getCreativeId();
        } else {
            str3 = null;
        }
        z zVar4 = this.advertisement;
        if (zVar4 != null) {
            str4 = zVar4.eventId();
        }
        com.vungle.ads.s.logMetric$vungle_ads_release$default(com.vungle.ads.s.INSTANCE, this.assetDownloadDurationMetric, str2, str3, str4, (String) null, 16, (Object) null);
    }

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(z zVar) {
        this.advertisement = zVar;
    }
}
