package o4;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2495a {

    /* renamed from: a, reason: collision with root package name */
    public String f21938a = null;
    public final HashSet b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f21939c;

    /* renamed from: d, reason: collision with root package name */
    public int f21940d;

    /* renamed from: e, reason: collision with root package name */
    public int f21941e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2498d f21942f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f21943g;

    public C2495a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.f21939c = new HashSet();
        this.f21940d = 0;
        this.f21941e = 0;
        this.f21943g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            com.bumptech.glide.d.H(cls2, "Null interface");
            this.b.add(q.a(cls2));
        }
    }

    public final void a(C2502h c2502h) {
        if (!this.b.contains(c2502h.f21960a)) {
            this.f21939c.add(c2502h);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final C2496b b() {
        boolean z8;
        if (this.f21942f != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return new C2496b(this.f21938a, new HashSet(this.b), new HashSet(this.f21939c), this.f21940d, this.f21941e, this.f21942f, this.f21943g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i9) {
        boolean z8;
        if (this.f21940d == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.f21940d = i9;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public C2495a(q qVar, q[] qVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.f21939c = new HashSet();
        this.f21940d = 0;
        this.f21941e = 0;
        this.f21943g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            com.bumptech.glide.d.H(qVar2, "Null interface");
        }
        Collections.addAll(this.b, qVarArr);
    }
}
