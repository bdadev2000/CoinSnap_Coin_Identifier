package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import h0.g;
import q0.p;

/* loaded from: classes4.dex */
public interface ScrollableState {

    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    boolean a();

    Object b(MutatePriority mutatePriority, p pVar, g gVar);

    default boolean c() {
        return true;
    }

    default boolean d() {
        return true;
    }

    float e(float f2);
}
