package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class IF {
    public static final Comparator<IE> A07 = new IC();
    public static final Comparator<IE> A08 = new ID();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final IE[] A06 = new IE[5];
    public final ArrayList<IE> A05 = new ArrayList<>();
    public int A00 = -1;

    public IF(int i2) {
        this.A04 = i2;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A07);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A08);
            this.A00 = 0;
        }
    }

    public final float A02(float f2) {
        A01();
        float f3 = this.A03 * f2;
        int i2 = 0;
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            IE ie = this.A05.get(i3);
            i2 += ie.A02;
            float desiredWeight = i2;
            if (desiredWeight >= f3) {
                float desiredWeight2 = ie.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        float desiredWeight3 = this.A05.get(this.A05.size() - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i2, float f2) {
        IE oldestSample;
        A00();
        if (this.A02 > 0) {
            IE[] ieArr = this.A06;
            int i3 = this.A02 - 1;
            this.A02 = i3;
            oldestSample = ieArr[i3];
        } else {
            oldestSample = new IE(null);
        }
        int i4 = this.A01;
        this.A01 = i4 + 1;
        oldestSample.A01 = i4;
        oldestSample.A02 = i2;
        oldestSample.A00 = f2;
        this.A05.add(oldestSample);
        this.A03 += i2;
        while (this.A03 > this.A04) {
            int excessWeight = this.A03 - this.A04;
            IE ie = this.A05.get(0);
            if (ie.A02 <= excessWeight) {
                this.A03 -= ie.A02;
                this.A05.remove(0);
                if (this.A02 < 5) {
                    IE[] ieArr2 = this.A06;
                    int excessWeight2 = this.A02;
                    this.A02 = excessWeight2 + 1;
                    ieArr2[excessWeight2] = ie;
                }
            } else {
                ie.A02 -= excessWeight;
                this.A03 -= excessWeight;
            }
        }
    }
}
