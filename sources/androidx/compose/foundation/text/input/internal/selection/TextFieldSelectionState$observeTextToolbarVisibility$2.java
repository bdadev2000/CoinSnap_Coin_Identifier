package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldSelectionState$observeTextToolbarVisibility$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f6836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeTextToolbarVisibility$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.f6836a = textFieldSelectionState;
    }

    @Override // q0.a
    public final Object invoke() {
        float f2;
        Rect rect;
        TextFieldSelectionState textFieldSelectionState = this.f6836a;
        boolean c2 = TextRange.c(textFieldSelectionState.f6714a.d().f6298b);
        Rect rect2 = Rect.e;
        if (((!c2 || textFieldSelectionState.t() != TextToolbarState.f6864b) && (c2 || textFieldSelectionState.t() != TextToolbarState.f6865c)) || textFieldSelectionState.o() != null || !((Boolean) textFieldSelectionState.f6722k.getValue()).booleanValue()) {
            return rect2;
        }
        LayoutCoordinates s2 = textFieldSelectionState.s();
        Rect c3 = s2 != null ? SelectionManagerKt.c(s2) : null;
        if (c3 == null) {
            return rect2;
        }
        LayoutCoordinates s3 = textFieldSelectionState.s();
        Offset offset = s3 != null ? new Offset(s3.e0(c3.g())) : null;
        p0.a.p(offset);
        Rect a2 = RectKt.a(offset.f14913a, c3.f());
        TextFieldCharSequence d = textFieldSelectionState.f6714a.d();
        if (TextRange.c(d.f6298b)) {
            Rect n2 = textFieldSelectionState.n();
            LayoutCoordinates s4 = textFieldSelectionState.s();
            rect = RectKt.a(s4 != null ? s4.e0(n2.g()) : 0L, n2.f());
        } else {
            LayoutCoordinates s5 = textFieldSelectionState.s();
            long e02 = s5 != null ? s5.e0(textFieldSelectionState.q(true)) : 0L;
            LayoutCoordinates s6 = textFieldSelectionState.s();
            long e03 = s6 != null ? s6.e0(textFieldSelectionState.q(false)) : 0L;
            LayoutCoordinates s7 = textFieldSelectionState.s();
            TextLayoutState textLayoutState = textFieldSelectionState.f6715b;
            float f3 = 0.0f;
            long j2 = d.f6298b;
            if (s7 != null) {
                TextLayoutResult b2 = textLayoutState.b();
                f2 = Offset.h(s7.e0(OffsetKt.a(0.0f, b2 != null ? b2.c((int) (j2 >> 32)).f14915b : 0.0f)));
            } else {
                f2 = 0.0f;
            }
            LayoutCoordinates s8 = textFieldSelectionState.s();
            if (s8 != null) {
                TextLayoutResult b3 = textLayoutState.b();
                f3 = Offset.h(s8.e0(OffsetKt.a(0.0f, b3 != null ? b3.c((int) (j2 & 4294967295L)).f14915b : 0.0f)));
            }
            rect = new Rect(Math.min(Offset.g(e02), Offset.g(e03)), Math.min(f2, f3), Math.max(Offset.g(e02), Offset.g(e03)), Math.max(Offset.h(e02), Offset.h(e03)));
        }
        Rect rect3 = a2.k(rect) ? rect : null;
        return rect3 != null ? rect3.i(a2) : rect2;
    }
}
