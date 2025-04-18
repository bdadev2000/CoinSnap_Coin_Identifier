package com.google.android.datatransport.runtime.dagger.internal;

import c0.a;
import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes4.dex */
public final class DoubleCheck<T> implements a, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile a provider;

    private DoubleCheck(a aVar) {
        this.provider = aVar;
    }

    public static <P extends a, T> Lazy<T> lazy(P p2) {
        return p2 instanceof Lazy ? (Lazy) p2 : new DoubleCheck((a) Preconditions.checkNotNull(p2));
    }

    public static <P extends a, T> a provider(P p2) {
        Preconditions.checkNotNull(p2);
        return p2 instanceof DoubleCheck ? p2 : new DoubleCheck(p2);
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // c0.a
    public T get() {
        Object obj = (T) this.instance;
        Object obj2 = UNINITIALIZED;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.instance;
                    if (obj == obj2) {
                        obj = (T) this.provider.get();
                        this.instance = reentrantCheck(this.instance, obj);
                        this.provider = null;
                    }
                } finally {
                }
            }
        }
        return (T) obj;
    }
}
