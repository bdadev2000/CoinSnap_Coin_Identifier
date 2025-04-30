package T;

import android.view.View;
import android.view.ViewGroup;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2959h;

/* renamed from: T.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269f0 extends AbstractC2959h implements F7.p {

    /* renamed from: d, reason: collision with root package name */
    public int f2886d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f2888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269f0(View view, w7.f fVar) {
        super(2, fVar);
        this.f2888g = view;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C0269f0 c0269f0 = new C0269f0(this.f2888g, fVar);
        c0269f0.f2887f = obj;
        return c0269f0;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C0269f0) c((N7.g) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        Object obj2;
        Object obj3 = EnumC2928a.b;
        int i9 = this.f2886d;
        View view = this.f2888g;
        if (i9 != 0) {
            Object obj4 = t7.y.f23029a;
            if (i9 != 1) {
                if (i9 == 2) {
                    AbstractC2712a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N7.g gVar = (N7.g) this.f2887f;
                AbstractC2712a.f(obj);
                if (view instanceof ViewGroup) {
                    this.f2887f = null;
                    this.f2886d = 2;
                    gVar.getClass();
                    N7.l lVar = new N7.l(new G7.a((ViewGroup) view, 1));
                    if (!lVar.f2135c.hasNext()) {
                        obj2 = obj4;
                    } else {
                        gVar.f2131d = lVar;
                        gVar.b = 2;
                        gVar.f2132f = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            }
            return obj4;
        }
        AbstractC2712a.f(obj);
        N7.g gVar2 = (N7.g) this.f2887f;
        this.f2887f = gVar2;
        this.f2886d = 1;
        gVar2.f2130c = view;
        gVar2.b = 3;
        gVar2.f2132f = this;
        return obj3;
    }
}
