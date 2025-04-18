package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class EG {
    public static byte[] A0F;
    public static String[] A0G = {"68X6mTnOwXdfZzYVO84LiBNlITu89iQX", "mcCM", "SB1U", "GkXNtRrGsWIfNkCQn88aLdXmD8Z6vhvm", "Qey5CsRmzWj382X", "n9", "Qz1jsOzCfP5BXHleCyslZPCOD1Jlt2Hf", "OEfF4KTHhKUz1ci9ksApPyeCZN0rEDYT"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C0550Dw A09;
    public final EL A0A;
    public final ArrayList<ED> A0B;
    public final ArrayList<ED> A0C;
    public final CopyOnWriteArraySet<E9> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{6, 69, 74, 71, 85, 78, 67, 85, 6, 81, 79, 82, 78, 6, 62, 36, 64, 117, 33, 109, 100, 96, 114, 117, 33, 110, 111, 100, 33, 69, 100, 114, 100, 115, 104, 96, 109, 104, 123, 100, 115, 33, 104, 114, 33, 115, 100, 112, 116, 104, 115, 100, 101, 47, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Byte.MAX_VALUE, 122, 115, 54, Byte.MAX_VALUE, 57, 121, 42, Ascii.US, Ascii.CR, Ascii.NAK, 94, Ascii.ETB, Ascii.CR, 94, Ascii.US, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.SUB, 9, 60, 46, 54, 125, 46, 41, 60, 41, 56, 125, 52, 46, 125, 62, 53, 60, 51, 58, 56, 57};
    }

    static {
        A0C();
    }

    public EG(EL el, int i10, int i11, File file, DownloadAction.Deserializer... deserializerArr) {
        AbstractC0626Ha.A05(deserializerArr.length > 0, A05(16, 38, 36));
        this.A0A = el;
        this.A04 = i10;
        this.A05 = i11;
        this.A09 = new C0550Dw(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        HandlerThread handlerThread = new HandlerThread(A05(54, 24, 51));
        this.A08 = handlerThread;
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ED A02(DownloadAction downloadAction) {
        int i10 = this.A00;
        this.A00 = i10 + 1;
        ED ed2 = new ED(i10, this, downloadAction, this.A05, null);
        this.A0C.add(ed2);
        A0J(A05(78, 13, 91), ed2);
        return ed2;
    }

    private void A08() {
        this.A06.post(new E7(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<E9> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[3].charAt(7) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "Uj";
            strArr[4] = "M47RheKcpZxFkBs";
            if (hasNext) {
                it.next().ABg(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction A06;
        boolean z10;
        if (!this.A02 || this.A03) {
            return;
        }
        int i10 = (this.A01 || this.A0B.size() == this.A04) ? 1 : 0;
        for (int i11 = 0; i11 < this.A0C.size(); i11++) {
            ED ed2 = this.A0C.get(i11);
            boolean A0H = ED.A0H(ed2);
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "ZZ";
            strArr[4] = "k3SOhcJE6F5rWIN";
            if (A0H && ((z10 = (A06 = ED.A06(ed2)).A03) || i10 == 0)) {
                boolean z11 = true;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        break;
                    }
                    ED ed3 = this.A0C.get(i12);
                    boolean skipDownloadActions = ED.A06(ed3).A09(A06);
                    if (skipDownloadActions) {
                        if (z10) {
                            z11 = false;
                            String str = ed2 + A05(0, 14, 3) + ed3;
                            ED.A0C(ed3);
                        } else {
                            boolean skipDownloadActions2 = ED.A06(ed3).A03;
                            if (skipDownloadActions2) {
                                z11 = false;
                                i10 = 1;
                                break;
                            }
                        }
                    }
                    i12++;
                }
                if (z11) {
                    ED.A0D(ed2);
                    if (!z10) {
                        this.A0B.add(ed2);
                        i10 = this.A0B.size() == this.A04 ? 1 : 0;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i10 = 0; i10 < this.A0C.size(); i10++) {
            downloadActionArr[i10] = ED.A06(this.A0C.get(i10));
        }
        this.A06.post(new E8(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(ED ed2) {
        A0J(A05(91, 21, 120), ed2);
        EF A0K = ed2.A0K();
        Iterator<E9> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            A0G[0] = "TUrgn6We5nsrVkZlQG2KUeV0nEHaGaai";
            if (hasNext) {
                it.next().ADI(this, A0K);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(ED ed2) {
        if (this.A03) {
            return;
        }
        boolean z10 = !ed2.A0L();
        if (z10) {
            this.A0B.remove(ed2);
        }
        A0D(ed2);
        if (A0G[3].charAt(7) == 'd') {
            throw new RuntimeException();
        }
        A0G[6] = "xCRZPuTuqF5VhljpIGNZbvIN3H6gjFvE";
        boolean stopped = ed2.A0M();
        if (stopped) {
            this.A0C.remove(ed2);
            A0B();
        }
        if (z10) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, ED ed2) {
        String str2 = str + A05(14, 2, 33) + ed2;
    }

    public final int A0O(DownloadAction downloadAction) {
        AbstractC0626Ha.A04(!this.A03);
        ED A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (ED.A03(A02) == 0) {
                A0D(A02);
            }
        }
        return ED.A04(A02);
    }

    public final void A0P() {
        AbstractC0626Ha.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(E9 e92) {
        this.A0D.add(e92);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0R() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            r3 = 1
            r0 = r0 ^ r3
            com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A04(r0)
            boolean r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.ED> r0 = r4.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.ED> r0 = r4.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.ED r0 = (com.facebook.ads.redexgen.uinode.ED) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EG.A0R():boolean");
    }

    public final EF[] A0S() {
        AbstractC0626Ha.A04(!this.A03);
        EF[] efArr = new EF[this.A0C.size()];
        for (int i10 = 0; i10 < efArr.length; i10++) {
            efArr[i10] = this.A0C.get(i10).A0K();
        }
        return efArr;
    }
}
