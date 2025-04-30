package k;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class u extends ContentFrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f21328k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, o.d dVar) {
        super(dVar, null);
        this.f21328k = wVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f21328k.u(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x9 < -5 || y4 < -5 || x9 > getWidth() + 5 || y4 > getHeight() + 5) {
                w wVar = this.f21328k;
                wVar.s(wVar.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i9) {
        setBackgroundDrawable(com.facebook.appevents.n.g(getContext(), i9));
    }
}
