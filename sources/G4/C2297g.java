package g4;

import G7.j;
import Q7.N;
import U4.p;
import java.util.concurrent.Executor;
import n4.InterfaceC2477a;
import n4.InterfaceC2478b;
import o4.InterfaceC2498d;
import o4.q;

/* renamed from: g4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2297g implements InterfaceC2498d {

    /* renamed from: c, reason: collision with root package name */
    public static final C2297g f20442c = new C2297g(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C2297g f20443d = new C2297g(1);

    /* renamed from: f, reason: collision with root package name */
    public static final C2297g f20444f = new C2297g(2);

    /* renamed from: g, reason: collision with root package name */
    public static final C2297g f20445g = new C2297g(3);
    public final /* synthetic */ int b;

    public /* synthetic */ C2297g(int i9) {
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
                Object f10 = pVar.f(new q(n4.c.class, Executor.class));
                j.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f10);
            case 2:
                Object f11 = pVar.f(new q(InterfaceC2478b.class, Executor.class));
                j.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f11);
            default:
                Object f12 = pVar.f(new q(n4.d.class, Executor.class));
                j.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new N((Executor) f12);
        }
    }
}
