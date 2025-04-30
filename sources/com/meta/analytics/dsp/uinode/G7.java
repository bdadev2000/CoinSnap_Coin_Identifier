package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class G7 {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C1167Fz A04;
    public final G0 A05;
    public final G6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1167Fz A04(C1216Hy c1216Hy, int i9) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i10 = 8;
        int A045 = c1216Hy.A04(8);
        c1216Hy.A08(8);
        int i11 = i9 - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i11 > 0) {
            int A046 = c1216Hy.A04(i10);
            int A047 = c1216Hy.A04(i10);
            int i12 = i11 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c1216Hy.A04(i10);
                A042 = c1216Hy.A04(i10);
                A043 = c1216Hy.A04(i10);
                A044 = c1216Hy.A04(i10);
                i11 = i12 - 4;
            } else {
                A04 = c1216Hy.A04(6) << 2;
                A042 = c1216Hy.A04(4) << 4;
                A043 = c1216Hy.A04(4) << 4;
                A044 = c1216Hy.A04(2) << 6;
                i11 = i12 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), IF.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), IF.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), IF.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i10 = 8;
        }
        return new C1167Fz(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G0 A05(C1216Hy c1216Hy) {
        int i9;
        int i10;
        int i11;
        int i12;
        c1216Hy.A08(4);
        boolean A0F = c1216Hy.A0F();
        c1216Hy.A08(3);
        int A04 = c1216Hy.A04(16);
        int A042 = c1216Hy.A04(16);
        if (A0F) {
            i9 = c1216Hy.A04(16);
            i12 = c1216Hy.A04(16);
            i10 = c1216Hy.A04(16);
            i11 = c1216Hy.A04(16);
        } else {
            i9 = 0;
            i10 = 0;
            i11 = A042;
            i12 = A04;
        }
        return new G0(A04, A042, i9, i12, i10, i11);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 27
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G4 A08(C1216Hy c1216Hy, int i9) {
        int i10 = 8;
        int A04 = c1216Hy.A04(8);
        c1216Hy.A08(4);
        boolean A0F = c1216Hy.A0F();
        c1216Hy.A08(3);
        int A042 = c1216Hy.A04(16);
        int A043 = c1216Hy.A04(16);
        int A044 = c1216Hy.A04(3);
        int A045 = c1216Hy.A04(3);
        c1216Hy.A08(2);
        int A046 = c1216Hy.A04(8);
        int A047 = c1216Hy.A04(8);
        int A048 = c1216Hy.A04(4);
        int A049 = c1216Hy.A04(2);
        c1216Hy.A08(2);
        int i11 = i9 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int A0410 = c1216Hy.A04(16);
            int A0411 = c1216Hy.A04(2);
            int A0412 = c1216Hy.A04(2);
            int A0413 = c1216Hy.A04(12);
            c1216Hy.A08(4);
            int A0414 = c1216Hy.A04(12);
            i11 -= 6;
            int i12 = 0;
            int i13 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i12 = c1216Hy.A04(i10);
                i13 = c1216Hy.A04(i10);
                i11 -= 2;
            }
            sparseArray.put(A0410, new G5(A0411, A0412, A0413, A0414, i12, i13));
            i10 = 8;
        }
        return new G4(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Ascii.DC2, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final List<C1155Fn> A0I(byte[] bArr, int i9) {
        C1216Hy c1216Hy = new C1216Hy(bArr, i9);
        while (c1216Hy.A01() >= 48 && c1216Hy.A04(8) == 15) {
            A0C(c1216Hy, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        G0 g02 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || g02.A05 + 1 != this.A00.getWidth() || g02.A00 + 1 != this.A00.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(g02.A05 + 1, g02.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A01.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<G3> sparseArray = this.A06.A01.A03;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            G3 valueAt = sparseArray.valueAt(i10);
            G4 g42 = this.A06.A08.get(sparseArray.keyAt(i10));
            int i11 = valueAt.A00 + g02.A02;
            int i12 = valueAt.A01 + g02.A04;
            this.A01.clipRect(i11, i12, Math.min(g42.A08 + i11, g02.A01), Math.min(g42.A02 + i12, g02.A03), Region.Op.REPLACE);
            C1167Fz c1167Fz = this.A06.A06.get(g42.A00);
            if (c1167Fz == null && (c1167Fz = this.A06.A04.get(g42.A00)) == null) {
                c1167Fz = this.A04;
            }
            SparseArray<G5> sparseArray2 = g42.A09;
            for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
                int keyAt = sparseArray2.keyAt(i13);
                G5 valueAt2 = sparseArray2.valueAt(i13);
                G1 g12 = this.A06.A07.get(keyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (g12 == null) {
                    g12 = this.A06.A05.get(keyAt);
                }
                if (g12 != null) {
                    A0B(g12, c1167Fz, g42.A01, i11 + valueAt2.A02, i12 + valueAt2.A05, g12.A01 ? null : this.A02, this.A01);
                }
            }
            if (g42.A0A) {
                this.A03.setColor(g42.A01 == 3 ? c1167Fz.A03[g42.A07] : g42.A01 == 2 ? c1167Fz.A02[g42.A06] : c1167Fz.A01[g42.A05]);
                this.A01.drawRect(i11, i12, g42.A08 + i11, g42.A02 + i12, this.A03);
            }
            arrayList.add(new C1155Fn(Bitmap.createBitmap(this.A00, i11, i12, g42.A08, g42.A02), i11 / g02.A05, 0, i12 / g02.A00, 0, g42.A08 / g02.A05, g42.A02 / g02.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, Ascii.SI};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public G7(int i9, int i10) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new G0(719, 575, 0, 719, 0, 575);
        this.A04 = new C1167Fz(0, A0F(), A0G(), A0H());
        this.A06 = new G6(i9, i10);
    }

    public static int A00(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0053. Please report as an issue. */
    public static int A01(C1216Hy c1216Hy, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        int i11 = i9;
        boolean z8 = false;
        do {
            int i12 = 0;
            int i13 = 0;
            i13 = 0;
            i13 = 0;
            i13 = 0;
            int A04 = c1216Hy.A04(2);
            if (A04 != 0) {
                i12 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
                i13 = A04;
            } else if (c1216Hy.A0F()) {
                i12 = c1216Hy.A04(3) + 3;
                i13 = c1216Hy.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c1216Hy.A0F()) {
                i12 = 1;
            } else {
                switch (c1216Hy.A04(2)) {
                    case 0:
                        z8 = true;
                        break;
                    case 1:
                        i12 = 2;
                        break;
                    case 2:
                        i12 = c1216Hy.A04(4) + 12;
                        i13 = c1216Hy.A04(2);
                        break;
                    case 3:
                        i12 = c1216Hy.A04(8) + 29;
                        if (A08[1].length() == 29) {
                            A08[5] = "eZC8v48u";
                            i13 = c1216Hy.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    i13 = bArr[i13];
                }
                paint.setColor(iArr[i13]);
                canvas.drawRect(i11, i10, i11 + i12, i10 + 1, paint);
            }
            i11 += i12;
        } while (!z8);
        return i11;
    }

    public static int A02(C1216Hy c1216Hy, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        int i11 = i9;
        boolean z8 = false;
        do {
            int peek = 0;
            int A04 = c1216Hy.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c1216Hy.A0F()) {
                int A042 = c1216Hy.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z8 = true;
                    A04 = 0;
                }
            } else if (!c1216Hy.A0F()) {
                peek = c1216Hy.A04(2) + 4;
                A04 = c1216Hy.A04(4);
            } else {
                switch (c1216Hy.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            A04 = 0;
                            break;
                        } else {
                            A04 = 0;
                            break;
                        }
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = c1216Hy.A04(4) + 9;
                        A04 = c1216Hy.A04(4);
                        break;
                    case 3:
                        peek = c1216Hy.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() != strArr2[4].length()) {
                            A08[6] = "tDVEwF5JbpPt";
                            A04 = c1216Hy.A04(4);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                float f9 = i11;
                float f10 = i10;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f9, f10, i11 + peek, i10 + 1, paint);
            }
            i11 += peek;
        } while (!z8);
        return i11;
    }

    public static int A03(C1216Hy c1216Hy, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        int clutIndex;
        int i11 = i9;
        boolean z8 = false;
        do {
            int A04 = c1216Hy.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c1216Hy.A0F()) {
                clutIndex = c1216Hy.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z8 = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = c1216Hy.A04(7);
                A04 = c1216Hy.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i11, i10, i11 + clutIndex, i10 + 1, paint);
            }
            i11 += clutIndex;
        } while (!z8);
        return i11;
    }

    public static G1 A06(C1216Hy c1216Hy) {
        int A04 = c1216Hy.A04(16);
        c1216Hy.A08(4);
        int objectId = c1216Hy.A04(2);
        boolean A0F = c1216Hy.A0F();
        c1216Hy.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c1216Hy.A04(8);
            c1216Hy.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c1216Hy.A04(16);
            int objectId2 = c1216Hy.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c1216Hy.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c1216Hy.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new G1(A04, A0F, bArr, bArr2);
    }

    public static G2 A07(C1216Hy c1216Hy, int i9) {
        int A04 = c1216Hy.A04(8);
        int A042 = c1216Hy.A04(4);
        int A043 = c1216Hy.A04(2);
        c1216Hy.A08(2);
        int i10 = i9 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int remainingLength = c1216Hy.A04(8);
            c1216Hy.A08(8);
            int version = c1216Hy.A04(16);
            int timeoutSecs = c1216Hy.A04(16);
            i10 -= 6;
            sparseArray.put(remainingLength, new G3(version, timeoutSecs));
        }
        return new G2(A04, A042, A043, sparseArray);
    }

    public static void A0B(G1 g12, C1167Fz c1167Fz, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i9 == 3) {
            iArr = c1167Fz.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i9 == 2) {
                iArr = c1167Fz.A02;
            } else {
                iArr = c1167Fz.A01;
            }
        }
        A0D(g12.A03, iArr, i9, i10, i11, paint, canvas);
        A0D(g12.A02, iArr, i9, i10, i11 + 1, paint, canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r0 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r7.A01 = r4;
        r7.A08.clear();
        r7.A06.clear();
        r7.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r1 = r5.A02;
        r0 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        r7.A01 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r0 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0C(com.meta.analytics.dsp.uinode.C1216Hy r6, com.meta.analytics.dsp.uinode.G6 r7) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.G7.A0C(com.facebook.ads.redexgen.X.Hy, com.facebook.ads.redexgen.X.G6):void");
    }

    public static void A0D(byte[] bArr, int[] iArr, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i11;
        C1216Hy c1216Hy = new C1216Hy(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i10;
        while (c1216Hy.A01() != 0) {
            switch (c1216Hy.A04(8)) {
                case 16:
                    if (i9 == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i9 == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() != 5) {
                        A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                        column = A01(c1216Hy, iArr, clutMapTable4To8, column, line, paint, canvas);
                        c1216Hy.A05();
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                case 17:
                    if (i9 == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(c1216Hy, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c1216Hy.A05();
                    break;
                case 18:
                    column = A03(c1216Hy, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c1216Hy);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c1216Hy);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c1216Hy);
                    break;
                case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                    line += 2;
                    column = i10;
                    break;
            }
        }
    }

    public static byte[] A0E(int i9, int i10, C1216Hy c1216Hy) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) c1216Hy.A04(i10);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i9 = 1; i9 < iArr.length; i9++) {
            if (i9 < 8) {
                int i10 = i9 & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i11 = i10 != 0 ? 255 : 0;
                iArr[i9] = A00(255, i11, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) != 0 ? 255 : 0);
            } else {
                int i12 = (i9 & 1) != 0 ? 127 : 0;
                iArr[i9] = A00(255, i12, (i9 & 2) != 0 ? 127 : 0, (i9 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0161, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0163, code lost:
    
        r0 = 170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b3, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x003c, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.G7.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
