package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TransitionKt$createChildTransitionInternal$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f2324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createChildTransitionInternal$1$1(Transition transition, Transition transition2) {
        super(1);
        this.f2323a = transition;
        this.f2324b = transition2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Transition transition = this.f2323a;
        SnapshotStateList snapshotStateList = transition.f2274j;
        final Transition transition2 = this.f2324b;
        snapshotStateList.add(transition2);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition.this.f2274j.remove(transition2);
            }
        };
    }
}
