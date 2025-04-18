package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f7351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1(TextFieldSelectionManager textFieldSelectionManager, MutableState mutableState) {
        super(0);
        this.f7350a = textFieldSelectionManager;
        this.f7351b = mutableState;
    }

    @Override // q0.a
    public final Object invoke() {
        long j2;
        TextLayoutResultProxy d;
        LegacyTextFieldState legacyTextFieldState;
        TextDelegate textDelegate;
        AnnotatedString annotatedString;
        TextDelegate textDelegate2;
        long j3 = ((IntSize) this.f7351b.getValue()).f17493a;
        TextFieldSelectionManager textFieldSelectionManager = this.f7350a;
        Offset i2 = textFieldSelectionManager.i();
        long j4 = 9205357640488583168L;
        if (i2 != null) {
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
            AnnotatedString annotatedString2 = (legacyTextFieldState2 == null || (textDelegate2 = legacyTextFieldState2.f6021a) == null) ? null : textDelegate2.f6107a;
            if (annotatedString2 != null && annotatedString2.f16880a.length() != 0) {
                Handle handle = (Handle) textFieldSelectionManager.f7313p.getValue();
                int i3 = handle == null ? -1 : TextFieldSelectionManagerKt.WhenMappings.f7338a[handle.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1 || i3 == 2) {
                        long j5 = textFieldSelectionManager.l().f17362b;
                        int i4 = TextRange.f17057c;
                        j2 = j5 >> 32;
                    } else {
                        if (i3 != 3) {
                            throw new RuntimeException();
                        }
                        long j6 = textFieldSelectionManager.l().f17362b;
                        int i5 = TextRange.f17057c;
                        j2 = j6 & 4294967295L;
                    }
                    int i6 = (int) j2;
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                    if (legacyTextFieldState3 != null && (d = legacyTextFieldState3.d()) != null && (legacyTextFieldState = textFieldSelectionManager.d) != null && (textDelegate = legacyTextFieldState.f6021a) != null && (annotatedString = textDelegate.f6107a) != null) {
                        int A = p0.a.A(textFieldSelectionManager.f7301b.b(i6), 0, annotatedString.f16880a.length());
                        float g2 = Offset.g(d.d(i2.f14913a));
                        TextLayoutResult textLayoutResult = d.f6210a;
                        int f2 = textLayoutResult.f(A);
                        float g3 = textLayoutResult.g(f2);
                        float h2 = textLayoutResult.h(f2);
                        float z2 = p0.a.z(g2, Math.min(g3, h2), Math.max(g3, h2));
                        if (IntSize.b(j3, 0L) || Math.abs(g2 - z2) <= ((int) (j3 >> 32)) / 2) {
                            MultiParagraph multiParagraph = textLayoutResult.f17047b;
                            float d2 = multiParagraph.d(f2);
                            j4 = OffsetKt.a(z2, ((multiParagraph.b(f2) - d2) / 2) + d2);
                        }
                    }
                }
            }
        }
        return new Offset(j4);
    }
}
