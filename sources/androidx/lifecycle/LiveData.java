package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class LiveData<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f20026k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f20027a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final SafeIterableMap f20028b = new SafeIterableMap();

    /* renamed from: c, reason: collision with root package name */
    public int f20029c = 0;
    public boolean d;
    public volatile Object e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f20030f;

    /* renamed from: g, reason: collision with root package name */
    public int f20031g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20032h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20033i;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f20034j;

    /* loaded from: classes2.dex */
    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final void b() {
            throw null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class ObserverWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Observer f20036a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f20037b;

        /* renamed from: c, reason: collision with root package name */
        public int f20038c = -1;

        public ObserverWrapper(Observer observer) {
            this.f20036a = observer;
        }

        public final void a(boolean z2) {
            if (z2 == this.f20037b) {
                return;
            }
            this.f20037b = z2;
            int i2 = z2 ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i3 = liveData.f20029c;
            liveData.f20029c = i2 + i3;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i4 = liveData.f20029c;
                        if (i3 == i4) {
                            break;
                        }
                        boolean z3 = i3 == 0 && i4 > 0;
                        boolean z4 = i3 > 0 && i4 == 0;
                        if (z3) {
                            liveData.e();
                        } else if (z4) {
                            liveData.f();
                        }
                        i3 = i4;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.f20037b) {
                liveData.c(this);
            }
        }

        public void b() {
        }

        public abstract boolean d();
    }

    public LiveData() {
        Object obj = f20026k;
        this.f20030f = obj;
        this.f20034j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.f20027a) {
                    obj2 = LiveData.this.f20030f;
                    LiveData.this.f20030f = LiveData.f20026k;
                }
                LiveData.this.h(obj2);
            }
        };
        this.e = obj;
        this.f20031g = -1;
    }

    public static void a(String str) {
        ArchTaskExecutor.a().f1303a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(androidx.compose.foundation.text.input.a.A("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(ObserverWrapper observerWrapper) {
        if (observerWrapper.f20037b) {
            if (!observerWrapper.d()) {
                observerWrapper.a(false);
                return;
            }
            int i2 = observerWrapper.f20038c;
            int i3 = this.f20031g;
            if (i2 >= i3) {
                return;
            }
            observerWrapper.f20038c = i3;
            observerWrapper.f20036a.a(this.e);
        }
    }

    public final void c(ObserverWrapper observerWrapper) {
        if (this.f20032h) {
            this.f20033i = true;
            return;
        }
        this.f20032h = true;
        do {
            this.f20033i = false;
            if (observerWrapper != null) {
                b(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.f20028b;
                safeIterableMap.getClass();
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                safeIterableMap.f1312c.put(iteratorWithAdditions, Boolean.FALSE);
                while (iteratorWithAdditions.hasNext()) {
                    b((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.f20033i) {
                        break;
                    }
                }
            }
        } while (this.f20033i);
        this.f20032h = false;
    }

    public final void d(Observer observer) {
        a("observeForever");
        ObserverWrapper observerWrapper = new ObserverWrapper(observer);
        ObserverWrapper observerWrapper2 = (ObserverWrapper) this.f20028b.b(observer, observerWrapper);
        if (observerWrapper2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper2 != null) {
            return;
        }
        observerWrapper.a(true);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(Observer observer) {
        a("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.f20028b.c(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.b();
        observerWrapper.a(false);
    }

    public void h(Object obj) {
        a("setValue");
        this.f20031g++;
        this.e = obj;
        c(null);
    }
}
