package androidx.compose.animation.core;

import android.support.v4.media.d;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.Arrays;

@Immutable
/* loaded from: classes2.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KeyframesSpecConfig f2130a;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class KeyframeEntity<T> extends KeyframeBaseEntity<T> {

        /* renamed from: c, reason: collision with root package name */
        public int f2131c;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KeyframeEntity)) {
                return false;
            }
            KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
            return p0.a.g(keyframeEntity.f2128a, this.f2128a) && p0.a.g(keyframeEntity.f2129b, this.f2129b) && keyframeEntity.f2131c == this.f2131c;
        }

        public final int hashCode() {
            Object obj = this.f2128a;
            return this.f2129b.hashCode() + d.c(this.f2131c, (obj != null ? obj.hashCode() : 0) * 31, 31);
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class KeyframesSpecConfig<T> extends KeyframesSpecBaseConfig<T, KeyframeEntity<T>> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.animation.core.KeyframesSpec$KeyframeEntity, java.lang.Object, androidx.compose.animation.core.KeyframeBaseEntity] */
        public final KeyframeEntity a(int i2, Float f2) {
            ?? keyframeBaseEntity = new KeyframeBaseEntity(f2, EasingKt.d);
            keyframeBaseEntity.f2131c = 0;
            this.f2133b.i(i2, keyframeBaseEntity);
            return keyframeBaseEntity;
        }
    }

    public KeyframesSpec(KeyframesSpecConfig keyframesSpecConfig) {
        this.f2130a = keyframesSpecConfig;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final VectorizedKeyframesSpec a(TwoWayConverter twoWayConverter) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i2;
        KeyframesSpecConfig keyframesSpecConfig = this.f2130a;
        MutableIntList mutableIntList = new MutableIntList(keyframesSpecConfig.f2133b.e + 2);
        MutableIntObjectMap mutableIntObjectMap = keyframesSpecConfig.f2133b;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap(mutableIntObjectMap.e);
        int[] iArr3 = mutableIntObjectMap.f1440b;
        Object[] objArr3 = mutableIntObjectMap.f1441c;
        long[] jArr = mutableIntObjectMap.f1439a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j2 & 255) < 128) {
                            int i7 = (i3 << 3) + i6;
                            int i8 = iArr3[i7];
                            KeyframeEntity keyframeEntity = (KeyframeEntity) objArr3[i7];
                            mutableIntList.b(i8);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            mutableIntObjectMap2.i(i8, new VectorizedKeyframeSpecElementInfo((AnimationVector) twoWayConverter.a().invoke(keyframeEntity.f2128a), keyframeEntity.f2129b, keyframeEntity.f2131c));
                            i2 = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i2 = i4;
                        }
                        j2 >>= i2;
                        i6++;
                        i4 = i2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!mutableIntObjectMap.a(0)) {
            int i9 = mutableIntList.f1434b;
            if (i9 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + mutableIntList.f1434b);
            }
            mutableIntList.c(i9 + 1);
            int[] iArr4 = mutableIntList.f1433a;
            int i10 = mutableIntList.f1434b;
            if (i10 != 0) {
                q.O(1, 0, i10, iArr4, iArr4);
            }
            iArr4[0] = 0;
            mutableIntList.f1434b++;
        }
        if (!mutableIntObjectMap.a(keyframesSpecConfig.f2132a)) {
            mutableIntList.b(keyframesSpecConfig.f2132a);
        }
        int i11 = mutableIntList.f1434b;
        if (i11 != 0) {
            int[] iArr5 = mutableIntList.f1433a;
            p0.a.s(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i11);
        }
        return new VectorizedKeyframesSpec(mutableIntList, mutableIntObjectMap2, keyframesSpecConfig.f2132a, EasingKt.d);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return a(VectorConvertersKt.f2340a);
    }
}
