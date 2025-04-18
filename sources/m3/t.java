package m3;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements w {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21586c;

    public /* synthetic */ t(x xVar, String str, int i10) {
        this.a = i10;
        this.f21585b = xVar;
        this.f21586c = str;
    }

    @Override // m3.w
    public final void run() {
        int i10 = this.a;
        String str = this.f21586c;
        x xVar = this.f21585b;
        switch (i10) {
            case 0:
                xVar.o(str);
                return;
            case 1:
                xVar.s(str);
                return;
            default:
                xVar.q(str);
                return;
        }
    }
}
