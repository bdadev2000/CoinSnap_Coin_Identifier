package com.facebook.ads.redexgen.uinode;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.audio.AudioProcessor;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Xy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1055Xy implements InterfaceC0478Ao {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"hUCCDXcY4t01difYD4QJmSlSRe7RVS9F", "yHOnf8lHgEM0FI0EKX1KbB3TaozNa", "kXByBOPR65DToxooqsu0gGt9HKAYl4Vo", "NIkyagP1AzDGImvyfrRhWneTEqqmK", "aXPRHAu0VDe5efXXlwPVbrYy41", "xYrm6yKJij65q9D2CisZETvgfz", "Fi2DTXQipqprJDEroL63LN5SWS4FAMqA", "8o6UBOAn3xAy4ZEKn0SjK2UR42QgxF0P"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public AudioTrack A0N;
    public C04619x A0O;
    public C04619x A0P;
    public AT A0Q;
    public InterfaceC0476Am A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC0465Ab[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    public final AU A0g;
    public final C0484Au A0h;
    public final Y1 A0i;
    public final InterfaceC0487Ax A0j;
    public final C1049Xs A0k;
    public final ArrayDeque<C0489Az> A0l;
    public final boolean A0m;
    public final InterfaceC0465Ab[] A0n;
    public final InterfaceC0465Ab[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private AudioTrack A0F(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0r, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{33, 45, 106, 98, 121, 45, 82, 102, 119, 122, 124, 71, 97, 114, 112, 120, 47, 2, Ascii.CAN, 8, 4, 5, Ascii.US, 2, 5, Ascii.RS, 2, Ascii.US, Ascii.DC2, 75, Ascii.SI, Ascii.SO, Ascii.US, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 48, Ascii.SO, 19, Ascii.ESC, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 33, 57, 38, 43, 38, 46, 78, 121, 111, 121, 104, 104, 117, 114, 123, 60, 111, 104, 125, 112, 112, 121, 120, 60, 125, 105, 120, 117, 115, 60, 104, 110, 125, Byte.MAX_VALUE, 119, 46, Ascii.NAK, Ascii.RS, 3, Ascii.VT, Ascii.RS, Ascii.CAN, Ascii.SI, Ascii.RS, Ascii.US, 91, Ascii.SUB, Ascii.SO, Ascii.US, Ascii.DC2, Ascii.DC4, 91, Ascii.RS, Ascii.NAK, Ascii.CAN, Ascii.DC4, Ascii.US, Ascii.DC2, Ascii.NAK, Ascii.FS, 65, 91, 58, 1, Ascii.FS, Ascii.SUB, Ascii.US, Ascii.US, 0, Ascii.GS, Ascii.ESC, 10, Ascii.VT, 79, Ascii.FF, 7, Ascii.SO, 1, 1, 10, 3, 79, Ascii.FF, 0, Ascii.SUB, 1, Ascii.ESC, 85, 79, Ascii.CAN, 121, 112, 108, 107, 122, 109, 41, 58, 40, 58};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0202, code lost:
    
        if (r4 != 6) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020b, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020d, code lost:
    
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0214, code lost:
    
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0204, code lost:
    
        r10.A02 = com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink.DEFAULT_BUFFER_SIZE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d4, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
    
        if (r8 == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r10.A07 != r5) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0159, code lost:
    
        if (r8 == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
    
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
    
        if (r2 == (-2)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019e, code lost:
    
        com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A04(r4);
        r10.A02 = com.facebook.ads.redexgen.uinode.IF.A06(r2 * 4, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * r10.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        r4 = r10.A08;
        r2 = com.facebook.ads.redexgen.uinode.C1055Xy.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ea, code lost:
    
        if (r2[2].charAt(5) == r2[7].charAt(5)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f2, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.C1055Xy.A0s;
        r2[4] = "14nowEFL6Yk6bTHhGEAerIHyFS";
        r2[5] = "whsLbLpoTkO7JKoY0ylMAK08jN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        if (r4 == 5) goto L110;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4P(int r11, int r12, int r13, int r14, int[] r15, int r16, int r17) throws com.facebook.ads.redexgen.uinode.C0474Ak {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1055Xy.A4P(int, int, int, int, int[], int, int):void");
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C1055Xy(AU au, InterfaceC0487Ax interfaceC0487Ax, boolean z10) {
        this.A0g = au;
        this.A0j = (InterfaceC0487Ax) AbstractC0626Ha.A01(interfaceC0487Ax);
        this.A0m = z10;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C0484Au(new C1056Xz(this, null));
        Y1 y12 = new Y1();
        this.A0i = y12;
        C1049Xs c1049Xs = new C1049Xs();
        this.A0k = c1049Xs;
        ArrayList<AudioProcessor> toIntPcmAudioProcessors = new ArrayList<>();
        Collections.addAll(toIntPcmAudioProcessors, new C1052Xv(), y12, c1049Xs);
        Collections.addAll(toIntPcmAudioProcessors, interfaceC0487Ax.A64());
        this.A0o = (InterfaceC0465Ab[]) toIntPcmAudioProcessors.toArray(new InterfaceC0465Ab[toIntPcmAudioProcessors.size()]);
        this.A0n = new InterfaceC0465Ab[]{new C1054Xx()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = AT.A04;
        this.A01 = 0;
        this.A0P = C04619x.A04;
        this.A04 = -1;
        this.A0d = new InterfaceC0465Ab[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C1055Xy(AU au, InterfaceC0465Ab[] interfaceC0465AbArr) {
        this(au, interfaceC0465AbArr, false);
    }

    public C1055Xy(AU au, InterfaceC0465Ab[] interfaceC0465AbArr, boolean z10) {
        this(au, new Y0(interfaceC0465AbArr), z10);
    }

    public static int A00(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return B1.A00(byteBuffer);
        }
        if (i10 == 5) {
            return AQ.A00();
        }
        if (i10 == 6) {
            int A03 = AQ.A03(byteBuffer);
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "kQJQgIYBfsXVI0BXiDfXFh8Y0v";
            strArr2[5] = "xmKGBElaJ1P1UFLQWjzE2KvoVx";
            return A03;
        }
        if (i10 == 14) {
            int A02 = AQ.A02(byteBuffer);
            if (A02 == -1) {
                return 0;
            }
            int syncframeOffset = AQ.A04(byteBuffer, A02);
            return syncframeOffset * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 113) + i10);
    }

    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j3) {
        if (this.A0S == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.A0S = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i10);
            this.A0S.putLong(8, 1000 * j3);
            this.A0S.position(0);
            this.A03 = i10;
        }
        int remaining = this.A0S.remaining();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "ZxHEhXNaRaOeicOuVS0y7eKtBmJV15x7";
        strArr2[0] = "lpmrRXkhPpBf5A8LovnLhyOg75mNhzFm";
        if (remaining > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0S, remaining, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A03 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < remaining) {
                return 0;
            }
        }
        int A01 = A01(audioTrack, byteBuffer, i10);
        if (A01 < 0) {
            this.A03 = 0;
            String[] strArr3 = A0s;
            String str = strArr3[6];
            String str2 = strArr3[0];
            int charAt = str.charAt(5);
            int avSyncHeaderBytesRemaining2 = str2.charAt(5);
            if (charAt != avSyncHeaderBytesRemaining2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0s;
            strArr4[6] = "98oBXXwj84JUUigMvdtlS6TYqH9EDAiG";
            strArr4[0] = "VyAxkX5UR8Pe4wLdxiezRSIVcQQDizsa";
            return A01;
        }
        int avSyncHeaderBytesRemaining3 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining3 - A01;
        return A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j3) {
        return A08(this.A0j.A80()) + j3;
    }

    private long A06(long j3) {
        C0489Az c0489Az = null;
        while (!this.A0l.isEmpty()) {
            C0489Az checkpoint = this.A0l.getFirst();
            if (j3 < C0489Az.A00(checkpoint)) {
                break;
            }
            C0489Az remove = this.A0l.remove();
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "EqLX22Mle1kVg1sX5ZT6YkRLc5f35";
            strArr2[3] = "gdY2b1urbXezKivfsFNrjnMWNzK4t";
            c0489Az = remove;
        }
        if (c0489Az != null) {
            this.A0P = C0489Az.A02(c0489Az);
            this.A0G = C0489Az.A00(c0489Az);
            this.A0F = C0489Az.A01(c0489Az) - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j3) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A7O(j3 - this.A0G);
        }
        return this.A0F + IF.A0C(j3 - this.A0G, this.A0P.A01);
    }

    private long A07(long j3) {
        return (this.A0A * j3) / 1000000;
    }

    private long A08(long j3) {
        return (1000000 * j3) / this.A0A;
    }

    private long A09(long j3) {
        return (1000000 * j3) / this.A06;
    }

    private AudioTrack A0D() {
        AudioAttributes A00;
        if (this.A0b) {
            A00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            A00 = this.A0Q.A00();
        }
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int audioSessionId = this.A01;
        if (audioSessionId == 0) {
            audioSessionId = 0;
        }
        return new AudioTrack(A00, build, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws C0475Al {
        AudioTrack audioTrack;
        if (IF.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int A03 = IF.A03(this.A0Q.A03);
            int streamType = this.A01;
            if (streamType == 0) {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(A03, this.A0A, this.A07, this.A08, this.A02, 1, this.A01);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new C0475Al(state, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        int i10 = 0;
        while (true) {
            InterfaceC0465Ab[] interfaceC0465AbArr = this.A0d;
            int i11 = interfaceC0465AbArr.length;
            if (i10 < i11) {
                InterfaceC0465Ab interfaceC0465Ab = interfaceC0465AbArr[i10];
                interfaceC0465Ab.flush();
                this.A0e[i10] = interfaceC0465Ab.A7W();
                i10++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws C0475Al {
        C04619x c04619x;
        this.A0f.block();
        AudioTrack A0E = A0E();
        this.A0M = A0E;
        int audioSessionId = A0E.getAudioSessionId();
        if (A0p && IF.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            InterfaceC0476Am interfaceC0476Am = this.A0R;
            if (interfaceC0476Am != null) {
                interfaceC0476Am.AAs(audioSessionId);
            }
        }
        if (this.A0V) {
            c04619x = this.A0j.A3b(this.A0P);
        } else {
            c04619x = C04619x.A04;
        }
        this.A0P = c04619x;
        A0N();
        C0484Au c0484Au = this.A0h;
        AudioTrack audioTrack2 = this.A0M;
        int i10 = this.A08;
        int i11 = this.A09;
        int audioSessionId4 = this.A02;
        c0484Au.A0G(audioTrack2, i10, i11, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C0486Aw(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (IF.A02 >= 21) {
            A0Q(this.A0M, this.A00);
            return;
        }
        AudioTrack audioTrack = this.A0M;
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "RUPACOvpiKp7bcWaTWyqVFSR7GtEantX";
        strArr2[7] = "RzQzoOWLdvYkkdkBCtRhC7yU7hWBsadG";
        A0R(audioTrack, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0465Ab interfaceC0465Ab : A0V()) {
            if (interfaceC0465Ab.A8w()) {
                arrayList.add(interfaceC0465Ab);
            } else {
                interfaceC0465Ab.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (InterfaceC0465Ab[]) arrayList.toArray(new InterfaceC0465Ab[count]);
        this.A0e = new ByteBuffer[count];
        A0J();
    }

    private void A0P(long j3) throws C0477An {
        ByteBuffer input;
        int length = this.A0d.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                int count = i10 - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = InterfaceC0465Ab.A00;
                }
            }
            if (i10 == length) {
                A0S(input, j3);
            } else {
                InterfaceC0465Ab interfaceC0465Ab = this.A0d[i10];
                interfaceC0465Ab.AEF(input);
                ByteBuffer A7W = interfaceC0465Ab.A7W();
                this.A0e[i10] = A7W;
                if (A7W.hasRemaining()) {
                    i10++;
                }
            }
            boolean hasRemaining = input.hasRemaining();
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[5];
            int index = str.length();
            int count2 = str2.length();
            if (index != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "GvJ2yOfBgit1iG3ukbpo3ztMvZtxyKui";
            strArr2[7] = "YNNwMOgGE9szKpvyLkHk1WmQlE5xjnt7";
            if (hasRemaining) {
                return;
            } else {
                i10--;
            }
        }
    }

    public static void A0Q(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void A0R(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void A0S(ByteBuffer byteBuffer, long j3) throws C0477An {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A0U;
        String[] strArr = A0s;
        if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "Y8Mrx0I9TdYWTjTrSbpDFDKjoXuQO";
        strArr2[3] = "wRs1O0frPXGaUer72uaPv4p6RCTih";
        if (byteBuffer2 != null) {
            AbstractC0626Ha.A03(byteBuffer2 == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            if (IF.A02 < 21) {
                int bytesWritten = byteBuffer.remaining();
                byte[] bArr = this.A0c;
                if (bArr == null || bArr.length < bytesWritten) {
                    this.A0c = new byte[bytesWritten];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, bytesWritten);
                byteBuffer.position(position);
                this.A0C = 0;
            }
        }
        int remaining = byteBuffer.remaining();
        int i10 = 0;
        if (IF.A02 < 21) {
            int A0B = this.A0h.A0B(this.A0L);
            if (A0B > 0) {
                i10 = this.A0M.write(this.A0c, this.A0C, Math.min(remaining, A0B));
                if (i10 > 0) {
                    this.A0C += i10;
                    byteBuffer.position(byteBuffer.position() + i10);
                }
            }
        } else if (!this.A0b) {
            i10 = A01(this.A0M, byteBuffer, remaining);
        } else {
            AbstractC0626Ha.A04(j3 != C.TIME_UNSET);
            i10 = A02(this.A0M, byteBuffer, remaining, j3);
        }
        this.A0E = SystemClock.elapsedRealtime();
        if (i10 >= 0) {
            boolean z10 = this.A0X;
            if (z10) {
                this.A0L += i10;
            }
            if (i10 == remaining) {
                if (!z10) {
                    this.A0K += this.A05;
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new C0477An(i10);
    }

    private boolean A0T() throws C0477An {
        boolean z10 = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z10 = true;
        }
        while (true) {
            int i10 = this.A04;
            InterfaceC0465Ab[] interfaceC0465AbArr = this.A0d;
            if (i10 < interfaceC0465AbArr.length) {
                InterfaceC0465Ab interfaceC0465Ab = interfaceC0465AbArr[i10];
                if (z10) {
                    interfaceC0465Ab.AEE();
                }
                A0P(C.TIME_UNSET);
                boolean audioProcessorNeedsEndOfStream2 = interfaceC0465Ab.A91();
                if (!audioProcessorNeedsEndOfStream2) {
                    return false;
                }
                z10 = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (byteBuffer != null) {
                    A0S(byteBuffer, C.TIME_UNSET);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private InterfaceC0465Ab[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void A59() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void A5W(int i10) {
        AbstractC0626Ha.A04(IF.A02 >= 21);
        if (this.A0b) {
            int i11 = this.A01;
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "PS7IBOM7NZDOoVGPPjdQOv1dv3IkizxK";
            strArr2[7] = "jjqtzOvKeeqNL4elNx3MZRV4owozeHXU";
            if (i11 == i10) {
                return;
            }
        }
        this.A0b = true;
        this.A01 = i10;
        reset();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final long A6e(boolean z10) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        long A0C = this.A0h.A0C(z10);
        long positionUs = A04();
        return this.A0H + A05(A06(Math.min(A0C, A08(positionUs))));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final C04619x A7h() {
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final boolean A8R(ByteBuffer byteBuffer, long j3) throws C0475Al, C0477An {
        ByteBuffer byteBuffer2 = this.A0T;
        AbstractC0626Ha.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean A0U = A0U();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "RcCB0XsFwDDOAw3euoH2B524NJP5PtQP";
        strArr2[0] = "S6sRDXDIUBrBns4w0IFsbKHJgfJaiswv";
        if (!A0U) {
            A0K();
            if (this.A0Y) {
                AE2();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        ByteBuffer byteBuffer3 = this.A0T;
        String A0I = A0I(6, 10, 25);
        if (byteBuffer3 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                int A00 = A00(this.A08, byteBuffer);
                this.A05 = A00;
                if (A00 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                if (!A0T()) {
                    return false;
                }
                C04619x c04619x = this.A0O;
                this.A0O = null;
                this.A0l.add(new C0489Az(this.A0j.A3b(c04619x), Math.max(0L, j3), A08(A04()), null));
                A0N();
            }
            if (this.A0D == 0) {
                this.A0H = Math.max(0L, j3);
                this.A0D = 1;
            } else {
                long expectedPresentationTimeUs = this.A0H + A09(A03());
                if (this.A0D == 1 && Math.abs(expectedPresentationTimeUs - j3) > 200000) {
                    Log.e(A0I, A0I(16, 33, 97) + expectedPresentationTimeUs + A0I(0, 6, 7) + j3 + A0I(138, 1, 79));
                    this.A0D = 2;
                }
                if (this.A0D == 2) {
                    this.A0H += j3 - expectedPresentationTimeUs;
                    this.A0D = 1;
                    InterfaceC0476Am interfaceC0476Am = this.A0R;
                    if (interfaceC0476Am != null) {
                        interfaceC0476Am.ACg();
                    }
                }
            }
            if (this.A0X) {
                this.A0J += byteBuffer.remaining();
            } else {
                this.A0I += this.A05;
            }
            this.A0T = byteBuffer;
        }
        if (!this.A0Z) {
            A0S(this.A0T, j3);
        } else {
            A0P(j3);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            Log.w(A0I, A0I(55, 29, 22));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void A8U() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final boolean A8Z() {
        if (A0U()) {
            boolean A0J = this.A0h.A0J(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "9qaAbWK7Rz0EURQ8gVPoKZJ79p";
            strArr2[5] = "PQsLZF4zdgMsSCMdKk30KO6aPE";
            if (A0J) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final boolean A90(int i10) {
        if (IF.A0c(i10)) {
            return i10 != 4 || IF.A02 >= 21;
        }
        AU au = this.A0g;
        return au != null && au.A04(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final boolean A91() {
        return !A0U() || (this.A0W && !A8Z());
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void AE2() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void AE3() throws C0477An {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "3Beu4rQqJml6K6p71ugtSnl6z4kve";
            strArr2[3] = "vTiWK9GhFZyDb3TQGI4eNztci47gx";
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void AEV() {
        reset();
        A0L();
        for (InterfaceC0465Ab interfaceC0465Ab : this.A0o) {
            interfaceC0465Ab.reset();
        }
        for (InterfaceC0465Ab interfaceC0465Ab2 : this.A0n) {
            interfaceC0465Ab2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void AFs(AT at) {
        if (this.A0Q.equals(at)) {
            return;
        }
        this.A0Q = at;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void AG4(InterfaceC0476Am interfaceC0476Am) {
        this.A0R = interfaceC0476Am;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final C04619x AGA(C04619x c04619x) {
        if (A0U() && !this.A0V) {
            C04619x c04619x2 = C04619x.A04;
            this.A0P = c04619x2;
            return c04619x2;
        }
        C04619x c04619x3 = this.A0O;
        String[] strArr = A0s;
        if (strArr[6].charAt(5) != strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "qknQOXr2sfI1wZbS1fFTxKCHwtwOF";
        strArr2[3] = "6hx8Cx11JAWA8IEiphxLzKnZtiWJj";
        if (c04619x3 == null) {
            if (!this.A0l.isEmpty()) {
                c04619x3 = C0489Az.A02(this.A0l.getLast());
            } else {
                c04619x3 = this.A0P;
            }
        }
        boolean equals = c04619x.equals(c04619x3);
        String[] strArr3 = A0s;
        if (strArr3[6].charAt(5) != strArr3[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0s;
        strArr4[4] = "rapNwYGl5aH6wSWwsREtxqAYY9";
        strArr4[5] = "Swk5nrnVyktI66zCHmEiilSuas";
        if (!equals) {
            if (A0U()) {
                this.A0O = c04619x;
            } else {
                C04619x lastSetPlaybackParameters = this.A0j.A3b(c04619x);
                this.A0P = lastSetPlaybackParameters;
            }
        }
        C04619x lastSetPlaybackParameters2 = this.A0P;
        return lastSetPlaybackParameters2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            AudioTrack audioTrack = this.A0M;
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "3LzsBOqgGe30i16a9NIVlDJcub4Z4Vvr";
            strArr2[7] = "hMaFPO8QBdBmzyeIOXtEGbbLXROtxATQ";
            audioTrack.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void reset() {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C04619x c04619x = this.A0O;
            if (c04619x != null) {
                this.A0P = c04619x;
                String[] strArr = A0s;
                if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[1] = "rnKZk3c8Taby0V4iUj7wGFJub43iz";
                strArr2[3] = "VEk4k7rPnS3kvq1QwagsAStWXQ6pG";
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                this.A0P = C0489Az.A02(this.A0l.getLast());
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new C0485Av(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0478Ao
    public final void setVolume(float f10) {
        if (this.A00 != f10) {
            this.A00 = f10;
            A0M();
        }
    }
}
