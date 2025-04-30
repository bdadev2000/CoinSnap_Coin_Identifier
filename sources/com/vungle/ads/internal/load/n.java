package com.vungle.ads.internal.load;

import U4.RunnableC0311g;
import com.vungle.ads.C2125l0;
import com.vungle.ads.C2137s;
import com.vungle.ads.internal.util.v;
import java.io.File;

/* loaded from: classes3.dex */
public final class n implements com.vungle.ads.internal.downloader.i {
    final /* synthetic */ com.vungle.ads.internal.executor.l $executor;
    final /* synthetic */ File $jsPath;
    final /* synthetic */ File $mraidJsFile;

    public n(com.vungle.ads.internal.executor.l lVar, File file, File file2) {
        this.$executor = lVar;
        this.$jsPath = file;
        this.$mraidJsFile = file2;
    }

    public static /* synthetic */ void a(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n nVar, File file) {
        m56onError$lambda0(dVar, nVar, file);
    }

    public static /* synthetic */ void b(File file, File file2, File file3) {
        m57onSuccess$lambda1(file, file2, file3);
    }

    /* renamed from: onError$lambda-0 */
    public static final void m56onError$lambda0(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n nVar, File file) {
        Integer num;
        G7.j.e(nVar, "$downloadRequest");
        G7.j.e(file, "$jsPath");
        try {
            try {
                StringBuilder sb = new StringBuilder("download mraid js error: ");
                if (dVar != null) {
                    num = Integer.valueOf(dVar.getServerCode());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(". Failed to load asset ");
                sb.append(nVar.getAsset().getServerPath());
                String sb2 = sb.toString();
                v.Companion.d("MraidJsLoader", sb2);
                new C2125l0(sb2).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.n.deleteContents(file);
            } catch (Exception e4) {
                v.Companion.e("MraidJsLoader", "Failed to delete js assets", e4);
            }
            o.INSTANCE.notifyListeners(12);
        } catch (Throwable th) {
            o.INSTANCE.notifyListeners(12);
            throw th;
        }
    }

    /* renamed from: onSuccess$lambda-1 */
    public static final void m57onSuccess$lambda1(File file, File file2, File file3) {
        G7.j.e(file, "$file");
        G7.j.e(file2, "$mraidJsFile");
        G7.j.e(file3, "$jsPath");
        try {
            if (file.exists() && file.length() > 0) {
                o.INSTANCE.notifyListeners(10);
            } else {
                C2137s.INSTANCE.logError$vungle_ads_release(131, "Mraid js downloaded but write failure: " + file2.getAbsolutePath(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                com.vungle.ads.internal.util.n.deleteContents(file3);
                o.INSTANCE.notifyListeners(12);
            }
        } catch (Exception e4) {
            v.Companion.e("MraidJsLoader", "Failed to delete js assets", e4);
            o.INSTANCE.notifyListeners(12);
        }
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onError(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n nVar) {
        G7.j.e(nVar, "downloadRequest");
        this.$executor.execute(new RunnableC0311g(dVar, nVar, this.$jsPath, 12));
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onSuccess(File file, com.vungle.ads.internal.downloader.n nVar) {
        G7.j.e(file, "file");
        G7.j.e(nVar, "downloadRequest");
        this.$executor.execute(new RunnableC0311g(file, this.$mraidJsFile, this.$jsPath, 11));
    }
}
