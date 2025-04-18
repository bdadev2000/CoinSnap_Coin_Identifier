package com.vungle.ads.internal.downloader;

import com.vungle.ads.d2;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import com.vungle.ads.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ki.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wh.c0;
import wh.d0;
import wh.k0;
import wh.l0;
import wh.u0;
import wh.w0;
import wh.y0;

/* loaded from: classes4.dex */
public final class l implements p {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final j Companion = new j(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final String TAG = "AssetDownloader";
    private static final int TIMEOUT = 30;
    private final com.vungle.ads.internal.executor.l downloadExecutor;
    private l0 okHttpClient;
    private final x pathProvider;
    private final List<n> transitioning;

    public l(com.vungle.ads.internal.executor.l downloadExecutor, x pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.transitioning = new ArrayList();
        k0 k0Var = new k0();
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        k0Var.u = xh.b.b(unit);
        Intrinsics.checkNotNullParameter(unit, "unit");
        k0Var.f27106t = xh.b.b(unit);
        k0Var.f27097k = null;
        k0Var.f27094h = true;
        k0Var.f27095i = true;
        f0 f0Var = f0.INSTANCE;
        if (f0Var.isCleverCacheEnabled()) {
            long cleverCacheDiskSize = f0Var.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = f0Var.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long min = Long.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (min > 0) {
                k0Var.f27097k = new wh.h(pathProvider.getCleverCacheDir(), min);
            } else {
                v.Companion.w(TAG, "cache disk capacity size <=0, no clever cache active.");
            }
        }
        this.okHttpClient = new l0(k0Var);
    }

    public static /* synthetic */ void a(l lVar, n nVar, i iVar) {
        m19download$lambda0(lVar, nVar, iVar);
    }

    private final boolean checkSpaceAvailable() {
        x xVar = this.pathProvider;
        String absolutePath = xVar.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = xVar.getAvailableBytes(absolutePath);
        if (availableBytes < 20971520) {
            s.INSTANCE.logError$vungle_ads_release(126, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Insufficient space ", availableBytes), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return false;
        }
        return true;
    }

    private final y0 decodeGzipIfNeeded(u0 u0Var) {
        boolean equals;
        y0 y0Var = u0Var.f27219i;
        equals = StringsKt__StringsJVMKt.equals(GZIP, u0.g(u0Var, CONTENT_ENCODING), true);
        if (equals && y0Var != null) {
            return new w0(u0.g(u0Var, CONTENT_TYPE), -1L, a6.k.f(new t(y0Var.source())));
        }
        return y0Var;
    }

    private final void deliverError(n nVar, i iVar, d dVar) {
        if (iVar != null) {
            iVar.onError(dVar, nVar);
        }
    }

    private final void deliverSuccess(File file, n nVar, i iVar) {
        v.Companion.d(TAG, "On success " + nVar);
        if (iVar != null) {
            iVar.onSuccess(file, nVar);
        }
    }

    /* renamed from: download$lambda-0 */
    public static final void m19download$lambda0(l this$0, n nVar, i iVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(nVar, iVar, new d(-1, new d2("Cannot complete " + nVar + " : Out of Memory"), c.Companion.getINTERNAL_ERROR()));
    }

    private final boolean isValidUrl(String str) {
        boolean z10;
        d0 d0Var;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        char[] cArr = d0.f27032k;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            d0Var = c0.i(str);
        } catch (IllegalArgumentException unused) {
            d0Var = null;
        }
        if (d0Var == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0290, code lost:
    
        com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(114, "Asset save error " + r14, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02b9, code lost:
    
        throw new com.vungle.ads.internal.downloader.o("File is not existing");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02ba, code lost:
    
        r8.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02bd, code lost:
    
        r0 = r6.getStatus();
        r2 = com.vungle.ads.internal.downloader.g.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02c7, code lost:
    
        if (r0 != r2.getIN_PROGRESS()) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02c9, code lost:
    
        r6.setStatus(r2.getDONE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02db, code lost:
    
        r0 = r15.f27219i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02dd, code lost:
    
        if (r0 == null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02df, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02e2, code lost:
    
        r20.cancel();
        r0 = com.vungle.ads.internal.util.n.INSTANCE;
        r0.closeQuietly(r8);
        r0.closeQuietly(r12);
        r0 = com.vungle.ads.internal.util.v.Companion;
        r0.d(com.vungle.ads.internal.downloader.l.TAG, "download status: " + r6.getStatus());
        r3 = r6.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x030a, code lost:
    
        if (r3 != r2.getERROR()) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0311, code lost:
    
        if (r3 != r2.getSTARTED()) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0315, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0317, code lost:
    
        if (r8 == false) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0319, code lost:
    
        r13 = r41;
        r11 = r42;
        deliverError(r13, r11, r4);
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0322, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0348, code lost:
    
        r10 = r4;
        r17 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0325, code lost:
    
        r13 = r41;
        r11 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x032d, code lost:
    
        if (r3 != r2.getCANCELLED()) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x032f, code lost:
    
        r3 = r21;
        r0.d(com.vungle.ads.internal.downloader.l.TAG, r3 + r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0341, code lost:
    
        r3 = r21;
        r2 = r22;
        deliverSuccess(r2, r13, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0313, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x034e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0480 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a4  */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.vungle.ads.internal.util.n] */
    /* JADX WARN: Type inference failed for: r12v14, types: [wh.u0] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v4, types: [bi.i] */
    /* JADX WARN: Type inference failed for: r20v5, types: [bi.i] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9, types: [bi.i] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41, types: [java.io.Closeable, ki.d0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [wh.y0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.n r41, com.vungle.ads.internal.downloader.i r42) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.l.launchRequest(com.vungle.ads.internal.downloader.n, com.vungle.ads.internal.downloader.i):void");
    }

    @Override // com.vungle.ads.internal.downloader.p
    public void cancel(n nVar) {
        if (nVar != null && !nVar.isCancelled()) {
            nVar.cancel();
        }
    }

    @Override // com.vungle.ads.internal.downloader.p
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((n) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.p
    public void download(n nVar, i iVar) {
        if (nVar == null) {
            return;
        }
        this.transitioning.add(nVar);
        this.downloadExecutor.execute(new k(this, nVar, iVar), new androidx.emoji2.text.n(18, this, nVar, iVar));
    }
}
