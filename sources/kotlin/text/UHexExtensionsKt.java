package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u000e\u001a\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"hexToUByte", "Lkotlin/UByte;", "", "format", "Lkotlin/text/HexFormat;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "hexToUByteArray", "Lkotlin/UByteArray;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToUInt", "Lkotlin/UInt;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToULong", "Lkotlin/ULong;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToUShort", "Lkotlin/UShort;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UHexExtensionsKt {
    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final byte hexToUByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m163constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    public static /* synthetic */ byte hexToUByte$default(String str, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m163constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] hexToUByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m216constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    public static /* synthetic */ byte[] hexToUByteArray$default(String str, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m216constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final int hexToUInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m240constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    public static /* synthetic */ int hexToUInt$default(String str, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m240constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final long hexToULong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m319constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    public static /* synthetic */ long hexToULong$default(String str, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m319constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final short hexToUShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m426constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    public static /* synthetic */ short hexToUShort$default(String str, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m426constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m1458toHexString8M7LxHw(int i10, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i10, format);
    }

    /* renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    public static /* synthetic */ String m1459toHexString8M7LxHw$default(int i10, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i10, format);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m1460toHexString8UJCmI(long j3, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j3, format);
    }

    /* renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    public static /* synthetic */ String m1461toHexString8UJCmI$default(long j3, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j3, format);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m1462toHexStringZQbaR00(byte b3, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b3, format);
    }

    /* renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    public static /* synthetic */ String m1463toHexStringZQbaR00$default(byte b3, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b3, format);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m1464toHexStringlZCiFrA(byte[] toHexString, int i10, int i11, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i10, i11, format);
    }

    /* renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    public static /* synthetic */ String m1465toHexStringlZCiFrA$default(byte[] toHexString, int i10, int i11, HexFormat format, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = UByteArray.m222getSizeimpl(toHexString);
        }
        if ((i12 & 4) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i10, i11, format);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m1466toHexStringr3ox_E0(short s5, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s5, format);
    }

    /* renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    public static /* synthetic */ String m1467toHexStringr3ox_E0$default(short s5, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s5, format);
    }

    @SinceKotlin(version = "1.9")
    @ExperimentalStdlibApi
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m1468toHexStringzHuV2wU(byte[] toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }

    /* renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    public static /* synthetic */ String m1469toHexStringzHuV2wU$default(byte[] toHexString, HexFormat format, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }
}
