package j9;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f19842b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19843c;

    public f(int i10, b bVar) {
        this.f19842b = i10;
        this.f19843c = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19842b, ((f) obj).f19842b);
    }
}
