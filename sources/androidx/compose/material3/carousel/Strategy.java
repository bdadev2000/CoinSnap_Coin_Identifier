package androidx.compose.material3.carousel;

import android.support.v4.media.d;
import androidx.collection.MutableFloatList;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import p0.a;
import w0.f;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Strategy {

    /* renamed from: m, reason: collision with root package name */
    public static final Strategy f12744m;

    /* renamed from: a, reason: collision with root package name */
    public final KeylineList f12745a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12746b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12747c;
    public final float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12748f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12749g;

    /* renamed from: h, reason: collision with root package name */
    public final float f12750h;

    /* renamed from: i, reason: collision with root package name */
    public final float f12751i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableFloatList f12752j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableFloatList f12753k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12754l;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    static {
        KeylineList keylineList = KeylineList.f12726h;
        w wVar = w.f30218a;
        f12744m = new Strategy(keylineList, wVar, wVar, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Strategy(KeylineList keylineList, List list, List list2, float f2, float f3, float f4, float f5) {
        this.f12745a = keylineList;
        this.f12746b = list;
        this.f12747c = list2;
        this.d = f2;
        this.e = f3;
        this.f12748f = f4;
        this.f12749g = f5;
        float max = list.isEmpty() ? 0.0f : Math.max(((Keyline) u.E0((List) u.L0(list))).f12723c - ((Keyline) u.E0((List) u.E0(list))).f12723c, f4);
        this.f12750h = max;
        float max2 = list2.isEmpty() ? 0.0f : Math.max(((Keyline) u.L0((List) u.E0(list2))).f12723c - ((Keyline) u.L0((List) u.L0(list2))).f12723c, f5);
        this.f12751i = max2;
        this.f12752j = StrategyKt.a(max, list, true);
        this.f12753k = StrategyKt.a(max2, list2, false);
        this.f12754l = (!(keylineList.f12727a.isEmpty() ^ true) || f2 == 0.0f || a() == 0.0f) ? false : true;
    }

    public final float a() {
        return this.f12745a.c().f12721a;
    }

    public final KeylineList b(float f2, float f3, boolean z2) {
        MutableFloatList mutableFloatList;
        List list;
        ShiftPointRange shiftPointRange;
        float max = Math.max(0.0f, f2);
        float max2 = Math.max(0.0f, f3 - this.f12751i);
        float f4 = this.f12750h;
        if (f4 <= max && max <= max2) {
            return this.f12745a;
        }
        float c2 = StrategyKt.c(1.0f, 0.0f, 0.0f, f4, max);
        if (max > max2) {
            c2 = StrategyKt.c(0.0f, 1.0f, max2, f3, max);
            mutableFloatList = this.f12753k;
            list = this.f12747c;
        } else {
            mutableFloatList = this.f12752j;
            list = this.f12746b;
        }
        int size = list.size();
        float a2 = mutableFloatList.a(0);
        f it = a.F0(1, size).iterator();
        while (true) {
            if (!it.f31411c) {
                shiftPointRange = new ShiftPointRange(0, 0, 0.0f);
                break;
            }
            int b2 = it.b();
            float a3 = mutableFloatList.a(b2);
            if (c2 <= a3) {
                shiftPointRange = new ShiftPointRange(b2 - 1, b2, StrategyKt.c(0.0f, 1.0f, a2, a3, c2));
                break;
            }
            a2 = a3;
        }
        int i2 = shiftPointRange.f12742b;
        int i3 = shiftPointRange.f12741a;
        float f5 = shiftPointRange.f12743c;
        if (z2) {
            if (a.t0(f5) == 0) {
                i2 = i3;
            }
            return (KeylineList) list.get(i2);
        }
        KeylineList keylineList = (KeylineList) list.get(i3);
        KeylineList keylineList2 = (KeylineList) list.get(i2);
        ArrayList arrayList = new ArrayList(keylineList.f12727a.size());
        int size2 = keylineList.f12727a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList.add(KeylineListKt.a(keylineList.get(i4), keylineList2.get(i4), f5));
        }
        return new KeylineList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z2 = this.f12754l;
        if (!z2 && !((Strategy) obj).f12754l) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z2 == strategy.f12754l && this.d == strategy.d && this.e == strategy.e && this.f12748f == strategy.f12748f && this.f12749g == strategy.f12749g && a() == strategy.a() && this.f12750h == strategy.f12750h && this.f12751i == strategy.f12751i && a.g(this.f12752j, strategy.f12752j) && a.g(this.f12753k, strategy.f12753k) && a.g(this.f12745a, strategy.f12745a);
    }

    public final int hashCode() {
        boolean z2 = this.f12754l;
        if (!z2) {
            return Boolean.hashCode(z2);
        }
        return this.f12745a.hashCode() + ((this.f12753k.hashCode() + ((this.f12752j.hashCode() + d.b(this.f12751i, d.b(this.f12750h, (Float.hashCode(a()) + d.b(this.f12749g, d.b(this.f12748f, d.b(this.e, d.b(this.d, Boolean.hashCode(z2) * 31, 31), 31), 31), 31)) * 31, 31), 31)) * 31)) * 31);
    }
}
