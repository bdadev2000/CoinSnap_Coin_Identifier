package a8;

import M0.C0219j;
import e8.W;
import e8.d0;

/* loaded from: classes3.dex */
public final class j extends G7.k implements F7.l {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4086c = new j(1, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final j f4087d = new j(1, 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                M7.b bVar = (M7.b) obj;
                G7.j.e(bVar, "it");
                b d2 = W.d(bVar, new b[0]);
                if (d2 == null) {
                    return (b) d0.f20159a.get(bVar);
                }
                return d2;
            default:
                M7.b bVar2 = (M7.b) obj;
                G7.j.e(bVar2, "it");
                b d9 = W.d(bVar2, new b[0]);
                if (d9 == null) {
                    d9 = (b) d0.f20159a.get(bVar2);
                }
                if (d9 != null) {
                    return C0219j.r(d9);
                }
                return null;
        }
    }
}
