package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public abstract class AH {
    public static String[] A00 = {"PM7DSx0y0lrec1UT4WPnkT9xVE7xO4Q3", "BEgdeY8scYjWDgLVGs4ZUut3Hirr2MX3", "ZAPPhI63uMybzXuqxrZ5dKdt3S18BPE9", "MM2rXOZDxF7k2VlV9Dcr24aSmfbMyxXV", "eywYp4IUfN7s09w4sjk3CdaIEMxiykZ2", "eISkZjTp9yJ8vcJJgc2cD29HnvZjEHrc", "bxIeMq2jLgGDMU", "MX4WpiU2EnoJ87vmil9r758WOfjNIsLN"};
    public static final AH A01 = new Y3();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract AF A0A(int i10, AF af2, boolean z10);

    public abstract AG A0D(int i10, AG ag2, boolean z10, long j3);

    public int A02(int i10, int i11, boolean z10) {
        switch (i11) {
            case 0:
                if (i10 == A06(z10)) {
                    return -1;
                }
                return i10 + 1;
            case 1:
                return i10;
            case 2:
                if (i10 == A06(z10)) {
                    return A05(z10);
                }
                return i10 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A03(int i10, AF af2, AG ag2, int i11, boolean z10) {
        int i12 = A09(i10, af2).A00;
        int windowIndex = A0B(i12, ag2).A01;
        if (windowIndex == i10) {
            int A02 = A02(i12, i11, z10);
            if (A00[1].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            A00[5] = "vHlQRfGLACzPc9SqhGGMQS9yx8mDrtQw";
            if (A02 == -1) {
                return -1;
            }
            AG A0B = A0B(A02, ag2);
            int nextWindowIndex = A00[6].length();
            if (nextWindowIndex == 14) {
                A00[5] = "g3EvwHO3x67yk3ScCmOHXM9FC4inpbOU";
                int windowIndex2 = A0B.A00;
                return windowIndex2;
            }
            String[] strArr = A00;
            strArr[4] = "oJT8BcC7iC9ashzghnGVZpN5rOviRVye";
            strArr[3] = "BXJ5tQfk704SS2XTm0iOlKfvNFhc4WVf";
            int windowIndex3 = A0B.A00;
            return windowIndex3;
        }
        int windowIndex4 = i10 + 1;
        return windowIndex4;
    }

    public int A05(boolean z10) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z10) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(AG ag2, AF af2, int i10, long j3) {
        return A08(ag2, af2, i10, j3, 0L);
    }

    public final Pair<Integer, Long> A08(AG ag2, AF af2, int i10, long j3, long j10) {
        AbstractC0626Ha.A00(i10, 0, A01());
        A0D(i10, ag2, false, j10);
        if (j3 == C.TIME_UNSET) {
            j3 = ag2.A01();
            if (A00[5].charAt(22) != '9') {
                throw new RuntimeException();
            }
            A00[0] = "jYNh2aRlntxjcST03zipQODHWrcZ3Q9N";
            if (j3 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = ag2.A00;
        long A03 = ag2.A03() + j3;
        long A07 = A09(i11, af2).A07();
        while (A07 != C.TIME_UNSET && A03 >= A07) {
            int i12 = ag2.A01;
            if (A00[1].charAt(27) == 'r') {
                String[] strArr = A00;
                strArr[7] = "IuvzXoPM3cIs3JU7ThgGmV6LQ39mYtz4";
                strArr[2] = "DGRaGmTIVAXEwTC12jYPgBDTgoVWDlIc";
                if (i11 >= i12) {
                    break;
                }
                A03 -= A07;
                i11++;
                A07 = A09(i11, af2).A07();
            } else {
                throw new RuntimeException();
            }
        }
        return Pair.create(Integer.valueOf(i11), Long.valueOf(A03));
    }

    public final AF A09(int i10, AF af2) {
        return A0A(i10, af2, false);
    }

    public final AG A0B(int i10, AG ag2) {
        return A0C(i10, ag2, false);
    }

    public final AG A0C(int i10, AG ag2, boolean z10) {
        return A0D(i10, ag2, z10, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i10, AF af2, AG ag2, int i11, boolean z10) {
        return A03(i10, af2, ag2, i11, z10) == -1;
    }
}
