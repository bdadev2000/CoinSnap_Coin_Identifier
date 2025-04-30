package z6;

import G7.j;
import K.o;
import U4.RunnableC0311g;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import j6.m;
import j6.n;
import j6.q;
import j6.s;
import j6.w;
import j6.x;
import u6.AbstractC2785a;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24557c;

    public /* synthetic */ d(ArRulerActivity arRulerActivity, int i9) {
        this.b = i9;
        this.f24557c = arRulerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArRulerActivity arRulerActivity = this.f24557c;
        switch (this.b) {
            case 0:
                int i9 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                Log.i("TAG", "onAnchorPointAdded: ");
                m mVar = arRulerActivity.f19643k;
                if (mVar != null) {
                    mVar.f();
                    return;
                }
                return;
            default:
                int i10 = ArRulerActivity.f19637r;
                j.e(arRulerActivity, "this$0");
                w wVar = new w(arRulerActivity);
                String string = arRulerActivity.getString(R.string.add_a_point);
                j.d(string, "getString(...)");
                wVar.b = string;
                wVar.f21198d = I.h.getColor(arRulerActivity, R.color.white);
                wVar.f21197c = 14.0f;
                wVar.f21201g = o.a(arRulerActivity, R.font.poppins_regular);
                x xVar = new x(wVar);
                if (arRulerActivity.f19643k == null) {
                    j6.j jVar = new j6.j(arRulerActivity);
                    jVar.a(10);
                    jVar.f21168z = xVar;
                    jVar.b = com.mbridge.msdk.foundation.entity.o.f(1, Integer.MIN_VALUE);
                    jVar.b(Integer.MIN_VALUE);
                    jVar.f21158p = j6.d.f21115c;
                    jVar.f21157o = 0.5f;
                    float f9 = 8;
                    jVar.f21150f = com.mbridge.msdk.foundation.entity.o.f(1, f9);
                    float f10 = 9;
                    jVar.f21151g = com.mbridge.msdk.foundation.entity.o.f(1, f10);
                    jVar.f21152h = com.mbridge.msdk.foundation.entity.o.f(1, f9);
                    jVar.f21153i = com.mbridge.msdk.foundation.entity.o.f(1, f10);
                    jVar.f21163u = TypedValue.applyDimension(1, 16.0f, Resources.getSystem().getDisplayMetrics());
                    jVar.f21162t = I.h.getColor(arRulerActivity, R.color.color_black_50);
                    jVar.f21138T = q.f21183c;
                    jVar.f21140V = 0L;
                    jVar.f21130K = false;
                    jVar.f21128I = false;
                    jVar.f21143Y = false;
                    jVar.f21131L = false;
                    jVar.f21133N = arRulerActivity;
                    arRulerActivity.f19643k = new m(arRulerActivity, jVar);
                }
                m mVar2 = arRulerActivity.f19643k;
                if (mVar2 != null) {
                    AppCompatImageView appCompatImageView = ((AbstractC2785a) arRulerActivity.k()).f23258y;
                    j.d(appCompatImageView, "imgRulerAdd");
                    int i11 = m.l;
                    s sVar = new s(appCompatImageView, n.b, 0, 0);
                    if (mVar2.e(appCompatImageView)) {
                        appCompatImageView.post(new RunnableC0311g(mVar2, appCompatImageView, sVar, 20));
                        return;
                    } else {
                        mVar2.f21171c.getClass();
                        return;
                    }
                }
                return;
        }
    }
}
