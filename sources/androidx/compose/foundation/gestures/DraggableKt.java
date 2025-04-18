package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import j0.i;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class DraggableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3365a = new i(3, null);

    /* renamed from: b, reason: collision with root package name */
    public static final q f3366b = new i(3, null);

    public static Modifier a(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, q qVar, boolean z4, int i2) {
        return modifier.T0(new DraggableElement(draggableState, orientation, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? null : mutableInteractionSource, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? f3365a : null, (i2 & 64) != 0 ? f3366b : qVar, (i2 & 128) != 0 ? false : z4));
    }

    public static final DraggableState b(l lVar, Composer composer) {
        MutableState k2 = SnapshotStateKt.k(lVar, composer);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            DefaultDraggableState defaultDraggableState = new DefaultDraggableState(new DraggableKt$rememberDraggableState$1$1(k2));
            composer.o(defaultDraggableState);
            u2 = defaultDraggableState;
        }
        return (DraggableState) u2;
    }
}
