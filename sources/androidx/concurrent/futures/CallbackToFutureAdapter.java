package androidx.concurrent.futures;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class CallbackToFutureAdapter {

    /* loaded from: classes3.dex */
    public static final class Completer<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f17727a;

        /* renamed from: b, reason: collision with root package name */
        public SafeFuture f17728b;

        /* renamed from: c, reason: collision with root package name */
        public ResolvableFuture f17729c;
        public boolean d;

        public final void a(Object obj) {
            this.d = true;
            SafeFuture safeFuture = this.f17728b;
            if (safeFuture == null || !safeFuture.f17731b.set(obj)) {
                return;
            }
            this.f17727a = null;
            this.f17728b = null;
            this.f17729c = null;
        }

        public final void b() {
            this.d = true;
            SafeFuture safeFuture = this.f17728b;
            if (safeFuture == null || !safeFuture.f17731b.cancel(true)) {
                return;
            }
            this.f17727a = null;
            this.f17728b = null;
            this.f17729c = null;
        }

        public final void c(Throwable th) {
            this.d = true;
            SafeFuture safeFuture = this.f17728b;
            if (safeFuture == null || !safeFuture.f17731b.setException(th)) {
                return;
            }
            this.f17727a = null;
            this.f17728b = null;
            this.f17729c = null;
        }

        public final void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.f17728b;
            if (safeFuture != null) {
                AbstractResolvableFuture abstractResolvableFuture = safeFuture.f17731b;
                if (!abstractResolvableFuture.isDone()) {
                    abstractResolvableFuture.setException(new Throwable("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f17727a));
                }
            }
            if (this.d || (resolvableFuture = this.f17729c) == null) {
                return;
            }
            resolvableFuture.set(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface Resolver<T> {
    }

    /* loaded from: classes3.dex */
    public static final class SafeFuture<T> implements ListenableFuture<T> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17730a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractResolvableFuture f17731b = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String pendingToString() {
                Completer completer = (Completer) SafeFuture.this.f17730a.get();
                if (completer == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + completer.f17727a + "]";
            }
        };

        public SafeFuture(Completer completer) {
            this.f17730a = new WeakReference(completer);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.f17731b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z2) {
            Completer completer = (Completer) this.f17730a.get();
            boolean cancel = this.f17731b.cancel(z2);
            if (cancel && completer != null) {
                completer.f17727a = null;
                completer.f17728b = null;
                completer.f17729c.set(null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.f17731b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f17731b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f17731b.isDone();
        }

        public final String toString() {
            return this.f17731b.toString();
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j2, TimeUnit timeUnit) {
            return this.f17731b.get(j2, timeUnit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.concurrent.futures.CallbackToFutureAdapter$Completer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.concurrent.futures.ResolvableFuture, java.lang.Object] */
    public static ListenableFuture a(a aVar) {
        ?? obj = new Object();
        obj.f17729c = new Object();
        SafeFuture safeFuture = new SafeFuture(obj);
        obj.f17728b = safeFuture;
        obj.f17727a = a.class;
        try {
            Object a2 = aVar.a(obj);
            if (a2 != null) {
                obj.f17727a = a2;
            }
        } catch (Exception e) {
            safeFuture.f17731b.setException(e);
        }
        return safeFuture;
    }
}
