package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements o.c {
    public final CollapsibleActionView b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.b = (CollapsibleActionView) view;
        addView(view);
    }
}
