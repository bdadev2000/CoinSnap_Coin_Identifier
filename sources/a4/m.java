package a4;

/* loaded from: classes.dex */
public final class m implements uc.n {

    /* renamed from: b, reason: collision with root package name */
    public String f153b;

    public m() {
    }

    public final a a() {
        if (this.f153b != null) {
            return new a(this);
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    @Override // uc.n
    public final Object b() {
        throw new com.google.gson.q(this.f153b);
    }

    public /* synthetic */ m(int i10) {
    }
}
