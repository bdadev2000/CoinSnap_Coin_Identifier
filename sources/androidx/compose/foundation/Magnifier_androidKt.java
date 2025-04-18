package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import q0.l;

/* loaded from: classes3.dex */
public final class Magnifier_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SemanticsPropertyKey f2785a = new SemanticsPropertyKey("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static Modifier b(l lVar, l lVar2, PlatformMagnifierFactory platformMagnifierFactory) {
        return a() ? new MagnifierElement(lVar, null, lVar2, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, platformMagnifierFactory) : Modifier.Companion.f14687a;
    }
}
