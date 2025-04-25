package com.glority.widget.uitls;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: GlTextViewSuffixWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"autoSet", "", "index", "", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes12.dex */
final class GlTextViewSuffixWrapperKt$setTextWithSuffix$3 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ CharSequence $mainContent;
    final /* synthetic */ Function1 $onFailed;
    final /* synthetic */ Function1 $onSuccess;
    final /* synthetic */ CharSequence $originText;
    final /* synthetic */ CharSequence $suffix;
    final /* synthetic */ Function3 $textWrapper;
    final /* synthetic */ TextView $this_setTextWithSuffix;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlTextViewSuffixWrapperKt$setTextWithSuffix$3(TextView textView, Function1 function1, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function3 function3, Function1 function12) {
        super(1);
        this.$this_setTextWithSuffix = textView;
        this.$onFailed = function1;
        this.$originText = charSequence;
        this.$mainContent = charSequence2;
        this.$suffix = charSequence3;
        this.$textWrapper = function3;
        this.$onSuccess = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        String str;
        if (i < 0) {
            Function1 function1 = this.$onFailed;
            CharSequence originText = this.$originText;
            Intrinsics.checkNotNullExpressionValue(originText, "originText");
            function1.invoke(originText);
            return;
        }
        TextView textView = this.$this_setTextWithSuffix;
        if (i >= this.$mainContent.length()) {
            str = this.$mainContent;
        } else {
            String str2 = this.$mainContent.subSequence(0, i).toString() + this.$suffix;
            Function3 function3 = this.$textWrapper;
            if (function3 == null || (str = (CharSequence) function3.invoke(str2, this.$suffix, Integer.valueOf(i))) == null) {
                str = str2;
            }
        }
        textView.setText(str);
        Function1 function12 = this.$onSuccess;
        CharSequence text = this.$this_setTextWithSuffix.getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        function12.invoke(text);
    }
}
