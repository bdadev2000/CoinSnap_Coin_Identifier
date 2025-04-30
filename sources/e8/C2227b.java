package e8;

/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2227b extends L {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2227b(c8.g gVar, int i9) {
        super(gVar);
        this.f20155c = i9;
    }

    @Override // c8.g
    public final String a() {
        switch (this.f20155c) {
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
