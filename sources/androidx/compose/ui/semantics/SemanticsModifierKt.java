package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import q0.l;

/* loaded from: classes3.dex */
public final class SemanticsModifierKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f16818a = new AtomicInteger(0);

    public static final Modifier a(Modifier modifier, l lVar) {
        return modifier.T0(new ClearAndSetSemanticsElement(lVar));
    }

    public static final Modifier b(Modifier modifier, boolean z2, l lVar) {
        return modifier.T0(new AppendedSemanticsElement(z2, lVar));
    }
}
