package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public z1 f734b;

    public FitWindowsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        z1 z1Var = this.f734b;
        if (z1Var != null) {
            rect.top = ((h.g0) ((fb.c) z1Var).f17773c).K(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(z1 z1Var) {
        this.f734b = z1Var;
    }
}
