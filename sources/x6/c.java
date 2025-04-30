package X6;

import G7.j;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.straight.StraightRulerActivity;
import j6.m;
import u6.AbstractC2808y;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3706c;

    public /* synthetic */ c(Object obj, int i9) {
        this.b = i9;
        this.f3706c = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Object obj = this.f3706c;
        switch (this.b) {
            case 0:
                int i9 = StraightRulerActivity.f19707k;
                StraightRulerActivity straightRulerActivity = (StraightRulerActivity) obj;
                j.e(straightRulerActivity, "this$0");
                straightRulerActivity.f19709g = true;
                ((AbstractC2808y) straightRulerActivity.k()).f23438s.setImageResource(R.drawable.ic_ruler_home);
                return;
            default:
                m mVar = (m) obj;
                j.e(mVar, "this$0");
                FrameLayout frameLayout = (FrameLayout) mVar.f21172d.b;
                Animation animation = frameLayout.getAnimation();
                if (animation != null) {
                    animation.cancel();
                    animation.reset();
                }
                frameLayout.clearAnimation();
                mVar.f();
                return;
        }
    }
}
