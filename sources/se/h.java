package se;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes4.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f25016b;

    public h(i iVar) {
        this.f25016b = iVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        i iVar = this.f25016b;
        iVar.f25018f = true;
        iVar.f1249b = a.LONG_TAP;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.f25016b;
        iVar.f25018f = true;
        iVar.f1249b = a.TAP;
        return true;
    }
}
