package androidx.lifecycle;

import android.os.Looper;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import r.C2650a;
import s.C2684a;
import s.C2686c;
import x0.AbstractC2914a;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513x extends AbstractC0505o {
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public C2684a f4903c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0504n f4904d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f4905e;

    /* renamed from: f, reason: collision with root package name */
    public int f4906f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4907g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4908h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4909i;

    /* renamed from: j, reason: collision with root package name */
    public final T7.r f4910j;

    public C0513x(InterfaceC0511v interfaceC0511v) {
        G7.j.e(interfaceC0511v, "provider");
        this.f4897a = new AtomicReference(null);
        this.b = true;
        this.f4903c = new C2684a();
        EnumC0504n enumC0504n = EnumC0504n.f4892c;
        this.f4904d = enumC0504n;
        this.f4909i = new ArrayList();
        this.f4905e = new WeakReference(interfaceC0511v);
        this.f4910j = new T7.r(enumC0504n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.w, java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC0505o
    public final void a(InterfaceC0510u interfaceC0510u) {
        InterfaceC0509t aVar;
        InterfaceC0511v interfaceC0511v;
        ArrayList arrayList = this.f4909i;
        int i9 = 2;
        G7.j.e(interfaceC0510u, "observer");
        d("addObserver");
        EnumC0504n enumC0504n = this.f4904d;
        EnumC0504n enumC0504n2 = EnumC0504n.b;
        if (enumC0504n != enumC0504n2) {
            enumC0504n2 = EnumC0504n.f4892c;
        }
        ?? obj = new Object();
        HashMap hashMap = AbstractC0515z.f4911a;
        boolean z8 = interfaceC0510u instanceof InterfaceC0509t;
        boolean z9 = interfaceC0510u instanceof InterfaceC0495e;
        boolean z10 = false;
        if (z8 && z9) {
            aVar = new R0.a((InterfaceC0495e) interfaceC0510u, (InterfaceC0509t) interfaceC0510u);
        } else if (z9) {
            aVar = new R0.a((InterfaceC0495e) interfaceC0510u, (InterfaceC0509t) null);
        } else if (z8) {
            aVar = (InterfaceC0509t) interfaceC0510u;
        } else {
            Class<?> cls = interfaceC0510u.getClass();
            if (AbstractC0515z.b(cls) == 2) {
                Object obj2 = AbstractC0515z.b.get(cls);
                G7.j.b(obj2);
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0498h[] interfaceC0498hArr = new InterfaceC0498h[size];
                    if (size <= 0) {
                        aVar = new G0.b(interfaceC0498hArr, i9);
                    } else {
                        AbstractC0515z.a((Constructor) list.get(0), interfaceC0510u);
                        throw null;
                    }
                } else {
                    AbstractC0515z.a((Constructor) list.get(0), interfaceC0510u);
                    throw null;
                }
            } else {
                aVar = new R0.a(interfaceC0510u);
            }
        }
        obj.b = aVar;
        obj.f4902a = enumC0504n2;
        if (((C0512w) this.f4903c.d(interfaceC0510u, obj)) != null || (interfaceC0511v = (InterfaceC0511v) this.f4905e.get()) == null) {
            return;
        }
        if (this.f4906f != 0 || this.f4907g) {
            z10 = true;
        }
        EnumC0504n c9 = c(interfaceC0510u);
        this.f4906f++;
        while (obj.f4902a.compareTo(c9) < 0 && this.f4903c.f22951g.containsKey(interfaceC0510u)) {
            arrayList.add(obj.f4902a);
            C0501k c0501k = EnumC0503m.Companion;
            EnumC0504n enumC0504n3 = obj.f4902a;
            c0501k.getClass();
            EnumC0503m b = C0501k.b(enumC0504n3);
            if (b != null) {
                obj.a(interfaceC0511v, b);
                arrayList.remove(arrayList.size() - 1);
                c9 = c(interfaceC0510u);
            } else {
                throw new IllegalStateException("no event up from " + obj.f4902a);
            }
        }
        if (!z10) {
            h();
        }
        this.f4906f--;
    }

    @Override // androidx.lifecycle.AbstractC0505o
    public final void b(InterfaceC0510u interfaceC0510u) {
        G7.j.e(interfaceC0510u, "observer");
        d("removeObserver");
        this.f4903c.c(interfaceC0510u);
    }

    public final EnumC0504n c(InterfaceC0510u interfaceC0510u) {
        C2686c c2686c;
        EnumC0504n enumC0504n;
        C0512w c0512w;
        HashMap hashMap = this.f4903c.f22951g;
        EnumC0504n enumC0504n2 = null;
        if (hashMap.containsKey(interfaceC0510u)) {
            c2686c = ((C2686c) hashMap.get(interfaceC0510u)).f22956f;
        } else {
            c2686c = null;
        }
        if (c2686c != null && (c0512w = (C0512w) c2686c.f22954c) != null) {
            enumC0504n = c0512w.f4902a;
        } else {
            enumC0504n = null;
        }
        ArrayList arrayList = this.f4909i;
        if (!arrayList.isEmpty()) {
            enumC0504n2 = (EnumC0504n) com.mbridge.msdk.foundation.entity.o.g(arrayList, 1);
        }
        EnumC0504n enumC0504n3 = this.f4904d;
        G7.j.e(enumC0504n3, "state1");
        if (enumC0504n == null || enumC0504n.compareTo(enumC0504n3) >= 0) {
            enumC0504n = enumC0504n3;
        }
        if (enumC0504n2 == null || enumC0504n2.compareTo(enumC0504n) >= 0) {
            return enumC0504n;
        }
        return enumC0504n2;
    }

    public final void d(String str) {
        if (this.b) {
            C2650a.v().f22808a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC2914a.e("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0503m enumC0503m) {
        G7.j.e(enumC0503m, NotificationCompat.CATEGORY_EVENT);
        d("handleLifecycleEvent");
        f(enumC0503m.a());
    }

    public final void f(EnumC0504n enumC0504n) {
        EnumC0504n enumC0504n2 = this.f4904d;
        if (enumC0504n2 == enumC0504n) {
            return;
        }
        EnumC0504n enumC0504n3 = EnumC0504n.f4892c;
        EnumC0504n enumC0504n4 = EnumC0504n.b;
        if (enumC0504n2 == enumC0504n3 && enumC0504n == enumC0504n4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + enumC0504n + ", but was " + this.f4904d + " in component " + this.f4905e.get()).toString());
        }
        this.f4904d = enumC0504n;
        if (!this.f4907g && this.f4906f == 0) {
            this.f4907g = true;
            h();
            this.f4907g = false;
            if (this.f4904d == enumC0504n4) {
                this.f4903c = new C2684a();
                return;
            }
            return;
        }
        this.f4908h = true;
    }

    public final void g(EnumC0504n enumC0504n) {
        G7.j.e(enumC0504n, "state");
        d("setCurrentState");
        f(enumC0504n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f4908h = false;
        r0 = r7.f4904d;
        r1 = r7.f4910j;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = U7.p.f3378a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0513x.h():void");
    }
}
