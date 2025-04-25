package com.glority.widget.uitls;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlTextViewSuffixWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"defaultCollapse", "", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlTextViewSuffixWrapper$performCollapse$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Transition $transition;
    final /* synthetic */ GlTextViewSuffixWrapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlTextViewSuffixWrapper$performCollapse$2(GlTextViewSuffixWrapper glTextViewSuffixWrapper, Transition transition) {
        super(0);
        this.this$0 = glTextViewSuffixWrapper;
        this.$transition = transition;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getTextView().setMaxLines(this.this$0.getTargetLineCount());
        this.this$0.getTextView().setEllipsize(TextUtils.TruncateAt.END);
        final CharSequence text = this.this$0.getTextView().getText();
        this.this$0.getTextView().setText(this.this$0.getMainContent());
        if (this.$transition != null) {
            final TextView textView = this.this$0.getTextView();
            Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(text);
                textView.setMaxLines(Integer.MAX_VALUE);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                this.$transition.addListener(new TransitionListenerAdapter() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapper$performCollapse$2$defaultCollapse$$inlined$apply$lambda$1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        Intrinsics.checkNotNullParameter(transition, "transition");
                        transition.removeListener(this);
                        textView.getLayoutParams().height = -2;
                        TextView textView2 = textView;
                        textView2.setLayoutParams(textView2.getLayoutParams());
                        textView.setMaxLines(this.this$0.getTargetLineCount());
                        textView.setText(this.this$0.getMainContent());
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                        Intrinsics.checkNotNullParameter(transition, "transition");
                        transition.removeListener(this);
                    }
                });
            }
            TransitionManager.beginDelayedTransition(this.this$0.getSceneRoot(), this.$transition);
        }
    }
}
