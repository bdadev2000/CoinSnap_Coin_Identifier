package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f722b = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i3 i3Var = new i3(context, context.obtainStyledAttributes(attributeSet, f722b));
        setBackgroundDrawable(i3Var.e(0));
        i3Var.o();
    }
}
