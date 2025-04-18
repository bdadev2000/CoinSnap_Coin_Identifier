package androidx.compose.foundation.text;

import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CoreTextFieldKt$CoreTextField$drawModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawModifier$1$1(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.f5875a = legacyTextFieldState;
        this.f5876b = textFieldValue;
        this.f5877c = offsetMapping;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        LegacyTextFieldState legacyTextFieldState = this.f5875a;
        TextLayoutResultProxy d = legacyTextFieldState.d();
        if (d != null) {
            OffsetMapping offsetMapping = this.f5877c;
            Canvas a2 = drawScope.A1().a();
            long j2 = ((TextRange) legacyTextFieldState.x.getValue()).f17058a;
            long j3 = ((TextRange) legacyTextFieldState.f6041y.getValue()).f17058a;
            TextLayoutResult textLayoutResult = d.f6210a;
            long j4 = legacyTextFieldState.w;
            boolean c2 = TextRange.c(j2);
            AndroidPaint androidPaint = legacyTextFieldState.f6040v;
            if (!c2) {
                androidPaint.v(j4);
                TextFieldDelegate.Companion.b(a2, j2, offsetMapping, textLayoutResult, androidPaint);
            } else if (TextRange.c(j3)) {
                TextFieldValue textFieldValue = this.f5876b;
                if (!TextRange.c(textFieldValue.f17362b)) {
                    androidPaint.v(j4);
                    TextFieldDelegate.Companion.b(a2, textFieldValue.f17362b, offsetMapping, textLayoutResult, androidPaint);
                }
            } else {
                long b2 = textLayoutResult.f17046a.f17039b.b();
                Color color = new Color(b2);
                if (b2 == 16) {
                    color = null;
                }
                long j5 = color != null ? color.f14964a : Color.f14957b;
                androidPaint.v(Color.b(j5, Color.d(j5) * 0.2f));
                TextFieldDelegate.Companion.b(a2, j3, offsetMapping, textLayoutResult, androidPaint);
            }
            TextPainter.a(a2, textLayoutResult);
        }
        return b0.f30125a;
    }
}
