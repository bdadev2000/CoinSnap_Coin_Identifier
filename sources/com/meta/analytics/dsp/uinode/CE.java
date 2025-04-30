package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class CE {
    public static byte[] A0h;
    public static String[] A0i = {"IyltKROI0dONAvxCzSFxMMbap986o", "mujPYAYhkPmTBtOccd1mpeNR", "0Po3ACznS97z3RfgrsPeIGcIu3WtX", "Uu0n9DuNw1LDS1xbXky22YF4xgkhplY6", "LMa7o3DPVrMB0USQzYMxMUIDtj36p7Zv", "YQocGDdhEprGCVrh1x2f0Ac7ybbPw1BN", "b3mlxzrKdW1g7zcxBPM3qbO1DSwndDSh", "Ser"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public C3 A0V;
    public C4 A0W;
    public CF A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A00(C1217Hz c1217Hz) throws C10259v {
        try {
            c1217Hz.A0Z(16);
            long A0K = c1217Hz.A0K();
            if (A0K == 1482049860) {
                return new Pair<>(A01(881, 10, 51), null);
            }
            if (A0K != 826496599) {
                Log.w(A01(283, 17, 0), A01(419, 51, 45));
                return new Pair<>(A01(944, 15, 101), null);
            }
            byte[] bArr = c1217Hz.A00;
            for (int A06 = c1217Hz.A06() + 20; A06 < bArr.length - 4; A06++) {
                if (bArr[A06] == 0 && bArr[A06 + 1] == 0 && bArr[A06 + 2] == 1 && bArr[A06 + 3] == 15) {
                    return new Pair<>(A01(934, 10, 127), Collections.singletonList(Arrays.copyOfRange(bArr, A06, bArr.length)));
                }
            }
            throw new C10259v(A01(238, 45, 91));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C10259v(A01(137, 33, 14));
        }
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0i[5] = "YLAPK4AntFjLAXIjsqe57SorlZ7T8mVd";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 8);
            i12++;
        }
    }

    public static void A04() {
        A0h = new byte[]{40, 38, 85, 99, 114, 114, 111, 104, 97, 38, 107, 111, 107, 99, 82, Ascii.DEL, 118, 99, 38, 114, 105, 38, 17, Ascii.SI, 17, 17, 19, 64, 94, 64, 66, 50, 103, 121, 98, 114, 117, 82, 76, 87, 71, 64, 60, 86, 75, 67, 65, 86, 64, 64, 56, 38, 61, 45, 42, 86, 53, 54, 42, 42, 53, 60, 42, 42, Ascii.DC2, Ascii.FF, Ascii.SYN, Ascii.DC2, Ascii.DLE, 96, 125, 99, 122, 112, 125, Ascii.DEL, 59, 37, 55, 42, 63, 61, 85, 54, 72, Ascii.ETB, 9, Ascii.ESC, 6, 19, 17, 121, Ascii.SUB, 101, 67, 93, 79, 81, 45, 67, 65, 79, 101, 123, 107, 116, 113, 119, 83, 77, 66, 81, 95, 61, 91, 92, 70, 61, 94, 91, 70, 75, 85, 94, 88, 95, 79, 66, 78, 17, Ascii.SI, 6, Ascii.US, 2, Ascii.DC2, Ascii.EM, 3, 67, 116, 116, 105, 116, 38, 118, 103, 116, 117, 111, 104, 97, 38, 64, 105, 115, 116, 69, 69, 38, 118, 116, 111, 112, 103, 114, 99, 38, 98, 103, 114, 103, 93, 106, 106, 119, 106, 56, 104, 121, 106, 107, 113, 118, Ascii.DEL, 56, 85, 75, 55, 89, 91, 85, 56, 123, 119, 124, 125, 123, 56, 104, 106, 113, 110, 121, 108, 125, 117, 66, 66, 95, 66, Ascii.DLE, 64, 81, 66, 67, 89, 94, 87, Ascii.DLE, 70, 95, 66, 82, 89, 67, Ascii.DLE, 83, 95, 84, 85, 83, Ascii.DLE, 64, 66, 89, 70, 81, 68, 85, Ascii.NAK, 50, 58, 63, 54, 55, 115, 39, 60, 115, 53, 58, 61, 55, 115, Ascii.NAK, 60, 38, 33, Ascii.DLE, Ascii.DLE, 115, 5, Ascii.DLE, 98, 115, 58, 61, 58, 39, 58, 50, 63, 58, 41, 50, 39, 58, 60, 61, 115, 55, 50, 39, 50, 69, 105, 124, 122, 103, 123, 99, 105, 77, 112, 124, 122, 105, 107, 124, 103, 122, 0, 33, 32, 99, Ascii.RS, Ascii.CR, 3, 110, 3, Ascii.GS, 97, Ascii.SI, Ascii.CR, 3, 110, 39, 61, 110, 59, 32, 61, 59, 62, 62, 33, 60, 58, 43, 42, 96, 110, Ascii.GS, 43, 58, 58, 39, 32, 41, 110, 35, 39, 35, 43, Ascii.SUB, 55, 62, 43, 110, 58, 33, 110, 126, 114, 105, 123, 111, 126, 120, 111, 46, 34, 53, 57, 48, 43, 82, 45, 58, 46, 82, 94, 85, 68, 89, 85, 46, 64, 82, 82, 48, 60, 55, 38, 59, 55, 76, 54, 55, 37, 91, Ascii.DC2, Ascii.RS, Ascii.ETB, Ascii.SO, 3, Ascii.DC2, Ascii.DC4, 3, 53, Ascii.SO, 5, Ascii.CAN, Ascii.DLE, 5, 3, Ascii.DC4, 5, 4, 64, 45, 41, 45, 37, 64, Ascii.DC4, Ascii.EM, Ascii.DLE, 5, 78, 112, 75, 78, 75, 74, 82, 75, 5, 99, 74, 80, 87, 102, 102, Ascii.VT, 5, 118, 64, 81, 81, 76, 75, 66, 5, 72, 76, 72, 64, 113, 92, 85, 64, 5, 81, 74, 5, 83, 76, 65, 64, 74, 10, 93, 8, 80, 75, 78, 75, 74, 82, 75, 19, 40, 52, 35, 37, 41, 33, 40, 47, 60, 35, 34, 102, 37, 41, 34, 35, 37, 102, 47, 34, 35, 40, 50, 47, 32, 47, 35, 52, 104, 120, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, Ascii.CR, 125, 110, 96, Ascii.CR, 79, 68, 89, Ascii.CR, 73, 72, 93, 89, 69, Ascii.ETB, Ascii.CR, 34, 43, 57, 36, 49, 51, 70, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 43, 58, 47, 38, 52, 41, 60, 62, 77, 86, 48, 42, 54, 86, 56, 42, 41, 116, 125, 111, 114, 103, 101, Ascii.SYN, Ascii.CR, 107, 113, 109, Ascii.CR, 99, 116, 97, 102, 111, 125, 96, 117, 119, 4, Ascii.US, 121, 99, Ascii.DEL, Ascii.US, 99, 96, 108, 101, 119, 106, Ascii.DEL, 125, 114, Ascii.NAK, 115, 105, 117, Ascii.NAK, 114, Ascii.DEL, 108, 121, 123, 114, 96, 126, 2, 123, 107, 122, 2, 107, 98, 120, Ascii.DEL, 110, 110, 94, 87, 92, 64, 77, 71, 90, 73, Ascii.SO, 7, Ascii.SO, 8, 96, 109, 100, 109, 107, 2, 89, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, Ascii.ETB, 92, 78, 90, 75, 77, 90, 75, 124, 109, 109, 113, 116, 126, 124, 105, 116, 114, 115, 50, 109, 122, 110, Ascii.US, Ascii.SO, Ascii.SO, Ascii.DC2, Ascii.ETB, Ascii.GS, Ascii.US, 10, Ascii.ETB, 17, Ascii.DLE, 81, 8, 17, Ascii.FS, Ascii.CR, Ascii.VT, Ascii.FS, Ascii.DLE, 1, 1, Ascii.GS, Ascii.CAN, Ascii.DC2, Ascii.DLE, 5, Ascii.CAN, Ascii.RS, Ascii.US, 94, 9, 92, 2, 4, 19, 3, Ascii.CAN, 1, 115, 103, 118, 123, 125, 61, 115, 113, 33, Ascii.ETB, 3, Ascii.DC2, Ascii.US, Ascii.EM, 89, 19, Ascii.ETB, Ascii.NAK, 69, 83, 71, 86, 91, 93, Ascii.GS, 84, 94, 83, 81, 118, 98, 115, 126, 120, 56, 122, 103, 35, 118, 58, 123, 118, 99, 122, Ascii.DC2, 6, Ascii.ETB, Ascii.SUB, Ascii.FS, 92, Ascii.RS, 3, Ascii.SYN, Ascii.DC4, 70, 82, 67, 78, 72, 8, 74, 87, 66, 64, 10, 107, Ascii.NAK, 68, 80, 65, 76, 74, 10, 74, 85, 80, 86, 37, 49, 32, 45, 43, 107, 54, 37, 51, 34, 54, 39, 42, 44, 108, 55, 49, 54, 38, 110, 43, 39, 3, Ascii.ETB, 6, Ascii.VT, Ascii.CR, 77, Ascii.DC4, Ascii.FF, 6, 76, 6, Ascii.SYN, 17, 123, 111, 126, 115, 117, 53, 108, 116, 126, 52, 126, 110, 105, 52, 114, 126, 120, 108, 125, 112, 118, 54, 111, 118, 107, 123, 112, 106, 101, 113, 96, 109, 107, 43, 124, 41, 113, 106, 111, 106, 107, 115, 106, 5, Ascii.SO, 7, 125, 108, 113, 125, 38, 113, 36, 122, 122, 104, 77, 82, 95, 94, 84, Ascii.DC4, 8, 92, 75, 75, Ascii.SYN, 9, 4, 5, Ascii.SI, 79, 1, Ascii.SYN, 3, 121, 102, 107, 106, 96, 32, 103, 106, 121, 108, 104, 119, 122, 123, 113, 49, 115, 110, 42, 104, 51, 123, 109, 103, 120, 117, 116, 126, 62, 124, 97, 116, 118, 35, 1, Ascii.RS, 19, Ascii.DC2, Ascii.CAN, 88, 0, 1, Ascii.DC4, 70, Ascii.ESC, 4, 9, 8, 2, 66, Ascii.NAK, 64, Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 69, 90, 87, 86, 92, Ascii.FS, 75, Ascii.RS, 69, 93, 87, Ascii.GS, 92, 93, 1, Ascii.GS, 69, 67, Ascii.VT, 109, 114, Ascii.DEL, 126, 116, 52, 99, 54, 109, 117, Ascii.DEL, 53, 116, 117, 41, 53, 109, 107, 34};
    }

    static {
        A04();
    }

    public CE() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 104);
    }

    public /* synthetic */ CE(XZ xz) {
        this();
    }

    public static /* synthetic */ String A02(CE ce, String str) {
        ce.A0g = str;
        return str;
    }

    public static List<byte[]> A03(byte[] bArr) throws C10259v {
        String A01 = A01(204, 34, 56);
        try {
            if (bArr[0] == 2) {
                int i9 = 1;
                int i10 = 0;
                while (bArr[i9] == -1) {
                    i10 += 255;
                    i9++;
                }
                int i11 = i9 + 1;
                int i12 = i10 + bArr[i9];
                if (A0i[5].charAt(0) != 'Y') {
                    throw new RuntimeException();
                }
                A0i[6] = "t9W1bu55HCX38CTD9AnwpVMfQcluPXu3";
                int i13 = 0;
                while (bArr[i11] == -1) {
                    i13 += 255;
                    i11++;
                }
                int offset = i11 + 1;
                int i14 = i13 + bArr[i11];
                if (bArr[offset] == 1) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, offset, bArr2, 0, i12);
                    int offset2 = offset + i12;
                    if (bArr[offset2] == 3) {
                        int offset3 = offset2 + i14;
                        if (bArr[offset3] == 5) {
                            byte[] bArr3 = new byte[bArr.length - offset3];
                            System.arraycopy(bArr, offset3, bArr3, 0, bArr.length - offset3);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C10259v(A01);
                    }
                    throw new C10259v(A01);
                }
                throw new C10259v(A01);
            }
            throw new C10259v(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C10259v(A01);
        }
    }

    public static boolean A05(C1217Hz c1217Hz) throws C10259v {
        UUID uuid;
        UUID uuid2;
        try {
            int A0C = c1217Hz.A0C();
            if (A0C == 1) {
                return true;
            }
            if (A0C != 65534) {
                return false;
            }
            c1217Hz.A0Y(24);
            long A0L = c1217Hz.A0L();
            uuid = XX.A0s;
            long mostSignificantBits = uuid.getMostSignificantBits();
            if (A0i[0].length() != 29) {
                throw new RuntimeException();
            }
            A0i[6] = "mXDtn5ZrlLpOkU84k9DC3Hi3Pcorcpog";
            if (A0L == mostSignificantBits) {
                long A0L2 = c1217Hz.A0L();
                uuid2 = XX.A0s;
                if (A0L2 == uuid2.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C10259v(A01(170, 34, 16));
        }
    }

    private byte[] A06() {
        if (this.A06 == -1.0f) {
            return null;
        }
        float f9 = this.A07;
        if (A0i[6].charAt(11) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0i;
        strArr[2] = "PBvrZHKgmU2uAVRQDCT9n0bIRHOqM";
        strArr[1] = "guZt3O6voa6ads6nTVRQaZ05";
        if (f9 == -1.0f || this.A04 == -1.0f) {
            return null;
        }
        float f10 = this.A05;
        if (A0i[7].length() != 6) {
            String[] strArr2 = A0i;
            strArr2[2] = "PayVPjYQSmFvrGG0qfp7CT6HXa6Ad";
            strArr2[1] = "9Xa9tASZMquPJJBB3AwdoWSz";
            if (f10 == -1.0f) {
                return null;
            }
        } else if (f10 == -1.0f) {
            return null;
        }
        if (this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr);
        hdrStaticInfo.put((byte) 0);
        hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
        hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
        hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
        hdrStaticInfo.putShort((short) this.A0K);
        hdrStaticInfo.putShort((short) this.A0L);
        return bArr;
    }

    public final void A07() {
        CF cf = this.A0X;
        if (cf != null) {
            cf.A02(this);
        }
    }

    public final void A08() {
        CF cf = this.A0X;
        if (cf != null) {
            cf.A00();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00dc, code lost:
    
        if (r8.equals(A01(379, 11, 107)) != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00de, code lost:
    
        r11 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ec, code lost:
    
        if (r8.equals(A01(379, 11, 107)) != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x063c, code lost:
    
        if (r8 != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x063e, code lost:
    
        r3 = 1;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A06(java.lang.Integer.toString(r31), r15, null, -1, r18, r29.A0B, r29.A0O, r21, r1, r29.A0U, r2, r29.A0g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x020c, code lost:
    
        if (r8.equals(A01(390, 4, 43)) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x020e, code lost:
    
        r11 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0225, code lost:
    
        if (r8.equals(A01(390, 8, 73)) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x067b, code lost:
    
        if (com.meta.analytics.dsp.uinode.AbstractC1210Hs.A0B(r15) == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x067d, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0680, code lost:
    
        if (r29.A0H != 0) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0682, code lost:
    
        r2 = r29.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0684, code lost:
    
        if (r2 != (-1)) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0686, code lost:
    
        r2 = r29.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0688, code lost:
    
        r29.A0I = r2;
        r2 = r29.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x068c, code lost:
    
        if (r2 != (-1)) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x068e, code lost:
    
        r2 = r29.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0690, code lost:
    
        r29.A0G = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0692, code lost:
    
        r8 = -1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0696, code lost:
    
        if (r29.A0I == (-1)) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x069a, code lost:
    
        if (r29.A0G == (-1)) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x069c, code lost:
    
        r8 = (r29.A0J * r5) / (r29.A0R * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x06a5, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x06a8, code lost:
    
        if (r29.A0b == false) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x06aa, code lost:
    
        r7 = new com.facebook.ads.internal.exoplayer2.thirdparty.video.ColorInfo(r29.A0D, r29.A0C, r29.A0E, A06());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x06b9, code lost:
    
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A04(java.lang.Integer.toString(r31), r15, null, -1, r18, r29.A0R, r29.A0J, -1.0f, r1, -1, r8, r29.A0e, r29.A0P, r7, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x06f3, code lost:
    
        if (A01(693, 20, 121).equals(r15) == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x06f5, code lost:
    
        r3 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A01(java.lang.Integer.toString(r31), r15, r2, r29.A0g, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0704, code lost:
    
        r7 = A01(871, 10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0719, code lost:
    
        if (com.meta.analytics.dsp.uinode.CE.A0i[4].charAt(3) == '7') goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x071f, code lost:
    
        if (r7.equals(r15) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0721, code lost:
    
        r3 = 3;
        r6 = new java.util.ArrayList(2);
        r1 = com.meta.analytics.dsp.uinode.XX.A0t;
        r6.add(r1);
        r6.add(r29.A0d);
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A09(java.lang.Integer.toString(r31), r15, null, -1, r2, r29.A0g, -1, r29.A0U, Long.MAX_VALUE, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x076b, code lost:
    
        if (A01(675, 18, 118).equals(r15) != false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x077b, code lost:
    
        if (A01(660, 15, 21).equals(r15) != false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x078b, code lost:
    
        if (A01(641, 19, 48).equals(r15) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x07b2, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A01(398, 21, 104));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x078d, code lost:
    
        r3 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A0A(java.lang.Integer.toString(r31), r15, null, -1, r2, r1, r29.A0g, r29.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x074f, code lost:
    
        com.meta.analytics.dsp.uinode.CE.A0i[3] = "f7sm5I7gZdCZUZkEBQd8yi8YhLy9ImnH";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x075a, code lost:
    
        if (r7.equals(r15) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0674, code lost:
    
        if (r8 != false) goto L394;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A09(com.meta.analytics.dsp.uinode.InterfaceC1076Bu r30, int r31) throws com.meta.analytics.dsp.uinode.C10259v {
        /*
            Method dump skipped, instructions count: 2164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.CE.A09(com.facebook.ads.redexgen.X.Bu, int):void");
    }
}
