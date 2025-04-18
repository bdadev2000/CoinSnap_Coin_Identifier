package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import h0.g;
import q0.p;

/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    Object K1(p pVar, g gVar);

    default void b0() {
    }

    ViewConfiguration getViewConfiguration();
}
