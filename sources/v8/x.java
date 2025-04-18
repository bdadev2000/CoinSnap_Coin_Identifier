package v8;

/* loaded from: classes3.dex */
public class x {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26319c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26321e;

    public x(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        return this.f26318b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.a.equals(xVar.a) && this.f26318b == xVar.f26318b && this.f26319c == xVar.f26319c && this.f26320d == xVar.f26320d && this.f26321e == xVar.f26321e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.f26318b) * 31) + this.f26319c) * 31) + ((int) this.f26320d)) * 31) + this.f26321e;
    }

    public x(Object obj, long j3) {
        this(obj, -1, -1, j3, -1);
    }

    public x(x xVar) {
        this.a = xVar.a;
        this.f26318b = xVar.f26318b;
        this.f26319c = xVar.f26319c;
        this.f26320d = xVar.f26320d;
        this.f26321e = xVar.f26321e;
    }

    public x(Object obj, int i10, int i11, long j3, int i12) {
        this.a = obj;
        this.f26318b = i10;
        this.f26319c = i11;
        this.f26320d = j3;
        this.f26321e = i12;
    }
}
