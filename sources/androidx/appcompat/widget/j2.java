package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class j2 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f886c;

    public /* synthetic */ j2(Object obj, int i10) {
        this.f885b = i10;
        this.f886c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k2 k2Var;
        d0 d0Var;
        switch (this.f885b) {
            case 0:
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y4 = (int) motionEvent.getY();
                Object obj = this.f886c;
                if (action == 0 && (d0Var = (k2Var = (k2) obj).B) != null && d0Var.isShowing() && x10 >= 0) {
                    d0 d0Var2 = k2Var.B;
                    if (x10 < d0Var2.getWidth() && y4 >= 0 && y4 < d0Var2.getHeight()) {
                        k2Var.f910x.postDelayed(k2Var.f907t, 250L);
                        return false;
                    }
                }
                if (action == 1) {
                    k2 k2Var2 = (k2) obj;
                    k2Var2.f910x.removeCallbacks(k2Var2.f907t);
                    return false;
                }
                return false;
            default:
                return true;
        }
    }
}
