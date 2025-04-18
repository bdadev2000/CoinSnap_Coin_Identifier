package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CommonRippleNode extends RippleNode {

    /* renamed from: y, reason: collision with root package name */
    public final MutableScatterMap f7395y;

    public CommonRippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, q0.a aVar) {
        super(interactionSource, z2, f2, colorProducer, aVar);
        this.f7395y = new MutableScatterMap();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f7395y.e();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void e2(PressInteraction.Press press, long j2, float f2) {
        MutableScatterMap mutableScatterMap = this.f7395y;
        Object[] objArr = mutableScatterMap.f1558b;
        Object[] objArr2 = mutableScatterMap.f1559c;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j3 = jArr[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j3) < 128) {
                            int i5 = (i2 << 3) + i4;
                            ((RippleAnimation) objArr2[i5]).c();
                        }
                        j3 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z2 = this.f7453p;
        RippleAnimation rippleAnimation = new RippleAnimation(z2 ? new Offset(press.f3741a) : null, f2, z2);
        mutableScatterMap.k(press, rippleAnimation);
        e.v(S1(), null, 0, new CommonRippleNode$addRipple$2(rippleAnimation, this, press, null), 3);
        DrawModifierNodeKt.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void f2(DrawScope drawScope) {
        float f2 = ((RippleAlpha) this.f7456s.invoke()).d;
        if (f2 == 0.0f) {
            return;
        }
        MutableScatterMap mutableScatterMap = this.f7395y;
        Object[] objArr = mutableScatterMap.f1558b;
        Object[] objArr2 = mutableScatterMap.f1559c;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        ((RippleAnimation) objArr2[i5]).b(drawScope, Color.b(this.f7455r.a(), f2));
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void h2(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.f7395y.c(press);
        if (rippleAnimation != null) {
            rippleAnimation.c();
        }
    }
}
