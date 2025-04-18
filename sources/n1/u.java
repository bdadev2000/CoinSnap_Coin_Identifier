package n1;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f31137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f31138c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i2, String str, v vVar) {
        super(0);
        this.f31136a = i2;
        this.f31137b = str;
        this.f31138c = vVar;
    }

    @Override // q0.a
    public final Object invoke() {
        int i2 = this.f31136a;
        l1.f[] fVarArr = new l1.f[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fVarArr[i3] = e1.t0.h(this.f31137b + '.' + this.f31138c.e[i3], l1.c.e, new l1.f[0], l1.j.f31044a);
        }
        return fVarArr;
    }
}
