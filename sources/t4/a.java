package T4;

import G7.j;
import Q7.N;
import U4.p;
import java.util.concurrent.Executor;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import n4.c;
import n4.d;
import o4.InterfaceC2498d;
import o4.q;

/* loaded from: classes2.dex */
public final class a implements InterfaceC2498d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3015c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final a f3016d = new a(1);

    /* renamed from: f, reason: collision with root package name */
    public static final a f3017f = new a(2);

    /* renamed from: g, reason: collision with root package name */
    public static final a f3018g = new a(3);
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i9) {
        this.b = i9;
    }

    @Override // o4.InterfaceC2498d
    public final Object f(p pVar) {
        switch (this.b) {
            case 0:
                Object f9 = pVar.f(new q(InterfaceC2477a.class, Executor.class));
                j.d(f9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f9);
            case 1:
                Object f10 = pVar.f(new q(c.class, Executor.class));
                j.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f10);
            case 2:
                Object f11 = pVar.f(new q(InterfaceC2478b.class, Executor.class));
                j.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f11);
            default:
                Object f12 = pVar.f(new q(d.class, Executor.class));
                j.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f12);
        }
    }
}
