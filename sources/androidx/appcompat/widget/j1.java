package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* loaded from: classes.dex */
public class j1 extends m1 {
    @Override // androidx.appcompat.widget.m1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) n1.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
