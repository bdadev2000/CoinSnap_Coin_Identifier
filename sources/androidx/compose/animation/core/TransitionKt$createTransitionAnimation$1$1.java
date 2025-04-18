package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TransitionKt$createTransitionAnimation$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition.TransitionAnimationState f2328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createTransitionAnimation$1$1(Transition transition, Transition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.f2327a = transition;
        this.f2328b = transitionAnimationState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Transition transition = this.f2327a;
        SnapshotStateList snapshotStateList = transition.f2273i;
        final Transition.TransitionAnimationState transitionAnimationState = this.f2328b;
        snapshotStateList.add(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition.this.f2273i.remove(transitionAnimationState);
            }
        };
    }
}
