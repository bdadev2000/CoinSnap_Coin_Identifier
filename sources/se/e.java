package se;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.app.t0;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;

/* loaded from: classes4.dex */
public final class e extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public final ScaleGestureDetector f25007e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25008f;

    /* renamed from: g, reason: collision with root package name */
    public float f25009g;

    public e(c1 c1Var) {
        super(c1Var, 2);
        this.f25009g = 0.0f;
        this.f1249b = a.PINCH;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(((CameraView) c1Var.f11925d).getContext(), new d(this));
        this.f25007e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    @Override // androidx.core.app.t0
    public final float f(float f10, float f11, float f12) {
        return vd.e.b(f12, f11, this.f25009g, f10);
    }

    public final boolean g(MotionEvent motionEvent) {
        boolean z10 = false;
        if (motionEvent.getAction() == 0) {
            this.f25008f = false;
        }
        this.f25007e.onTouchEvent(motionEvent);
        if (this.f25008f) {
            e(0).x = motionEvent.getX(0);
            e(0).y = motionEvent.getY(0);
            z10 = true;
            if (motionEvent.getPointerCount() > 1) {
                e(1).x = motionEvent.getX(1);
                e(1).y = motionEvent.getY(1);
            }
        }
        return z10;
    }
}
