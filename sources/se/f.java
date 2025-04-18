package se;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;

/* loaded from: classes4.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f25010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f25011c;

    public f(g gVar, c1 c1Var) {
        this.f25011c = gVar;
        this.f25010b = c1Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        float height;
        boolean z11 = false;
        g.f25012h.a(1, "onScroll:", "distanceX=" + f10, "distanceY=" + f11);
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        g gVar = this.f25011c;
        float f12 = gVar.e(0).x;
        a aVar = a.SCROLL_HORIZONTAL;
        if (x10 == f12 && motionEvent.getY() == gVar.e(0).y) {
            if (((a) gVar.f1249b) == aVar) {
                z11 = true;
            }
        } else {
            if (Math.abs(f10) >= Math.abs(f11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                aVar = a.SCROLL_VERTICAL;
            }
            gVar.f1249b = aVar;
            gVar.e(0).set(motionEvent.getX(), motionEvent.getY());
            z11 = z10;
        }
        gVar.e(1).set(motionEvent2.getX(), motionEvent2.getY());
        c cVar = this.f25010b;
        if (z11) {
            height = f10 / ((CameraView) ((c1) cVar).f11925d).getWidth();
        } else {
            height = f11 / ((CameraView) ((c1) cVar).f11925d).getHeight();
        }
        gVar.f25015g = height;
        if (z11) {
            height = -height;
        }
        gVar.f25015g = height;
        gVar.f25014f = true;
        return true;
    }
}
