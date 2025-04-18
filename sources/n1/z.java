package n1;

/* loaded from: classes4.dex */
public final class z extends m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l1.f fVar, l1.f fVar2, int i2) {
        super("kotlin.collections.HashMap", fVar, fVar2);
        if (i2 != 1) {
            p0.a.s(fVar, "keyDesc");
            p0.a.s(fVar2, "valueDesc");
        } else {
            p0.a.s(fVar, "keyDesc");
            p0.a.s(fVar2, "valueDesc");
            super("kotlin.collections.LinkedHashMap", fVar, fVar2);
        }
    }
}
