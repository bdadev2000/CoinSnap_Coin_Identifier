package androidx.compose.animation.core;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SeekableTransitionState$firstFrameLambda$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$firstFrameLambda$1(SeekableTransitionState seekableTransitionState) {
        super(1);
        this.f2196a = seekableTransitionState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f2196a.f2173l = ((Number) obj).longValue();
        return b0.f30125a;
    }
}
