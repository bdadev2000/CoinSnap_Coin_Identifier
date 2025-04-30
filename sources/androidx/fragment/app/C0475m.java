package androidx.fragment.app;

import android.view.ViewGroup;
import i8.C2364a;
import i8.C2375l;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2818i;

/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475m extends G7.k implements F7.a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4738d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0475m(Object obj, Object obj2, Object obj3, int i9) {
        super(0);
        this.b = i9;
        this.f4737c = obj;
        this.f4738d = obj2;
        this.f4739f = obj3;
    }

    @Override // F7.a
    public final Object invoke() {
        List c9;
        switch (this.b) {
            case 0:
                ((C0481p) this.f4737c).f4751f.e((ViewGroup) this.f4738d, this.f4739f);
                return t7.y.f23029a;
            case 1:
                e1.f fVar = ((C2375l) this.f4737c).b;
                List list = (List) this.f4738d;
                if (fVar == null) {
                    c9 = null;
                } else {
                    c9 = fVar.c(list, (String) this.f4739f);
                }
                if (c9 != null) {
                    list = c9;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC2818i.E(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            default:
                e1.f fVar2 = ((C2375l) this.f4737c).b;
                G7.j.b(fVar2);
                return fVar2.c(((i8.r) this.f4738d).a(), ((C2364a) this.f4739f).f20805h.f20886d);
        }
    }
}
