package androidx.compose.foundation.gestures.snapping;

import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$result$1$animationState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f3693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1$animationState$1(c0 c0Var, l lVar) {
        super(1);
        this.f3693a = c0Var;
        this.f3694b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        c0 c0Var = this.f3693a;
        float f2 = c0Var.f30922a - floatValue;
        c0Var.f30922a = f2;
        this.f3694b.invoke(Float.valueOf(f2));
        return b0.f30125a;
    }
}
