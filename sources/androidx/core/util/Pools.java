package androidx.core.util;

import p0.a;

/* loaded from: classes2.dex */
public final class Pools {

    /* loaded from: classes2.dex */
    public interface Pool<T> {
        boolean a(Object obj);

        Object b();
    }

    /* loaded from: classes2.dex */
    public static class SimplePool<T> implements Pool<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f18681a;

        /* renamed from: b, reason: collision with root package name */
        public int f18682b;

        public SimplePool(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0".toString());
            }
            this.f18681a = new Object[i2];
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean a(Object obj) {
            Object[] objArr;
            boolean z2;
            a.s(obj, "instance");
            int i2 = this.f18682b;
            int i3 = 0;
            while (true) {
                objArr = this.f18681a;
                if (i3 >= i2) {
                    z2 = false;
                    break;
                }
                if (objArr[i3] == obj) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (!(!z2)) {
                throw new IllegalStateException("Already in the pool!".toString());
            }
            int i4 = this.f18682b;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = obj;
            this.f18682b = i4 + 1;
            return true;
        }

        @Override // androidx.core.util.Pools.Pool
        public Object b() {
            int i2 = this.f18682b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f18681a;
            Object obj = objArr[i3];
            a.q(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objArr[i3] = null;
            this.f18682b--;
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* renamed from: c, reason: collision with root package name */
        public final Object f18683c;

        public SynchronizedPool(int i2) {
            super(i2);
            this.f18683c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final boolean a(Object obj) {
            boolean a2;
            a.s(obj, "instance");
            synchronized (this.f18683c) {
                a2 = super.a(obj);
            }
            return a2;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public final Object b() {
            Object b2;
            synchronized (this.f18683c) {
                b2 = super.b();
            }
            return b2;
        }
    }
}
