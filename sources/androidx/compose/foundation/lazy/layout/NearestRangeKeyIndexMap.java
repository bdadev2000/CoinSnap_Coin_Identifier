package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;
import w0.g;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {

    /* renamed from: a, reason: collision with root package name */
    public final MutableObjectIntMap f4882a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4884c;

    public NearestRangeKeyIndexMap(g gVar, LazyLayoutIntervalContent lazyLayoutIntervalContent) {
        MutableIntervalList h2 = lazyLayoutIntervalContent.h();
        int i2 = gVar.f31406a;
        if (i2 < 0) {
            throw new IllegalStateException("negative nearestRange.first".toString());
        }
        int min = Math.min(gVar.f31407b, h2.f4880b - 1);
        if (min < i2) {
            MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f1548a;
            a.q(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
            this.f4882a = mutableObjectIntMap;
            this.f4883b = new Object[0];
            this.f4884c = 0;
            return;
        }
        int i3 = (min - i2) + 1;
        this.f4883b = new Object[i3];
        this.f4884c = i2;
        MutableObjectIntMap mutableObjectIntMap2 = new MutableObjectIntMap(i3);
        h2.c(i2, min, new NearestRangeKeyIndexMap$2$1(i2, min, mutableObjectIntMap2, this));
        this.f4882a = mutableObjectIntMap2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public final int b(Object obj) {
        MutableObjectIntMap mutableObjectIntMap = this.f4882a;
        int a2 = mutableObjectIntMap.a(obj);
        if (a2 >= 0) {
            return mutableObjectIntMap.f1547c[a2];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public final Object c(int i2) {
        int i3 = i2 - this.f4884c;
        if (i3 >= 0) {
            Object[] objArr = this.f4883b;
            a.s(objArr, "<this>");
            if (i3 <= objArr.length - 1) {
                return objArr[i3];
            }
        }
        return null;
    }
}
