package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import d0.b0;
import e0.q;
import kotlin.jvm.internal.r;
import q0.l;
import w0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SeekableTransitionState$animateOneFrameLambda$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekableTransitionState f2185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateOneFrameLambda$1(SeekableTransitionState seekableTransitionState) {
        super(1);
        this.f2185a = seekableTransitionState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        SeekableTransitionState seekableTransitionState = this.f2185a;
        long j2 = longValue - seekableTransitionState.f2173l;
        seekableTransitionState.f2173l = longValue;
        long u02 = p0.a.u0(j2 / seekableTransitionState.f2177p);
        MutableObjectList mutableObjectList = seekableTransitionState.f2174m;
        int i2 = mutableObjectList.f1550b;
        int i3 = 0;
        if (i2 != 0) {
            Object[] objArr = mutableObjectList.f1549a;
            for (int i4 = 0; i4 < i2; i4++) {
                SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i4];
                SeekableTransitionState.g(seekableTransitionState, seekingAnimationState, u02);
                seekingAnimationState.f2181c = true;
            }
            Transition transition = seekableTransitionState.e;
            if (transition != null) {
                transition.p();
            }
            int i5 = mutableObjectList.f1550b;
            Object[] objArr2 = mutableObjectList.f1549a;
            g F0 = p0.a.F0(0, i5);
            int i6 = F0.f31406a;
            int i7 = F0.f31407b;
            if (i6 <= i7) {
                while (true) {
                    objArr2[i6 - i3] = objArr2[i6];
                    if (((SeekableTransitionState.SeekingAnimationState) objArr2[i6]).f2181c) {
                        i3++;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6++;
                }
            }
            q.W(i5 - i3, i5, objArr2);
            mutableObjectList.f1550b -= i3;
        }
        SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = seekableTransitionState.f2175n;
        if (seekingAnimationState2 != null) {
            seekingAnimationState2.f2183g = seekableTransitionState.f2167f;
            SeekableTransitionState.g(seekableTransitionState, seekingAnimationState2, u02);
            seekableTransitionState.p(seekingAnimationState2.d);
            if (seekingAnimationState2.d == 1.0f) {
                seekableTransitionState.f2175n = null;
            }
            seekableTransitionState.o();
        }
        return b0.f30125a;
    }
}
