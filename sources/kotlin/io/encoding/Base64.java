package kotlin.io.encoding;

import a4.j;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", "destination", "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class Base64 {
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;

    /* renamed from: Default, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] mimeLineSeparatorSymbols = {Ascii.CR, 10};
    private static final Base64 UrlSafe = new Base64(true, false);
    private static final Base64 Mime = new Base64(false, true);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    /* loaded from: classes4.dex */
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Base64 getMime() {
            return Base64.Mime;
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private Companion() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.Companion.<init>():void");
        }
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset >= 0 && destinationOffset <= destinationSize) {
            int i10 = destinationOffset + capacityNeeded;
            if (i10 >= 0 && i10 <= destinationSize) {
                return;
            }
            StringBuilder n10 = j.n("The destination array does not have enough capacity, destination offset: ", destinationOffset, ", destination size: ", destinationSize, ", capacity needed: ");
            n10.append(capacityNeeded);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        throw new IndexOutOfBoundsException(j.e("destination offset: ", destinationOffset, ", destination size: ", destinationSize));
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.decode(bArr, i10, i11);
    }

    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int[] access$getBase64DecodeMap$p;
        if (this.isUrlSafe) {
            access$getBase64DecodeMap$p = Base64Kt.access$getBase64UrlDecodeMap$p();
        } else {
            access$getBase64DecodeMap$p = Base64Kt.access$getBase64DecodeMap$p();
        }
        int i10 = -8;
        int i11 = destinationOffset;
        int i12 = -8;
        int i13 = 0;
        int i14 = startIndex;
        while (true) {
            if (i14 >= endIndex) {
                break;
            }
            if (i12 == i10 && i14 + 3 < endIndex) {
                int i15 = i14 + 1;
                int i16 = access$getBase64DecodeMap$p[source[i14] & UByte.MAX_VALUE];
                int i17 = i15 + 1;
                int i18 = access$getBase64DecodeMap$p[source[i15] & UByte.MAX_VALUE];
                int i19 = i17 + 1;
                int i20 = access$getBase64DecodeMap$p[source[i17] & UByte.MAX_VALUE];
                int i21 = i19 + 1;
                int i22 = (i20 << 6) | (i16 << 18) | (i18 << 12) | access$getBase64DecodeMap$p[source[i19] & UByte.MAX_VALUE];
                if (i22 >= 0) {
                    int i23 = i11 + 1;
                    destination[i11] = (byte) (i22 >> 16);
                    int i24 = i23 + 1;
                    destination[i23] = (byte) (i22 >> 8);
                    destination[i24] = (byte) i22;
                    i11 = i24 + 1;
                    i14 = i21;
                    i10 = -8;
                } else {
                    i14 = i21 - 4;
                }
            }
            int i25 = source[i14] & UByte.MAX_VALUE;
            int i26 = access$getBase64DecodeMap$p[i25];
            if (i26 < 0) {
                if (i26 == -2) {
                    i14 = handlePaddingSymbol(source, i14, endIndex, i12);
                    break;
                }
                if (this.isMimeScheme) {
                    i14++;
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid symbol '");
                    sb2.append((char) i25);
                    sb2.append("'(");
                    String num = Integer.toString(i25, CharsKt.checkRadix(8));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    sb2.append(num);
                    sb2.append(") at index ");
                    sb2.append(i14);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                i14++;
                i13 = (i13 << 6) | i26;
                i12 += 6;
                if (i12 >= 0) {
                    destination[i11] = (byte) (i13 >>> i12);
                    i13 &= (1 << i12) - 1;
                    i12 -= 8;
                    i11++;
                }
            }
            i10 = -8;
        }
        if (i12 != -2) {
            int skipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, i14, endIndex);
            if (skipIllegalSymbolsIfMime >= endIndex) {
                return i11 - destinationOffset;
            }
            int i27 = source[skipIllegalSymbolsIfMime] & UByte.MAX_VALUE;
            StringBuilder sb3 = new StringBuilder("Symbol '");
            sb3.append((char) i27);
            sb3.append("'(");
            String num2 = Integer.toString(i27, CharsKt.checkRadix(8));
            Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
            sb3.append(num2);
            sb3.append(") at index ");
            sb3.append(skipIllegalSymbolsIfMime - 1);
            sb3.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb3.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i14, i15, i12);
    }

    private final int decodeSize(byte[] source, int startIndex, int endIndex) {
        int i10 = endIndex - startIndex;
        if (i10 == 0) {
            return 0;
        }
        if (i10 != 1) {
            if (this.isMimeScheme) {
                while (true) {
                    if (startIndex >= endIndex) {
                        break;
                    }
                    int i11 = Base64Kt.access$getBase64DecodeMap$p()[source[startIndex] & UByte.MAX_VALUE];
                    if (i11 < 0) {
                        if (i11 == -2) {
                            i10 -= endIndex - startIndex;
                            break;
                        }
                        i10--;
                    }
                    startIndex++;
                }
            } else if (source[endIndex - 1] == 61) {
                i10--;
                if (source[endIndex - 2] == 61) {
                    i10--;
                }
            }
            return (int) ((i10 * 6) / 8);
        }
        throw new IllegalArgumentException(j.e("Input should have at list 2 symbols for Base64 decoding, startIndex: ", startIndex, ", endIndex: ", endIndex));
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.encode(bArr, i10, i11);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        int i14;
        int i15;
        if (obj == null) {
            if ((i13 & 4) != 0) {
                i14 = 0;
            } else {
                i14 = i10;
            }
            if ((i13 & 8) != 0) {
                i15 = 0;
            } else {
                i15 = i11;
            }
            if ((i13 & 16) != 0) {
                i12 = bArr.length;
            }
            return base64.encodeIntoByteArray(bArr, bArr2, i14, i15, i12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    private final int encodeSize(int sourceSize) {
        int i10;
        int i11 = ((sourceSize + 3) - 1) / 3;
        if (this.isMimeScheme) {
            i10 = (i11 - 1) / 19;
        } else {
            i10 = 0;
        }
        int i12 = (i10 * 2) + (i11 * 4);
        if (i12 >= 0) {
            return i12;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return base64.encodeToAppendable(bArr, appendable, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i10, i11);
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart != -8) {
            if (byteStart != -6) {
                if (byteStart != -4) {
                    if (byteStart != -2) {
                        throw new IllegalStateException("Unreachable".toString());
                    }
                } else {
                    padIndex = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
                    if (padIndex == endIndex || source[padIndex] != 61) {
                        throw new IllegalArgumentException(eb.j.i("Missing one pad character at index ", padIndex));
                    }
                }
            }
            return padIndex + 1;
        }
        throw new IllegalArgumentException(eb.j.i("Redundant pad character at index ", padIndex));
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (Base64Kt.access$getBase64DecodeMap$p()[source[startIndex] & UByte.MAX_VALUE] != -1) {
                return startIndex;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b3 : source) {
            sb2.append((char) b3);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i10 = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i10] = (byte) charAt;
                i10++;
            } else {
                bArr[i10] = 63;
                i10++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize = decodeSize(source, startIndex, endIndex);
        byte[] bArr = new byte[decodeSize];
        if (decodeImpl(source, bArr, 0, startIndex, endIndex) == decodeSize) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final String encode(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] access$getBase64EncodeMap$p;
        int i10;
        boolean z10;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize(endIndex - startIndex));
        if (this.isUrlSafe) {
            access$getBase64EncodeMap$p = Base64Kt.access$getBase64UrlEncodeMap$p();
        } else {
            access$getBase64EncodeMap$p = Base64Kt.access$getBase64EncodeMap$p();
        }
        if (this.isMimeScheme) {
            i10 = 19;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        int i11 = destinationOffset;
        while (true) {
            z10 = false;
            if (startIndex + 2 >= endIndex) {
                break;
            }
            int min = Math.min((endIndex - startIndex) / 3, i10);
            int i12 = 0;
            while (i12 < min) {
                int i13 = startIndex + 1;
                int i14 = i13 + 1;
                int i15 = ((source[startIndex] & UByte.MAX_VALUE) << 16) | ((source[i13] & UByte.MAX_VALUE) << 8) | (source[i14] & UByte.MAX_VALUE);
                int i16 = i11 + 1;
                destination[i11] = access$getBase64EncodeMap$p[i15 >>> 18];
                int i17 = i16 + 1;
                destination[i16] = access$getBase64EncodeMap$p[(i15 >>> 12) & 63];
                int i18 = i17 + 1;
                destination[i17] = access$getBase64EncodeMap$p[(i15 >>> 6) & 63];
                i11 = i18 + 1;
                destination[i18] = access$getBase64EncodeMap$p[i15 & 63];
                i12++;
                startIndex = i14 + 1;
            }
            if (min == i10 && startIndex != endIndex) {
                int i19 = i11 + 1;
                byte[] bArr = mimeLineSeparatorSymbols;
                destination[i11] = bArr[0];
                i11 = i19 + 1;
                destination[i19] = bArr[1];
            }
        }
        int i20 = endIndex - startIndex;
        if (i20 != 1) {
            if (i20 == 2) {
                int i21 = startIndex + 1;
                int i22 = i21 + 1;
                int i23 = ((source[i21] & UByte.MAX_VALUE) << 2) | ((source[startIndex] & UByte.MAX_VALUE) << 10);
                int i24 = i11 + 1;
                destination[i11] = access$getBase64EncodeMap$p[i23 >>> 12];
                int i25 = i24 + 1;
                destination[i24] = access$getBase64EncodeMap$p[(i23 >>> 6) & 63];
                int i26 = i25 + 1;
                destination[i25] = access$getBase64EncodeMap$p[i23 & 63];
                i11 = i26 + 1;
                destination[i26] = padSymbol;
                startIndex = i22;
            }
        } else {
            int i27 = startIndex + 1;
            int i28 = (source[startIndex] & UByte.MAX_VALUE) << 4;
            int i29 = i11 + 1;
            destination[i11] = access$getBase64EncodeMap$p[i28 >>> 6];
            int i30 = i29 + 1;
            destination[i29] = access$getBase64EncodeMap$p[i28 & 63];
            int i31 = i30 + 1;
            destination[i30] = padSymbol;
            i11 = i31 + 1;
            destination[i31] = padSymbol;
            startIndex = i27;
        }
        if (startIndex == endIndex) {
            z10 = true;
        }
        if (z10) {
            return i11 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <A extends Appendable> A encodeToAppendable(byte[] source, A destination, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1));
        return destination;
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    /* renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    private Base64(boolean z10, boolean z11) {
        this.isUrlSafe = z10;
        this.isMimeScheme = z11;
        if (!((z10 && z11) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.decode(charSequence, i10, i11);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i14 = (i13 & 4) != 0 ? 0 : i10;
        int i15 = (i13 & 8) != 0 ? 0 : i11;
        if ((i13 & 16) != 0) {
            i12 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i14, i15, i12);
    }

    public final int decodeIntoByteArray(CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, charsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    public final byte[] decode(CharSequence source, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, charsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
