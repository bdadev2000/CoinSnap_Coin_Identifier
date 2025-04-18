package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private m.g mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends c0 implements t {

        /* renamed from: g, reason: collision with root package name */
        public final v f1775g;

        public LifecycleBoundObserver(v vVar, f0 f0Var) {
            super(LiveData.this, f0Var);
            this.f1775g = vVar;
        }

        @Override // androidx.lifecycle.t
        public final void a(v vVar, n nVar) {
            v vVar2 = this.f1775g;
            o oVar = ((x) vVar2.getLifecycle()).f1835d;
            if (oVar == o.DESTROYED) {
                LiveData.this.removeObserver(this.f1786b);
                return;
            }
            o oVar2 = null;
            while (oVar2 != oVar) {
                c(f());
                oVar2 = oVar;
                oVar = ((x) vVar2.getLifecycle()).f1835d;
            }
        }

        @Override // androidx.lifecycle.c0
        public final void d() {
            this.f1775g.getLifecycle().b(this);
        }

        @Override // androidx.lifecycle.c0
        public final boolean e(v vVar) {
            return this.f1775g == vVar;
        }

        @Override // androidx.lifecycle.c0
        public final boolean f() {
            return ((x) this.f1775g.getLifecycle()).f1835d.a(o.STARTED);
        }
    }

    public LiveData(T t5) {
        this.mDataLock = new Object();
        this.mObservers = new m.g();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a0(this);
        this.mData = t5;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (l.b.v().w()) {
        } else {
            throw new IllegalStateException(com.applovin.impl.mediation.ads.e.f("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(c0 c0Var) {
        if (!c0Var.f1787c) {
            return;
        }
        if (!c0Var.f()) {
            c0Var.c(false);
            return;
        }
        int i10 = c0Var.f1788d;
        int i11 = this.mVersion;
        if (i10 >= i11) {
            return;
        }
        c0Var.f1788d = i11;
        c0Var.f1786b.a(this.mData);
    }

    public void changeActiveCounter(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.mActiveCount;
        this.mActiveCount = i10 + i11;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i12 = this.mActiveCount;
                if (i11 != i12) {
                    if (i11 == 0 && i12 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        onActive();
                    } else if (z11) {
                        onInactive();
                    }
                    i11 = i12;
                } else {
                    return;
                }
            } finally {
                this.mChangingActiveState = false;
            }
        }
    }

    public void dispatchingValue(@Nullable c0 c0Var) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (c0Var != null) {
                considerNotify(c0Var);
                c0Var = null;
            } else {
                m.g gVar = this.mObservers;
                gVar.getClass();
                m.d dVar = new m.d(gVar);
                gVar.f21419d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((c0) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    @Nullable
    public T getValue() {
        T t5 = (T) this.mData;
        if (t5 != NOT_SET) {
            return t5;
        }
        return null;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public void observe(@NonNull v vVar, @NonNull f0 f0Var) {
        assertMainThread("observe");
        if (((x) vVar.getLifecycle()).f1835d == o.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, f0Var);
        c0 c0Var = (c0) this.mObservers.b(f0Var, lifecycleBoundObserver);
        if (c0Var != null && !c0Var.e(vVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c0Var != null) {
            return;
        }
        vVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(@NonNull f0 f0Var) {
        assertMainThread("observeForever");
        b0 b0Var = new b0(this, f0Var);
        c0 c0Var = (c0) this.mObservers.b(f0Var, b0Var);
        if (!(c0Var instanceof LifecycleBoundObserver)) {
            if (c0Var != null) {
                return;
            }
            b0Var.c(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t5) {
        boolean z10;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.mPendingData = t5;
        }
        if (!z10) {
            return;
        }
        l.b.v().x(this.mPostValueRunnable);
    }

    public void removeObserver(@NonNull f0 f0Var) {
        assertMainThread("removeObserver");
        c0 c0Var = (c0) this.mObservers.c(f0Var);
        if (c0Var == null) {
            return;
        }
        c0Var.d();
        c0Var.c(false);
    }

    public void setValue(T t5) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t5;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new m.g();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a0(this);
        this.mData = obj;
        this.mVersion = -1;
    }
}
