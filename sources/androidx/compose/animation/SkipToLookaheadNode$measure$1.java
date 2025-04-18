package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SkipToLookaheadNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SkipToLookaheadNode f1965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Placeable f1966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1967c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f1968f;

    /* renamed from: androidx.compose.animation.SkipToLookaheadNode$measure$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final Object invoke(Object obj) {
            GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
            graphicsLayerScope.e(ScaleFactor.a(0L));
            graphicsLayerScope.k(ScaleFactor.b(0L));
            graphicsLayerScope.G0(TransformOriginKt.a(0.0f, 0.0f));
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadNode$measure$1(SkipToLookaheadNode skipToLookaheadNode, Placeable placeable, long j2, long j3, MeasureScope measureScope) {
        super(1);
        this.f1965a = skipToLookaheadNode;
        this.f1966b = placeable;
        this.f1967c = j2;
        this.d = j3;
        this.f1968f = measureScope;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        SkipToLookaheadNode skipToLookaheadNode = this.f1965a;
        ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) skipToLookaheadNode.f1963p.getValue();
        if (!((Boolean) ((q0.a) skipToLookaheadNode.f1964q.getValue()).invoke()).booleanValue() || scaleToBoundsImpl == null) {
            placementScope.e(this.f1966b, 0, 0, 0.0f);
            return b0.f30125a;
        }
        long j2 = this.f1967c;
        int i2 = (int) (j2 >> 32);
        if (i2 != 0 && ((int) (j2 & 4294967295L)) != 0) {
            IntSizeKt.c(j2);
            IntSizeKt.c(this.d);
            throw null;
        }
        long a2 = ScaleFactorKt.a(1.0f, 1.0f);
        p0.a.t0(ScaleFactor.a(a2) * i2);
        p0.a.t0(ScaleFactor.b(a2) * ((int) (j2 & 4294967295L)));
        this.f1968f.getLayoutDirection();
        throw null;
    }
}
