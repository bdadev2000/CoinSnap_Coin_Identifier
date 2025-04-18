package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class uc {
    private final sg a = new sg();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f8363b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f8364c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f8365d;

    /* renamed from: e, reason: collision with root package name */
    private int f8366e;

    public uc(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void a() {
        this.f8364c.clear();
        this.f8363b.clear();
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f8363b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int b3 = this.a.b(Integer.valueOf(i10));
        for (int size = this.a.size() - 1; size >= b3; size--) {
            Integer num = (Integer) this.a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i10) {
        return this.a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f8363b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int b3 = this.a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f8364c.remove(Integer.valueOf(i10));
            this.f8363b.remove(Integer.valueOf(i10));
            this.a.b(b3);
        }
        while (b3 < this.a.size()) {
            Integer num = (Integer) this.a.a(b3);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.a.a(b3, Integer.valueOf(intValue));
            b3++;
        }
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public int c() {
        int i10 = this.f8365d;
        if (i10 != -1 && this.f8366e != -1) {
            while (i10 <= this.f8366e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f8364c.remove(num);
            this.f8363b.remove(num);
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f8363b);
    }

    public void c(int i10, int i11) {
        this.f8365d = i10;
        this.f8366e = i11;
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f8364c.get(Integer.valueOf(i10));
    }

    private int a(int i10, boolean z10) {
        int c10 = this.a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + c10;
            while (c10 < this.a.size() && i11 >= ((Integer) this.a.a(c10)).intValue()) {
                i11++;
                c10++;
            }
        }
        return c10;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.t.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.a.isEmpty()) {
            this.a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.a.a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.a.add(Integer.valueOf(intValue));
            }
        }
    }

    public void a(MaxAd maxAd, int i10) {
        this.f8364c.put(Integer.valueOf(i10), maxAd);
        this.f8363b.add(Integer.valueOf(i10));
    }

    private void a(int i10, int i11) {
        if (this.f8364c.containsKey(Integer.valueOf(i10))) {
            this.f8364c.put(Integer.valueOf(i11), (MaxAd) this.f8364c.get(Integer.valueOf(i10)));
            this.f8363b.add(Integer.valueOf(i11));
            this.f8364c.remove(Integer.valueOf(i10));
            this.f8363b.remove(Integer.valueOf(i10));
        }
    }
}
