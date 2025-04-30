package Q7;

/* loaded from: classes3.dex */
public final class H implements h0, F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2530c;

    public /* synthetic */ H(Object obj, int i9) {
        this.b = i9;
        this.f2530c = obj;
    }

    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((G) this.f2530c).d();
                return;
            default:
                ((F7.l) this.f2530c).invoke(th);
                return;
        }
    }

    @Override // F7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                a((Throwable) obj);
                return t7.y.f23029a;
            default:
                a((Throwable) obj);
                return t7.y.f23029a;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "DisposeOnCancel[" + ((G) this.f2530c) + ']';
            default:
                return "InvokeOnCancel[" + ((F7.l) this.f2530c).getClass().getSimpleName() + '@' + AbstractC0255x.g(this) + ']';
        }
    }
}
