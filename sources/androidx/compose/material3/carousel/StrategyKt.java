package androidx.compose.material3.carousel;

import androidx.collection.FloatListKt;
import androidx.collection.MutableFloatList;
import androidx.compose.ui.util.MathHelpersKt;
import b1.f0;
import e0.q;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import p0.a;
import w0.f;
import w0.g;

/* loaded from: classes3.dex */
public final class StrategyKt {
    public static final MutableFloatList a(float f2, List list, boolean z2) {
        int i2 = FloatListKt.f1412a;
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.b(0.0f);
        if (f2 != 0.0f && !list.isEmpty()) {
            g F0 = a.F0(1, list.size());
            ArrayList arrayList = new ArrayList(q.M(F0, 10));
            f it = F0.iterator();
            while (it.f31411c) {
                int b2 = it.b();
                int i3 = b2 - 1;
                KeylineList keylineList = (KeylineList) list.get(i3);
                KeylineList keylineList2 = (KeylineList) list.get(b2);
                mutableFloatList.b(b2 == f0.p(list) ? 1.0f : mutableFloatList.a(i3) + ((z2 ? ((Keyline) u.E0(keylineList2)).f12723c - ((Keyline) u.E0(keylineList)).f12723c : ((Keyline) u.L0(keylineList)).f12723c - ((Keyline) u.L0(keylineList2)).f12723c) / f2));
                arrayList.add(Boolean.TRUE);
            }
        }
        return mutableFloatList;
    }

    public static final KeylineList b(KeylineList keylineList, float f2, float f3, float f4, Keyline keyline, int i2) {
        ArrayList arrayList = new ArrayList(keylineList.f12727a.size());
        int size = keylineList.f12727a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = keylineList.get(i3);
            if (!keyline2.e) {
                arrayList.add(keyline2);
            }
        }
        float size2 = f4 / arrayList.size();
        float f5 = (keyline.f12722b - (size2 / 2.0f)) + f4;
        StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1 strategyKt$createShiftedKeylineListForContentPadding$newKeylines$1 = new StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1(keylineList, size2);
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        strategyKt$createShiftedKeylineListForContentPadding$newKeylines$1.invoke(keylineListScopeImpl);
        ArrayList b2 = KeylineListScopeImpl.b(i2, f5, keylineListScopeImpl.f12732a, keylineListScopeImpl.c(), keylineListScopeImpl.f12733b, f2, f3, keylineListScopeImpl.f12734c);
        KeylineList keylineList2 = new KeylineList(b2);
        ArrayList arrayList2 = new ArrayList(b2.size());
        int size3 = b2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Keyline keyline3 = keylineList2.get(i4);
            arrayList2.add(new Keyline(keyline3.f12721a, keyline3.f12722b, keylineList.get(i4).f12723c, keyline3.d, keyline3.e, keyline3.f12724f, keyline3.f12725g));
        }
        return new KeylineList(arrayList2);
    }

    public static final float c(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : MathHelpersKt.b(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static final KeylineList d(KeylineList keylineList, int i2, int i3, float f2, float f3) {
        int i4 = i2 > i3 ? 1 : -1;
        float f4 = ((keylineList.get(i2).f12721a - keylineList.get(i2).f12725g) + f3) * i4;
        int i5 = keylineList.f12728b;
        int i6 = i5 + i4;
        float f5 = keylineList.get(i5).f12722b + f4;
        StrategyKt$moveKeylineAndCreateShiftedKeylineList$1 strategyKt$moveKeylineAndCreateShiftedKeylineList$1 = new StrategyKt$moveKeylineAndCreateShiftedKeylineList$1(keylineList, i2, i3);
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        strategyKt$moveKeylineAndCreateShiftedKeylineList$1.invoke(keylineListScopeImpl);
        return new KeylineList(KeylineListScopeImpl.b(i6, f5, keylineListScopeImpl.f12732a, keylineListScopeImpl.c(), keylineListScopeImpl.f12733b, f2, f3, keylineListScopeImpl.f12734c));
    }
}
