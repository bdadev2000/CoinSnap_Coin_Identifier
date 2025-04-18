package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public class zc {

    /* renamed from: a, reason: collision with root package name */
    private final vg f28319a = new vg();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f28320b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f28321c = new HashMap();
    private int d;
    private int e;

    public zc(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public void a() {
        this.f28321c.clear();
        this.f28320b.clear();
    }

    public int b(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i2 + a(i2 - 1, false);
    }

    public void c(int i2, int i3) {
        this.d = i2;
        this.e = i3;
    }

    public int d(int i2) {
        if (g(i2)) {
            return -1;
        }
        return i2 - a(i2, true);
    }

    public Collection e(int i2) {
        return new TreeSet((SortedSet) this.f28320b.tailSet(Integer.valueOf(i2), false));
    }

    public void f(int i2) {
        int b2 = this.f28319a.b(Integer.valueOf(i2));
        for (int size = this.f28319a.size() - 1; size >= b2; size--) {
            Integer num = (Integer) this.f28319a.a(size);
            int intValue = num.intValue() + 1;
            a(num.intValue(), intValue);
            this.f28319a.a(size, Integer.valueOf(intValue));
        }
    }

    public boolean g(int i2) {
        return this.f28319a.contains(Integer.valueOf(i2));
    }

    public boolean h(int i2) {
        return this.f28320b.contains(Integer.valueOf(i2));
    }

    public void i(int i2) {
        int b2 = this.f28319a.b(Integer.valueOf(i2));
        if (g(i2)) {
            this.f28321c.remove(Integer.valueOf(i2));
            this.f28320b.remove(Integer.valueOf(i2));
            this.f28319a.b(b2);
        }
        while (b2 < this.f28319a.size()) {
            Integer num = (Integer) this.f28319a.a(b2);
            int intValue = num.intValue() - 1;
            a(num.intValue(), intValue);
            this.f28319a.a(b2, Integer.valueOf(intValue));
            b2++;
        }
    }

    public void b(int i2, int i3) {
        i(i2);
        f(i3);
    }

    public int c(int i2) {
        return i2 + a(i2, false);
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f28321c.remove(num);
            this.f28320b.remove(num);
        }
    }

    public int c() {
        int i2 = this.d;
        if (i2 != -1 && this.e != -1) {
            while (i2 <= this.e) {
                if (g(i2) && !h(i2)) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f28320b);
    }

    public MaxAd a(int i2) {
        return (MaxAd) this.f28321c.get(Integer.valueOf(i2));
    }

    private int a(int i2, boolean z2) {
        int c2 = this.f28319a.c(Integer.valueOf(i2));
        if (!z2) {
            int i3 = i2 + c2;
            while (c2 < this.f28319a.size() && i3 >= ((Integer) this.f28319a.a(c2)).intValue()) {
                i3++;
                c2++;
            }
        }
        return c2;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.n.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f28319a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f28319a.isEmpty()) {
            this.f28319a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int intValue = ((Integer) this.f28319a.a()).intValue();
        while (true) {
            intValue += repeatingInterval;
            if (this.f28319a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f28319a.add(Integer.valueOf(intValue));
            }
        }
    }

    public void a(MaxAd maxAd, int i2) {
        this.f28321c.put(Integer.valueOf(i2), maxAd);
        this.f28320b.add(Integer.valueOf(i2));
    }

    private void a(int i2, int i3) {
        if (this.f28321c.containsKey(Integer.valueOf(i2))) {
            this.f28321c.put(Integer.valueOf(i3), (MaxAd) this.f28321c.get(Integer.valueOf(i2)));
            this.f28320b.add(Integer.valueOf(i3));
            this.f28321c.remove(Integer.valueOf(i2));
            this.f28320b.remove(Integer.valueOf(i2));
        }
    }
}
