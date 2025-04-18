package com.swordfish.libretrodroid;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class KtUtils {

    @NotNull
    public static final KtUtils INSTANCE = new KtUtils();

    private KtUtils() {
    }

    private final boolean isUIThread() {
        return Looper.getMainLooper().isCurrentThread();
    }

    /* renamed from: runOnUIThread$lambda-0 */
    public static final void m628runOnUIThread$lambda0(q0.a aVar) {
        p0.a.s(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void awaitUninterruptibly(@NotNull CountDownLatch countDownLatch) {
        p0.a.s(countDownLatch, "<this>");
        while (true) {
            try {
                countDownLatch.await();
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void runOnUIThread(@NotNull q0.a aVar) {
        p0.a.s(aVar, "runnable");
        if (isUIThread()) {
            aVar.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new c(aVar, 0));
        }
    }
}
