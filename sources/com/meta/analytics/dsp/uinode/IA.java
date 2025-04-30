package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: assets/audience_network.dex */
public final class IA {
    public static String[] A07 = {"5DRquCQGg5fv0P6nja7IsOodPXBGhUeG", "CLJKgVN4XJask5diLy7MGSBxba0Pch5a", "wHftqcE0jDwIdOqBDBC3mNx0B5SBQznZ", "ol9v552kFRhJ1T6A32CtEuz", "A1CuUzQu9jwyUqSqJ17msfwDUTn6GREa", "TbNgrGyLzvQfDvkF0WCoqwQu2K", "lR0XC8VxWttqZJTwOmQs4gh4fjIE6f", "2mBuumTUpjmiSXNoBcdi8fBRoWPOanRf"};
    public static final Comparator<I9> A08 = new I7();
    public static final Comparator<I9> A09 = new I8();
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final I9[] A06 = new I9[5];
    public final ArrayList<I9> A05 = new ArrayList<>();
    public int A00 = -1;

    public IA(int i9) {
        this.A04 = i9;
    }

    private void A00() {
        if (this.A00 != 1) {
            Collections.sort(this.A05, A08);
            this.A00 = 1;
        }
    }

    private void A01() {
        if (this.A00 != 0) {
            Collections.sort(this.A05, A09);
            this.A00 = 0;
        }
    }

    public final float A02(float f9) {
        A01();
        float f10 = this.A03 * f9;
        int i9 = 0;
        for (int i10 = 0; i10 < this.A05.size(); i10++) {
            I9 i92 = this.A05.get(i10);
            i9 += i92.A02;
            float desiredWeight = i9;
            if (desiredWeight >= f10) {
                float desiredWeight2 = i92.A00;
                return desiredWeight2;
            }
        }
        if (this.A05.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<I9> arrayList = this.A05;
        int size = arrayList.size();
        int accumulatedWeight = A07[3].length();
        if (accumulatedWeight == 12) {
            throw new RuntimeException();
        }
        A07[3] = "XkLaJBoD11zWycQ";
        float desiredWeight3 = arrayList.get(size - 1).A00;
        return desiredWeight3;
    }

    public final void A03(int i9, float f9) {
        I9 oldestSample;
        A00();
        int i10 = this.A02;
        if (i10 > 0) {
            I9[] i9Arr = this.A06;
            int i11 = i10 - 1;
            this.A02 = i11;
            oldestSample = i9Arr[i11];
        } else {
            oldestSample = new I9(null);
        }
        int i12 = this.A01;
        this.A01 = i12 + 1;
        oldestSample.A01 = i12;
        oldestSample.A02 = i9;
        oldestSample.A00 = f9;
        this.A05.add(oldestSample);
        this.A03 += i9;
        while (true) {
            int i13 = this.A03;
            int i14 = this.A04;
            if (i13 > i14) {
                int excessWeight = i13 - i14;
                I9 i92 = this.A05.get(0);
                if (i92.A02 <= excessWeight) {
                    int i15 = this.A03;
                    int i16 = i92.A02;
                    if (A07[5].length() != 26) {
                        throw new RuntimeException();
                    }
                    A07[6] = "uvvU8EqEwFGMOcNu2z1EziqDegtCkn";
                    this.A03 = i15 - i16;
                    this.A05.remove(0);
                    int excessWeight2 = this.A02;
                    if (excessWeight2 < 5) {
                        I9[] i9Arr2 = this.A06;
                        this.A02 = excessWeight2 + 1;
                        i9Arr2[excessWeight2] = i92;
                    }
                } else {
                    i92.A02 -= excessWeight;
                    this.A03 -= excessWeight;
                }
            } else {
                return;
            }
        }
    }
}
