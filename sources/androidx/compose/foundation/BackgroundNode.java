package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import org.objectweb.asm.Opcodes;
import p0.a;

/* loaded from: classes.dex */
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public long f2493o;

    /* renamed from: p, reason: collision with root package name */
    public Brush f2494p;

    /* renamed from: q, reason: collision with root package name */
    public float f2495q;

    /* renamed from: r, reason: collision with root package name */
    public Shape f2496r;

    /* renamed from: s, reason: collision with root package name */
    public long f2497s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutDirection f2498t;

    /* renamed from: u, reason: collision with root package name */
    public Outline f2499u;

    /* renamed from: v, reason: collision with root package name */
    public Shape f2500v;

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        this.f2497s = 9205357640488583168L;
        this.f2498t = null;
        this.f2499u = null;
        this.f2500v = null;
        DrawModifierNodeKt.a(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        Path path;
        if (this.f2496r == RectangleShapeKt.f15014a) {
            if (!Color.c(this.f2493o, Color.f14962i)) {
                DrawScope.R0(contentDrawScope, this.f2493o, 0L, 0L, 0.0f, null, 126);
            }
            Brush brush = this.f2494p;
            if (brush != null) {
                DrawScope.a1(contentDrawScope, brush, 0L, 0L, this.f2495q, null, null, Opcodes.FNEG);
            }
        } else {
            ?? obj = new Object();
            if (Size.a(contentDrawScope.b(), this.f2497s) && contentDrawScope.getLayoutDirection() == this.f2498t && a.g(this.f2500v, this.f2496r)) {
                Outline outline = this.f2499u;
                a.p(outline);
                obj.f30930a = outline;
            } else {
                ObserverModifierNodeKt.a(this, new BackgroundNode$getOutline$1(obj, this, contentDrawScope));
            }
            this.f2499u = (Outline) obj.f30930a;
            this.f2497s = contentDrawScope.b();
            this.f2498t = contentDrawScope.getLayoutDirection();
            this.f2500v = this.f2496r;
            Object obj2 = obj.f30930a;
            a.p(obj2);
            Outline outline2 = (Outline) obj2;
            if (!Color.c(this.f2493o, Color.f14962i)) {
                OutlineKt.a(contentDrawScope, outline2, this.f2493o);
            }
            Brush brush2 = this.f2494p;
            if (brush2 != null) {
                float f2 = this.f2495q;
                Fill fill = Fill.f15146a;
                if (outline2 instanceof Outline.Rectangle) {
                    Rect rect = ((Outline.Rectangle) outline2).f15001a;
                    contentDrawScope.Z0(brush2, OffsetKt.a(rect.f14914a, rect.f14915b), SizeKt.a(rect.h(), rect.e()), f2, fill, null, 3);
                } else {
                    if (outline2 instanceof Outline.Rounded) {
                        Outline.Rounded rounded = (Outline.Rounded) outline2;
                        path = rounded.f15003b;
                        if (path == null) {
                            RoundRect roundRect = rounded.f15002a;
                            float b2 = CornerRadius.b(roundRect.f14922h);
                            contentDrawScope.u1(brush2, OffsetKt.a(roundRect.f14917a, roundRect.f14918b), SizeKt.a(roundRect.b(), roundRect.a()), CornerRadiusKt.a(b2, b2), f2, fill, null, 3);
                        }
                    } else {
                        if (!(outline2 instanceof Outline.Generic)) {
                            throw new RuntimeException();
                        }
                        path = ((Outline.Generic) outline2).f15000a;
                    }
                    contentDrawScope.v0(path, brush2, f2, fill, null, 3);
                }
            }
        }
        contentDrawScope.P1();
    }
}
