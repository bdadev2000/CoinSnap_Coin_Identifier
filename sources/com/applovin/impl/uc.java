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

    /* renamed from: a, reason: collision with root package name */
    private final sg f11578a = new sg();
    private final TreeSet b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f11579c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f11580d;

    /* renamed from: e, reason: collision with root package name */
    private int f11581e;

    public uc(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void a() {
        this.f11579c.clear();
        this.b.clear();
    }

    public int b(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return i9 + a(i9 - 1, false);
    }

    public int c(int i9) {
        return i9 + a(i9, false);
    }

    public int d(int i9) {
        if (g(i9)) {
            return -1;
        }
        return i9 - a(i9, true);
    }

    public Collection e(int i9) {
        return new TreeSet((SortedSet) this.b.tailSet(Integer.valueOf(i9), false));
    }

    public void f(int i9) {
        int b = this.f11578a.b(Integer.valueOf(i9));
        for (int size = this.f11578a.size() - 1; size >= b; size--) {
            Integer num = (Integer) this.f11578a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.f11578a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i9) {
        return this.f11578a.contains(Integer.valueOf(i9));
    }

    public boolean h(int i9) {
        return this.b.contains(Integer.valueOf(i9));
    }

    public void i(int i9) {
        int b = this.f11578a.b(Integer.valueOf(i9));
        if (g(i9)) {
            this.f11579c.remove(Integer.valueOf(i9));
            this.b.remove(Integer.valueOf(i9));
            this.f11578a.b(b);
        }
        while (b < this.f11578a.size()) {
            Integer num = (Integer) this.f11578a.a(b);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.f11578a.a(b, Integer.valueOf(intValue));
            b++;
        }
    }

    public void b(int i9, int i10) {
        i(i9);
        f(i10);
    }

    public int c() {
        int i9 = this.f11580d;
        if (i9 != -1 && this.f11581e != -1) {
            while (i9 <= this.f11581e) {
                if (g(i9) && !h(i9)) {
                    return i9;
                }
                i9++;
            }
        }
        return -1;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f11579c.remove(num);
            this.b.remove(num);
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.b);
    }

    public void c(int i9, int i10) {
        this.f11580d = i9;
        this.f11581e = i10;
    }

    public MaxAd a(int i9) {
        return (MaxAd) this.f11579c.get(Integer.valueOf(i9));
    }

    private int a(int i9, boolean z8) {
        int c9 = this.f11578a.c(Integer.valueOf(i9));
        if (!z8) {
            int i10 = i9 + c9;
            while (c9 < this.f11578a.size() && i10 >= ((Integer) this.f11578a.a(c9)).intValue()) {
                i10++;
                c9++;
            }
        }
        return c9;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.t.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f11578a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f11578a.isEmpty()) {
            this.f11578a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.f11578a.a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f11578a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f11578a.add(Integer.valueOf(intValue));
            }
        }
    }

    public void a(MaxAd maxAd, int i9) {
        this.f11579c.put(Integer.valueOf(i9), maxAd);
        this.b.add(Integer.valueOf(i9));
    }

    private void a(int i9, int i10) {
        if (this.f11579c.containsKey(Integer.valueOf(i9))) {
            this.f11579c.put(Integer.valueOf(i10), (MaxAd) this.f11579c.get(Integer.valueOf(i9)));
            this.b.add(Integer.valueOf(i10));
            this.f11579c.remove(Integer.valueOf(i9));
            this.b.remove(Integer.valueOf(i9));
        }
    }
}
