package androidx.compose.animation;

import android.support.v4.media.d;
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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnimatedEnterExitMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedVisibilityScopeImpl f1681a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1682b;

    public AnimatedEnterExitMeasurePolicy(AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl) {
        this.f1681a = animatedVisibilityScopeImpl;
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
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j2) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            i2 = d.e((Measurable) list.get(i2), j2, arrayList, i2, 1);
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i3 = ((Placeable) obj).f15825a;
            int p2 = f0.p(arrayList);
            if (1 <= p2) {
                int i4 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i5 = ((Placeable) obj3).f15825a;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == p2) {
                        break;
                    }
                    i4++;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int i6 = placeable != null ? placeable.f15825a : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i7 = ((Placeable) obj2).f15826b;
            int p3 = f0.p(arrayList);
            if (1 <= p3) {
                int i8 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i8);
                    int i9 = ((Placeable) obj4).f15826b;
                    if (i7 < i9) {
                        obj2 = obj4;
                        i7 = i9;
                    }
                    if (i8 == p3) {
                        break;
                    }
                    i8++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        int i10 = placeable2 != null ? placeable2.f15826b : 0;
        boolean t02 = measureScope.t0();
        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = this.f1681a;
        if (t02) {
            this.f1682b = true;
            animatedVisibilityScopeImpl.f1771a.setValue(new IntSize(IntSizeKt.a(i6, i10)));
        } else if (!this.f1682b) {
            animatedVisibilityScopeImpl.f1771a.setValue(new IntSize(IntSizeKt.a(i6, i10)));
        }
        return measureScope.T(i6, i10, x.f30219a, new AnimatedEnterExitMeasurePolicy$measure$1(arrayList));
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
