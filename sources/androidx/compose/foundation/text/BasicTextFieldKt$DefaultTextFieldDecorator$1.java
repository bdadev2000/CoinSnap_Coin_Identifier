package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import q0.p;

/* loaded from: classes3.dex */
public final class BasicTextFieldKt$DefaultTextFieldDecorator$1 implements TextFieldDecorator {

    /* renamed from: a, reason: collision with root package name */
    public static final BasicTextFieldKt$DefaultTextFieldDecorator$1 f5617a = new Object();

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void a(p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1669748801);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            pVar.invoke(g2, Integer.valueOf(i3 & 14));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicTextFieldKt$DefaultTextFieldDecorator$1$Decoration$1(this, pVar, i2);
        }
    }
}
