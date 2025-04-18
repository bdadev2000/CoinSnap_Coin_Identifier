package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SemanticsNodeWithAdjustedBounds {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsNode f16596a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f16597b;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, Rect rect) {
        this.f16596a = semanticsNode;
        this.f16597b = rect;
    }
}
