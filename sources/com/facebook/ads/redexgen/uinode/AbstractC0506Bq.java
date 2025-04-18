package com.facebook.ads.redexgen.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0506Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C03384q A02;
    public final ArrayDeque<C03384q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0507Br> A04;
    public final PriorityQueue<C03384q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c52);

    public abstract boolean A0R();

    public AbstractC0506Bq() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C03384q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C03354n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C03384q c03384q) {
        c03384q.A07();
        this.A03.add(c03384q);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C0591Fp {
        AbstractC0626Ha.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        C03384q pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC0507Br A55() throws C0591Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1048Xr) this.A05.peek()).A00 <= this.A00) {
            C03384q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0507Br pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                A0K(poll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                WI A0N = A0N();
                if (!poll.A03()) {
                    AbstractC0507Br pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1048Xr) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c52) throws C0591Fp {
        AbstractC0626Ha.A03(c52 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c52.A03()) {
            A0K(this.A02);
        } else {
            C03384q c03384q = this.A02;
            long j3 = this.A01;
            this.A01 = 1 + j3;
            c03384q.A00 = j3;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0507Br abstractC0507Br) {
        abstractC0507Br.A07();
        this.A04.add(abstractC0507Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void AEV() {
    }

    @Override // com.facebook.ads.redexgen.uinode.WL
    public void AGB(long j3) {
        this.A00 = j3;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C03384q c03384q = this.A02;
        if (c03384q != null) {
            A0K(c03384q);
            this.A02 = null;
        }
    }
}
