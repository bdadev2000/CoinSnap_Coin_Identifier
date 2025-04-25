package com.glority.widget.uitls;

import android.view.View;
import android.widget.TextView;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlTextViewSuffixWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/glority/widget/uitls/GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, LogEvents.bottom, "oldLeft", "oldTop", "oldRight", "oldBottom", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ GlTextViewSuffixWrapperKt$setTextWithSuffix$3 $autoSet$3;
    final /* synthetic */ CharSequence $mainContent;
    final /* synthetic */ Function1 $onFailed;
    final /* synthetic */ CharSequence $suffix;
    final /* synthetic */ int $targetLineCount;
    final /* synthetic */ Function3 $textWrapper;
    final /* synthetic */ TextView $this_setTextWithSuffix;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1(TextView textView, Function1 function1, GlTextViewSuffixWrapperKt$setTextWithSuffix$3 glTextViewSuffixWrapperKt$setTextWithSuffix$3, CharSequence charSequence, CharSequence charSequence2, int i, Function3 function3) {
        this.$this_setTextWithSuffix = textView;
        this.$onFailed = function1;
        this.$autoSet$3 = glTextViewSuffixWrapperKt$setTextWithSuffix$3;
        this.$mainContent = charSequence;
        this.$suffix = charSequence2;
        this.$targetLineCount = i;
        this.$textWrapper = function3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        this.$this_setTextWithSuffix.removeOnLayoutChangeListener(this);
        if (this.$this_setTextWithSuffix.getLayout() == null) {
            Function1 function1 = this.$onFailed;
            CharSequence text = this.$this_setTextWithSuffix.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            function1.invoke(text);
            return;
        }
        this.$this_setTextWithSuffix.post(new Runnable() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1$onLayoutChange$1
            @Override // java.lang.Runnable
            public final void run() {
                System.currentTimeMillis();
                GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$autoSet$3.invoke(GlTextViewSuffixWrapperKt.access$binarySearch(GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$this_setTextWithSuffix, GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$mainContent, GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$suffix, GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$targetLineCount, GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1.this.$textWrapper));
                System.currentTimeMillis();
            }
        });
    }
}
