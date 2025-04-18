package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.ObjectFloatMap;
import p0.a;

/* loaded from: classes2.dex */
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectFloatMap f3393a;

    public MapDraggableAnchors(MutableObjectFloatMap mutableObjectFloatMap) {
        this.f3393a = mutableObjectFloatMap;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object a(float f2, boolean z2) {
        ObjectFloatMap objectFloatMap = this.f3393a;
        Object[] objArr = objectFloatMap.f1543b;
        float[] fArr = objectFloatMap.f1544c;
        long[] jArr = objectFloatMap.f1542a;
        int length = jArr.length - 2;
        Object obj = null;
        if (length >= 0) {
            float f3 = Float.POSITIVE_INFINITY;
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            float f4 = fArr[i5];
                            float f5 = z2 ? f4 - f2 : f2 - f4;
                            if (f5 < 0.0f) {
                                f5 = Float.POSITIVE_INFINITY;
                            }
                            if (f5 <= f3) {
                                f3 = f5;
                                obj = obj2;
                            }
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
        return obj;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final Object b(float f2) {
        ObjectFloatMap objectFloatMap = this.f3393a;
        Object[] objArr = objectFloatMap.f1543b;
        float[] fArr = objectFloatMap.f1544c;
        long[] jArr = objectFloatMap.f1542a;
        int length = jArr.length - 2;
        Object obj = null;
        if (length >= 0) {
            float f3 = Float.POSITIVE_INFINITY;
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            float abs = Math.abs(f2 - fArr[i5]);
                            if (abs <= f3) {
                                f3 = abs;
                                obj = obj2;
                            }
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
        return obj;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final boolean c(Object obj) {
        return this.f3393a.a(obj) >= 0;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float d() {
        ObjectFloatMap objectFloatMap = this.f3393a;
        if (objectFloatMap.e == 1) {
            return Float.NaN;
        }
        float[] fArr = objectFloatMap.f1544c;
        long[] jArr = objectFloatMap.f1542a;
        int length = jArr.length - 2;
        float f2 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            float f3 = fArr[(i2 << 3) + i4];
                            if (f3 <= f2) {
                                f2 = f3;
                            }
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
        return f2;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float e(Object obj) {
        ObjectFloatMap objectFloatMap = this.f3393a;
        int a2 = objectFloatMap.a(obj);
        if (a2 >= 0) {
            return objectFloatMap.f1544c[a2];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDraggableAnchors)) {
            return false;
        }
        return a.g(this.f3393a, ((MapDraggableAnchors) obj).f3393a);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public final float f() {
        ObjectFloatMap objectFloatMap = this.f3393a;
        if (objectFloatMap.e == 1) {
            return Float.NaN;
        }
        float[] fArr = objectFloatMap.f1544c;
        long[] jArr = objectFloatMap.f1542a;
        int length = jArr.length - 2;
        float f2 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j2) < 128) {
                            float f3 = fArr[(i2 << 3) + i4];
                            if (f3 >= f2) {
                                f2 = f3;
                            }
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
        return f2;
    }

    public final int hashCode() {
        return this.f3393a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f3393a + ')';
    }
}
