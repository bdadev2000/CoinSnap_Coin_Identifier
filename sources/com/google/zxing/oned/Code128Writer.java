package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    /* loaded from: classes2.dex */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int chooseCode(CharSequence charSequence, int i2, int i3) {
        CType findCType;
        CType findCType2;
        char charAt;
        CType findCType3 = findCType(charSequence, i2);
        CType cType = CType.ONE_DIGIT;
        if (findCType3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (findCType3 == cType2) {
            return (i2 >= charSequence.length() || ((charAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i3 == 99) {
            return 99;
        }
        if (i3 != 100) {
            if (findCType3 == CType.FNC_1) {
                findCType3 = findCType(charSequence, i2 + 1);
            }
            return findCType3 == CType.TWO_DIGITS ? 99 : 100;
        }
        CType cType3 = CType.FNC_1;
        if (findCType3 == cType3 || (findCType = findCType(charSequence, i2 + 2)) == cType2 || findCType == cType) {
            return 100;
        }
        if (findCType == cType3) {
            return findCType(charSequence, i2 + 3) == CType.TWO_DIGITS ? 99 : 100;
        }
        int i4 = i2 + 4;
        while (true) {
            findCType2 = findCType(charSequence, i4);
            if (findCType2 != CType.TWO_DIGITS) {
                break;
            }
            i4 += 2;
        }
        return findCType2 == CType.ONE_DIGIT ? 100 : 99;
    }

    private static CType findCType(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i3);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                        break;
                }
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 1;
            while (true) {
                int i8 = 103;
                if (i4 < length) {
                    int chooseCode = chooseCode(str, i4, i6);
                    int i9 = 100;
                    if (chooseCode == i6) {
                        switch (str.charAt(i4)) {
                            case 241:
                                i9 = 102;
                                break;
                            case 242:
                                i9 = 97;
                                break;
                            case 243:
                                i9 = 96;
                                break;
                            case 244:
                                if (i6 == 101) {
                                    i9 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i6 != 100) {
                                    if (i6 != 101) {
                                        i9 = Integer.parseInt(str.substring(i4, i4 + 2));
                                        i4++;
                                        break;
                                    } else {
                                        char charAt2 = str.charAt(i4);
                                        i9 = charAt2 - ' ';
                                        if (i9 < 0) {
                                            i9 = charAt2 + '@';
                                            break;
                                        }
                                    }
                                } else {
                                    i9 = str.charAt(i4) - ' ';
                                    break;
                                }
                                break;
                        }
                        i4++;
                    } else {
                        if (i6 != 0) {
                            i8 = chooseCode;
                        } else if (chooseCode == 100) {
                            i8 = 104;
                        } else if (chooseCode != 101) {
                            i8 = 105;
                        }
                        i9 = i8;
                        i6 = chooseCode;
                    }
                    arrayList.add(Code128Reader.CODE_PATTERNS[i9]);
                    i5 += i9 * i7;
                    if (i4 != 0) {
                        i7++;
                    }
                } else {
                    int[][] iArr = Code128Reader.CODE_PATTERNS;
                    arrayList.add(iArr[i5 % 103]);
                    arrayList.add(iArr[106]);
                    Iterator it = arrayList.iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        for (int i11 : (int[]) it.next()) {
                            i10 += i11;
                        }
                    }
                    boolean[] zArr = new boolean[i10];
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        i2 += OneDimensionalCodeWriter.appendPattern(zArr, i2, (int[]) it2.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
