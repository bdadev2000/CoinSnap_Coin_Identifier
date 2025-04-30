package K6;

import F7.p;
import G7.j;
import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import android.widget.FrameLayout;
import com.tools.arruler.ui.component.language.LanguageActivity;
import p1.C2538b;
import t7.AbstractC2712a;
import t7.y;
import u6.AbstractC2797m;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class b extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LanguageActivity f1649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LanguageActivity languageActivity, w7.f fVar) {
        super(2, fVar);
        this.f1649h = languageActivity;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        b bVar = new b(this.f1649h, fVar);
        bVar.f1648g = obj;
        return bVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        b bVar = (b) c((InterfaceC0253v) obj, (w7.f) obj2);
        y yVar = y.f23029a;
        bVar.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f1648g;
        q6.b bVar = q6.c.f22801e;
        boolean g9 = bVar.a().g();
        LanguageActivity languageActivity = this.f1649h;
        if (g9 && android.support.v4.media.session.a.v(languageActivity) && !C2538b.a().m) {
            int i9 = LanguageActivity.m;
            AbstractC0255x.l(interfaceC0253v, null, null, new e(languageActivity, null), 3);
        } else {
            FrameLayout frameLayout = ((AbstractC2797m) languageActivity.k()).f23356q;
            j.d(frameLayout, "frAds");
            com.bumptech.glide.d.M(frameLayout);
        }
        if (bVar.a().h() && android.support.v4.media.session.a.v(languageActivity) && !C2538b.a().m) {
            int i10 = LanguageActivity.m;
            AbstractC0255x.l(interfaceC0253v, null, null, new h(languageActivity, null), 3);
        } else {
            FrameLayout frameLayout2 = ((AbstractC2797m) languageActivity.k()).f23356q;
            j.d(frameLayout2, "frAds");
            com.bumptech.glide.d.M(frameLayout2);
        }
        return y.f23029a;
    }
}
