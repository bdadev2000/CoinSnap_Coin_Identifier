package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextLinkScope$LinksComposables$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextLinkScope f6221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnnotatedString.Range f6222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ State f6223c;
    public final /* synthetic */ State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ State f6224f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$2$1(TextLinkScope textLinkScope, AnnotatedString.Range range, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        super(1);
        this.f6221a = textLinkScope;
        this.f6222b = range;
        this.f6223c = mutableState;
        this.d = mutableState2;
        this.f6224f = mutableState3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SpanStyle c2;
        TextLinkStyles b2;
        SpanStyle c3;
        TextLinkStyles b3;
        SpanStyle c4;
        TextLinkStyles b4;
        TextAnnotatorScope textAnnotatorScope = (TextAnnotatorScope) obj;
        AnnotatedString.Range range = this.f6222b;
        TextLinkStyles b5 = ((LinkAnnotation) range.f16890a).b();
        SpanStyle spanStyle = null;
        SpanStyle spanStyle2 = b5 != null ? b5.f17050a : null;
        boolean booleanValue = ((Boolean) this.f6223c.getValue()).booleanValue();
        Object obj2 = range.f16890a;
        SpanStyle spanStyle3 = (!booleanValue || (b4 = ((LinkAnnotation) obj2).b()) == null) ? null : b4.f17051b;
        this.f6221a.getClass();
        if (spanStyle2 != null && (c4 = spanStyle2.c(spanStyle3)) != null) {
            spanStyle3 = c4;
        }
        SpanStyle spanStyle4 = (!((Boolean) this.d.getValue()).booleanValue() || (b3 = ((LinkAnnotation) obj2).b()) == null) ? null : b3.f17052c;
        if (spanStyle3 != null && (c3 = spanStyle3.c(spanStyle4)) != null) {
            spanStyle4 = c3;
        }
        if (((Boolean) this.f6224f.getValue()).booleanValue() && (b2 = ((LinkAnnotation) obj2).b()) != null) {
            spanStyle = b2.d;
        }
        if (spanStyle4 != null && (c2 = spanStyle4.c(spanStyle)) != null) {
            spanStyle = c2;
        }
        if (spanStyle != null) {
            textAnnotatorScope.f6101a.a(spanStyle, range.f16891b, range.f16892c);
        }
        return b0.f30125a;
    }
}
