package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes.dex */
public final class RippleNodeFactory implements IndicationNodeFactory {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10788a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10789b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorProducer f10790c = null;
    public final long d;

    public RippleNodeFactory(boolean z2, float f2, long j2) {
        this.f10788a = z2;
        this.f10789b = f2;
        this.d = j2;
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode b(InteractionSource interactionSource) {
        ColorProducer colorProducer = this.f10790c;
        if (colorProducer == null) {
            colorProducer = new ColorProducer() { // from class: androidx.compose.material3.RippleNodeFactory$create$colorProducer$1
                @Override // androidx.compose.ui.graphics.ColorProducer
                public final long a() {
                    return RippleNodeFactory.this.d;
                }
            };
        }
        return new DelegatingThemeAwareRippleNode(interactionSource, this.f10788a, this.f10789b, colorProducer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleNodeFactory)) {
            return false;
        }
        RippleNodeFactory rippleNodeFactory = (RippleNodeFactory) obj;
        if (this.f10788a == rippleNodeFactory.f10788a && Dp.a(this.f10789b, rippleNodeFactory.f10789b) && p0.a.g(this.f10790c, rippleNodeFactory.f10790c)) {
            return Color.c(this.d, rippleNodeFactory.d);
        }
        return false;
    }

    public final int hashCode() {
        int b2 = d.b(this.f10789b, Boolean.hashCode(this.f10788a) * 31, 31);
        ColorProducer colorProducer = this.f10790c;
        int hashCode = colorProducer != null ? colorProducer.hashCode() : 0;
        int i2 = Color.f14963j;
        return Long.hashCode(this.d) + ((b2 + hashCode) * 31);
    }
}
