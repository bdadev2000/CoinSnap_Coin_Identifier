package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements j.d {

    /* renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f20177b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view) {
        super(view.getContext());
        this.f20177b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // j.d
    public final void b() {
        this.f20177b.onActionViewExpanded();
    }

    @Override // j.d
    public final void e() {
        this.f20177b.onActionViewCollapsed();
    }
}
