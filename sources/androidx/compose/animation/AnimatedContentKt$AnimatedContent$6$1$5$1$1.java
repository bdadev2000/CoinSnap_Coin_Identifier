package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class AnimatedContentKt$AnimatedContent$6$1$5$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f1652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f1654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$5$1$1(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.f1652a = snapshotStateList;
        this.f1653b = obj;
        this.f1654c = animatedContentTransitionScopeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Object obj2 = this.f1653b;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.f1654c;
        final SnapshotStateList snapshotStateList = this.f1652a;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                SnapshotStateList snapshotStateList2 = SnapshotStateList.this;
                Object obj3 = obj2;
                snapshotStateList2.remove(obj3);
                animatedContentTransitionScopeImpl.d.i(obj3);
            }
        };
    }
}
