package n1;

/* loaded from: classes4.dex */
public final class b extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l1.f fVar, int i2) {
        super(fVar);
        this.f31054c = i2;
        if (i2 == 1) {
            p0.a.s(fVar, "elementDesc");
            super(fVar);
        } else if (i2 == 2) {
            p0.a.s(fVar, "elementDesc");
            super(fVar);
        } else if (i2 != 3) {
            p0.a.s(fVar, "elementDesc");
        } else {
            p0.a.s(fVar, "elementDesc");
            super(fVar);
        }
    }

    @Override // l1.f
    public final String g() {
        switch (this.f31054c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
