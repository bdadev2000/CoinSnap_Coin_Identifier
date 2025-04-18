package com.mbridge.msdk.foundation.download.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.same.report.d.b;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import eb.j;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class H5DownLoadManager {
    public static final String SP_ENDING_PAGE_SAVE_TIME = "ending_page_save_time";
    public static final String SP_ENDING_PAGE_SOURCE = "ending_page_source";
    private static final String TAG = "H5DownLoadManager";
    private static volatile H5DownLoadManager sH5Manager;
    private final String DOWN_TYPE = "down_type";
    private final String LOCAL_RID = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private HTMLResourceManager htmlResourceManager;
    private boolean isUseDownloadModule;
    private CopyOnWriteArrayList<String> mResDownloadingList;
    private ConcurrentMap<String, DownLoadH5SourceListener> mResDownloadingMap;
    private ResourceManager resourceManager;

    /* loaded from: classes4.dex */
    public interface H5ResDownloadListerInter {
        void onFailed(String str, String str2);

        void onSuccess(String str, String str2, boolean z10);
    }

    /* loaded from: classes4.dex */
    public interface IH5SourceDownloadListener extends H5ResDownloadListerInter {
    }

    /* loaded from: classes4.dex */
    public interface IOnDownLoadH5Source {
        void onFailed(String str);

        void onStart();

        void onSuccess(String str, byte[] bArr, String str2);
    }

    /* loaded from: classes4.dex */
    public interface ZipDownloadListener extends H5ResDownloadListerInter {
    }

    private H5DownLoadManager() {
        this.isUseDownloadModule = false;
        try {
            this.resourceManager = ResourceManager.getinstance();
            this.htmlResourceManager = HTMLResourceManager.getInstance();
            this.mResDownloadingList = new CopyOnWriteArrayList<>();
            this.mResDownloadingMap = new ConcurrentHashMap();
            g b3 = h.a().b(c.m().k());
            if (b3 != null) {
                this.isUseDownloadModule = b3.y(1);
            }
        } catch (Throwable th2) {
            ad.b(TAG, th2.getMessage(), th2);
        }
    }

    private void downloadHTML(final b bVar, final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        try {
            ad.b(TAG, "download url:" + str);
            final d dVar = new d();
            dVar.a("scenes", "1");
            dVar.a("url", str);
            if (bVar != null) {
                dVar.a("resource_type", Integer.valueOf(bVar.b()));
            }
            if (this.mResDownloadingList.contains(str)) {
                return;
            }
            this.mResDownloadingList.add(str);
            DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2
                @Override // com.mbridge.msdk.foundation.same.e.a
                public void cancelTask() {
                }

                @Override // com.mbridge.msdk.foundation.same.e.a
                public void pauseTask(boolean z10) {
                }

                @Override // com.mbridge.msdk.foundation.same.e.a
                public void runTask() {
                    if (!TextUtils.isEmpty(H5DownLoadManager.this.htmlResourceManager.getHtmlContentFromUrl(str))) {
                        dVar.a("cache", 2);
                        H5DownLoadManager.this.mResDownloadingList.remove(str);
                        H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                        if (h5ResDownloadListerInter2 != null) {
                            h5ResDownloadListerInter2.onSuccess(str, "", true);
                        }
                        bVar.a("m_download_start", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        return;
                    }
                    DownLoadUtils.getSourceCodeFromNetUrl(str, new IOnDownLoadH5Source() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.2.1
                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onFailed(String str2) {
                            try {
                                H5DownLoadManager.this.mResDownloadingList.remove(str);
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter3 != null) {
                                    h5ResDownloadListerInter3.onFailed(str, str2);
                                }
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    e2.printStackTrace();
                                }
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter4 != null) {
                                    h5ResDownloadListerInter4.onFailed(str, str2);
                                }
                            }
                            AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                            if (h5ResDownloadListerInter == null) {
                                dVar.a("result", 3);
                                AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                bVar.a("m_download_end", dVar);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                            }
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onStart() {
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.IOnDownLoadH5Source
                        public void onSuccess(String str2, byte[] bArr, String str3) {
                            try {
                                H5DownLoadManager.this.mResDownloadingList.remove(str3);
                                if (bArr != null && bArr.length > 0) {
                                    if (H5DownLoadManager.this.htmlResourceManager.saveResHtmlFile(str3, bArr)) {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        H5ResDownloadListerInter h5ResDownloadListerInter3 = h5ResDownloadListerInter;
                                        if (h5ResDownloadListerInter3 != null) {
                                            h5ResDownloadListerInter3.onSuccess(str3, "", false);
                                            return;
                                        }
                                        dVar.a("result", 3);
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        bVar.a("m_download_end", dVar);
                                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                                        return;
                                    }
                                    AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                                    H5ResDownloadListerInter h5ResDownloadListerInter4 = h5ResDownloadListerInter;
                                    if (h5ResDownloadListerInter4 != null) {
                                        h5ResDownloadListerInter4.onFailed(str3, "save file failed");
                                        return;
                                    }
                                    dVar.a("result", 3);
                                    AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                    bVar.a("m_download_end", dVar);
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                                }
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    e2.printStackTrace();
                                }
                                AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                                H5ResDownloadListerInter h5ResDownloadListerInter5 = h5ResDownloadListerInter;
                                if (h5ResDownloadListerInter5 != null) {
                                    h5ResDownloadListerInter5.onFailed(str3, e2.getMessage());
                                    return;
                                }
                                dVar.a("result", 3);
                                AnonymousClass2 anonymousClass26 = AnonymousClass2.this;
                                bVar.a("m_download_end", dVar);
                                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                            }
                        }
                    }, true);
                    dVar.a("cache", 1);
                    bVar.a("m_download_start", dVar);
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                }
            });
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    private void downloadHTMLByDownloadModule(final String str, final H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (TextUtils.isEmpty(str)) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is null", str);
                return;
            }
            return;
        }
        try {
            new URL(str);
            MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, j.k(SameMD5.getMD5(ao.b(str)), ".html"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML)).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withReadTimeout(30000L).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML) + "/").withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.1
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "下载取消： ");
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "下载结束： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType() + " " + downloadMessage.getSaveFilePath());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onSuccess(str, "", false);
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
                    ad.a(H5DownLoadManager.TAG, "下载结束失败： " + downloadError.getException().getMessage());
                    H5ResDownloadListerInter h5ResDownloadListerInter2 = h5ResDownloadListerInter;
                    if (h5ResDownloadListerInter2 != null) {
                        h5ResDownloadListerInter2.onFailed(str, downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage) {
                    ad.a(H5DownLoadManager.TAG, "开始下载 html： " + downloadMessage.getDownloadUrl() + " " + downloadMessage.getDownloadResourceType());
                }
            }).build().start();
        } catch (Exception unused) {
            if (h5ResDownloadListerInter != null) {
                h5ResDownloadListerInter.onFailed("zip url is unlawful", str);
            }
        }
    }

    private void downloadZipByDownloadModule(final b bVar, String str, final ZipDownloadListener zipDownloadListener) {
        if (TextUtils.isEmpty(str)) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is null");
                return;
            }
            return;
        }
        try {
            new URL(str);
            final d dVar = new d();
            dVar.a("scenes", "1");
            dVar.a("url", str);
            if (bVar != null) {
                dVar.a("resource_type", Integer.valueOf(bVar.b()));
            }
            String a = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
            String md5 = SameMD5.getMD5(ao.b(str));
            String k10 = j.k(a, "/");
            final String m10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(a, "/", md5);
            DownloadMessage<?> downloadMessage = new DownloadMessage<>(bVar, str, j.k(md5, ".zip"), 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
            if (bVar != null) {
                downloadMessage.setUseCronetDownload(bVar.n());
            }
            MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(30000L).withConnectTimeout(20000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(k10).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadStateListener(new OnDownloadStateListener() { // from class: com.mbridge.msdk.foundation.download.download.H5DownLoadManager.3
                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onCancelDownload(DownloadMessage downloadMessage2) {
                    int i10;
                    ad.a(H5DownLoadManager.TAG, "下载取消： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        if (downloadMessage2.isCache()) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        dVar2.a("cache", Integer.valueOf(i10));
                    }
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a("m_download_start", dVar);
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                    if (!TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), "task cancel");
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadComplete(DownloadMessage downloadMessage2) {
                    int i10;
                    ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + " " + downloadMessage2.getSaveFilePath());
                    try {
                        d dVar2 = dVar;
                        if (dVar2 != null) {
                            if (downloadMessage2.isCache()) {
                                i10 = 1;
                            } else {
                                i10 = 2;
                            }
                            dVar2.a("cache", Integer.valueOf(i10));
                        }
                        b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a("m_download_start", dVar);
                        }
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        if (TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                            MBResourceManager.getInstance().unZip(downloadMessage2.getSaveFilePath(), m10);
                        }
                        String str2 = "";
                        try {
                            str2 = (String) downloadMessage2.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            ad.b(H5DownLoadManager.TAG, th2.getMessage());
                        }
                        ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压成功： " + m10);
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), str2, downloadMessage2.isCache());
                        }
                    } catch (IOException e2) {
                        ad.a(H5DownLoadManager.TAG, "下载结束，开始解压缩文件，文件解压失败： " + e2.getMessage());
                        ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                        if (zipDownloadListener3 != null) {
                            zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), e2.getMessage());
                        }
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadError(DownloadMessage downloadMessage2, DownloadError downloadError) {
                    int i10;
                    ad.a(H5DownLoadManager.TAG, "下载错误： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType() + "  " + downloadError.getException().getMessage());
                    d dVar2 = dVar;
                    if (dVar2 != null) {
                        if (downloadMessage2.isCache()) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        dVar2.a("cache", Integer.valueOf(i10));
                    }
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a("m_download_start", dVar);
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                    if (!TextUtils.isEmpty(ResourceManager.getinstance().getResDirFromCampaign(downloadMessage2.getDownloadUrl()))) {
                        ZipDownloadListener zipDownloadListener2 = zipDownloadListener;
                        if (zipDownloadListener2 != null) {
                            zipDownloadListener2.onSuccess(downloadMessage2.getDownloadUrl(), "", downloadMessage2.isCache());
                            return;
                        }
                        return;
                    }
                    ZipDownloadListener zipDownloadListener3 = zipDownloadListener;
                    if (zipDownloadListener3 != null) {
                        zipDownloadListener3.onFailed(downloadMessage2.getDownloadUrl(), downloadError.getException().getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
                public void onDownloadStart(DownloadMessage downloadMessage2) {
                    ad.a(H5DownLoadManager.TAG, "开始下载 zip： " + downloadMessage2.getDownloadUrl() + " " + downloadMessage2.getDownloadResourceType());
                }
            }).build().start();
        } catch (Exception unused) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "zip url is unlawful");
            }
        }
    }

    private void downloadZipByOldDownloadModule(b bVar, String str, ZipDownloadListener zipDownloadListener) {
        d dVar = new d();
        dVar.a("scenes", "1");
        dVar.a("url", str);
        if (bVar != null) {
            dVar.a("resource_type", Integer.valueOf(bVar.b()));
        }
        try {
            if (TextUtils.isEmpty(this.resourceManager.getResDirFromCampaign(str))) {
                dVar.a("cache", 2);
                if (this.mResDownloadingMap.containsKey(str)) {
                    DownLoadH5SourceListener downLoadH5SourceListener = this.mResDownloadingMap.get(str);
                    if (downLoadH5SourceListener != null) {
                        downLoadH5SourceListener.setZipDownloadListener(zipDownloadListener);
                    }
                    if (bVar != null && !bVar.a()) {
                        bVar.a("m_download_start", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
                        return;
                    }
                    return;
                }
                DownLoadH5SourceListener downLoadH5SourceListener2 = new DownLoadH5SourceListener(this.mResDownloadingMap, this.resourceManager, zipDownloadListener, str);
                this.mResDownloadingMap.put(str, downLoadH5SourceListener2);
                DownLoadUtils.getSourceCodeFromNetUrl(str, downLoadH5SourceListener2, true);
            } else {
                dVar.a("cache", 1);
                if (zipDownloadListener != null) {
                    zipDownloadListener.onSuccess(str, "", true);
                }
            }
            if (bVar != null && !bVar.a()) {
                bVar.a("m_download_start", dVar);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            }
        } catch (Exception e2) {
            if (zipDownloadListener != null) {
                zipDownloadListener.onFailed(str, "downloadzip failed");
            }
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private String getHtmlAddress(String str) {
        HTMLResourceManager hTMLResourceManager = this.htmlResourceManager;
        if (hTMLResourceManager != null) {
            return hTMLResourceManager.getHtmlPathFromUrl(str);
        }
        return str;
    }

    public static H5DownLoadManager getInstance() {
        if (sH5Manager == null) {
            synchronized (H5DownLoadManager.class) {
                if (sH5Manager == null) {
                    sH5Manager = new H5DownLoadManager();
                }
            }
        }
        return sH5Manager;
    }

    private long getPreSaveTimeFromSp(String str) {
        try {
            Object a = al.a(c.m().c(), SP_ENDING_PAGE_SAVE_TIME + str, 0L);
            if (a != null && (a instanceof Long)) {
                return ((Long) a).longValue();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0L;
    }

    private void saveSourceContent(String str, String str2) {
        try {
            ad.c(TAG, "sourceContent:" + str);
            al.b(c.m().c(), SP_ENDING_PAGE_SOURCE + str2, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void updateEndingPageSaveTime(String str) {
        try {
            al.b(c.m().c(), SP_ENDING_PAGE_SAVE_TIME + str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void download(b bVar, String str) {
        download(bVar, str, null);
    }

    public void downloadH5Res(b bVar, String str) {
        downloadH5Res(bVar, str, null);
    }

    public void downloadZip(b bVar, String str, ZipDownloadListener zipDownloadListener) {
        if (this.isUseDownloadModule) {
            downloadZipByDownloadModule(bVar, str, zipDownloadListener);
        } else {
            downloadZipByOldDownloadModule(bVar, str, zipDownloadListener);
        }
    }

    public String getH5ResAddress(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                        return str;
                    }
                    if (path.toLowerCase().endsWith(".zip")) {
                        return getResAddress(str);
                    }
                    return getHtmlAddress(str);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }

    public String getResAddress(String str) {
        ResourceManager resourceManager = this.resourceManager;
        if (resourceManager != null) {
            return resourceManager.getResDirFromCampaign(str);
        }
        return null;
    }

    public String getSourceContentFromSp(String str) {
        try {
            Object a = al.a(c.m().c(), SP_ENDING_PAGE_SOURCE + str, "");
            if (a != null && (a instanceof String)) {
                String str2 = (String) a;
                if (an.b(str2)) {
                    return str2;
                }
                return null;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void download(b bVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        if (this.isUseDownloadModule) {
            downloadHTMLByDownloadModule(str, h5ResDownloadListerInter);
        } else {
            downloadHTML(bVar, str, h5ResDownloadListerInter);
        }
    }

    public void downloadH5Res(b bVar, String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        b b3 = com.mbridge.msdk.foundation.same.report.d.c.a().b(bVar);
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                String path = Uri.parse(str).getPath();
                if (!TextUtils.isEmpty(path)) {
                    if (path.toLowerCase().endsWith(".zip")) {
                        downloadZip(b3, str, (ZipDownloadListener) h5ResDownloadListerInter);
                        return;
                    } else {
                        download(b3, str, h5ResDownloadListerInter);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (h5ResDownloadListerInter != null) {
            h5ResDownloadListerInter.onFailed(str, "The URL does not contain a path ");
        }
    }

    public void downloadH5Res(String str, H5ResDownloadListerInter h5ResDownloadListerInter) {
        downloadH5Res(new b(), str, h5ResDownloadListerInter);
    }
}
