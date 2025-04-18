package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class SharedTransitionScopeImpl$observeAnimatingBlock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f1922a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$observeAnimatingBlock$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(0);
        this.f1922a = sharedTransitionScopeImpl;
    }

    @Override // q0.a
    public final Object invoke() {
        MutableScatterMap mutableScatterMap = this.f1922a.f1921j;
        Object[] objArr = mutableScatterMap.f1558b;
        Object[] objArr2 = mutableScatterMap.f1559c;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            loop0: while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                if (((SharedElement) objArr2[i5]).e()) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                            i4++;
                        }
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return b0.f30125a;
    }
}
