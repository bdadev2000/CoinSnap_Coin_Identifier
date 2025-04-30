package G7;

/* loaded from: classes3.dex */
public final class l extends o implements M7.c, F7.l {
    public l(Class cls, String str, String str2) {
        super(b.b, cls, str, str2, 0);
    }

    @Override // G7.c
    public final M7.a a() {
        s.f1335a.getClass();
        return this;
    }

    public final void e() {
        if (!this.f1334i) {
            M7.a d2 = d();
            if (d2 != this) {
                ((l) ((M7.c) d2)).e();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        e();
        throw null;
    }
}
