package com.glority.base.ext;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViewExtension.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"setMaxEllipsize", "", "Landroid/widget/TextView;", "setSpannableEllipsize", "base_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class TextViewExtensionKt {
    public static final void setMaxEllipsize(final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.glority.base.ext.TextViewExtensionKt$setMaxEllipsize$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int maxLines = textView.getMaxLines();
                Layout layout = textView.getLayout();
                if (layout.getLineCount() > maxLines) {
                    int lineEnd = layout.getLineEnd(maxLines - 1);
                    TextView textView2 = textView;
                    textView2.setText(textView2.getText().subSequence(0, lineEnd - 3), TextView.BufferType.SPANNABLE);
                    textView.append("...");
                }
            }
        });
    }

    public static final void setSpannableEllipsize(final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.glority.base.ext.TextViewExtensionKt$setSpannableEllipsize$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int lineEnd;
                ViewTreeObserver viewTreeObserver2 = textView.getViewTreeObserver();
                Intrinsics.checkNotNullExpressionValue(viewTreeObserver2, "getViewTreeObserver(...)");
                viewTreeObserver2.removeOnGlobalLayoutListener(this);
                if (textView.getLineCount() <= 1 || textView.getLayout().getLineEnd(0) - 3 <= 0) {
                    return;
                }
                textView.setText(((Object) textView.getText().subSequence(0, lineEnd)) + "...");
            }
        });
    }
}
