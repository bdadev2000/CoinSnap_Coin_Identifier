package com.meta.analytics.dsp.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1072Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C09044q A02;
    public final ArrayDeque<C09044q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC1073Br> A04;
    public final PriorityQueue<C09044q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c52);

    public abstract boolean A0R();

    public AbstractC1072Bq() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.A03.add(new C09044q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i10 = 0; i10 < 2; i10++) {
            this.A04.add(new C09014n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C09044q c09044q) {
        c09044q.A07();
        this.A03.add(c09044q);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C5 A54() throws C1157Fp {
        AbstractC1192Ha.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        C09044q pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC1073Br A55() throws C1157Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1614Xr) this.A05.peek()).A00 <= this.A00) {
            C09044q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC1073Br pollFirst = this.A04.pollFirst();
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
                    AbstractC1073Br pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1614Xr) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C5 c52) throws C1157Fp {
        AbstractC1192Ha.A03(c52 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c52.A03()) {
            A0K(this.A02);
        } else {
            C09044q c09044q = this.A02;
            long j7 = this.A01;
            this.A01 = 1 + j7;
            c09044q.A00 = j7;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC1073Br abstractC1073Br) {
        abstractC1073Br.A07();
        this.A04.add(abstractC1073Br);
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void AEV() {
    }

    @Override // com.meta.analytics.dsp.uinode.WL
    public void AGB(long j7) {
        this.A00 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C09044q c09044q = this.A02;
        if (c09044q != null) {
            A0K(c09044q);
            this.A02 = null;
        }
    }
}
