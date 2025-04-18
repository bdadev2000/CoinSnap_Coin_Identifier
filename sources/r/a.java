package r;

/* loaded from: classes.dex */
public final class a extends k.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23917e;

    public /* synthetic */ a(Object obj, int i10) {
        this.f23916d = i10;
        this.f23917e = obj;
    }

    @Override // k.d
    public final void c() {
        int i10 = this.f23916d;
        Object obj = this.f23917e;
        switch (i10) {
            case 0:
                ((b) obj).clear();
                return;
            default:
                ((c) obj).clear();
                return;
        }
    }

    @Override // k.d
    public final Object d(int i10, int i11) {
        int i12 = this.f23916d;
        Object obj = this.f23917e;
        switch (i12) {
            case 0:
                return ((b) obj).f23954c[(i10 << 1) + i11];
            default:
                return ((c) obj).f23926c[i10];
        }
    }

    @Override // k.d
    public final b e() {
        switch (this.f23916d) {
            case 0:
                return (b) this.f23917e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // k.d
    public final int f() {
        int i10 = this.f23916d;
        Object obj = this.f23917e;
        switch (i10) {
            case 0:
                return ((b) obj).f23955d;
            default:
                return ((c) obj).f23927d;
        }
    }

    @Override // k.d
    public final int g(Object obj) {
        int i10 = this.f23916d;
        Object obj2 = this.f23917e;
        switch (i10) {
            case 0:
                return ((b) obj2).e(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // k.d
    public final int h(Object obj) {
        int i10 = this.f23916d;
        Object obj2 = this.f23917e;
        switch (i10) {
            case 0:
                return ((b) obj2).g(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // k.d
    public final void i(Object obj, Object obj2) {
        int i10 = this.f23916d;
        Object obj3 = this.f23917e;
        switch (i10) {
            case 0:
                ((b) obj3).put(obj, obj2);
                return;
            default:
                ((c) obj3).add(obj);
                return;
        }
    }

    @Override // k.d
    public final void j(int i10) {
        int i11 = this.f23916d;
        Object obj = this.f23917e;
        switch (i11) {
            case 0:
                ((b) obj).j(i10);
                return;
            default:
                ((c) obj).e(i10);
                return;
        }
    }

    @Override // k.d
    public final Object k(int i10, Object obj) {
        switch (this.f23916d) {
            case 0:
                return ((b) this.f23917e).k(i10, obj);
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
