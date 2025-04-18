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
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final Stack f7138b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.qb
        public synchronized Object a(a aVar) {
            return this.f7138b.isEmpty() ? aVar.a() : this.f7138b.pop();
        }

        public c(int i10) {
            this.f7138b = new Stack();
            this.a = i10;
        }

        @Override // com.applovin.impl.qb
        public synchronized void a(Object obj, b bVar) {
            if (this.f7138b.size() < this.a) {
                this.f7138b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e2) {
                    o6.a((Throwable) e2);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d implements qb {
        private final c a = new c();

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.qb
        public Object a(a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.a.a(new js(aVar, 11))).get();
            } while (obj == null);
            return obj;
        }

        @Override // com.applovin.impl.qb
        public void a(Object obj, b bVar) {
            o6.a(obj);
            this.a.a(new WeakReference(obj), new os(2, bVar, obj));
        }
    }

    Object a(a aVar);

    void a(Object obj, b bVar);
}
