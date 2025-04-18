package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public final class r {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache = new p(((int) (Runtime.getRuntime().maxMemory() / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) / 8);
    public static final q Companion = new q(null);
    private static final String TAG = r.class.getSimpleName();
    private static final r instance = new r();

    private r() {
    }

    /* renamed from: displayImage$lambda-0 */
    public static final void m70displayImage$lambda0(String str, r this$0, Function1 onImageLoaded) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onImageLoaded, "$onImageLoaded");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "file://", false, 2, null);
        if (!startsWith$default) {
            return;
        }
        Bitmap bitmap = this$0.lruCache.get(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            onImageLoaded.invoke(bitmap);
            return;
        }
        String substring = str.substring(7);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        Bitmap decodeFile = BitmapFactory.decodeFile(substring);
        if (decodeFile != null) {
            this$0.lruCache.put(str, decodeFile);
            onImageLoaded.invoke(decodeFile);
        } else {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(String str, Function1<? super Bitmap, Unit> onImageLoaded) {
        boolean z10;
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            u uVar2 = v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new androidx.emoji2.text.n(25, str, this, onImageLoaded));
        }
    }

    public final void init(Executor ioExecutor) {
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
