package s7;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ra.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24759c;

    public /* synthetic */ t(Object obj, int i10) {
        this.f24758b = i10;
        this.f24759c = obj;
    }

    @Override // ra.p
    public final Object get() {
        int i10 = this.f24758b;
        Object obj = this.f24759c;
        switch (i10) {
            case 0:
                return (p) obj;
            default:
                try {
                    return (v8.y) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
        }
    }
}
