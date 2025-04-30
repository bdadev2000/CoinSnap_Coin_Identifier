package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class v0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;

    public v0(View view) {
        this.b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.b;
        view2.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
