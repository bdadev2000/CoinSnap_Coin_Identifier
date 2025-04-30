package N6;

import Q7.AbstractC0255x;
import T7.r;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import com.tools.arruler.models.InternalImageModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import n1.C2475f;
import u7.AbstractC2816g;
import u7.C2824o;
import w6.C2910a;

/* loaded from: classes3.dex */
public final class j extends b0 {
    public final C2910a b;

    /* renamed from: c, reason: collision with root package name */
    public final r f2118c;

    /* renamed from: d, reason: collision with root package name */
    public List f2119d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2120e;

    /* renamed from: f, reason: collision with root package name */
    public final C2475f f2121f;

    public j(C2910a c2910a) {
        G7.j.e(c2910a, "internalImageRepository");
        this.b = c2910a;
        C2824o c2824o = C2824o.b;
        r rVar = new r(new h(c2824o));
        this.f2118c = rVar;
        this.f2119d = c2824o;
        this.f2120e = new ArrayList();
        this.f2121f = new C2475f(rVar, 15);
        f();
    }

    public final void e(InternalImageModel internalImageModel) {
        r rVar;
        Object value;
        ArrayList U8;
        G7.j.e(internalImageModel, "model");
        if (new File(internalImageModel.getPath()).delete()) {
            ArrayList U9 = AbstractC2816g.U(this.f2119d);
            U9.remove(internalImageModel);
            this.f2119d = U9;
            do {
                rVar = this.f2118c;
                value = rVar.getValue();
                U8 = AbstractC2816g.U(((h) value).f2116a);
                U8.remove(internalImageModel);
            } while (!rVar.b(value, new h(U8)));
        }
    }

    public final void f() {
        AbstractC0255x.l(V.h(this), null, null, new i(this, null), 3);
    }
}
