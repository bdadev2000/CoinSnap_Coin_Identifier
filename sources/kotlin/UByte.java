package kotlin;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u000fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b4\u0010\u0012J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u0010\u000bJ\u0018\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b9\u0010\u0012J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b:\u0010\u001fJ\u0018\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u000fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bK\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bL\u0010\u0012J\u0018\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bQ\u0010\u0012J\u0018\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0013\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0013\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UByte;", "", DataSchemeDataSource.SCHEME_DATA, "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes4.dex */
public final class UByte implements Comparable<UByte> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b3) {
        this.data = b3;
    }

    @InlineOnly
    /* renamed from: and-7apg3OU */
    private static final byte m156and7apg3OU(byte b3, byte b10) {
        return m163constructorimpl((byte) (b3 & b10));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m157boximpl(byte b3) {
        return new UByte(b3);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private int m158compareTo7apg3OU(byte b3) {
        return Intrinsics.compare(getData() & MAX_VALUE, b3 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m160compareToVKZWuLQ(byte b3, long j3) {
        return Long.compare(ULong.m319constructorimpl(b3 & 255) ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m161compareToWZ4Q5Ns(byte b3, int i10) {
        return Integer.compare(UInt.m240constructorimpl(b3 & MAX_VALUE) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m162compareToxj2QHRw(byte b3, short s5) {
        return Intrinsics.compare(b3 & MAX_VALUE, s5 & UShort.MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static byte m163constructorimpl(byte b3) {
        return b3;
    }

    @InlineOnly
    /* renamed from: dec-w2LRezQ */
    private static final byte m164decw2LRezQ(byte b3) {
        return m163constructorimpl((byte) (b3 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m165div7apg3OU(byte b3, byte b10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(b10 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m166divVKZWuLQ(byte b3, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(b3 & 255);
        if (j3 < 0) {
            return (m319constructorimpl ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (m319constructorimpl >= 0) {
            return m319constructorimpl / j3;
        }
        long j10 = ((m319constructorimpl >>> 1) / j3) << 1;
        return j10 + (((m319constructorimpl - (j10 * j3)) ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final int m167divWZ4Q5Ns(byte b3, int i10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m168divxj2QHRw(byte b3, short s5) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m169equalsimpl(byte b3, Object obj) {
        return (obj instanceof UByte) && b3 == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m170equalsimpl0(byte b3, byte b10) {
        return b3 == b10;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m171floorDiv7apg3OU(byte b3, byte b10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(b10 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m172floorDivVKZWuLQ(byte b3, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(b3 & 255);
        if (j3 < 0) {
            return (m319constructorimpl ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (m319constructorimpl >= 0) {
            return m319constructorimpl / j3;
        }
        long j10 = ((m319constructorimpl >>> 1) / j3) << 1;
        return j10 + (((m319constructorimpl - (j10 * j3)) ^ Long.MIN_VALUE) < (j3 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m173floorDivWZ4Q5Ns(byte b3, int i10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m174floorDivxj2QHRw(byte b3, short s5) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m175hashCodeimpl(byte b3) {
        return Byte.hashCode(b3);
    }

    @InlineOnly
    /* renamed from: inc-w2LRezQ */
    private static final byte m176incw2LRezQ(byte b3) {
        return m163constructorimpl((byte) (b3 + 1));
    }

    @InlineOnly
    /* renamed from: inv-w2LRezQ */
    private static final byte m177invw2LRezQ(byte b3) {
        return m163constructorimpl((byte) (~b3));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m178minus7apg3OU(byte b3, byte b10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & MAX_VALUE) - UInt.m240constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m179minusVKZWuLQ(byte b3, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(b3 & 255) - j3);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m180minusWZ4Q5Ns(byte b3, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m181minusxj2QHRw(byte b3, short s5) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & MAX_VALUE) - UInt.m240constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m182mod7apg3OU(byte b3, byte b10) {
        return m163constructorimpl((byte) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(b10 & MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m183modVKZWuLQ(byte b3, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(b3 & 255);
        if (j3 < 0) {
            if ((m319constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j3)) {
                return m319constructorimpl;
            }
        } else {
            if (m319constructorimpl >= 0) {
                return m319constructorimpl % j3;
            }
            m319constructorimpl -= (((m319constructorimpl >>> 1) / j3) << 1) * j3;
            if ((m319constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j3)) {
                j3 = 0;
            }
        }
        return m319constructorimpl - j3;
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    private static final int m184modWZ4Q5Ns(byte b3, int i10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m185modxj2QHRw(byte b3, short s5) {
        return UShort.m426constructorimpl((short) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-7apg3OU */
    private static final byte m186or7apg3OU(byte b3, byte b10) {
        return m163constructorimpl((byte) (b3 | b10));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m187plus7apg3OU(byte b3, byte b10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b10 & MAX_VALUE) + UInt.m240constructorimpl(b3 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m188plusVKZWuLQ(byte b3, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(b3 & 255) + j3);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m189plusWZ4Q5Ns(byte b3, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m190plusxj2QHRw(byte b3, short s5) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) + UInt.m240constructorimpl(b3 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-7apg3OU */
    private static final UIntRange m191rangeTo7apg3OU(byte b3, byte b10) {
        return new UIntRange(UInt.m240constructorimpl(b3 & MAX_VALUE), UInt.m240constructorimpl(b10 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-7apg3OU */
    private static final UIntRange m192rangeUntil7apg3OU(byte b3, byte b10) {
        return URangesKt.m1412untilJ1ME1BU(UInt.m240constructorimpl(b3 & MAX_VALUE), UInt.m240constructorimpl(b10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m193rem7apg3OU(byte b3, byte b10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(b10 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m194remVKZWuLQ(byte b3, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(b3 & 255);
        if (j3 < 0) {
            if ((m319constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j3)) {
                return m319constructorimpl;
            }
        } else {
            if (m319constructorimpl >= 0) {
                return m319constructorimpl % j3;
            }
            m319constructorimpl -= (((m319constructorimpl >>> 1) / j3) << 1) * j3;
            if ((m319constructorimpl ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j3)) {
                j3 = 0;
            }
        }
        return m319constructorimpl - j3;
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final int m195remWZ4Q5Ns(byte b3, int i10) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m196remxj2QHRw(byte b3, short s5) {
        return (int) ((UInt.m240constructorimpl(b3 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m197times7apg3OU(byte b3, byte b10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b10 & MAX_VALUE) * UInt.m240constructorimpl(b3 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m198timesVKZWuLQ(byte b3, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(b3 & 255) * j3);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m199timesWZ4Q5Ns(byte b3, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m200timesxj2QHRw(byte b3, short s5) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & UShort.MAX_VALUE) * UInt.m240constructorimpl(b3 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m201toByteimpl(byte b3) {
        return b3;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m202toDoubleimpl(byte b3) {
        return b3 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m203toFloatimpl(byte b3) {
        return b3 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m204toIntimpl(byte b3) {
        return b3 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m205toLongimpl(byte b3) {
        return b3 & 255;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m206toShortimpl(byte b3) {
        return (short) (b3 & 255);
    }

    /* renamed from: toString-impl */
    public static String m207toStringimpl(byte b3) {
        return String.valueOf(b3 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m208toUBytew2LRezQ(byte b3) {
        return b3;
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m209toUIntpVg5ArA(byte b3) {
        return UInt.m240constructorimpl(b3 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m210toULongsVKNKU(byte b3) {
        return ULong.m319constructorimpl(b3 & 255);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m211toUShortMh2AYeg(byte b3) {
        return UShort.m426constructorimpl((short) (b3 & 255));
    }

    @InlineOnly
    /* renamed from: xor-7apg3OU */
    private static final byte m212xor7apg3OU(byte b3, byte b10) {
        return m163constructorimpl((byte) (b3 ^ b10));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m169equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m175hashCodeimpl(this.data);
    }

    public String toString() {
        return m207toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static int m159compareTo7apg3OU(byte b3, byte b10) {
        return Intrinsics.compare(b3 & MAX_VALUE, b10 & MAX_VALUE);
    }
}
