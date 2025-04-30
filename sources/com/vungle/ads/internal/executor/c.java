package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class c implements Future {
    public static final b Companion = new b(null);
    private static final String TAG = c.class.getSimpleName();
    private final Future<Object> future;

    public c(Future<Object> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z8) {
        Future<Object> future = this.future;
        if (future != null) {
            return future.cancel(z8);
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
            String str = TAG;
            G7.j.d(str, "TAG");
            uVar.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e4) {
            u uVar2 = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar2.e(str2, "error on execution", e4);
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
    public Object get(long j7, TimeUnit timeUnit) {
        G7.j.e(timeUnit, "unit");
        try {
            Future<Object> future = this.future;
            if (future != null) {
                return future.get(j7, timeUnit);
            }
            return null;
        } catch (InterruptedException unused) {
            u uVar = v.Companion;
            String str = TAG;
            G7.j.d(str, "TAG");
            uVar.w(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e4) {
            u uVar2 = v.Companion;
            String str2 = TAG;
            G7.j.d(str2, "TAG");
            uVar2.e(str2, "error on execution", e4);
            return null;
        } catch (TimeoutException e9) {
            u uVar3 = v.Companion;
            String str3 = TAG;
            G7.j.d(str3, "TAG");
            uVar3.e(str3, "error on timeout", e9);
            G7.j.d(str3, "TAG");
            uVar3.w(str3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
