package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import c7.C0620c;
import c7.C0628g;
import c7.C0634j;
import c7.C0637k0;
import c7.C0648q;
import c7.C0665z;
import c7.EnumC0616a;
import c7.EnumC0618b;
import com.vungle.ads.C2074d0;
import com.vungle.ads.C2137s;
import com.vungle.ads.C2139t;
import com.vungle.ads.C2148x0;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.f1;
import com.vungle.ads.g1;
import com.vungle.ads.h1;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.F;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.o1;
import f7.C2275b;
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
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;
import u7.AbstractC2816g;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class j {
    public static final c Companion = new c(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    private final List<C0620c> adAssets;
    private a adLoaderCallback;
    private final b adRequest;
    private C0665z advertisement;
    private h1 assetDownloadDurationMetric;
    private final Context context;
    private final AtomicLong downloadCount;
    private final AtomicLong downloadRequiredCount;
    private final com.vungle.ads.internal.downloader.p downloader;
    private final List<com.vungle.ads.internal.downloader.d> errors;
    private g1 mainVideoSizeMetric;
    private AtomicBoolean notifyFailed;
    private AtomicBoolean notifySuccess;
    private final e7.d omInjector;
    private final x pathProvider;
    private final com.vungle.ads.internal.executor.a sdkExecutors;
    private g1 templateSizeMetric;
    private final y vungleApiClient;

    public j(Context context, y yVar, com.vungle.ads.internal.executor.a aVar, e7.d dVar, com.vungle.ads.internal.downloader.p pVar, x xVar, b bVar) {
        G7.j.e(context, "context");
        G7.j.e(yVar, "vungleApiClient");
        G7.j.e(aVar, "sdkExecutors");
        G7.j.e(dVar, "omInjector");
        G7.j.e(pVar, "downloader");
        G7.j.e(xVar, "pathProvider");
        G7.j.e(bVar, "adRequest");
        this.context = context;
        this.vungleApiClient = yVar;
        this.sdkExecutors = aVar;
        this.omInjector = dVar;
        this.downloader = pVar;
        this.pathProvider = xVar;
        this.adRequest = bVar;
        this.downloadCount = new AtomicLong(0L);
        this.downloadRequiredCount = new AtomicLong(0L);
        this.notifySuccess = new AtomicBoolean(false);
        this.notifyFailed = new AtomicBoolean(false);
        this.adAssets = new ArrayList();
        this.errors = Collections.synchronizedList(new ArrayList());
        this.mainVideoSizeMetric = new g1(com.vungle.ads.internal.protos.n.ASSET_FILE_SIZE);
        this.templateSizeMetric = new g1(com.vungle.ads.internal.protos.n.TEMPLATE_ZIP_SIZE);
        this.assetDownloadDurationMetric = new h1(com.vungle.ads.internal.protos.n.ASSET_DOWNLOAD_DURATION_MS);
    }

    public static /* synthetic */ void a(j jVar, a aVar) {
        m53loadAd$lambda0(jVar, aVar);
    }

    private final void downloadAssets(C0665z c0665z) {
        this.assetDownloadDurationMetric.markStart();
        this.downloadCount.set(this.adAssets.size());
        AtomicLong atomicLong = this.downloadRequiredCount;
        List<C0620c> list = this.adAssets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C0620c) obj).isRequired()) {
                arrayList.add(obj);
            }
        }
        atomicLong.set(arrayList.size());
        for (C0620c c0620c : this.adAssets) {
            com.vungle.ads.internal.downloader.n nVar = new com.vungle.ads.internal.downloader.n(getAssetPriority(c0620c), c0620c, this.adRequest.getPlacement().getReferenceId(), c0665z.getCreativeId(), c0665z.eventId());
            if (nVar.isTemplate()) {
                nVar.startRecord();
            }
            ((com.vungle.ads.internal.downloader.l) this.downloader).download(nVar, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, C0620c c0620c) {
        if (file.exists() && file.length() == c0620c.getFileSize()) {
            return true;
        }
        return false;
    }

    private final com.vungle.ads.internal.downloader.i getAssetDownloadListener() {
        return new e(this);
    }

    private final com.vungle.ads.internal.downloader.m getAssetPriority(C0620c c0620c) {
        if (c0620c.isRequired()) {
            return com.vungle.ads.internal.downloader.m.CRITICAL;
        }
        return com.vungle.ads.internal.downloader.m.HIGHEST;
    }

    private final File getDestinationDir(C0665z c0665z) {
        return this.pathProvider.getDownloadsDirForAd(c0665z.eventId());
    }

    private final d getErrorInfo(C0665z c0665z) {
        int i9;
        Integer num;
        Integer errorCode;
        C0628g adUnit = c0665z.adUnit();
        if (adUnit != null && (errorCode = adUnit.getErrorCode()) != null) {
            i9 = errorCode.intValue();
        } else {
            i9 = 212;
        }
        int i10 = i9;
        C0628g adUnit2 = c0665z.adUnit();
        String str = null;
        if (adUnit2 != null) {
            num = adUnit2.getSleep();
        } else {
            num = null;
        }
        C0628g adUnit3 = c0665z.adUnit();
        if (adUnit3 != null) {
            str = adUnit3.getInfo();
        }
        if (i10 != 10001 && i10 != 10002 && i10 != 20001 && i10 != 30001 && i10 != 30002) {
            return new d(212, "Response error: " + num, AbstractC2914a.d("Request failed with error: 212, ", str), false, 8, null);
        }
        return new d(i10, "Response error: " + num, "Request failed with error: " + i10 + ", " + str, false, 8, null);
    }

    /* renamed from: handleAdMetaData$lambda-3 */
    private static final C2275b m51handleAdMetaData$lambda3(InterfaceC2717f interfaceC2717f) {
        return (C2275b) interfaceC2717f.getValue();
    }

    /* renamed from: handleAdMetaData$lambda-6 */
    private static final com.vungle.ads.internal.signals.j m52handleAdMetaData$lambda6(InterfaceC2717f interfaceC2717f) {
        return (com.vungle.ads.internal.signals.j) interfaceC2717f.getValue();
    }

    public final boolean injectOMIfNeeded(C0665z c0665z) {
        if (c0665z == null) {
            return false;
        }
        if (c0665z.omEnabled()) {
            try {
                File destinationDir = getDestinationDir(c0665z);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    this.omInjector.injectJsFiles(destinationDir);
                    return true;
                }
                onAdLoadFailed(new C2139t());
                return false;
            } catch (IOException unused) {
                onAdLoadFailed(new C2139t());
                return false;
            }
        }
        return true;
    }

    private final boolean isUrlValid(String str) {
        if (str != null && str.length() != 0 && (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str))) {
            return true;
        }
        return false;
    }

    /* renamed from: loadAd$lambda-0 */
    public static final void m53loadAd$lambda0(j jVar, a aVar) {
        G7.j.e(jVar, "this$0");
        G7.j.e(aVar, "$adLoaderCallback");
        o.INSTANCE.downloadJs(jVar.pathProvider, jVar.downloader, ((com.vungle.ads.internal.executor.f) jVar.sdkExecutors).getBackgroundExecutor(), new h(jVar, aVar));
    }

    public final void onAdReady() {
        C0665z c0665z = this.advertisement;
        if (c0665z != null && !this.notifyFailed.get() && this.notifySuccess.compareAndSet(false, true)) {
            onAdLoadReady();
            a aVar = this.adLoaderCallback;
            if (aVar != null) {
                aVar.onSuccess(c0665z);
            }
        }
    }

    public final boolean processTemplate(C0620c c0620c, C0665z c0665z) {
        if (c0665z == null || c0620c.getStatus() != EnumC0618b.DOWNLOAD_SUCCESS || c0620c.getLocalPath().length() == 0) {
            return false;
        }
        File file = new File(c0620c.getLocalPath());
        if (!fileIsValid(file, c0620c)) {
            return false;
        }
        if (c0620c.getFileType() == EnumC0616a.ZIP && !unzipFile(c0665z, file)) {
            return false;
        }
        return true;
    }

    private final boolean unzipFile(C0665z c0665z, File file) {
        ArrayList arrayList = new ArrayList();
        for (C0620c c0620c : this.adAssets) {
            if (c0620c.getFileType() == EnumC0616a.ASSET) {
                arrayList.add(c0620c.getLocalPath());
            }
        }
        File destinationDir = getDestinationDir(c0665z);
        if (destinationDir != null && destinationDir.isDirectory()) {
            try {
                F f9 = F.INSTANCE;
                String path = file.getPath();
                String path2 = destinationDir.getPath();
                G7.j.d(path2, "destinationDir.path");
                f9.unzip(path, path2, new i(arrayList));
                StringBuilder sb = new StringBuilder();
                sb.append(destinationDir.getPath());
                String str = File.separator;
                sb.append(str);
                sb.append("index.html");
                if (!new File(sb.toString()).exists()) {
                    C2137s.INSTANCE.logError$vungle_ads_release(115, "Failed to retrieve indexFileUrl from the Ad.", this.adRequest.getPlacement().getReferenceId(), c0665z.getCreativeId(), c0665z.eventId());
                    return false;
                }
                if (G7.j.a(file.getName(), "template")) {
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
            } catch (Exception e4) {
                C2137s.INSTANCE.logError$vungle_ads_release(109, "Unzip failed: " + e4.getMessage(), this.adRequest.getPlacement().getReferenceId(), c0665z.getCreativeId(), c0665z.eventId());
                return false;
            }
        }
        throw new IOException("Unable to access Destination Directory");
    }

    private final d validateAdMetadata(C0665z c0665z) {
        Integer num;
        String str;
        String str2;
        C0648q c0648q;
        String str3;
        String str4;
        String str5;
        C0628g adUnit = c0665z.adUnit();
        if (adUnit != null) {
            num = adUnit.getSleep();
        } else {
            num = null;
        }
        if (num != null) {
            return getErrorInfo(c0665z);
        }
        String referenceId = this.adRequest.getPlacement().getReferenceId();
        C0665z c0665z2 = this.advertisement;
        if (c0665z2 != null) {
            str = c0665z2.placementId();
        } else {
            str = null;
        }
        if (!G7.j.a(referenceId, str)) {
            return new d(215, "The ad response is missing placement reference id.", null, false, 12, null);
        }
        List<String> supportedTemplateTypes = this.adRequest.getPlacement().getSupportedTemplateTypes();
        C0665z c0665z3 = this.advertisement;
        if (c0665z3 != null) {
            str2 = c0665z3.templateType();
        } else {
            str2 = null;
        }
        if (!AbstractC2816g.I(supportedTemplateTypes, str2)) {
            return new d(216, "The ad response has an unexpected template type.", null, false, 12, null);
        }
        C0628g adUnit2 = c0665z.adUnit();
        if (adUnit2 != null) {
            c0648q = adUnit2.getTemplateSettings();
        } else {
            c0648q = null;
        }
        if (c0648q == null) {
            return new d(113, "Missing assets URLs", null, false, 12, null);
        }
        Map<String, C0634j> cacheableReplacements = c0648q.getCacheableReplacements();
        if (c0665z.isNativeTemplateType()) {
            if (cacheableReplacements != null) {
                C0634j c0634j = cacheableReplacements.get(C2148x0.TOKEN_MAIN_IMAGE);
                if (c0634j != null) {
                    str4 = c0634j.getUrl();
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    return new d(600, "Unable to load main image.", null, false, 12, null);
                }
                C0634j c0634j2 = cacheableReplacements.get(C2148x0.TOKEN_VUNGLE_PRIVACY_ICON_URL);
                if (c0634j2 != null) {
                    str5 = c0634j2.getUrl();
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    return new d(600, "Unable to load privacy image.", null, false, 12, null);
                }
            }
        } else {
            C0628g adUnit3 = c0665z.adUnit();
            if (adUnit3 != null) {
                str3 = adUnit3.getTemplateURL();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0) {
                if (!isUrlValid(str3)) {
                    return new d(112, "Failed to load template asset.", null, false, 12, null);
                }
            } else {
                return new d(105, "Failed to prepare URL for template download.", null, false, 12, null);
            }
        }
        if (c0665z.hasExpired()) {
            return new d(304, "The ad markup has expired for playback.", null, false, 12, null);
        }
        String eventId = c0665z.eventId();
        if (eventId != null && eventId.length() != 0) {
            if (cacheableReplacements != null) {
                Iterator<Map.Entry<String, C0634j>> it = cacheableReplacements.entrySet().iterator();
                while (it.hasNext()) {
                    String url = it.next().getValue().getUrl();
                    if (url != null && url.length() != 0) {
                        if (!isUrlValid(url)) {
                            return new d(112, AbstractC2914a.d("Invalid asset URL ", url), null, false, 12, null);
                        }
                    } else {
                        return new d(111, AbstractC2914a.d("Invalid asset URL ", url), null, false, 12, null);
                    }
                }
            }
            return null;
        }
        return new d(200, "Event id is invalid.", null, false, 12, null);
    }

    public final void cancel() {
        ((com.vungle.ads.internal.downloader.l) this.downloader).cancelAll();
    }

    public final b getAdRequest() {
        return this.adRequest;
    }

    public final C0665z getAdvertisement$vungle_ads_release() {
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

    public final void handleAdMetaData(C0665z c0665z) {
        List<String> loadAdUrls;
        String configExt;
        G7.j.e(c0665z, "advertisement");
        this.advertisement = c0665z;
        d validateAdMetadata = validateAdMetadata(c0665z);
        if (validateAdMetadata != null) {
            C2137s.INSTANCE.logError$vungle_ads_release(validateAdMetadata.getReason(), validateAdMetadata.getDescription(), this.adRequest.getPlacement().getReferenceId(), c0665z.getCreativeId(), c0665z.eventId());
            onAdLoadFailed(new C2074d0(validateAdMetadata.getReason(), validateAdMetadata.getDescriptionExternal()));
            return;
        }
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        Context context = this.context;
        EnumC2718g enumC2718g = EnumC2718g.b;
        InterfaceC2717f c9 = AbstractC2712a.c(enumC2718g, new f(context));
        C0637k0 configExt2 = c0665z.configExt();
        if (configExt2 != null && (configExt = configExt2.getConfigExt()) != null) {
            com.vungle.ads.internal.F.INSTANCE.updateConfigExtension(configExt);
            m51handleAdMetaData$lambda3(c9).put("config_extension", configExt).apply();
        }
        File destinationDir = getDestinationDir(c0665z);
        if (destinationDir != null && destinationDir.isDirectory() && destinationDir.exists()) {
            InterfaceC2717f c10 = AbstractC2712a.c(enumC2718g, new g(this.context));
            C0628g adUnit = c0665z.adUnit();
            if (adUnit != null && (loadAdUrls = adUnit.getLoadAdUrls()) != null) {
                com.vungle.ads.internal.network.l lVar = new com.vungle.ads.internal.network.l(this.vungleApiClient, c0665z.placementId(), c0665z.getCreativeId(), c0665z.eventId(), ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getIoExecutor(), this.pathProvider, m52handleAdMetaData$lambda6(c10));
                Iterator<T> it = loadAdUrls.iterator();
                while (it.hasNext()) {
                    lVar.sendTpat((String) it.next(), ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getJobExecutor());
                }
            }
            if (!this.adAssets.isEmpty()) {
                this.adAssets.clear();
            }
            this.adAssets.addAll(c0665z.getDownloadableAssets(destinationDir));
            downloadAssets(c0665z);
            return;
        }
        onAdLoadFailed(new C2139t());
    }

    public final void loadAd(a aVar) {
        G7.j.e(aVar, "adLoaderCallback");
        this.adLoaderCallback = aVar;
        ((com.vungle.ads.internal.executor.f) this.sdkExecutors).getBackgroundExecutor().execute(new com.facebook.appevents.k(6, this, aVar));
    }

    public final void onAdLoadFailed(o1 o1Var) {
        a aVar;
        G7.j.e(o1Var, "error");
        if (!this.notifySuccess.get() && this.notifyFailed.compareAndSet(false, true) && (aVar = this.adLoaderCallback) != null) {
            aVar.onFailure(o1Var);
        }
    }

    public abstract void onAdLoadReady();

    public void onDownloadCompleted(b bVar, String str) {
        String str2;
        String str3;
        G7.j.e(bVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        v.Companion.d(TAG, "download completed " + bVar);
        C0665z c0665z = this.advertisement;
        if (c0665z != null) {
            c0665z.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        C0665z c0665z2 = this.advertisement;
        String str4 = null;
        if (c0665z2 != null) {
            str2 = c0665z2.placementId();
        } else {
            str2 = null;
        }
        C0665z c0665z3 = this.advertisement;
        if (c0665z3 != null) {
            str3 = c0665z3.getCreativeId();
        } else {
            str3 = null;
        }
        C0665z c0665z4 = this.advertisement;
        if (c0665z4 != null) {
            str4 = c0665z4.eventId();
        }
        C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, this.assetDownloadDurationMetric, str2, str3, str4, (String) null, 16, (Object) null);
    }

    public abstract void requestAd();

    public final void setAdvertisement$vungle_ads_release(C0665z c0665z) {
        this.advertisement = c0665z;
    }
}
