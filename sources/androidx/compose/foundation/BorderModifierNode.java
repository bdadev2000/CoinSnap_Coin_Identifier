package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DelegatingNode;

@StabilityInferred
/* loaded from: classes2.dex */
public final class BorderModifierNode extends DelegatingNode {

    /* renamed from: q, reason: collision with root package name */
    public BorderCache f2585q;

    /* renamed from: r, reason: collision with root package name */
    public float f2586r;

    /* renamed from: s, reason: collision with root package name */
    public Brush f2587s;

    /* renamed from: t, reason: collision with root package name */
    public Shape f2588t;

    /* renamed from: u, reason: collision with root package name */
    public final CacheDrawModifierNode f2589u;

    public BorderModifierNode(float f2, Brush brush, Shape shape) {
        this.f2586r = f2;
        this.f2587s = brush;
        this.f2588t = shape;
        CacheDrawModifierNode a2 = DrawModifierKt.a(new BorderModifierNode$drawWithCacheModifierNode$1(this));
        e2(a2);
        this.f2589u = a2;
    }
}
