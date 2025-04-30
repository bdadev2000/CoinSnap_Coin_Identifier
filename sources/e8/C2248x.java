package e8;

/* renamed from: e8.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2248x extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2249y f20204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248x(int i9, String str, C2249y c2249y) {
        super(0);
        this.b = i9;
        this.f20203c = str;
        this.f20204d = c2249y;
    }

    @Override // F7.a
    public final Object invoke() {
        int i9 = this.b;
        c8.g[] gVarArr = new c8.g[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            gVarArr[i10] = android.support.v4.media.session.a.e(this.f20203c + '.' + this.f20204d.f20147e[i10], c8.l.f5456g, new c8.g[0], c8.j.b);
        }
        return gVarArr;
    }
}
