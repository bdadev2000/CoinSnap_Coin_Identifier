package androidx.compose.ui.node;

import androidx.compose.ui.layout.RulerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LookaheadCapablePlaceable$captureRulers$3 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlaceableResult f16060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LookaheadCapablePlaceable f16061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadCapablePlaceable$captureRulers$3(LookaheadCapablePlaceable lookaheadCapablePlaceable, PlaceableResult placeableResult) {
        super(0);
        this.f16060a = placeableResult;
        this.f16061b = lookaheadCapablePlaceable;
    }

    @Override // q0.a
    public final Object invoke() {
        l s2 = this.f16060a.f16169a.s();
        if (s2 != null) {
            final LookaheadCapablePlaceable lookaheadCapablePlaceable = this.f16061b;
            lookaheadCapablePlaceable.getClass();
            s2.invoke(new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
                @Override // androidx.compose.ui.unit.Density
                public final float getDensity() {
                    return LookaheadCapablePlaceable.this.getDensity();
                }

                @Override // androidx.compose.ui.unit.FontScaling
                public final float x1() {
                    return LookaheadCapablePlaceable.this.x1();
                }
            });
        }
        return b0.f30125a;
    }
}
