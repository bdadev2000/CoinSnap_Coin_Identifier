package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SnapFlingBehaviorKt$animateWithTarget$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3716c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateWithTarget$2(float f2, c0 c0Var, ScrollScope scrollScope, l lVar) {
        super(1);
        this.f3714a = f2;
        this.f3715b = c0Var;
        this.f3716c = scrollScope;
        this.d = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        float c2 = SnapFlingBehaviorKt.c(((Number) animationScope.e.getValue()).floatValue(), this.f3714a);
        c0 c0Var = this.f3715b;
        float f2 = c2 - c0Var.f30922a;
        float a2 = this.f3716c.a(f2);
        this.d.invoke(Float.valueOf(a2));
        if (Math.abs(f2 - a2) > 0.5f || c2 != ((Number) animationScope.e.getValue()).floatValue()) {
            animationScope.a();
        }
        c0Var.f30922a += a2;
        return b0.f30125a;
    }
}
