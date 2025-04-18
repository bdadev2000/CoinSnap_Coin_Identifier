package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Future {
    public static final b Companion = new b(null);
    private static final String TAG = c.class.getSimpleName();
    private final Future<Object> future;

    public c(Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Future<Object> future = this.future;
        if (future != null) {
            return future.cancel(z10);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e2) {
            u uVar2 = v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.e(TAG3, "error on execution", e2);
            return null;
        }
    }

    public final Future<Object> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<Object> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j3, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get(j3, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            u uVar = v.Companion;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            uVar.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e2) {
            u uVar2 = v.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            uVar2.e(TAG3, "error on execution", e2);
            return null;
        } catch (TimeoutException e10) {
            u uVar3 = v.Companion;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            uVar3.e(TAG4, "error on timeout", e10);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            uVar3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
