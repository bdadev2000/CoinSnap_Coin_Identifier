package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextLinkScope$shouldMeasureLinks$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6233a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$shouldMeasureLinks$1(TextLinkScope textLinkScope) {
        super(0);
        this.f6233a = textLinkScope;
    }

    @Override // q0.a
    public final Object invoke() {
        TextLayoutInput textLayoutInput;
        TextLinkScope textLinkScope = this.f6233a;
        AnnotatedString annotatedString = textLinkScope.f6215c;
        TextLayoutResult textLayoutResult = (TextLayoutResult) textLinkScope.f6214b.getValue();
        return Boolean.valueOf(p0.a.g(annotatedString, (textLayoutResult == null || (textLayoutInput = textLayoutResult.f17046a) == null) ? null : textLayoutInput.f17038a));
    }
}
