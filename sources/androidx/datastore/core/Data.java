package androidx.datastore.core;

/* loaded from: classes2.dex */
final class Data<T> extends State<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18951b;

    public Data(Object obj, int i2) {
        this.f18950a = obj;
        this.f18951b = i2;
    }

    public final void a() {
        Object obj = this.f18950a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f18951b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
