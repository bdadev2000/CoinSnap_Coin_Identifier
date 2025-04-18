package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import q0.l;

@d0.a
/* loaded from: classes4.dex */
public interface PlatformTextInputService {
    default void a() {
    }

    void b();

    void c();

    void d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    void e();

    void f(TextFieldValue textFieldValue, ImeOptions imeOptions, l lVar, l lVar2);

    default void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l lVar, Rect rect, Rect rect2) {
    }

    default void h(Rect rect) {
    }
}
