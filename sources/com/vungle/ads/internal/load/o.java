package com.vungle.ads.internal.load;

import c7.C0620c;
import c7.EnumC0616a;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
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
        m58downloadJs$lambda1(mVar, xVar, pVar, lVar);
    }

    public static /* synthetic */ void downloadJs$default(o oVar, x xVar, com.vungle.ads.internal.downloader.p pVar, com.vungle.ads.internal.executor.l lVar, m mVar, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            mVar = null;
        }
        oVar.downloadJs(xVar, pVar, lVar, mVar);
    }

    /* renamed from: downloadJs$lambda-1 */
    public static final void m58downloadJs$lambda1(m mVar, x xVar, com.vungle.ads.internal.downloader.p pVar, com.vungle.ads.internal.executor.l lVar) {
        G7.j.e(xVar, "$pathProvider");
        G7.j.e(pVar, "$downloader");
        G7.j.e(lVar, "$executor");
        if (mVar != null) {
            listeners.add(mVar);
        }
        if (isDownloading.getAndSet(true)) {
            v.Companion.w(TAG, "mraid js is downloading, waiting for the previous request.");
            return;
        }
        F f9 = F.INSTANCE;
        String mraidEndpoint = f9.getMraidEndpoint();
        if (mraidEndpoint != null && mraidEndpoint.length() != 0) {
            File file = new File(xVar.getJsAssetDir(f9.getMraidJsVersion()), "mraid.min.js");
            if (file.exists()) {
                v.Companion.w(TAG, "mraid js already downloaded");
                INSTANCE.notifyListeners(13);
                return;
            }
            File jsDir = xVar.getJsDir();
            com.vungle.ads.internal.util.n.deleteContents(jsDir);
            String j7 = com.mbridge.msdk.foundation.entity.o.j(mraidEndpoint, "/mraid.min.js");
            String absolutePath = file.getAbsolutePath();
            G7.j.d(absolutePath, "mraidJsFile.absolutePath");
            com.vungle.ads.internal.downloader.l lVar2 = (com.vungle.ads.internal.downloader.l) pVar;
            lVar2.download(new com.vungle.ads.internal.downloader.n(com.vungle.ads.internal.downloader.m.HIGH, new C0620c("mraid.min.js", j7, absolutePath, EnumC0616a.ASSET, true), null, null, null, 28, null), new n(lVar, jsDir, file));
            return;
        }
        INSTANCE.notifyListeners(11);
    }

    public final void notifyListeners(int i9) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            ((h) ((m) it.next())).onDownloadResult(i9);
        }
        listeners.clear();
        isDownloading.set(false);
    }

    public final void downloadJs(x xVar, com.vungle.ads.internal.downloader.p pVar, com.vungle.ads.internal.executor.l lVar, m mVar) {
        G7.j.e(xVar, "pathProvider");
        G7.j.e(pVar, "downloader");
        G7.j.e(lVar, "executor");
        lVar.execute(new I2.f(mVar, xVar, pVar, lVar, 8));
    }
}
