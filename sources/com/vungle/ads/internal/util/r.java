package com.vungle.ads.internal.util;

import U4.RunnableC0311g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class r {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache = new p(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
    public static final q Companion = new q(null);
    private static final String TAG = r.class.getSimpleName();
    private static final r instance = new r();

    private r() {
    }

    /* renamed from: displayImage$lambda-0 */
    public static final void m90displayImage$lambda0(String str, r rVar, F7.l lVar) {
        G7.j.e(rVar, "this$0");
        G7.j.e(lVar, "$onImageLoaded");
        if (!O7.o.C(str, "file://", false)) {
            return;
        }
        Bitmap bitmap = rVar.lruCache.get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            lVar.invoke(bitmap);
            return;
        }
        String substring = str.substring(7);
        G7.j.d(substring, "this as java.lang.String).substring(startIndex)");
        Bitmap decodeFile = BitmapFactory.decodeFile(substring);
        if (decodeFile != null) {
            rVar.lruCache.put(str, decodeFile);
            lVar.invoke(decodeFile);
        } else {
            u uVar = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar.w(str2, "decode bitmap failed.");
        }
    }

    public final void displayImage(String str, F7.l lVar) {
        G7.j.e(lVar, "onImageLoaded");
        if (this.ioExecutor == null) {
            u uVar = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar.w(str2, "ImageLoader not initialized.");
            return;
        }
        if (str != null && str.length() != 0) {
            Executor executor = this.ioExecutor;
            if (executor != null) {
                executor.execute(new RunnableC0311g(str, this, lVar, 14));
                return;
            }
            return;
        }
        u uVar2 = v.Companion;
        String str3 = TAG;
        G7.j.d(str3, "TAG");
        uVar2.w(str3, "the uri is required.");
    }

    public final void init(Executor executor) {
        G7.j.e(executor, "ioExecutor");
        this.ioExecutor = executor;
    }
}
