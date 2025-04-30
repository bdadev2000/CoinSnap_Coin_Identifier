package com.vungle.ads.internal.downloader;

import Q7.n0;
import U4.RunnableC0311g;
import com.vungle.ads.C2137s;
import com.vungle.ads.F0;
import com.vungle.ads.internal.F;
import com.vungle.ads.internal.util.v;
import com.vungle.ads.internal.util.x;
import i8.C2370g;
import i8.I;
import i8.K;
import i8.M;
import i8.t;
import i8.u;
import i8.y;
import i8.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
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
    private z okHttpClient;
    private final x pathProvider;
    private final List<n> transitioning;

    public l(com.vungle.ads.internal.executor.l lVar, x xVar) {
        G7.j.e(lVar, "downloadExecutor");
        G7.j.e(xVar, "pathProvider");
        this.downloadExecutor = lVar;
        this.pathProvider = xVar;
        this.transitioning = new ArrayList();
        y yVar = new y();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        G7.j.e(timeUnit, "unit");
        yVar.f20913u = j8.b.b(timeUnit);
        yVar.f20912t = j8.b.b(timeUnit);
        yVar.f20905k = null;
        yVar.f20902h = true;
        yVar.f20903i = true;
        F f9 = F.INSTANCE;
        if (f9.isCleverCacheEnabled()) {
            long cleverCacheDiskSize = f9.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = f9.getCleverCacheDiskPercentage();
            String absolutePath = xVar.getCleverCacheDir().getAbsolutePath();
            G7.j.d(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long min = Long.min(cleverCacheDiskSize, (xVar.getAvailableBytes(absolutePath) * cleverCacheDiskPercentage) / 100);
            if (min > 0) {
                yVar.f20905k = new C2370g(xVar.getCleverCacheDir(), min);
            } else {
                v.Companion.w(TAG, "cache disk capacity size <=0, no clever cache active.");
            }
        }
        this.okHttpClient = new z(yVar);
    }

    public static /* synthetic */ void a(l lVar, n nVar, i iVar) {
        m38download$lambda0(lVar, nVar, iVar);
    }

    private final boolean checkSpaceAvailable() {
        x xVar = this.pathProvider;
        String absolutePath = xVar.getVungleDir().getAbsolutePath();
        G7.j.d(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = xVar.getAvailableBytes(absolutePath);
        if (availableBytes < 20971520) {
            C2137s.INSTANCE.logError$vungle_ads_release(126, n0.g(availableBytes, "Insufficient space "), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return false;
        }
        return true;
    }

    private final M decodeGzipIfNeeded(I i9) {
        M m = i9.f20779i;
        if (GZIP.equalsIgnoreCase(I.b(i9, CONTENT_ENCODING)) && m != null) {
            return new K(I.b(i9, CONTENT_TYPE), -1L, r8.k.f(new w8.n(m.source())), 1);
        }
        return m;
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
    public static final void m38download$lambda0(l lVar, n nVar, i iVar) {
        G7.j.e(lVar, "this$0");
        lVar.deliverError(nVar, iVar, new d(-1, new F0("Cannot complete " + nVar + " : Out of Memory"), c.Companion.getINTERNAL_ERROR()));
    }

    private final boolean isValidUrl(String str) {
        if (str != null && str.length() != 0) {
            u uVar = null;
            try {
                t tVar = new t();
                tVar.d(null, str);
                uVar = tVar.a();
            } catch (IllegalArgumentException unused) {
            }
            if (uVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0328, code lost:
    
        r8.flush();
        r0 = r6.getStatus();
        r2 = com.vungle.ads.internal.downloader.g.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0335, code lost:
    
        if (r0 != r2.getIN_PROGRESS()) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0337, code lost:
    
        r6.setStatus(r2.getDONE());
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x033e, code lost:
    
        r0 = r4.f20779i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0340, code lost:
    
        if (r0 == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0342, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0345, code lost:
    
        r15.cancel();
        r0 = com.vungle.ads.internal.util.n.INSTANCE;
        r0.closeQuietly(r8);
        r0.closeQuietly(r13);
        r0 = com.vungle.ads.internal.util.v.Companion;
        r0.d(com.vungle.ads.internal.downloader.l.TAG, "download status: " + r6.getStatus());
        r3 = r6.getStatus();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x036d, code lost:
    
        if (r3 != r2.getERROR()) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036f, code lost:
    
        r12 = r39;
        r11 = r40;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x037d, code lost:
    
        deliverError(r12, r11, r10);
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0382, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03aa, code lost:
    
        r9 = r10;
        r10 = r12;
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x037a, code lost:
    
        if (r3 != r2.getSTARTED()) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0385, code lost:
    
        r12 = r39;
        r11 = r40;
        r10 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x038f, code lost:
    
        if (r3 != r2.getCANCELLED()) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0391, code lost:
    
        r3 = r18;
        r0.d(com.vungle.ads.internal.downloader.l.TAG, r3 + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a3, code lost:
    
        r3 = r18;
        r2 = r20;
        deliverSuccess(r2, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02fe, code lost:
    
        com.vungle.ads.C2137s.INSTANCE.logError$vungle_ads_release(114, "Asset save error " + r14, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0327, code lost:
    
        throw new com.vungle.ads.internal.downloader.o("File is not existing");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0504 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0631  */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.vungle.ads.internal.util.n] */
    /* JADX WARN: Type inference failed for: r15v12, types: [m8.i, i8.j] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v5, types: [m8.i] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v2, types: [m8.i] */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r8v39, types: [w8.s, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [i8.M] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.n r39, com.vungle.ads.internal.downloader.i r40) {
        /*
            Method dump skipped, instructions count: 1668
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
        this.downloadExecutor.execute(new k(this, nVar, iVar), new RunnableC0311g(this, nVar, iVar, 7));
    }
}
