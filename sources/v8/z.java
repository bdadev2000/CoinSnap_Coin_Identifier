package v8;

/* loaded from: classes3.dex */
public final class z extends x {
    public z(Object obj, long j3, int i10) {
        super(obj, -1, -1, j3, i10);
    }

    public final z b(Object obj) {
        x xVar;
        if (this.a.equals(obj)) {
            xVar = this;
        } else {
            xVar = new x(obj, this.f26318b, this.f26319c, this.f26320d, this.f26321e);
        }
        return new z(xVar);
    }

    public z(Object obj, int i10, int i11, long j3) {
        super(obj, i10, i11, j3, -1);
    }

    public z(Object obj) {
        super(obj);
    }

    public z(Object obj, long j3) {
        super(obj, j3);
    }

    public z(x xVar) {
        super(xVar);
    }
}
