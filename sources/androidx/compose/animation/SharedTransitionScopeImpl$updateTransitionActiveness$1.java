package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class SharedTransitionScopeImpl$updateTransitionActiveness$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f1924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$updateTransitionActiveness$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f1924a = sharedTransitionScopeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        SharedTransitionScopeImpl sharedTransitionScopeImpl = this.f1924a;
        MutableScatterMap mutableScatterMap = sharedTransitionScopeImpl.f1921j;
        Object[] objArr = mutableScatterMap.f1558b;
        Object[] objArr2 = mutableScatterMap.f1559c;
        long[] jArr = mutableScatterMap.f1557a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j2 & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            ((SharedElement) objArr2[i5]).getClass();
                            throw null;
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (sharedTransitionScopeImpl.a()) {
            sharedTransitionScopeImpl.f1916c.setValue(Boolean.FALSE);
            Object[] objArr3 = mutableScatterMap.f1558b;
            Object[] objArr4 = mutableScatterMap.f1559c;
            long[] jArr2 = mutableScatterMap.f1557a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr2[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj3 = objArr3[i9];
                                ((SharedElement) objArr4[i9]).getClass();
                                throw null;
                            }
                            j3 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        Object[] objArr5 = mutableScatterMap.f1558b;
        Object[] objArr6 = mutableScatterMap.f1559c;
        long[] jArr3 = mutableScatterMap.f1557a;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i10 = 0;
            while (true) {
                long j4 = jArr3[i10];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length3)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j4 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj4 = objArr5[i13];
                            ((SharedElement) objArr6[i13]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length3) {
                    break;
                }
                i10++;
            }
        }
        SharedTransitionScopeKt.b().e(sharedTransitionScopeImpl, sharedTransitionScopeImpl.f1917f, sharedTransitionScopeImpl.d);
        return b0.f30125a;
    }
}
