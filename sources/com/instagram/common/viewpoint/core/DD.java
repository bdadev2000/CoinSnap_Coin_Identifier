package com.instagram.common.viewpoint.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: assets/audience_network.dex */
public abstract class DD implements XQ {
    public static String[] A06 = {"z2muy9QJdv6UNqkrRX5Tg36TVvjaRGqW", "YxwD1MugG7ZhXNTXvxibfreR7ej", "rT3nprJIB6deoGRocSgDtQnW", "BfDIjN", "UzZd8wX", "7tX", "IQas6CvLP2cXmM1lvwO9WgYKNIICj7B2", "QvQ"};
    public long A00;
    public long A01;
    public C02824q A02;
    public final ArrayDeque<C02824q> A03 = new ArrayDeque<>();
    public final ArrayDeque<DM> A04;
    public final PriorityQueue<C02824q> A05;

    public abstract XN A0N();

    public abstract void A0P(DO r1);

    public abstract boolean A0R();

    public DD() {
        for (int i2 = 0; i2 < 10; i2++) {
            this.A03.add(new C02824q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i3 = 0; i3 < 2; i3++) {
            this.A04.add(new C02794n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C02824q c02824q) {
        c02824q.A07();
        this.A03.add(c02824q);
    }

    @Override // com.instagram.common.viewpoint.core.BG
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public DO A5Q() throws C0541Fu {
        AbstractC0576Hf.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.BG
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public DM A5R() throws C0541Fu {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1023Yw) this.A05.peek()).A00 <= this.A00) {
            C02824q poll = this.A05.poll();
            if (poll.A04()) {
                DM outputBuffer = this.A04.pollFirst();
                outputBuffer.A00(4);
                A0K(poll);
                return outputBuffer;
            }
            A0P(poll);
            if (A0R()) {
                XN A0N = A0N();
                if (!poll.A03()) {
                    DM pollFirst = this.A04.pollFirst();
                    pollFirst.A09(((C1023Yw) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.BG
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEj(DO r6) throws C0541Fu {
        AbstractC0576Hf.A03(r6 == this.A02);
        if (r6.A03()) {
            A0K(this.A02);
        } else {
            C02824q c02824q = this.A02;
            long j2 = this.A01;
            this.A01 = 1 + j2;
            c02824q.A00 = j2;
            if (A06[6].charAt(25) == 'n') {
                throw new RuntimeException();
            }
            A06[0] = "AtrTuyLMED6qzWt7DVqAVoSQD1pO5Y9g";
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(DM dm) {
        dm.A07();
        this.A04.add(dm);
    }

    @Override // com.instagram.common.viewpoint.core.BG
    public void AEy() {
    }

    @Override // com.instagram.common.viewpoint.core.XQ
    public void AGb(long j2) {
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.BG
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        if (this.A02 != null) {
            A0K(this.A02);
            this.A02 = null;
        }
    }
}
