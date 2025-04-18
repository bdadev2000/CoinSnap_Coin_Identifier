package com.facebook.ads.redexgen.uinode;

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

    public IA(int i10) {
        this.A04 = i10;
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

    public final float A02(float f10) {
        A01();
        float f11 = this.A03 * f10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.A05.size(); i11++) {
            I9 i92 = this.A05.get(i11);
            i10 += i92.A02;
            float desiredWeight = i10;
            if (desiredWeight >= f11) {
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

    public final void A03(int i10, float f10) {
        I9 oldestSample;
        A00();
        int i11 = this.A02;
        if (i11 > 0) {
            I9[] i9Arr = this.A06;
            int i12 = i11 - 1;
            this.A02 = i12;
            oldestSample = i9Arr[i12];
        } else {
            oldestSample = new I9(null);
        }
        int i13 = this.A01;
        this.A01 = i13 + 1;
        oldestSample.A01 = i13;
        oldestSample.A02 = i10;
        oldestSample.A00 = f10;
        this.A05.add(oldestSample);
        this.A03 += i10;
        while (true) {
            int i14 = this.A03;
            int i15 = this.A04;
            if (i14 > i15) {
                int excessWeight = i14 - i15;
                I9 i92 = this.A05.get(0);
                if (i92.A02 <= excessWeight) {
                    int i16 = this.A03;
                    int i17 = i92.A02;
                    if (A07[5].length() != 26) {
                        throw new RuntimeException();
                    }
                    A07[6] = "uvvU8EqEwFGMOcNu2z1EziqDegtCkn";
                    this.A03 = i16 - i17;
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
