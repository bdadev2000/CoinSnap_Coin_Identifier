package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class l1 extends j1 {
    @Override // androidx.appcompat.widget.j1, androidx.appcompat.widget.m1
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // androidx.appcompat.widget.m1
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
