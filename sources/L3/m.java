package L3;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.tools.arruler.photomeasure.camera.ruler.R;
import d0.AbstractC2158e;

/* loaded from: classes2.dex */
public final class m implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i9) {
        this.b = i9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC2158e abstractC2158e;
        switch (this.b) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                ViewCompat.requestApplyInsets(view);
                return;
            default:
                if (view != null) {
                    abstractC2158e = (AbstractC2158e) view.getTag(R.id.dataBinding);
                } else {
                    abstractC2158e = null;
                }
                abstractC2158e.f19784c.run();
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i9 = this.b;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
