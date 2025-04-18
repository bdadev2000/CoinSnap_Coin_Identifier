package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import e0.w;
import q0.p;

/* loaded from: classes4.dex */
public final class SuspendingPointerInputFilterKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PointerEvent f15643a = new PointerEvent(w.f30218a, null);

    public static final SuspendingPointerInputModifierNodeImpl a(p pVar) {
        return new SuspendingPointerInputModifierNodeImpl(null, null, null, pVar);
    }

    public static final Modifier b(Modifier modifier, Object obj, p pVar) {
        return modifier.T0(new SuspendPointerInputElement(obj, null, null, pVar, 6));
    }
}
