package a8;

import F7.p;
import M0.C0219j;
import a.AbstractC0325a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class i extends G7.k implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final i f4084c = new i(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final i f4085d = new i(2, 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i9, int i10) {
        super(i9);
        this.b = i10;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                M7.b bVar = (M7.b) obj;
                List list = (List) obj2;
                G7.j.e(bVar, "clazz");
                G7.j.e(list, "types");
                ArrayList r9 = AbstractC0325a.r(h8.a.f20611a, list, true);
                G7.j.b(r9);
                return AbstractC0325a.k(bVar, list, r9);
            default:
                M7.b bVar2 = (M7.b) obj;
                List list2 = (List) obj2;
                G7.j.e(bVar2, "clazz");
                G7.j.e(list2, "types");
                ArrayList r10 = AbstractC0325a.r(h8.a.f20611a, list2, true);
                G7.j.b(r10);
                b k6 = AbstractC0325a.k(bVar2, list2, r10);
                if (k6 != null) {
                    return C0219j.r(k6);
                }
                return null;
        }
    }
}
