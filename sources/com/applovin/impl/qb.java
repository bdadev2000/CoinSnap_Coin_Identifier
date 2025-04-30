package com.applovin.impl;

import java.lang.ref.WeakReference;
import java.util.Stack;

/* loaded from: classes.dex */
public interface qb {

    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Object obj);
    }

    /* loaded from: classes.dex */
    public static class c implements qb {

        /* renamed from: a, reason: collision with root package name */
        private final int f10222a;
        private final Stack b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.qb
        public synchronized Object a(a aVar) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            return this.b.isEmpty() ? aVar.a() : this.b.pop();
        }

        public c(int i9) {
            this.b = new Stack();
            this.f10222a = i9;
        }

        @Override // com.applovin.impl.qb
        public synchronized void a(Object obj, b bVar) {
            if (this.b.size() < this.f10222a) {
                this.b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e4) {
                    o6.a((Throwable) e4);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements qb {

        /* renamed from: a, reason: collision with root package name */
        private final c f10223a = new c();

        @Override // com.applovin.impl.qb
        public Object a(a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.f10223a.a(new C(aVar, 11))).get();
            } while (obj == null);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.qb
        public void a(Object obj, b bVar) {
            o6.a(obj);
            this.f10223a.a(new WeakReference(obj), new B(2, bVar, obj));
        }
    }

    Object a(a aVar);

    void a(Object obj, b bVar);
}
