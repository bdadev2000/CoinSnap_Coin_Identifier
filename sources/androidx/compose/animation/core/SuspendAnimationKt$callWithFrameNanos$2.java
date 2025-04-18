package androidx.compose.animation.core;

import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SuspendAnimationKt$callWithFrameNanos$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$callWithFrameNanos$2(l lVar) {
        super(1);
        this.f2259a = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return this.f2259a.invoke(Long.valueOf(((Number) obj).longValue()));
    }
}
