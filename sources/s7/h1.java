package s7;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h1 {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public int f24386b;

    /* renamed from: c, reason: collision with root package name */
    public int f24387c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24388d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f24389e;

    /* renamed from: f, reason: collision with root package name */
    public Object f24390f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f24391g;

    public h1() {
        this.f24386b = 64;
        this.f24387c = 5;
        this.f24389e = new ArrayDeque();
        this.f24390f = new ArrayDeque();
        this.f24391g = new ArrayDeque();
    }

    public final void a(db.j jVar) {
        if (!((Set) this.f24388d).contains(jVar.a)) {
            ((Set) this.f24389e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final db.a b() {
        boolean z10;
        if (((db.d) this.f24390f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new db.a((String) this.a, new HashSet((Set) this.f24388d), new HashSet((Set) this.f24389e), this.f24386b, this.f24387c, (db.d) this.f24390f, (Set) this.f24391g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final bi.f c(String str) {
        Iterator it = ((ArrayDeque) this.f24390f).iterator();
        while (it.hasNext()) {
            bi.f fVar = (bi.f) it.next();
            if (Intrinsics.areEqual(fVar.f2465d.f2468c.a.f27035d, str)) {
                return fVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f24389e).iterator();
        while (it2.hasNext()) {
            bi.f fVar2 = (bi.f) it2.next();
            if (Intrinsics.areEqual(fVar2.f2465d.f2468c.a.f27035d, str)) {
                return fVar2;
            }
        }
        return null;
    }

    public final void d(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                synchronized (this) {
                    runnable = (Runnable) this.f24388d;
                }
                if (f() && runnable != null) {
                    runnable.run();
                    return;
                }
            }
            throw new AssertionError("Call wasn't in-flight!");
        }
        Unit unit = Unit.INSTANCE;
        if (f()) {
        }
    }

    public final void e(bi.f call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f2464c.decrementAndGet();
        d((ArrayDeque) this.f24390f, call);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r3 < r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r1.remove();
        r2.f2464c.incrementAndGet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "asyncCall");
        r0.add(r2);
        ((java.util.ArrayDeque) r15.f24390f).add(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.h1.f():boolean");
    }

    public final void g(int i10) {
        boolean z10;
        if (this.f24386b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f24386b = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public h1(Class cls, Class[] clsArr) {
        this.a = null;
        HashSet hashSet = new HashSet();
        this.f24388d = hashSet;
        this.f24389e = new HashSet();
        this.f24386b = 0;
        this.f24387c = 0;
        this.f24391g = new HashSet();
        hashSet.add(db.s.a(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                ((Set) this.f24388d).add(db.s.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
    }

    public h1(db.s sVar, db.s[] sVarArr) {
        this.a = null;
        HashSet hashSet = new HashSet();
        this.f24388d = hashSet;
        this.f24389e = new HashSet();
        this.f24386b = 0;
        this.f24387c = 0;
        this.f24391g = new HashSet();
        hashSet.add(sVar);
        for (db.s sVar2 : sVarArr) {
            if (sVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll((Set) this.f24388d, sVarArr);
    }

    public h1(Uri uri) {
        this.f24388d = uri;
    }

    public h1(i1 i1Var) {
        this.f24388d = i1Var.f24433b;
        this.a = i1Var.f24434c;
        this.f24389e = i1Var.f24435d;
        this.f24386b = i1Var.f24436f;
        this.f24387c = i1Var.f24437g;
        this.f24390f = i1Var.f24438h;
        this.f24391g = i1Var.f24439i;
    }
}
