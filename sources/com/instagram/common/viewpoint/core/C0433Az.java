package com.instagram.common.viewpoint.core;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0433Az {
    public static byte[] A0P;
    public static String[] A0Q = {"LlgsTT0Zui6IKPeQPgD8fSGM6QqYY5Rc", "pm8SMp4UFXjr9JE8LdvH4UGGKUCw8m3c", "zxRdy6MMcurCLd", "LTFO7rX5uSjfOX3uaTYKwhSNZ2EHHmg0", "A3FflbVDLT8hKrCOMbhf6ddg", "YVrA88PsPmqtAXS24dEjb0zjZhY9NNbQ", "ykDXgz0RSMwhstOtB5XzMrmFiU4VC1of", "nTtGLRyiyXzbXESigTOLKBAlDpVOCduX"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public C0430Aw A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final InterfaceC0431Ax A0N;
    public final long[] A0O;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0Q[5].charAt(9) != 'm') {
                throw new RuntimeException();
            }
            A0Q[7] = "gTtjPRse8wyQODgaJCc8oOoIzj4GdKlV";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 87);
            i5++;
        }
    }

    public static void A06() {
        A0P = new byte[]{72, 74, 91, 99, 78, 91, 74, 65, 76, 86};
    }

    static {
        A06();
    }

    public C0433Az(InterfaceC0431Ax interfaceC0431Ax) {
        this.A0N = (InterfaceC0431Ax) AbstractC0576Hf.A01(interfaceC0431Ax);
        if (IK.A02 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 120), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r11 <= 28) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r3 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r12.A0A <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r9 != 3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r12.A07 != (-9223372036854775807L)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        r12.A07 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        return r12.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        r12.A07 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r12.A0A <= r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        r12.A0D++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        r12.A0A = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        return (r12.A0D << 32) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r11 <= 28) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A00() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0433Az.A00():long");
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j2) {
        return (1000000 * j2) / this.A03;
    }

    private void A04() {
        long A01 = A01();
        if (A01 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.A09 >= 30000) {
            this.A0O[this.A01] = A01 - nanoTime;
            this.A01 = (this.A01 + 1) % 10;
            if (this.A04 < 10) {
                this.A04++;
            }
            this.A09 = nanoTime;
            this.A0E = 0L;
            for (int i2 = 0; i2 < this.A04; i2++) {
                long j2 = this.A0E;
                long j3 = this.A0O[i2];
                long playbackPositionUs = this.A04;
                this.A0E = j2 + (j3 / playbackPositionUs);
            }
        }
        if (this.A0M) {
            return;
        }
        A08(nanoTime, A01);
        String[] strArr = A0Q;
        if (strArr[0].charAt(8) != strArr[3].charAt(8)) {
            throw new RuntimeException();
        }
        A0Q[4] = "NIXZw08ktYL6dUzDfb0VMH0i";
        A07(nanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j2) {
        if (this.A0L && this.A0J != null && j2 - this.A08 >= 500000) {
            try {
                this.A0B = (((Integer) this.A0J.invoke(this.A0H, null)).intValue() * 1000) - this.A05;
                this.A0B = Math.max(this.A0B, 0L);
                if (this.A0B > 5000000) {
                    this.A0N.ACM(this.A0B);
                    this.A0B = 0L;
                }
            } catch (Exception unused) {
                this.A0J = null;
            }
            this.A08 = j2;
        }
    }

    private void A08(long j2, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j2)) {
            return;
        }
        long A02 = this.A0I.A02();
        long A01 = this.A0I.A01();
        if (Math.abs(A02 - j2) > 5000000) {
            this.A0N.ADk(A01, A02, j2, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (Math.abs(A02(A01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0N.ADB(A01, A02, j2, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i2) {
        return IK.A02 < 23 && (i2 == 5 || i2 == 6);
    }

    public final int A0B(long j2) {
        int bytesPending = (int) (j2 - (A00() * this.A02));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z2) {
        long positionUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long timestampPositionUs = System.nanoTime() / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs = this.A0I.A01();
            long timestampPositionFrames = A02(systemTimeUs);
            if (!this.A0I.A07()) {
                return timestampPositionFrames;
            }
            long systemTimeUs2 = this.A0I.A02();
            return timestampPositionFrames + (timestampPositionUs - systemTimeUs2);
        }
        if (this.A04 == 0) {
            positionUs = A01();
        } else {
            long positionUs2 = this.A0E;
            positionUs = positionUs2 + timestampPositionUs;
        }
        if (!z2) {
            long j2 = this.A0B;
            String[] strArr = A0Q;
            if (strArr[0].charAt(8) != strArr[3].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[0] = "lcRtxCp1u16sb9wLaNGF5MQQPhmhPIjy";
            strArr2[3] = "crTnJJYSu7Bzqj8lWvsfk12r9Prdsw4f";
            return positionUs - j2;
        }
        return positionUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j2) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j2;
    }

    public final void A0G(AudioTrack audioTrack, int i2, int i3, int i4) {
        long j2;
        this.A0H = audioTrack;
        this.A02 = i3;
        this.A00 = i4;
        this.A0I = new C0430Aw(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i2);
        this.A0L = IK.A0c(i2);
        if (this.A0L) {
            long j3 = i4 / i3;
            if (A0Q[7].charAt(5) == 'U') {
                throw new RuntimeException();
            }
            A0Q[7] = "0drPZAnnslhsUu7nqTZLhFKaqhlU4ehr";
            j2 = A02(j3);
        } else {
            j2 = -9223372036854775807L;
        }
        this.A05 = j2;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == -9223372036854775807L) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j2) {
        return j2 > A00() || A09();
    }

    public final boolean A0K(long j2) {
        return this.A07 != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.A07 >= 200;
    }

    public final boolean A0L(long j2) {
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        this.A0K = A0J(j2);
        if (hadData && !this.A0K && playState != 1 && this.A0N != null) {
            this.A0N.ADt(this.A00, AbstractC03849b.A01(this.A05));
        }
        return true;
    }
}
