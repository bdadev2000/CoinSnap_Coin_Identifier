package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SnapFlingBehaviorKt$animateDecay$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f3706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollScope f3708c;
    public final /* synthetic */ l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehaviorKt$animateDecay$2(float f2, c0 c0Var, ScrollScope scrollScope, l lVar) {
        super(1);
        this.f3706a = f2;
        this.f3707b = c0Var;
        this.f3708c = scrollScope;
        this.d = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        float abs = Math.abs(((Number) animationScope.e.getValue()).floatValue());
        float f2 = this.f3706a;
        float abs2 = Math.abs(f2);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.e;
        l lVar = this.d;
        ScrollScope scrollScope = this.f3708c;
        c0 c0Var = this.f3707b;
        if (abs >= abs2) {
            float c2 = SnapFlingBehaviorKt.c(((Number) parcelableSnapshotMutableState.getValue()).floatValue(), f2);
            float f3 = c2 - c0Var.f30922a;
            float a2 = scrollScope.a(f3);
            lVar.invoke(Float.valueOf(a2));
            if (Math.abs(f3 - a2) > 0.5f) {
                animationScope.a();
            }
            animationScope.a();
            c0Var.f30922a = c2;
        } else {
            float floatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue() - c0Var.f30922a;
            float f4 = SnapFlingBehaviorKt.f3701a;
            float a3 = scrollScope.a(floatValue);
            lVar.invoke(Float.valueOf(a3));
            if (Math.abs(floatValue - a3) > 0.5f) {
                animationScope.a();
            }
            c0Var.f30922a = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
        }
        return b0.f30125a;
    }
}
