package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class GC {
    public static byte[] A07;
    public static String[] A08 = {"8ynjxGuvqhEK6HfwGz4huo4aEJumTbl9", "NQLxoEekrmTrbdkQbYiEmw9U8A", "A7wePrDRFUe5oDe3z7CQumm14hMskdd5", "dWtbDx1", "U1JmOT8CtllLd5omv4HbWcgryxPwPNTJ", "82VKBP1", "VTB1AgJpGnH13J8WHYKYhxqoccEXo0Al", "jD6Ac3Tj6h7jGdKoRkcqzsP79IKcaoo7"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final G4 A04;
    public final G5 A05;
    public final GB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G4 A04(I3 i3, int i2) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i4 = 8;
        int A045 = i3.A04(8);
        i3.A08(8);
        int i5 = i2 - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i5 > 0) {
            int A046 = i3.A04(i4);
            int A047 = i3.A04(i4);
            int i6 = i5 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = i3.A04(i4);
                A042 = i3.A04(i4);
                A043 = i3.A04(i4);
                A044 = i3.A04(i4);
                i5 = i6 - 4;
            } else {
                A04 = i3.A04(6) << 2;
                A042 = i3.A04(4) << 4;
                A043 = i3.A04(4) << 4;
                A044 = i3.A04(2) << 6;
                i5 = i6 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), IK.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), IK.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), IK.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i4 = 8;
        }
        return new G4(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G5 A05(I3 i3) {
        int i2;
        int i4;
        int i5;
        int i6;
        i3.A08(4);
        boolean A0F = i3.A0F();
        i3.A08(3);
        int A04 = i3.A04(16);
        int A042 = i3.A04(16);
        if (A0F) {
            i2 = i3.A04(16);
            i6 = i3.A04(16);
            i4 = i3.A04(16);
            i5 = i3.A04(16);
        } else {
            i2 = 0;
            i4 = 0;
            i5 = A042;
            i6 = A04;
        }
        return new G5(A04, A042, i2, i6, i4, i5);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G9 A08(I3 i3, int i2) {
        int i4 = 8;
        int A04 = i3.A04(8);
        i3.A08(4);
        boolean A0F = i3.A0F();
        i3.A08(3);
        int A042 = i3.A04(16);
        int A043 = i3.A04(16);
        int A044 = i3.A04(3);
        int A045 = i3.A04(3);
        i3.A08(2);
        int A046 = i3.A04(8);
        int A047 = i3.A04(8);
        int A048 = i3.A04(4);
        int A049 = i3.A04(2);
        i3.A08(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int A0410 = i3.A04(16);
            int A0411 = i3.A04(2);
            int A0412 = i3.A04(2);
            int A0413 = i3.A04(12);
            i3.A08(4);
            int A0414 = i3.A04(12);
            i5 -= 6;
            int i6 = 0;
            int i7 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i6 = i3.A04(i4);
                i7 = i3.A04(i4);
                i5 -= 2;
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[1] = "TVBzy0qXZAp8MmoWSjJzaLxcgs";
            }
            sparseArray.put(A0410, new GA(A0411, A0412, A0413, A0414, i6, i7));
            i4 = 8;
        }
        return new G9(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{121, -106, -87, -106, 85, -101, -98, -102, -95, -103, 85, -95, -102, -93, -100, -87, -99, 85, -102, -83, -104, -102, -102, -103, -88, 85, -95, -98, -94, -98, -87, -74, -24, -44, -62, -45, -28, -27, -41, -28};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final List<C0539Fs> A0I(byte[] bArr, int i2) {
        I3 i3 = new I3(bArr, i2);
        while (i3.A01() >= 48 && i3.A04(8) == 15) {
            A0C(i3, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        G5 g5 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || g5.A05 + 1 != this.A00.getWidth() || g5.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(g5.A05 + 1, g5.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<G8> sparseArray = this.A06.A01.A03;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            G8 valueAt = sparseArray.valueAt(i4);
            G9 g9 = this.A06.A08.get(sparseArray.keyAt(i4));
            int i5 = valueAt.A00 + g5.A02;
            int i6 = valueAt.A01 + g5.A04;
            int min = Math.min(g9.A08 + i5, g5.A01);
            int i7 = g9.A02 + i6;
            int i8 = g5.A03;
            if (A08[4].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            A08[4] = "3k1bLSmeVMMbgOcaW30zy1SdV300Zn1R";
            this.A01.clipRect(i5, i6, min, Math.min(i7, i8), Region.Op.REPLACE);
            G4 g4 = this.A06.A06.get(g9.A00);
            if (g4 == null && (g4 = this.A06.A04.get(g9.A00)) == null) {
                g4 = this.A04;
            }
            SparseArray<GA> sparseArray2 = g9.A09;
            String[] strArr = A08;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[1] = "JjoMguGs1qt7GN1pTvjIzDQaCf";
            int i9 = 0;
            while (i9 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i9);
                GA valueAt2 = sparseArray2.valueAt(i9);
                G6 g6 = this.A06.A07.get(keyAt);
                if (g6 == null) {
                    g6 = this.A06.A05.get(keyAt);
                }
                if (g6 != null) {
                    A0B(g6, g4, g9.A01, i5 + valueAt2.A02, i6 + valueAt2.A05, g6.A01 ? null : this.A02, this.A01);
                }
                i9++;
                if (A08[2].charAt(19) != '3') {
                    String[] strArr2 = A08;
                    strArr2[5] = "xSTCNLC";
                    strArr2[3] = "SHujbXn";
                } else {
                    A08[6] = "3gGlAGYtRyGpn5rL0vQCRHGDsmQahIPQ";
                }
            }
            if (g9.A0A) {
                this.A03.setColor(g9.A01 == 3 ? g4.A03[g9.A07] : g9.A01 == 2 ? g4.A02[g9.A06] : g4.A01[g9.A05]);
                this.A01.drawRect(i5, i6, g9.A08 + i5, g9.A02 + i6, this.A03);
            }
            arrayList.add(new C0539Fs(Bitmap.createBitmap(this.A00, i5, i6, g9.A08, g9.A02), i5 / g5.A05, 0, i6 / g5.A00, 0, g9.A08 / g5.A05, g9.A02 / g5.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public GC(int i2, int i3) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new G5(719, 575, 0, 719, 0, 575);
        this.A04 = new G4(0, A0F(), A0G(), A0H());
        this.A06 = new GB(i2, i3);
    }

    public static int A00(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static int A01(I3 i3, int[] iArr, byte[] bArr, int i2, int i4, Paint paint, Canvas canvas) {
        int i5 = i2;
        boolean z2 = false;
        do {
            int i6 = 0;
            int A04 = i3.A04(2);
            if (A08[4].charAt(24) != 'N') {
                A08[4] = "HrbNpNFlv98dQSYIGN1QikeC8F3JgSwg";
                if (A04 != 0) {
                    i6 = 1;
                } else if (i3.A0F()) {
                    i6 = i3.A04(3) + 3;
                    A04 = i3.A04(2);
                } else if (i3.A0F()) {
                    i6 = 1;
                    if (A08[2].charAt(19) != '3') {
                        A08[4] = "HLIBFdOcBcQ13vsz9vC4X3h7S8RvBqZM";
                        A04 = 0;
                    }
                } else {
                    switch (i3.A04(2)) {
                        case 0:
                            z2 = true;
                            A04 = 0;
                            break;
                        case 1:
                            i6 = 2;
                            A04 = 0;
                            break;
                        case 2:
                            i6 = i3.A04(4) + 12;
                            A04 = i3.A04(2);
                            break;
                        case 3:
                            i6 = i3.A04(8) + 29;
                            A04 = i3.A04(2);
                            break;
                        default:
                            A04 = 0;
                            break;
                    }
                }
                if (i6 != 0 && paint != null) {
                    if (bArr != null) {
                        A04 = bArr[A04];
                    }
                    paint.setColor(iArr[A04]);
                    canvas.drawRect(i5, i4, i5 + i6, i4 + 1, paint);
                }
                i5 += i6;
            }
            throw new RuntimeException();
        } while (!z2);
        return i5;
    }

    public static int A02(I3 i3, int[] iArr, byte[] bArr, int i2, int i4, Paint paint, Canvas canvas) {
        int i5 = i2;
        boolean z2 = false;
        do {
            int peek = 0;
            int A04 = i3.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!i3.A0F()) {
                int A042 = i3.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z2 = true;
                    A04 = 0;
                }
            } else if (!i3.A0F()) {
                peek = i3.A04(2) + 4;
                A04 = i3.A04(4);
            } else {
                switch (i3.A04(2)) {
                    case 0:
                        peek = 1;
                        A04 = 0;
                        break;
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = i3.A04(4) + 9;
                        A04 = i3.A04(4);
                        break;
                    case 3:
                        peek = i3.A04(8) + 25;
                        A04 = i3.A04(4);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                int i6 = iArr[A04];
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[6] = "99qTAMz5ObSXEsnosFsE0iIiJXmhlgSb";
                paint.setColor(i6);
                canvas.drawRect(i5, i4, i5 + peek, i4 + 1, paint);
            }
            i5 += peek;
        } while (!z2);
        return i5;
    }

    public static int A03(I3 i3, int[] iArr, byte[] bArr, int i2, int i4, Paint paint, Canvas canvas) {
        int A04;
        boolean z2 = false;
        do {
            int A042 = i3.A04(8);
            if (A042 != 0) {
                A04 = 1;
            } else if (!i3.A0F()) {
                A04 = i3.A04(7);
                if (A04 != 0) {
                    A042 = 0;
                } else {
                    z2 = true;
                    A04 = 0;
                    A042 = 0;
                }
            } else {
                A04 = i3.A04(7);
                A042 = i3.A04(8);
            }
            if (A04 != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                canvas.drawRect(i2, i4, i2 + A04, i4 + 1, paint);
            }
            i2 += A04;
            if (A08[2].charAt(19) == '3') {
                throw new RuntimeException();
            }
            A08[6] = "VUlHAiRwnKVSYNNIm22gyVEFvpJ5tK4N";
        } while (!z2);
        return i2;
    }

    public static G6 A06(I3 i3) {
        int A04 = i3.A04(16);
        i3.A08(4);
        int objectCodingMethod = i3.A04(2);
        boolean A0F = i3.A0F();
        i3.A08(1);
        byte[] bottomFieldData = null;
        byte[] bArr = null;
        if (objectCodingMethod == 1) {
            int numberOfCodes = i3.A04(8);
            i3.A08(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int A042 = i3.A04(16);
            int topFieldDataLength = i3.A04(16);
            if (A042 > 0) {
                bottomFieldData = new byte[A042];
                int objectId = A08[2].charAt(19);
                if (objectId == 51) {
                    throw new RuntimeException();
                }
                A08[6] = "RKYJA8yEMhap3nvsTUFIJMEemn1r9hAW";
                i3.A0E(bottomFieldData, 0, A042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                i3.A0E(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new G6(A04, A0F, bottomFieldData, bArr);
    }

    public static G7 A07(I3 i3, int i2) {
        int A04 = i3.A04(8);
        int A042 = i3.A04(4);
        int A043 = i3.A04(2);
        i3.A08(2);
        int i4 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int remainingLength = i3.A04(8);
            i3.A08(8);
            int version = i3.A04(16);
            int timeoutSecs = i3.A04(16);
            i4 -= 6;
            sparseArray.put(remainingLength, new G8(version, timeoutSecs));
        }
        return new G7(A04, A042, A043, sparseArray);
    }

    public static void A0B(G6 g6, G4 g4, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = g4.A03;
        } else if (i2 == 2) {
            iArr = g4.A02;
        } else {
            iArr = g4.A01;
        }
        A0D(g6.A03, iArr, i2, i3, i4, paint, canvas);
        A0D(g6.A02, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    public static void A0C(I3 i3, GB gb) {
        int pageId = i3.A04(8);
        int A04 = i3.A04(16);
        int A042 = i3.A04(16);
        int dataFieldLimit = i3.A02() + A042;
        int dataFieldLength = A042 * 8;
        int segmentType = i3.A01();
        if (dataFieldLength > segmentType) {
            Log.w(A09(31, 9, 112), A09(0, 31, 51));
            int segmentType2 = i3.A01();
            i3.A08(segmentType2);
            return;
        }
        switch (pageId) {
            case 16:
                int segmentType3 = gb.A03;
                if (A04 == segmentType3) {
                    G7 g7 = gb.A01;
                    G7 A072 = A07(i3, A042);
                    int segmentType4 = A072.A00;
                    if (segmentType4 != 0) {
                        gb.A01 = A072;
                        gb.A08.clear();
                        gb.A06.clear();
                        gb.A07.clear();
                        break;
                    } else if (g7 != null) {
                        int dataFieldLength2 = g7.A02;
                        int segmentType5 = A072.A02;
                        if (dataFieldLength2 != segmentType5) {
                            gb.A01 = A072;
                            break;
                        }
                    }
                }
                break;
            case 17:
                G7 pageComposition = gb.A01;
                int i2 = gb.A03;
                String[] strArr = A08;
                String str = strArr[5];
                String str2 = strArr[3];
                int dataFieldLength3 = str.length();
                int segmentType6 = str2.length();
                if (dataFieldLength3 == segmentType6) {
                    A08[4] = "q1WJVeOMaGnpbtvlIttdST2Iz5tS8l4c";
                    if (A04 == i2 && pageComposition != null) {
                        G9 A082 = A08(i3, A042);
                        int segmentType7 = pageComposition.A00;
                        if (segmentType7 == 0) {
                            SparseArray<G9> sparseArray = gb.A08;
                            int segmentType8 = A082.A03;
                            A082.A00(sparseArray.get(segmentType8));
                        }
                        SparseArray<G9> sparseArray2 = gb.A08;
                        int segmentType9 = A082.A03;
                        sparseArray2.put(segmentType9, A082);
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 18:
                int segmentType10 = gb.A03;
                if (A04 == segmentType10) {
                    G4 A043 = A04(i3, A042);
                    SparseArray<G4> sparseArray3 = gb.A06;
                    int segmentType11 = A043.A00;
                    sparseArray3.put(segmentType11, A043);
                    break;
                } else {
                    int segmentType12 = gb.A02;
                    if (A04 == segmentType12) {
                        G4 A044 = A04(i3, A042);
                        SparseArray<G4> sparseArray4 = gb.A04;
                        int segmentType13 = A044.A00;
                        sparseArray4.put(segmentType13, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType14 = gb.A03;
                if (A04 == segmentType14) {
                    G6 A06 = A06(i3);
                    SparseArray<G6> sparseArray5 = gb.A07;
                    int segmentType15 = A06.A00;
                    sparseArray5.put(segmentType15, A06);
                    break;
                } else {
                    int segmentType16 = gb.A02;
                    if (A04 == segmentType16) {
                        G6 A062 = A06(i3);
                        SparseArray<G6> sparseArray6 = gb.A05;
                        int segmentType17 = A062.A00;
                        sparseArray6.put(segmentType17, A062);
                        break;
                    }
                }
                break;
            case 20:
                int segmentType18 = gb.A03;
                if (A04 == segmentType18) {
                    gb.A00 = A05(i3);
                    break;
                }
                break;
        }
        int segmentType19 = i3.A02();
        i3.A09(dataFieldLimit - segmentType19);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i4;
        I3 i32 = new I3(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i3;
        while (i32.A01() != 0) {
            switch (i32.A04(8)) {
                case 16:
                    if (i2 == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i2 == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                    }
                    column = A01(i32, iArr, clutMapTable4To8, column, line, paint, canvas);
                    i32.A05();
                    break;
                case 17:
                    if (i2 == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(i32, iArr, clutMapTable4To82, column, line, paint, canvas);
                    i32.A05();
                    break;
                case 18:
                    column = A03(i32, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, i32);
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    clutMapTable2To4 = A0E(4, 8, i32);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, i32);
                    break;
                case 240:
                    line += 2;
                    column = i3;
                    break;
            }
        }
    }

    public static byte[] A0E(int i2, int i3, I3 i32) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) i32.A04(i3);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (i2 < 8) {
                int i3 = (i2 & 1) != 0 ? 255 : 0;
                iArr[i2] = A00(255, i3, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i4 = (i2 & 1) != 0 ? 127 : 0;
                iArr[i2] = A00(255, i4, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x016b, code lost:
    
        if (r9 != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x016f, code lost:
    
        if ((r5 & 64) == 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0171, code lost:
    
        r6[r5] = A00(255, r8, r7, r3 + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x017e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x017b, code lost:
    
        if (r9 != 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0191, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r9 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        r1 = 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        if (r9 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.GC.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
