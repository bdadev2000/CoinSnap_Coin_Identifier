package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0504n f4902a;
    public InterfaceC0509t b;

    public final void a(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        EnumC0504n a6 = enumC0503m.a();
        EnumC0504n enumC0504n = this.f4902a;
        G7.j.e(enumC0504n, "state1");
        if (a6.compareTo(enumC0504n) < 0) {
            enumC0504n = a6;
        }
        this.f4902a = enumC0504n;
        this.b.b(interfaceC0511v, enumC0503m);
        this.f4902a = a6;
    }
}
