package com.instagram.common.viewpoint.core;

import android.util.Pair;

/* loaded from: assets/audience_network.dex */
public abstract class AM {
    public static String[] A00 = {"IexUQhYz8RUJUtV2yarZNq98m", "SqA0rybJc2Jt0Ub7DMrjeUwUZAoVo8qv", "DxKx9aNXAj7QPQdQDSbsmk09wXoOPMXu", "S07tUDZ51Jgo3YfQ92rRpWn9afvBt6KZ", "soNl1VU97OXHQ4CjHAobgeJ4Yx1tI1qy", "ZprKdiaQVhEf0JuCZOvliqNdbLoAvnqm", "6MSYafjKTbgzk4635", "p5W86Vx2FooSJmLWV"};
    public static final AM A01 = new Z8();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract AK A0A(int i2, AK ak, boolean z2);

    public abstract AL A0D(int i2, AL al, boolean z2, long j2);

    public int A02(int i2, int i3, boolean z2) {
        switch (i3) {
            case 0:
                if (i2 == A06(z2)) {
                    return -1;
                }
                return i2 + 1;
            case 1:
                return i2;
            case 2:
                if (i2 == A06(z2)) {
                    return A05(z2);
                }
                return i2 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i2, AK ak, AL al, int i3, boolean z2) {
        int i4 = A09(i2, ak).A00;
        int windowIndex = A0B(i4, al).A01;
        if (windowIndex == i2) {
            int A02 = A02(i4, i3, z2);
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[3];
            int charAt = str.charAt(18);
            int windowIndex2 = str2.charAt(18);
            if (charAt != windowIndex2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "n5aRHXbmzoQSsyEqE";
            strArr2[6] = "TNiQeaFqL1JGSvg6B";
            if (A02 == -1) {
                return -1;
            }
            int windowIndex3 = A0B(A02, al).A00;
            return windowIndex3;
        }
        int windowIndex4 = i2 + 1;
        return windowIndex4;
    }

    public int A05(boolean z2) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z2) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(AL al, AK ak, int i2, long j2) {
        return A08(al, ak, i2, j2, 0L);
    }

    public final Pair<Integer, Long> A08(AL al, AK ak, int i2, long j2, long j3) {
        AbstractC0576Hf.A00(i2, 0, A01());
        A0D(i2, al, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = al.A01();
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = al.A00;
        long periodPositionUs = al.A03() + j2;
        long A07 = A09(i3, ak).A07();
        while (A07 != -9223372036854775807L && periodPositionUs >= A07 && i3 < al.A01) {
            periodPositionUs -= A07;
            i3++;
            A07 = A09(i3, ak).A07();
        }
        return Pair.create(Integer.valueOf(i3), Long.valueOf(periodPositionUs));
    }

    public final AK A09(int i2, AK ak) {
        return A0A(i2, ak, false);
    }

    public final AL A0B(int i2, AL al) {
        return A0C(i2, al, false);
    }

    public final AL A0C(int i2, AL al, boolean z2) {
        return A0D(i2, al, z2, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i2, AK ak, AL al, int i3, boolean z2) {
        return A03(i2, ak, al, i3, z2) == -1;
    }
}
