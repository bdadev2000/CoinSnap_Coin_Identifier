package com.google.common.base;

import com.applovin.impl.adview.t;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += encodedLengthGeneral(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j2 = i3 + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) == charAt) {
                        throw new IllegalArgumentException(unpairedSurrogateMsg(i2));
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    public static boolean isWellFormed(byte[] bArr) {
        return isWellFormed(bArr, 0, bArr.length);
    }

    private static boolean isWellFormedSlowPath(byte[] bArr, int i2, int i3) {
        byte b2;
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i4 != i3 && b3 >= -62) {
                        i2 += 2;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (b3 < -16) {
                    int i5 = i2 + 2;
                    if (i5 < i3 && (b2 = bArr[i4]) <= -65 && ((b3 != -32 || b2 >= -96) && (b3 != -19 || -96 > b2))) {
                        i2 += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return false;
                }
                if (i2 + 3 >= i3) {
                    return false;
                }
                int i6 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b3 << 28)) >> 30) == 0) {
                        int i7 = i2 + 3;
                        if (bArr[i6] <= -65) {
                            i2 += 4;
                            if (bArr[i7] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i2 = i4;
        }
        return true;
    }

    private static String unpairedSurrogateMsg(int i2) {
        return t.h(39, "Unpaired surrogate at index ", i2);
    }

    public static boolean isWellFormed(byte[] bArr, int i2, int i3) {
        int i4 = i3 + i2;
        Preconditions.checkPositionIndexes(i2, i4, bArr.length);
        while (i2 < i4) {
            if (bArr[i2] < 0) {
                return isWellFormedSlowPath(bArr, i2, i4);
            }
            i2++;
        }
        return true;
    }
}
