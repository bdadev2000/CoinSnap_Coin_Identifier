package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0511Ed implements ZB {
    public static byte[] A0M;
    public static String[] A0N = {"w8VAAYxajCwIoAYYjD3lLavMTkUOaMKn", "LsuplI2AFLx33t6glLoweUUwBxsDM6eJ", "n5ZpgNe8kAkQTw0twR8R0sU4HpYvcw33", "rwAXW1DnXASIJgDkZIisH2bihwrxiuKR", "nh92Wxhsr0aH2lO7Xy4xTBv2WwV0hwN3", "", "RFoFjGknfB0i2", "f5Io1mcG5jEJO"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C03909h A05;
    public A1 A06;
    public A2 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0510Ec A0E;
    public final AK A0F;
    public final AL A0G;
    public final AbstractC0559Go A0H;
    public final C0560Gp A0I;
    public final ArrayDeque<C03949l> A0J;
    public final CopyOnWriteArraySet<A5> A0K;
    public final ZA[] A0L;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{-35, 24, -48, 3, -6, -37, -9, -20, 4, -16, -3, -44, -8, -5, -9, 37, 88, 79, 48, 76, 65, 89, 69, 82, 44, 73, 66, 15, 18, 14, 24, 14, 20, 4, 41, 36, 47, -37, -64, -45, -38, -45, -49, -31, -45, -114, 14, -35, -96, -37, 34, 20, 20, 26, 3, 30, -49, 24, 22, 29, 30, 33, 20, 19, -49, 17, 20, 18, 16, 36, 34, 20, -49, 16, 29, -49, 16, 19, -49, 24, 34, -49, 31, 27, 16, 40, 24, 29, 22};
    }

    static {
        A03();
    }

    public C0511Ed(ZA[] zaArr, AbstractC0559Go abstractC0559Go, InterfaceC04049w interfaceC04049w, InterfaceC0579Hi interfaceC0579Hi) {
        Log.i(A02(2, 13, 30), A02(33, 5, 78) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 80) + A02(15, 18, Opcodes.DREM) + A02(47, 3, 19) + IK.A04 + A02(46, 1, 68));
        AbstractC0576Hf.A04(zaArr.length > 0);
        this.A0L = (ZA[]) AbstractC0576Hf.A01(zaArr);
        this.A0H = (AbstractC0559Go) AbstractC0576Hf.A01(abstractC0559Go);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new C0560Gp(new AG[zaArr.length], new InterfaceC0556Gl[zaArr.length], null);
        this.A0G = new AL();
        this.A0F = new AK();
        this.A07 = A2.A05;
        final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0C = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.9k
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    C0511Ed.this.A0A(msg);
                } catch (Throwable th) {
                    KQ.A00(th, this);
                }
            }
        };
        this.A06 = new A1(AM.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0510Ec(zaArr, abstractC0559Go, this.A0I, interfaceC04049w, this.A0A, this.A03, this.A0B, this.A0C, this, interfaceC0579Hi);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j2) {
        long A01 = AbstractC03849b.A01(j2);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return A01 + positionMs;
        }
        return A01;
    }

    private A1 A01(boolean z2, boolean z3, int i2) {
        C0560Gp c0560Gp;
        if (z2) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A74();
            this.A00 = A07();
            this.A04 = A71();
        }
        AM am = z3 ? AM.A01 : this.A06.A03;
        Object obj = z3 ? null : this.A06.A07;
        Et et = this.A06.A04;
        long j2 = this.A06.A02;
        long j3 = this.A06.A01;
        TrackGroupArray trackGroupArray = z3 ? TrackGroupArray.A04 : this.A06.A05;
        if (z3) {
            c0560Gp = this.A0I;
        } else {
            c0560Gp = this.A06.A06;
        }
        return new A1(am, obj, et, j2, j3, i2, false, trackGroupArray, c0560Gp);
    }

    private void A04(A1 a12, int i2, boolean z2, int i3) {
        int i4;
        A1 a13 = a12;
        this.A02 -= i2;
        if (this.A02 == 0) {
            if (a13.A02 == -9223372036854775807L) {
                a13 = a13.A04(a13.A04, 0L, a13.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && a13.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                if (A0N[2].charAt(11) == 'f') {
                    throw new RuntimeException();
                }
                A0N[2] = "I0z9XBogSeP4xaPMoEVv8Y3CsXKu0t6N";
                this.A04 = 0L;
            }
            if (this.A08) {
                i4 = 0;
            } else {
                i4 = 2;
            }
            boolean z3 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(a13, z2, i3, i4, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final A1 a12, final boolean z2, final int i2, final int i3, final boolean z3, final boolean z4) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C03949l> arrayDeque = this.A0J;
        final A1 a13 = this.A06;
        final CopyOnWriteArraySet<A5> copyOnWriteArraySet = this.A0K;
        final AbstractC0559Go abstractC0559Go = this.A0H;
        final boolean z5 = this.A0A;
        arrayDeque.addLast(new Object(a12, a13, copyOnWriteArraySet, abstractC0559Go, z2, i2, i3, z3, z5, z4) { // from class: com.facebook.ads.redexgen.X.9l
            public static String[] A0C = {"KYzLQiBmn0FiQRjPmzMoZyTMXJUCYazH", "8ZWwkBEIP5GpfkYlq", "GsiX37b8ObJA1d3iwpzM", "DZldgTYE3duYcDTffrrsish34ss3C", "owziJE4ETQEY5DqdH7kHnL5e4jEZYH", "elngO9mL6FpjJEe4il6taIIRZ5n02WzG", "vc3a7vRG", "Ibw5ifPZZc9LdA"};
            public final int A00;
            public final int A01;
            public final A1 A02;
            public final AbstractC0559Go A03;
            public final Set<A5> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = a12;
                this.A04 = copyOnWriteArraySet;
                this.A03 = abstractC0559Go;
                this.A08 = z2;
                this.A00 = i2;
                this.A01 = i3;
                this.A09 = z3;
                this.A06 = z5;
                this.A07 = z4 || a13.A00 != a12.A00;
                this.A0A = (a13.A03 == a12.A03 && a13.A07 == a12.A07) ? false : true;
                this.A05 = a13.A08 != a12.A08;
                this.A0B = a13.A06 != a12.A06;
            }

            public final void A00() {
                Iterator<A5> it;
                if (this.A0A || this.A01 == 0) {
                    Iterator<A5> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().ADm(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (A5 listener : this.A04) {
                        listener.ADA(this.A00);
                    }
                }
                boolean z6 = this.A0B;
                if (A0C[0].charAt(4) == 'F') {
                    throw new RuntimeException();
                }
                A0C[0] = "NSO1YjE0K80ooc4jlLY2PvdGV0yqHKRo";
                if (z6) {
                    this.A03.A0U(this.A02.A06.A02);
                    Set<A5> set = this.A04;
                    String[] strArr = A0C;
                    if (strArr[1].length() != strArr[2].length()) {
                        A0C[0] = "IX8AzuZF3sh97knAPev8KtZkbQXBOL0k";
                        it = set.iterator();
                    } else {
                        String[] strArr2 = A0C;
                        strArr2[7] = "IystOXtUMajZr4";
                        strArr2[6] = "BmaC5zCJ";
                        it = set.iterator();
                    }
                    while (it.hasNext()) {
                        it.next().ADp(this.A02.A05, this.A02.A06.A01);
                    }
                }
                if (this.A05) {
                    for (A5 listener2 : this.A04) {
                        listener2.ACY(this.A02.A08);
                    }
                }
                if (this.A07) {
                    Iterator<A5> it3 = this.A04.iterator();
                    while (it3.hasNext()) {
                        it3.next().AD8(this.A06, this.A02.A00);
                    }
                }
                boolean z7 = this.A09;
                if (A0C[5].charAt(19) == 't') {
                    String[] strArr3 = A0C;
                    strArr3[3] = "rZ5iCKv2iyJCL3c8gXhMhKHhXlzWd";
                    strArr3[4] = "JkBTkyzl6HurESuXa9ju20RiiMzRa3";
                    if (!z7) {
                        return;
                    }
                } else if (!z7) {
                    return;
                }
                Iterator<A5> it4 = this.A04.iterator();
                while (it4.hasNext()) {
                    it4.next().ADX();
                }
            }
        });
        this.A06 = a12;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i2) {
        A09(i2, -9223372036854775807L);
    }

    public final void A09(int i2, long j2) {
        long A00;
        AM am = this.A06.A03;
        if (i2 < 0 || (!am.A0E() && i2 >= am.A01())) {
            throw new C04039v(am, i2, j2);
        }
        this.A09 = true;
        this.A02++;
        if (A0B()) {
            Log.w(A02(2, 13, 30), A02(50, 39, 66));
            this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
            return;
        }
        this.A01 = i2;
        if (am.A0E()) {
            this.A04 = j2 == -9223372036854775807L ? 0L : j2;
            this.A00 = 0;
        } else {
            if (j2 == -9223372036854775807L) {
                A00 = am.A0B(i2, this.A0G).A01();
            } else {
                A00 = AbstractC03849b.A00(j2);
            }
            Pair<Integer, Long> A07 = am.A07(this.A0G, this.A0F, i2, A00);
            this.A04 = AbstractC03849b.A01(A00);
            this.A00 = ((Integer) A07.first).intValue();
        }
        this.A0E.A0y(am, i2, AbstractC03849b.A00(j2));
        Iterator<A5> it = this.A0K.iterator();
        while (it.hasNext()) {
            it.next().ADA(1);
        }
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((A1) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                A2 a2 = (A2) message.obj;
                A2 playbackParameters = this.A07;
                if (!playbackParameters.equals(a2)) {
                    this.A07 = a2;
                    Iterator<A5> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        A5 next = it.next();
                        String[] strArr = A0N;
                        if (strArr[3].charAt(18) == strArr[0].charAt(18)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0N;
                        strArr2[1] = "Rx35SoFeg5J49OemA5SmkfILnHIw2zPV";
                        strArr2[4] = "AOCcqe8qUBOiNNfFwZNpwcN90njeUUle";
                        next.AD4(a2);
                    }
                    return;
                }
                return;
            case 2:
                C03909h c03909h = (C03909h) message.obj;
                this.A05 = c03909h;
                Iterator<A5> it2 = this.A0K.iterator();
                while (it2.hasNext()) {
                    it2.next().AD6(c03909h);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void A3m(A5 a5) {
        this.A0K.add(a5);
    }

    @Override // com.instagram.common.viewpoint.core.ZB
    public final AD A51(AC ac) {
        return new AD(this.A0E, ac, this.A06.A03, A74(), this.A0D);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6Z() {
        long A6a = A6a();
        long A7E = A7E();
        if (A6a == -9223372036854775807L || A7E == -9223372036854775807L) {
            return 0;
        }
        if (A7E == 0) {
            return 100;
        }
        return IK.A06((int) ((100 * A6a) / A7E), 0, 100);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A6a() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A6w() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AbstractC03849b.A01(this.A06.A01);
        }
        return A71();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6y() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A6z() {
        if (!A0B()) {
            return -1;
        }
        Et et = this.A06.A04;
        String[] strArr = A0N;
        if (strArr[1].charAt(26) == strArr[4].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0N;
        strArr2[6] = "CcD4McdZf45PB";
        strArr2[7] = "2ShBxbZH9Pfqw";
        return et.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A71() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final AM A73() {
        return this.A06.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final int A74() {
        if (A06()) {
            int i2 = this.A01;
            String[] strArr = A0N;
            if (strArr[1].charAt(26) == strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0N[5] = "";
            return i2;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final long A7E() {
        AM am = this.A06.A03;
        if (am.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            Et et = this.A06.A04;
            am.A09(et.A02, this.A0F);
            return AbstractC03849b.A01(this.A0F.A0A(et.A00, et.A01));
        }
        return am.A0B(A74(), this.A0G).A02();
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final boolean A84() {
        return this.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.ZB
    public final void AEY(Ev ev, boolean z2, boolean z3) {
        this.A05 = null;
        A1 A01 = A01(z2, z3, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(ev, z2, z3);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AEy() {
        StringBuilder append = new StringBuilder().append(A02(38, 8, 1)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 80)).append(A02(15, 18, Opcodes.DREM));
        String A02 = A02(47, 3, 19);
        Log.i(A02(2, 13, 30), append.append(A02).append(IK.A04).append(A02).append(C04009r.A00()).append(A02(46, 1, 68)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AG9(long j2) {
        A09(A74(), j2);
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AGA() {
        A08(A74());
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AGZ(boolean z2) {
        if (this.A0A != z2) {
            this.A0A = z2;
            this.A0E.A10(z2);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AA
    public final void AH2(boolean z2) {
        if (z2) {
            this.A05 = null;
        }
        A1 A01 = A01(z2, z2, 1);
        this.A02++;
        this.A0E.A11(z2);
        A05(A01, false, 4, 1, false, false);
    }
}
