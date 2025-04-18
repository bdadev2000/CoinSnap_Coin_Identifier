package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import q0.a;
import q0.l;

/* loaded from: classes3.dex */
public interface FocusOwner extends FocusManager {
    static /* synthetic */ boolean k(FocusOwner focusOwner, KeyEvent keyEvent) {
        return focusOwner.f(keyEvent, FocusOwner$dispatchKeyEvent$1.f14840a);
    }

    Boolean a(int i2, Rect rect, l lVar);

    void b(FocusEventModifierNode focusEventModifierNode);

    FocusTransactionManager c();

    boolean e(KeyEvent keyEvent);

    boolean f(KeyEvent keyEvent, a aVar);

    boolean g();

    void h(FocusTargetNode focusTargetNode);

    Modifier i();

    boolean j(RotaryScrollEvent rotaryScrollEvent);

    FocusStateImpl l();

    void m(FocusPropertiesModifierNode focusPropertiesModifierNode);

    Rect n();

    boolean o(int i2, boolean z2, boolean z3);

    void p();
}
