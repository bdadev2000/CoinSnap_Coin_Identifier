package kotlinx.serialization.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "()V", "hexCode", "", "hexToInt", "", "ch", "", "parseHexBinary", "", "s", "printHexBinary", DataSchemeDataSource.SCHEME_DATA, "lowerCase", "", "toHexString", "n", "kotlinx-serialization-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class InternalHexConverter {
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    private final int hexToInt(char ch2) {
        if ('0' <= ch2 && ch2 < ':') {
            return ch2 - '0';
        }
        char c10 = 'A';
        if (!('A' <= ch2 && ch2 < 'G')) {
            c10 = 'a';
            if (!('a' <= ch2 && ch2 < 'g')) {
                return -1;
            }
        }
        return (ch2 - c10) + 10;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return internalHexConverter.printHexBinary(bArr, z10);
    }

    public final byte[] parseHexBinary(String s5) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(s5, "s");
        int length = s5.length();
        if (length % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                int hexToInt = hexToInt(s5.charAt(i10));
                int i11 = i10 + 1;
                int hexToInt2 = hexToInt(s5.charAt(i11));
                if (hexToInt != -1 && hexToInt2 != -1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    bArr[i10 / 2] = (byte) ((hexToInt << 4) + hexToInt2);
                } else {
                    throw new IllegalArgumentException(("Invalid hex chars: " + s5.charAt(i10) + s5.charAt(i11)).toString());
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("HexBinary string must be even length".toString());
    }

    public final String printHexBinary(byte[] data, boolean lowerCase) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b3 : data) {
            sb2.append(hexCode.charAt((b3 >> 4) & 15));
            sb2.append(hexCode.charAt(b3 & Ascii.SI));
        }
        if (lowerCase) {
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "r.toString()");
            String lowerCase2 = sb3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return lowerCase2;
        }
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "r.toString()");
        return sb4;
    }

    public final String toHexString(int n10) {
        byte[] bArr = new byte[4];
        boolean z10 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10] = (byte) (n10 >> (24 - (i10 * 8)));
        }
        String trimStart = StringsKt.trimStart(printHexBinary(bArr, true), '0');
        if (trimStart.length() > 0) {
            z10 = true;
        }
        if (!z10) {
            trimStart = null;
        }
        if (trimStart == null) {
            return "0";
        }
        return trimStart;
    }
}
