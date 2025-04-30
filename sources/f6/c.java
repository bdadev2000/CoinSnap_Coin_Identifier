package F6;

import F7.l;
import G7.j;
import I.h;
import U4.RunnableC0311g;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.core.ar.ArRulerSurface;
import com.google.ar.core.Session;
import com.mbridge.msdk.foundation.entity.o;
import com.skydoves.balloon.radius.RadiusLayout;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import j6.m;
import j6.n;
import j6.s;
import u6.AbstractC2785a;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1220d;

    public /* synthetic */ c(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f1219c = obj;
        this.f1220d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        switch (this.b) {
            case 0:
                e eVar = (e) this.f1219c;
                j.e(eVar, "this$0");
                Object obj = this.f1220d;
                j.e(obj, "$item");
                l lVar = eVar.f1224k;
                if (lVar != null) {
                    lVar.invoke(obj);
                    return;
                }
                return;
            case 1:
                e eVar2 = (e) this.f1219c;
                j.e(eVar2, "this$0");
                Object obj2 = this.f1220d;
                j.e(obj2, "$item");
                l lVar2 = eVar2.l;
                if (lVar2 != null) {
                    lVar2.invoke(obj2);
                    return;
                }
                return;
            default:
                ArRulerActivity arRulerActivity = (ArRulerActivity) this.f1219c;
                A6.b bVar = (A6.b) this.f1220d;
                int i9 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                j.e(bVar, "$unitAdapter");
                Session session = ((AbstractC2785a) arRulerActivity.k()).f23251r.f13361j;
                if (session != null) {
                    z8 = ArRulerSurface.h(session);
                } else {
                    z8 = false;
                }
                if (z8 && ((AbstractC2785a) arRulerActivity.k()).f23251r.f13353P) {
                    j6.j jVar = new j6.j(arRulerActivity);
                    jVar.f21127H = Integer.valueOf(R.layout.layout_rcv_unit);
                    jVar.f21148d = 0.6f;
                    jVar.a(0);
                    jVar.b(280);
                    float f9 = 16;
                    jVar.f21155k = o.f(1, f9);
                    jVar.f21154j = o.f(1, f9);
                    jVar.f21163u = TypedValue.applyDimension(1, 16.0f, Resources.getSystem().getDisplayMetrics());
                    jVar.f21162t = h.getColor(arRulerActivity, R.color.color_black_60);
                    jVar.f21133N = arRulerActivity;
                    m mVar = new m(arRulerActivity, jVar);
                    arRulerActivity.l = mVar;
                    RadiusLayout radiusLayout = (RadiusLayout) mVar.f21172d.f24547d;
                    j.d(radiusLayout, "balloonCard");
                    View findViewById = radiusLayout.findViewById(R.id.rvUnit);
                    j.d(findViewById, "findViewById(...)");
                    ((RecyclerView) findViewById).setAdapter(bVar);
                    m mVar2 = arRulerActivity.l;
                    if (mVar2 != null) {
                        AppCompatTextView appCompatTextView = ((AbstractC2785a) arRulerActivity.k()).f23249G;
                        j.d(appCompatTextView, "txtUnit");
                        s sVar = new s(appCompatTextView, n.f21179c, 0, arRulerActivity.getResources().getDimensionPixelSize(R.dimen._8sdp));
                        if (mVar2.e(appCompatTextView)) {
                            appCompatTextView.post(new RunnableC0311g(mVar2, appCompatTextView, sVar, 20));
                            return;
                        } else {
                            mVar2.f21171c.getClass();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
