package b1;

/* loaded from: classes2.dex */
public final class s0 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22372a;

    public s0(boolean z2) {
        this.f22372a = z2;
    }

    @Override // b1.d1
    public final v1 c() {
        return null;
    }

    @Override // b1.d1
    public final boolean isActive() {
        return this.f22372a;
    }

    public final String toString() {
        return android.support.v4.media.d.q(new StringBuilder("Empty{"), this.f22372a ? "Active" : "New", '}');
    }
}
