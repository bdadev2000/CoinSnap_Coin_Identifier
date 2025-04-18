package androidx.compose.animation.core;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Transition$totalDurationNanos$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2310a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition transition) {
        super(0);
        this.f2310a = transition;
    }

    @Override // q0.a
    public final Object invoke() {
        return Long.valueOf(this.f2310a.b());
    }
}
