package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public class MotionHelper extends ConstraintHelper implements Animatable, MotionLayout.TransitionListener {

    /* renamed from: i, reason: collision with root package name */
    public float f17816i;

    /* renamed from: j, reason: collision with root package name */
    public View[] f17817j;

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void a() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public final void b() {
    }

    public float getProgress() {
        return this.f17816i;
    }

    public void setProgress(float f2) {
        this.f17816i = f2;
        int i2 = 0;
        if (this.f18192b > 0) {
            this.f17817j = h((ConstraintLayout) getParent());
            while (i2 < this.f18192b) {
                View view = this.f17817j[i2];
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            boolean z2 = viewGroup.getChildAt(i2) instanceof MotionHelper;
            i2++;
        }
    }
}
