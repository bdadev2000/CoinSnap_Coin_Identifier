package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import b1.f0;
import e0.x;
import java.util.List;
import w0.e;
import w0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedContentTransitionScopeImpl f1663a;

    public AnimatedContentMeasurePolicy(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f1663a = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).s(i2));
            int p2 = f0.p(list);
            int i3 = 1;
            if (1 <= p2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).s(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == p2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).S(i2));
            int p2 = f0.p(list);
            int i3 = 1;
            if (1 <= p2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).S(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == p2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Placeable placeable2;
        int i2;
        int size = list.size();
        Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        long j3 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            placeable = null;
            if (i4 >= size2) {
                break;
            }
            Measurable measurable = (Measurable) list.get(i4);
            Object m2 = measurable.m();
            AnimatedContentTransitionScopeImpl.ChildData childData = m2 instanceof AnimatedContentTransitionScopeImpl.ChildData ? (AnimatedContentTransitionScopeImpl.ChildData) m2 : null;
            if (childData != null && ((Boolean) childData.f1671a.getValue()).booleanValue()) {
                Placeable V = measurable.V(j2);
                long a2 = IntSizeKt.a(V.f15825a, V.f15826b);
                placeableArr[i4] = V;
                j3 = a2;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Measurable measurable2 = (Measurable) list.get(i5);
            if (placeableArr[i5] == null) {
                placeableArr[i5] = measurable2.V(j2);
            }
        }
        if (measureScope.t0()) {
            i2 = (int) (j3 >> 32);
        } else {
            if (size == 0) {
                placeable2 = null;
            } else {
                placeable2 = placeableArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = placeable2 != null ? placeable2.f15825a : 0;
                    f it = new e(1, i6, 1).iterator();
                    while (it.f31411c) {
                        Placeable placeable3 = placeableArr[it.b()];
                        int i8 = placeable3 != null ? placeable3.f15825a : 0;
                        if (i7 < i8) {
                            placeable2 = placeable3;
                            i7 = i8;
                        }
                    }
                }
            }
            i2 = placeable2 != null ? placeable2.f15825a : 0;
        }
        if (measureScope.t0()) {
            i3 = (int) (4294967295L & j3);
        } else {
            if (size != 0) {
                placeable = placeableArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int i10 = placeable != null ? placeable.f15826b : 0;
                    f it2 = new e(1, i9, 1).iterator();
                    while (it2.f31411c) {
                        Placeable placeable4 = placeableArr[it2.b()];
                        int i11 = placeable4 != null ? placeable4.f15826b : 0;
                        if (i10 < i11) {
                            placeable = placeable4;
                            i10 = i11;
                        }
                    }
                }
            }
            if (placeable != null) {
                i3 = placeable.f15826b;
            }
        }
        if (!measureScope.t0()) {
            this.f1663a.f1670c.setValue(new IntSize(IntSizeKt.a(i2, i3)));
        }
        return measureScope.T(i2, i3, x.f30219a, new AnimatedContentMeasurePolicy$measure$3(placeableArr, this, i2, i3));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).K(i2));
            int p2 = f0.p(list);
            int i3 = 1;
            if (1 <= p2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).K(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == p2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).R(i2));
            int p2 = f0.p(list);
            int i3 = 1;
            if (1 <= p2) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).R(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == p2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
