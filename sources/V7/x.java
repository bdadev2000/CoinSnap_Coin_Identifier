package V7;

import Q7.l0;

/* loaded from: classes3.dex */
public final class x extends G7.k implements F7.p {

    /* renamed from: c, reason: collision with root package name */
    public static final x f3543c = new x(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final x f3544d = new x(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final x f3545f = new x(2, 2);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        Integer num;
        int i9;
        switch (this.b) {
            case 0:
                w7.i iVar = (w7.i) obj2;
                if (iVar instanceof l0) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i9 = num.intValue();
                    } else {
                        i9 = 1;
                    }
                    if (i9 == 0) {
                        return iVar;
                    }
                    return Integer.valueOf(i9 + 1);
                }
                return obj;
            case 1:
                l0 l0Var = (l0) obj;
                w7.i iVar2 = (w7.i) obj2;
                if (l0Var == null) {
                    if (iVar2 instanceof l0) {
                        return (l0) iVar2;
                    }
                    return null;
                }
                return l0Var;
            default:
                return (z) obj;
        }
    }
}
