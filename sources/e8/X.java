package e8;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class X extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f20143c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Y y4, int i9) {
        super(0);
        this.b = i9;
        this.f20143c = y4;
    }

    @Override // F7.a
    public final Object invoke() {
        a8.b[] childSerializers;
        ArrayList arrayList;
        a8.b[] typeParametersSerializers;
        switch (this.b) {
            case 0:
                Y y4 = this.f20143c;
                return Integer.valueOf(W.e(y4, (c8.g[]) y4.f20152j.getValue()));
            case 1:
                D d2 = this.f20143c.b;
                if (d2 == null || (childSerializers = d2.childSerializers()) == null) {
                    return W.b;
                }
                return childSerializers;
            default:
                D d9 = this.f20143c.b;
                if (d9 != null && (typeParametersSerializers = d9.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (a8.b bVar : typeParametersSerializers) {
                        arrayList.add(bVar.getDescriptor());
                    }
                } else {
                    arrayList = null;
                }
                return W.c(arrayList);
        }
    }
}
