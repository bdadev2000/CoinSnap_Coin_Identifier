package h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class e0 extends ContentFrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0 f18550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, j.f fVar) {
        super(fVar, null);
        this.f18550k = g0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f18550k.v(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x10 >= -5 && y4 >= -5 && x10 <= getWidth() + 5 && y4 <= getHeight() + 5) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                g0 g0Var = this.f18550k;
                g0Var.t(g0Var.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(com.bumptech.glide.c.t(getContext(), i10));
    }
}
