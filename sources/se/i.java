package se;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.core.app.t0;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;

/* loaded from: classes4.dex */
public final class i extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f25017e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25018f;

    public i(c1 c1Var) {
        super(c1Var, 1);
        GestureDetector gestureDetector = new GestureDetector(((CameraView) c1Var.f11925d).getContext(), new h(this));
        this.f25017e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // androidx.core.app.t0
    public final float f(float f10, float f11, float f12) {
        return 0.0f;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25018f = false;
        }
        this.f25017e.onTouchEvent(motionEvent);
        if (!this.f25018f) {
            return false;
        }
        e(0).x = motionEvent.getX();
        e(0).y = motionEvent.getY();
        return true;
    }
}
