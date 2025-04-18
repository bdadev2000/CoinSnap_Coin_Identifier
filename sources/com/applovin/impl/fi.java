package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fi {

    /* renamed from: a */
    private final Object f23921a;

    /* renamed from: b */
    private final String f23922b;

    /* renamed from: c */
    private final List f23923c;
    private volatile boolean d;
    private volatile boolean e;

    /* renamed from: f */
    private volatile Object f23924f;

    /* renamed from: g */
    private volatile Object f23925g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Object obj);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z2, Object obj, Object obj2);
    }

    public fi() {
        this(null);
    }

    public void a(b bVar) {
        synchronized (this.f23921a) {
            try {
                if (!this.d) {
                    this.f23923c.add(bVar);
                } else {
                    b(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return this.d && !this.e;
    }

    public String toString() {
        String str;
        if (!this.d) {
            str = "Waiting";
        } else if (this.e) {
            str = "Success -> " + this.f23924f;
        } else {
            str = "Failed -> " + this.f23925g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    public fi(String str) {
        this.f23921a = new Object();
        this.f23923c = new ArrayList();
        this.d = false;
        this.e = false;
        this.f23922b = str;
    }

    public String b() {
        String str = this.f23922b;
        return str != null ? str : super.toString();
    }

    public boolean c() {
        return this.d;
    }

    public static fi c(Object obj) {
        return new fi().b(obj);
    }

    public fi b(Object obj) {
        a(true, obj, null);
        return this;
    }

    private void b(b bVar) {
        try {
            bVar.a(this.e, this.f23924f, this.f23925g);
        } catch (Throwable th) {
            q6.a(th, "Promise callbacks must not throw exceptions", new Object[0]);
        }
    }

    public void a(a aVar) {
        a((b) new lt(aVar, 0));
    }

    public void a(Runnable runnable) {
        a((b) new lt(runnable, 1));
    }

    public Object a() {
        q6.a(d());
        return this.f23925g;
    }

    public static /* synthetic */ void a(a aVar, boolean z2, Object obj, Object obj2) {
        if (z2) {
            return;
        }
        aVar.a(obj2);
    }

    public static /* synthetic */ void a(Runnable runnable, boolean z2, Object obj, Object obj2) {
        if (z2) {
            runnable.run();
        }
    }

    public fi a(Object obj) {
        a(false, null, obj);
        return this;
    }

    private void a(boolean z2, Object obj, Object obj2) {
        synchronized (this.f23921a) {
            try {
                if (this.d) {
                    return;
                }
                this.f23924f = obj;
                this.f23925g = obj2;
                this.e = z2;
                this.d = true;
                Iterator it = this.f23923c.iterator();
                while (it.hasNext()) {
                    b((b) it.next());
                }
                this.f23923c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
