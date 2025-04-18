package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class TextFieldCursorKt$cursor$1$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CursorAnimationState f6122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f6123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6124c;
    public final /* synthetic */ LegacyTextFieldState d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Brush f6125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCursorKt$cursor$1$2$1(CursorAnimationState cursorAnimationState, OffsetMapping offsetMapping, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, Brush brush) {
        super(1);
        this.f6122a = cursorAnimationState;
        this.f6123b = offsetMapping;
        this.f6124c = textFieldValue;
        this.d = legacyTextFieldState;
        this.f6125f = brush;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextLayoutResult textLayoutResult;
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        contentDrawScope.P1();
        float c2 = this.f6122a.f6393b.c();
        if (c2 != 0.0f) {
            long j2 = this.f6124c.f17362b;
            int i2 = TextRange.f17057c;
            int b2 = this.f6123b.b((int) (j2 >> 32));
            TextLayoutResultProxy d = this.d.d();
            Rect rect = (d == null || (textLayoutResult = d.f6210a) == null) ? new Rect(0.0f, 0.0f, 0.0f, 0.0f) : textLayoutResult.c(b2);
            float y1 = contentDrawScope.y1(TextFieldCursorKt.f6116a);
            float f2 = y1 / 2;
            float v2 = p0.a.v(p0.a.x(rect.f14914a + f2, Size.d(contentDrawScope.b()) - f2), f2);
            contentDrawScope.B1(this.f6125f, OffsetKt.a(v2, rect.f14915b), OffsetKt.a(v2, rect.d), (r22 & 8) != 0 ? 0.0f : y1, 0, null, (r22 & 64) != 0 ? 1.0f : c2, null, (r22 & 256) != 0 ? 3 : 0);
        }
        return b0.f30125a;
    }
}
