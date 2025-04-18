package com.applovin.impl;

import java.lang.ref.WeakReference;
import java.util.Stack;

/* loaded from: classes2.dex */
public interface vb {

    /* loaded from: classes2.dex */
    public interface a {
        Object a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(Object obj);
    }

    /* loaded from: classes2.dex */
    public static class c implements vb {

        /* renamed from: a, reason: collision with root package name */
        private final int f27517a;

        /* renamed from: b, reason: collision with root package name */
        private final Stack f27518b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.vb
        public synchronized Object a(a aVar) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            return this.f27518b.isEmpty() ? aVar.a() : this.f27518b.pop();
        }

        public c(int i2) {
            this.f27518b = new Stack();
            this.f27517a = i2;
        }

        @Override // com.applovin.impl.vb
        public synchronized void a(Object obj, b bVar) {
            if (this.f27518b.size() < this.f27517a) {
                this.f27518b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e) {
                    q6.a((Throwable) e);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements vb {

        /* renamed from: a, reason: collision with root package name */
        private final c f27519a = new c();

        @Override // com.applovin.impl.vb
        public Object a(a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.f27519a.a(new is(aVar, 13))).get();
            } while (obj == null);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.vb
        public void a(Object obj, b bVar) {
            q6.a(obj);
            this.f27519a.a(new WeakReference(obj), new zs(11, bVar, obj));
        }
    }

    Object a(a aVar);

    void a(Object obj, b bVar);
}
