package G;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class b {
    public boolean e(View view) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i9) {
        return false;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        return false;
    }

    public boolean m(View view) {
        return false;
    }

    public void o(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
    }

    public Parcelable r(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean s(View view, int i9, int i10) {
        return false;
    }

    public boolean u(View view, MotionEvent motionEvent) {
        return false;
    }

    public void i() {
    }

    public void f(View view) {
    }

    public void g(e eVar) {
    }

    public void p(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void q(View view, Parcelable parcelable) {
    }

    public void t(View view, View view2, int i9) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10, int[] iArr, int i11) {
    }
}
