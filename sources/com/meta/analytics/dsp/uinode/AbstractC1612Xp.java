package com.meta.analytics.dsp.uinode;

import com.meta.analytics.dsp.uinode.AbstractC1613Xq;
import com.meta.analytics.dsp.uinode.C1614Xr;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1612Xp<I extends C1614Xr, O extends AbstractC1613Xq, E extends Exception> implements BB<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i9, O o3, boolean z8);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0020 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC1612Xp(I[] r4, O[] r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.A07 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A09 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A0A = r0
            r3.A0B = r4
            int r0 = r4.length
            r3.A00 = r0
            r2 = 0
        L1e:
            int r0 = r3.A00
            if (r2 >= r0) goto L2d
            I extends com.facebook.ads.redexgen.X.Xr[] r1 = r3.A0B
            com.facebook.ads.redexgen.X.Xr r0 = r3.A0T()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L1e
        L2d:
            r3.A0C = r5
            int r0 = r5.length
            r3.A01 = r0
            r2 = 0
        L33:
            int r0 = r3.A01
            if (r2 >= r0) goto L42
            O extends com.facebook.ads.redexgen.X.Xq[] r1 = r3.A0C
            com.facebook.ads.redexgen.X.Xq r0 = r3.A0V()
            r1[r2] = r0
            int r2 = r2 + 1
            goto L33
        L42:
            com.facebook.ads.redexgen.X.BE r0 = new com.facebook.ads.redexgen.X.BE
            r0.<init>(r3)
            r3.A08 = r0
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC1612Xp.<init>(com.facebook.ads.redexgen.X.Xr[], com.facebook.ads.redexgen.X.Xq[]):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e4 = this.A04;
        if (e4 == null) {
        } else {
            throw e4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (InterruptedException e4) {
                throw new IllegalStateException(e4);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0N(I inputBuffer) {
        inputBuffer.A07();
        I[] iArr = this.A0B;
        int i9 = this.A00;
        this.A00 = i9 + 1;
        iArr[i9] = inputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private void A0O(O outputBuffer) {
        outputBuffer.A07();
        O[] oArr = this.A0C;
        int i9 = this.A01;
        this.A01 = i9 + 1;
        oArr[i9] = outputBuffer;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I removeFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i9 = this.A01 - 1;
            this.A01 = i9;
            O o3 = oArr[i9];
            boolean z8 = this.A05;
            this.A05 = false;
            if (removeFirst.A04()) {
                o3.A00(4);
            } else {
                if (removeFirst.A03()) {
                    o3.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = A0W(removeFirst, o3, z8);
                } catch (OutOfMemoryError e4) {
                    this.A04 = A0X(e4);
                } catch (RuntimeException e9) {
                    this.A04 = A0X(e9);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o3);
                } else if (o3.A03()) {
                    this.A02++;
                    A0O(o3);
                } else {
                    o3.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o3);
                }
                A0N(removeFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A54() throws Exception {
        I i9;
        synchronized (this.A07) {
            A0L();
            AbstractC1192Ha.A04(this.A03 == null);
            int i10 = this.A00;
            if (i10 == 0) {
                i9 = null;
            } else {
                I[] iArr = this.A0B;
                int i11 = i10 - 1;
                this.A00 = i11;
                i9 = iArr[i11];
            }
            this.A03 = i9;
        }
        return i9;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A55() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public final void A0Y(int i9) {
        AbstractC1192Ha.A04(this.A00 == this.A0B.length);
        for (I i10 : this.A0B) {
            i10.A09(i9);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void AEG(I inputBuffer) throws Exception {
        synchronized (this.A07) {
            A0L();
            AbstractC1192Ha.A03(inputBuffer == this.A03);
            this.A09.addLast(inputBuffer);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    public void A0a(O outputBuffer) {
        synchronized (this.A07) {
            A0O(outputBuffer);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    public final void AEV() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Xp != com.facebook.ads.internal.exoplayer2.thirdparty.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.Xr, O extends com.facebook.ads.redexgen.X.Xq, E extends java.lang.Exception> */
    @Override // com.meta.analytics.dsp.uinode.BB
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            I i9 = this.A03;
            if (i9 != null) {
                A0N(i9);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
