package z6;

import G7.j;
import android.view.MotionEvent;
import android.view.View;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import com.tools.arruler.ui.component.library.ImageLibraryActivity;
import j6.m;
import java.util.concurrent.ArrayBlockingQueue;
import p1.C2538b;
import r2.C2657a;
import u6.AbstractC2785a;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC2978a implements View.OnClickListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArRulerActivity f24554c;

    public /* synthetic */ ViewOnClickListenerC2978a(ArRulerActivity arRulerActivity, int i9) {
        this.b = i9;
        this.f24554c = arRulerActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s2.d dVar;
        int i9 = 0;
        switch (this.b) {
            case 0:
                int i10 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity = this.f24554c;
                j.e(arRulerActivity, "this$0");
                if (q6.c.f22801e.a().a() && android.support.v4.media.session.a.v(arRulerActivity) && !C2538b.a().m) {
                    r6.c.f22895g.d().b(arRulerActivity, "ca-app-pub-6691965685689933/1923984700", new e(arRulerActivity, i9));
                    return;
                } else {
                    arRulerActivity.s(ImageLibraryActivity.class, null);
                    return;
                }
            case 1:
                int i11 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity2 = this.f24554c;
                j.e(arRulerActivity2, "this$0");
                if (((AbstractC2785a) arRulerActivity2.k()).f23247E.getVisibility() == 0) {
                    ((AbstractC2785a) arRulerActivity2.k()).f23247E.setVisibility(8);
                }
                m mVar = arRulerActivity2.m;
                if (mVar != null && mVar.f21175h) {
                    mVar.f();
                    arRulerActivity2.f19647q = true;
                    return;
                }
                return;
            case 2:
                int i12 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity3 = this.f24554c;
                j.e(arRulerActivity3, "this$0");
                ((AbstractC2785a) arRulerActivity3.k()).f23251r.f13342D.offer(Boolean.TRUE);
                return;
            case 3:
                ArRulerActivity arRulerActivity4 = this.f24554c;
                int i13 = ArRulerActivity.f19637r;
                j.e(arRulerActivity4, "this$0");
                if (((AbstractC2785a) arRulerActivity4.k()).f23251r.f13353P) {
                    arRulerActivity4.f19646p = false;
                    C2657a c2657a = arRulerActivity4.f19644n;
                    if (c2657a != null && (dVar = c2657a.f22813d) != null) {
                        MotionEvent motionEvent = c2657a.f22815g;
                        ArrayBlockingQueue arrayBlockingQueue = dVar.f22972a;
                        if (!arrayBlockingQueue.offer(motionEvent)) {
                            arrayBlockingQueue.poll();
                        }
                    }
                }
                m mVar2 = arRulerActivity4.m;
                if (mVar2 != null && mVar2.f21175h) {
                    mVar2.f();
                    return;
                }
                return;
            default:
                int i14 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity5 = this.f24554c;
                j.e(arRulerActivity5, "this$0");
                arRulerActivity5.getOnBackPressedDispatcher().d();
                return;
        }
    }
}
