package com.vungle.ads.internal.load;

import com.vungle.ads.internal.util.v;
import com.vungle.ads.j1;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements com.vungle.ads.internal.downloader.i {
    final /* synthetic */ com.vungle.ads.internal.executor.l $executor;
    final /* synthetic */ File $jsPath;
    final /* synthetic */ File $mraidJsFile;

    public n(com.vungle.ads.internal.executor.l lVar, File file, File file2) {
        this.$executor = lVar;
        this.$jsPath = file;
        this.$mraidJsFile = file2;
    }

    /* renamed from: onError$lambda-0 */
    public static final void m36onError$lambda0(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n downloadRequest, File jsPath) {
        Integer num;
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(jsPath, "$jsPath");
        try {
            try {
                StringBuilder sb2 = new StringBuilder("download mraid js error: ");
                if (dVar != null) {
                    num = Integer.valueOf(dVar.getServerCode());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(". Failed to load asset ");
                sb2.append(downloadRequest.getAsset().getServerPath());
                String sb3 = sb2.toString();
                v.Companion.d("MraidJsLoader", sb3);
                new j1(sb3).logErrorNoReturnValue$vungle_ads_release();
                com.vungle.ads.internal.util.n.deleteContents(jsPath);
            } catch (Exception e2) {
                v.Companion.e("MraidJsLoader", "Failed to delete js assets", e2);
            }
        } finally {
            o.INSTANCE.notifyListeners(12);
        }
    }

    /* renamed from: onSuccess$lambda-1 */
    public static final void m37onSuccess$lambda1(File file, File mraidJsFile, File jsPath) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(mraidJsFile, "$mraidJsFile");
        Intrinsics.checkNotNullParameter(jsPath, "$jsPath");
        try {
            if (file.exists() && file.length() > 0) {
                o.INSTANCE.notifyListeners(10);
            } else {
                com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(131, "Mraid js downloaded but write failure: " + mraidJsFile.getAbsolutePath(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                com.vungle.ads.internal.util.n.deleteContents(jsPath);
                o.INSTANCE.notifyListeners(12);
            }
        } catch (Exception e2) {
            v.Companion.e("MraidJsLoader", "Failed to delete js assets", e2);
            o.INSTANCE.notifyListeners(12);
        }
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onError(com.vungle.ads.internal.downloader.d dVar, com.vungle.ads.internal.downloader.n downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        this.$executor.execute(new androidx.emoji2.text.n(22, dVar, downloadRequest, this.$jsPath));
    }

    @Override // com.vungle.ads.internal.downloader.i
    public void onSuccess(File file, com.vungle.ads.internal.downloader.n downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        this.$executor.execute(new androidx.emoji2.text.n(23, file, this.$mraidJsFile, this.$jsPath));
    }
}
