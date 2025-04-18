package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import b1.f0;
import e0.u;
import e0.w;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import p0.a;
import q0.p;
import w0.e;
import w0.f;

@StabilityInferred
/* loaded from: classes.dex */
public final class CarouselPageSize implements PageSize {

    /* renamed from: a, reason: collision with root package name */
    public final p f12713a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12714b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12715c;
    public final ParcelableSnapshotMutableState d;

    public CarouselPageSize(p pVar, float f2, float f3) {
        ParcelableSnapshotMutableState f4;
        this.f12713a = pVar;
        this.f12714b = f2;
        this.f12715c = f3;
        f4 = SnapshotStateKt.f(Strategy.f12744m, StructuralEqualityPolicy.f14078a);
        this.d = f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    @Override // androidx.compose.foundation.pager.PageSize
    public final int a(Density density, int i2, int i3) {
        w wVar;
        int i4;
        w wVar2;
        Object obj;
        w wVar3;
        w wVar4;
        int i5;
        int i6;
        Object obj2;
        w wVar5;
        float f2 = i2;
        float f3 = i3;
        KeylineList keylineList = (KeylineList) this.f12713a.invoke(Float.valueOf(f2), Float.valueOf(f3));
        float f4 = this.f12714b;
        float f5 = this.f12715c;
        boolean isEmpty = keylineList.f12727a.isEmpty();
        w wVar6 = w.f30218a;
        if (isEmpty) {
            w wVar7 = wVar6;
            wVar = wVar7;
            wVar4 = wVar7;
        } else {
            ?? arrayList = new ArrayList();
            arrayList.add(keylineList);
            float f6 = keylineList.c().f12722b - (keylineList.c().f12721a / 2);
            int i7 = keylineList.f12729c;
            if (f6 < 0.0f || !a.g(keylineList.c(), keylineList.get(i7))) {
                ?? r15 = arrayList;
                int i8 = keylineList.f12730f - i7;
                if (i8 > 0 || keylineList.c().f12725g <= 0.0f) {
                    int i9 = 0;
                    while (i9 < i8) {
                        KeylineList keylineList2 = (KeylineList) u.L0(r15);
                        int i10 = i7 + i9;
                        int p2 = f0.p(keylineList);
                        if (i10 > 0) {
                            float f7 = keylineList.get(i10 - 1).f12721a;
                            keylineList2.getClass();
                            i4 = i8;
                            wVar2 = wVar6;
                            f it = new e(keylineList2.f12731g, f0.p(keylineList2), 1).iterator();
                            while (true) {
                                if (!it.f31411c) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (keylineList2.get(((Number) obj).intValue()).f12721a == f7) {
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            p2 = (num != null ? num.intValue() : f0.p(keylineList2)) - 1;
                        } else {
                            i4 = i8;
                            wVar2 = wVar6;
                        }
                        r15.add(StrategyKt.d(keylineList2, i7, p2, f2, f3));
                        i9++;
                        i8 = i4;
                        wVar6 = wVar2;
                    }
                    wVar = wVar6;
                    wVar4 = r15;
                    if (f4 != 0.0f) {
                        r15.set(f0.p(r15), StrategyKt.b((KeylineList) u.L0(r15), f2, f3, f4, ((KeylineList) u.L0(r15)).c(), ((KeylineList) u.L0(r15)).f12730f));
                        wVar4 = r15;
                    }
                } else {
                    r15.add(StrategyKt.d(keylineList, 0, 0, f2, f3));
                    wVar3 = r15;
                }
            } else if (f4 == 0.0f) {
                wVar3 = arrayList;
            } else {
                ?? r152 = arrayList;
                r152.add(StrategyKt.b(keylineList, f2, f3, f4, keylineList.c(), keylineList.f12730f));
                wVar3 = r152;
            }
            wVar = wVar6;
            wVar4 = wVar3;
        }
        if (keylineList.f12727a.isEmpty()) {
            wVar5 = wVar;
        } else {
            ?? arrayList2 = new ArrayList();
            arrayList2.add(keylineList);
            float f8 = (keylineList.d().f12721a / 2) + keylineList.d().f12722b;
            int i11 = keylineList.d;
            if (f8 > f2 || !a.g(keylineList.d(), keylineList.get(i11))) {
                int i12 = i11 - keylineList.f12731g;
                if (i12 > 0 || keylineList.d().f12725g <= 0.0f) {
                    int i13 = 0;
                    while (i13 < i12) {
                        KeylineList keylineList3 = (KeylineList) u.L0(arrayList2);
                        int i14 = i11 - i13;
                        if (i14 < f0.p(keylineList)) {
                            float f9 = keylineList.get(i14 + 1).f12721a;
                            int i15 = keylineList3.f12730f - 1;
                            i5 = i12;
                            f fVar = new f(i15, q.f(i15, 0, -1), -1);
                            while (true) {
                                if (!fVar.f31411c) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = fVar.next();
                                if (keylineList3.get(((Number) obj2).intValue()).f12721a == f9) {
                                    break;
                                }
                            }
                            Integer num2 = (Integer) obj2;
                            i6 = (num2 != null ? num2.intValue() : 0) + 1;
                        } else {
                            i5 = i12;
                            i6 = 0;
                        }
                        arrayList2.add(StrategyKt.d(keylineList3, i11, i6, f2, f3));
                        i13++;
                        i12 = i5;
                    }
                    if (f5 != 0.0f) {
                        arrayList2.set(f0.p(arrayList2), StrategyKt.b((KeylineList) u.L0(arrayList2), f2, f3, -f5, ((KeylineList) u.L0(arrayList2)).d(), ((KeylineList) u.L0(arrayList2)).f12731g));
                    }
                } else {
                    arrayList2.add(StrategyKt.d(keylineList, 0, 0, f2, f3));
                }
            } else if (f5 != 0.0f) {
                arrayList2.add(StrategyKt.b(keylineList, f2, f3, -f5, keylineList.d(), keylineList.f12731g));
            }
            wVar5 = arrayList2;
        }
        Strategy strategy = new Strategy(keylineList, wVar4, wVar5, f2, f3, f4, f5);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.d;
        parcelableSnapshotMutableState.setValue(strategy);
        return ((Strategy) parcelableSnapshotMutableState.getValue()).f12754l ? a.t0(((Strategy) parcelableSnapshotMutableState.getValue()).a()) : i2;
    }
}
