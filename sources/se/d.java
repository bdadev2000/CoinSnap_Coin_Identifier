package se;

import android.view.ScaleGestureDetector;

/* loaded from: classes4.dex */
public final class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        e eVar = this.a;
        eVar.f25008f = true;
        eVar.f25009g = (scaleGestureDetector.getScaleFactor() - 1.0f) * 2.0f;
        return true;
    }
}
