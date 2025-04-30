package F0;

/* loaded from: classes.dex */
public final class c implements Comparable {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1059c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1060d;

    /* renamed from: f, reason: collision with root package name */
    public final String f1061f;

    public c(int i9, int i10, String str, String str2) {
        this.b = i9;
        this.f1059c = i10;
        this.f1060d = str;
        this.f1061f = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int i9 = this.b - cVar.b;
        if (i9 == 0) {
            return this.f1059c - cVar.f1059c;
        }
        return i9;
    }
}
