package androidx.compose.material3.carousel;

import java.util.List;
import p0.a;

/* loaded from: classes4.dex */
public final class KeylineSnapPositionKt {
    public static final int a(Strategy strategy, int i2, int i3) {
        if (!strategy.f12754l) {
            return 0;
        }
        KeylineList keylineList = strategy.f12745a;
        int i4 = keylineList.f12731g - keylineList.f12730f;
        List list = strategy.f12746b;
        int size = list.size() + i4;
        List list2 = strategy.f12747c;
        int size2 = list2.size() + i4;
        int t02 = a.t0(keylineList.c().f12723c - (strategy.a() / 2.0f));
        if (i2 < size) {
            t02 = a.t0(((KeylineList) list.get(Math.min(list.size() - 1, Math.max(0, (size - 1) - i2)))).c().f12723c - (strategy.a() / 2.0f));
        }
        if (i3 <= i4 + 1 || i2 < i3 - size2) {
            return t02;
        }
        return a.t0(((KeylineList) list2.get(Math.min(list2.size() - 1, Math.max(0, (i2 - i3) + size2)))).c().f12723c - (strategy.a() / 2.0f));
    }
}
