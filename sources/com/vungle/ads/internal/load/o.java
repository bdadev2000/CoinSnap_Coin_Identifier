package com.vungle.ads.internal.load;

import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {
    public static final int MRAID_AVAILABLE = 13;
    public static final int MRAID_DOWNLOADED = 10;
    public static final int MRAID_DOWNLOAD_FAILED = 12;
    public static final int MRAID_INVALID_ENDPOINT = 11;
    private static final String TAG = "MraidJsLoader";
    public static final o INSTANCE = new o();
    private static final AtomicBoolean isDownloading = new AtomicBoolean(false);
    private static final CopyOnWriteArrayList<m> listeners = new CopyOnWriteArrayList<>();

    private o() {
    }

    public static /* synthetic */ void a(m mVar, x xVar, com.vungle.ads.internal.downloader.p pVar, com.vungle.ads.internal.executor.l lVar) {
        m38downloadJs$lambda1(mVar, xVar, pVar, lVar);
    }

    public static final /* synthetic */ void access$notifyListeners(o oVar, int i10) {
        oVar.notifyListeners(i10);
    }

    public static /* synthetic */ void downloadJs$default(o oVar, x xVar, com.vungle.ads.internal.downloader.p pVar, com.vungle.ads.internal.executor.l lVar, m mVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            mVar = null;
        }
        oVar.downloadJs(xVar, pVar, lVar, mVar);
    }

    /* renamed from: downloadJs$lambda-1 */
    public static final void m38downloadJs$lambda1(m mVar, x pathProvider, com.vungle.ads.internal.downloader.p downloader, com.vungle.ads.internal.executor.l executor) {
        Intrinsics.checkNotNullParameter(pathProvider, "$pathProvider");
        Intrinsics.checkNotNullParameter(downloader, "$downloader");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        if (mVar != null) {
            listeners.add(mVar);
        }
        boolean z10 = true;
        if (isDownloading.getAndSet(true)) {
            v.Companion.w(TAG, "mraid js is downloading, waiting for the previous request.");
            return;
        }
        f0 f0Var = f0.INSTANCE;
        String mraidEndpoint = f0Var.getMraidEndpoint();
        if (mraidEndpoint != null && mraidEndpoint.length() != 0) {
            z10 = false;
        }
        if (z10) {
            INSTANCE.notifyListeners(11);
            return;
        }
        File file = new File(pathProvider.getJsAssetDir(f0Var.getMraidJsVersion()), "mraid.min.js");
        if (file.exists()) {
            v.Companion.w(TAG, "mraid js already downloaded");
            INSTANCE.notifyListeners(13);
            return;
        }
        File jsDir = pathProvider.getJsDir();
        com.vungle.ads.internal.util.n.deleteContents(jsDir);
        String k10 = eb.j.k(mraidEndpoint, "/mraid.min.js");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "mraidJsFile.absolutePath");
        com.vungle.ads.internal.downloader.l lVar = (com.vungle.ads.internal.downloader.l) downloader;
        lVar.download(new com.vungle.ads.internal.downloader.n(com.vungle.ads.internal.downloader.m.HIGH, new bh.c("mraid.min.js", k10, absolutePath, bh.a.ASSET, true), null, null, null, 28, null), new n(executor, jsDir, file));
    }

    public final void notifyListeners(int i10) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((h) ((m) it.next())).onDownloadResult(i10);
        }
        listeners.clear();
        isDownloading.set(false);
    }

    public final void downloadJs(x pathProvider, com.vungle.ads.internal.downloader.p downloader, com.vungle.ads.internal.executor.l executor, m mVar) {
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(executor, "executor");
        executor.execute(new c3.b(12, mVar, pathProvider, downloader, executor));
    }
}
