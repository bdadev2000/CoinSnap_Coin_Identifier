package se;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.app.t0;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;

/* loaded from: classes4.dex */
public final class g extends t0 {

    /* renamed from: h, reason: collision with root package name */
    public static final fe.c f25012h = new fe.c(g.class.getSimpleName());

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f25013e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25014f;

    /* renamed from: g, reason: collision with root package name */
    public float f25015g;

    public g(c1 c1Var) {
        super(c1Var, 2);
        GestureDetector gestureDetector = new GestureDetector(((CameraView) c1Var.f11925d).getContext(), new f(this, c1Var));
        this.f25013e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // androidx.core.app.t0
    public final float f(float f10, float f11, float f12) {
        return ((f12 - f11) * this.f25015g * 2.0f) + f10;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25014f = false;
        }
        this.f25013e.onTouchEvent(motionEvent);
        if (this.f25014f) {
            f25012h.a(1, "Notifying a gesture of type", ((a) this.f1249b).name());
        }
        return this.f25014f;
    }
}
