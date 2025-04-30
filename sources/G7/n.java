package G7;

/* loaded from: classes3.dex */
public final class n extends o implements M7.c, F7.p {
    public n(Class cls) {
        super(b.b, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
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
                ((n) ((M7.c) d2)).e();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        e();
        throw null;
    }
}
