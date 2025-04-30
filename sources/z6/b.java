package z6;

import F7.l;
import G7.j;
import U4.RunnableC0311g;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.core.ar.ArRulerSurface;
import com.core.ar.model.Tool;
import com.google.ar.core.Session;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.tutorial.ArTutorialActivity;
import f.o;
import j6.m;
import j6.n;
import j6.s;
import java.util.List;
import p1.C2538b;
import t7.y;
import u6.AbstractC2785a;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24555c;

    public /* synthetic */ b(ArRulerActivity arRulerActivity, int i9) {
        this.b = i9;
        this.f24555c = arRulerActivity;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        boolean z8;
        boolean z9;
        int i9 = 0;
        int i10 = 1;
        switch (this.b) {
            case 0:
                int i11 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity = this.f24555c;
                j.e(arRulerActivity, "this$0");
                if (q6.c.f22801e.a().a() && android.support.v4.media.session.a.v(arRulerActivity) && !C2538b.a().m) {
                    r6.c.f22895g.d().b(arRulerActivity, "ca-app-pub-6691965685689933/1923984700", new e(arRulerActivity, i10));
                } else {
                    arRulerActivity.startActivity(new Intent(arRulerActivity, (Class<?>) ArTutorialActivity.class));
                }
                return y.f23029a;
            case 1:
                t2.a aVar = (t2.a) obj;
                int i12 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity2 = this.f24555c;
                j.e(arRulerActivity2, "this$0");
                j.e(aVar, "arUnit");
                m mVar = arRulerActivity2.l;
                if (mVar != null) {
                    mVar.f();
                }
                RecyclerView recyclerView = ((AbstractC2785a) arRulerActivity2.k()).f23247E;
                j.d(recyclerView, "rvUnit");
                recyclerView.setVisibility(8);
                ((AbstractC2785a) arRulerActivity2.k()).f23249G.setText(aVar.b);
                ((AbstractC2785a) arRulerActivity2.k()).f23251r.setUnit(aVar);
                return y.f23029a;
            case 2:
                Tool tool = (Tool) obj;
                int i13 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity3 = this.f24555c;
                j.e(arRulerActivity3, "this$0");
                j.e(tool, "tool");
                if (!tool.isPremium()) {
                    new D6.c((Context) arRulerActivity3, new c(arRulerActivity3, 3)).show();
                } else {
                    m mVar2 = arRulerActivity3.m;
                    if (mVar2 != null && mVar2.f21175h) {
                        mVar2.f();
                        arRulerActivity3.f19647q = true;
                    }
                    AbstractC2785a abstractC2785a = (AbstractC2785a) arRulerActivity3.k();
                    String name = tool.getName();
                    abstractC2785a.f23251r.getClass();
                    j.e(name, "newType");
                    ArRulerSurface.f13337R = name;
                    AppCompatImageView appCompatImageView = ((AbstractC2785a) arRulerActivity3.k()).f23259z;
                    Context context = appCompatImageView.getContext();
                    j2.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
                    com.bumptech.glide.b.a(context).f12794g.c(context).j(Integer.valueOf(tool.getThumbId())).w(appCompatImageView);
                }
                return y.f23029a;
            case 3:
                ArRulerActivity arRulerActivity4 = this.f24555c;
                int i14 = ArRulerActivity.f19637r;
                j.e(arRulerActivity4, "this$0");
                arRulerActivity4.f19647q = !arRulerActivity4.f19647q;
                Session session = ((AbstractC2785a) arRulerActivity4.k()).f23251r.f13361j;
                if (session != null) {
                    z8 = ArRulerSurface.h(session);
                } else {
                    z8 = false;
                }
                if (z8 && ((AbstractC2785a) arRulerActivity4.k()).f23251r.f13353P) {
                    m mVar3 = arRulerActivity4.f19643k;
                    if (mVar3 != null) {
                        mVar3.f();
                    }
                    m mVar4 = arRulerActivity4.m;
                    if (mVar4 != null && mVar4.f21175h) {
                        mVar4.f();
                    } else if (mVar4 != null) {
                        AppCompatImageView appCompatImageView2 = ((AbstractC2785a) arRulerActivity4.k()).f23259z;
                        j.d(appCompatImageView2, "imgTool");
                        s sVar = new s(appCompatImageView2, n.b, 0, arRulerActivity4.getResources().getDimensionPixelSize(R.dimen._8sdp));
                        if (mVar4.e(appCompatImageView2)) {
                            appCompatImageView2.post(new RunnableC0311g(mVar4, appCompatImageView2, sVar, 20));
                        } else {
                            mVar4.f21171c.getClass();
                        }
                    }
                }
                return y.f23029a;
            default:
                int i15 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity5 = this.f24555c;
                j.e(arRulerActivity5, "this$0");
                j.e((o) obj, "$this$addCallback");
                List list = ((AbstractC2785a) arRulerActivity5.k()).f23251r.f13362k;
                if (list != null) {
                    z9 = !list.isEmpty();
                } else {
                    z9 = false;
                }
                if (z9) {
                    new B6.b(arRulerActivity5, new c(arRulerActivity5, i9), new j6.f(4)).show();
                } else {
                    arRulerActivity5.w(new c(arRulerActivity5, i10));
                }
                return y.f23029a;
        }
    }
}
