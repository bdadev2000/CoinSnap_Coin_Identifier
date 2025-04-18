package kotlin;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001~B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b)\u0010\u001dJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010\u000bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0013\u00102\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010\u0005J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b6\u0010\u001fJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b8\u0010\"J\u0018\u00109\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010;J\u0018\u00109\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010\u0013J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u000bJ\u0018\u00109\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bA\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bC\u0010\u001dJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bD\u0010\u001fJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010\u000bJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bF\u0010\"J\u0018\u0010G\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020H2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bL\u0010JJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bN\u0010\u001dJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bO\u0010\u001fJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bQ\u0010\"J\u001b\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bT\u0010\u001fJ\u001b\u0010U\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\rH\u0087\fø\u0001\u0000¢\u0006\u0004\bV\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bX\u0010\u001dJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bY\u0010\u001fJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bZ\u0010\u000bJ\u0018\u0010W\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b[\u0010\"J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\rH\u0087\b¢\u0006\u0004\bi\u0010/J\u0010\u0010j\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bk\u0010\u0005J\u0010\u0010l\u001a\u00020mH\u0087\b¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bu\u0010_J\u0013\u0010v\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bw\u0010/J\u0013\u0010x\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\by\u0010\u0005J\u0013\u0010z\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b{\u0010oJ\u0018\u0010|\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b}\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006\u007f"}, d2 = {"Lkotlin/ULong;", "", DataSchemeDataSource.SCHEME_DATA, "", "constructor-impl", "(J)J", "getData$annotations", "()V", "and", "other", "and-VKZWuLQ", "(JJ)J", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "dec", "dec-s-VKNKU", TtmlNode.TAG_DIV, "div-7apg3OU", "(JB)J", "div-WZ4Q5Ns", "(JI)J", "div-VKZWuLQ", "div-xj2QHRw", "(JS)J", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(J)I", "inc", "inc-s-VKNKU", "inv", "inv-s-VKNKU", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(JB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(JS)S", "or", "or-VKZWuLQ", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(J)B", "toDouble", "", "toDouble-impl", "(J)D", "toFloat", "", "toFloat-impl", "(J)F", "toInt", "toInt-impl", "toLong", "toLong-impl", "toShort", "", "toShort-impl", "(J)S", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-VKZWuLQ", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes4.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/ULong;", "J", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private /* synthetic */ ULong(long j3) {
        this.data = j3;
    }

    @InlineOnly
    /* renamed from: and-VKZWuLQ */
    private static final long m312andVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 & j10);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ ULong m313boximpl(long j3) {
        return new ULong(j3);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m314compareTo7apg3OU(long j3, byte b3) {
        return Long.compare(j3 ^ Long.MIN_VALUE, m319constructorimpl(b3 & 255) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private int m315compareToVKZWuLQ(long j3) {
        return UnsignedKt.ulongCompare(getData(), j3);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m317compareToWZ4Q5Ns(long j3, int i10) {
        return Long.compare(j3 ^ Long.MIN_VALUE, m319constructorimpl(i10 & 4294967295L) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m318compareToxj2QHRw(long j3, short s5) {
        return Long.compare(j3 ^ Long.MIN_VALUE, m319constructorimpl(s5 & 65535) ^ Long.MIN_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static long m319constructorimpl(long j3) {
        return j3;
    }

    @InlineOnly
    /* renamed from: dec-s-VKNKU */
    private static final long m320decsVKNKU(long j3) {
        return m319constructorimpl(j3 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final long m321div7apg3OU(long j3, byte b3) {
        long m319constructorimpl = m319constructorimpl(b3 & 255);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m322divVKZWuLQ(long j3, long j10) {
        return UnsignedKt.m498ulongDivideeb3DHEI(j3, j10);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns */
    private static final long m323divWZ4Q5Ns(long j3, int i10) {
        long m319constructorimpl = m319constructorimpl(i10 & 4294967295L);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final long m324divxj2QHRw(long j3, short s5) {
        long m319constructorimpl = m319constructorimpl(s5 & 65535);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    /* renamed from: equals-impl */
    public static boolean m325equalsimpl(long j3, Object obj) {
        return (obj instanceof ULong) && j3 == ((ULong) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m326equalsimpl0(long j3, long j10) {
        return j3 == j10;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final long m327floorDiv7apg3OU(long j3, byte b3) {
        long m319constructorimpl = m319constructorimpl(b3 & 255);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m328floorDivVKZWuLQ(long j3, long j10) {
        if (j10 < 0) {
            return (j3 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / j10;
        }
        long j11 = ((j3 >>> 1) / j10) << 1;
        return j11 + (((j3 - (j11 * j10)) ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final long m329floorDivWZ4Q5Ns(long j3, int i10) {
        long m319constructorimpl = m319constructorimpl(i10 & 4294967295L);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final long m330floorDivxj2QHRw(long j3, short s5) {
        long m319constructorimpl = m319constructorimpl(s5 & 65535);
        if (m319constructorimpl < 0) {
            return (j3 ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j3 >= 0) {
            return j3 / m319constructorimpl;
        }
        long j10 = ((j3 >>> 1) / m319constructorimpl) << 1;
        return j10 + (((j3 - (j10 * m319constructorimpl)) ^ Long.MIN_VALUE) < (m319constructorimpl ^ Long.MIN_VALUE) ? 0 : 1);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m331hashCodeimpl(long j3) {
        return Long.hashCode(j3);
    }

    @InlineOnly
    /* renamed from: inc-s-VKNKU */
    private static final long m332incsVKNKU(long j3) {
        return m319constructorimpl(j3 + 1);
    }

    @InlineOnly
    /* renamed from: inv-s-VKNKU */
    private static final long m333invsVKNKU(long j3) {
        return m319constructorimpl(~j3);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final long m334minus7apg3OU(long j3, byte b3) {
        return m319constructorimpl(j3 - m319constructorimpl(b3 & 255));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m335minusVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 - j10);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final long m336minusWZ4Q5Ns(long j3, int i10) {
        return m319constructorimpl(j3 - m319constructorimpl(i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final long m337minusxj2QHRw(long j3, short s5) {
        return m319constructorimpl(j3 - m319constructorimpl(s5 & 65535));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-7apg3OU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final byte m338mod7apg3OU(long r8, byte r10) {
        /*
            long r0 = (long) r10
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = m319constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1a
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L18
            goto L31
        L18:
            long r8 = r8 - r0
            goto L31
        L1a:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L20
            long r8 = r8 % r0
            goto L31
        L20:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L2f
            goto L18
        L2f:
            r0 = r2
            goto L18
        L31:
            int r8 = (int) r8
            byte r8 = (byte) r8
            byte r8 = kotlin.UByte.m163constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m338mod7apg3OU(long, byte):byte");
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m339modVKZWuLQ(long j3, long j10) {
        if (j10 < 0) {
            if ((j3 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                return j3;
            }
        } else {
            if (j3 >= 0) {
                return j3 % j10;
            }
            j3 -= (((j3 >>> 1) / j10) << 1) * j10;
            if ((j3 ^ Long.MIN_VALUE) < (j10 ^ Long.MIN_VALUE)) {
                j10 = 0;
            }
        }
        return j3 - j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-WZ4Q5Ns */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int m340modWZ4Q5Ns(long r8, int r10) {
        /*
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = m319constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1d
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L1b
            goto L34
        L1b:
            long r8 = r8 - r0
            goto L34
        L1d:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L23
            long r8 = r8 % r0
            goto L34
        L23:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L32
            goto L1b
        L32:
            r0 = r2
            goto L1b
        L34:
            int r8 = (int) r8
            int r8 = kotlin.UInt.m240constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m340modWZ4Q5Ns(long, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((r8 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ r0)) goto L32;
     */
    @kotlin.internal.InlineOnly
    /* renamed from: mod-xj2QHRw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final short m341modxj2QHRw(long r8, short r10) {
        /*
            long r0 = (long) r10
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = m319constructorimpl(r0)
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = -9223372036854775808
            if (r10 >= 0) goto L1b
            long r2 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L19
            goto L32
        L19:
            long r8 = r8 - r0
            goto L32
        L1b:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 < 0) goto L21
            long r8 = r8 % r0
            goto L32
        L21:
            r10 = 1
            long r6 = r8 >>> r10
            long r6 = r6 / r0
            long r6 = r6 << r10
            long r6 = r6 * r0
            long r8 = r8 - r6
            long r6 = r8 ^ r4
            long r4 = r4 ^ r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 < 0) goto L30
            goto L19
        L30:
            r0 = r2
            goto L19
        L32:
            int r8 = (int) r8
            short r8 = (short) r8
            short r8 = kotlin.UShort.m426constructorimpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ULong.m341modxj2QHRw(long, short):short");
    }

    @InlineOnly
    /* renamed from: or-VKZWuLQ */
    private static final long m342orVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 | j10);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final long m343plus7apg3OU(long j3, byte b3) {
        return m319constructorimpl(m319constructorimpl(b3 & 255) + j3);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m344plusVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 + j10);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final long m345plusWZ4Q5Ns(long j3, int i10) {
        return m319constructorimpl(m319constructorimpl(i10 & 4294967295L) + j3);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final long m346plusxj2QHRw(long j3, short s5) {
        return m319constructorimpl(m319constructorimpl(s5 & 65535) + j3);
    }

    @InlineOnly
    /* renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m347rangeToVKZWuLQ(long j3, long j10) {
        return new ULongRange(j3, j10, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-VKZWuLQ */
    private static final ULongRange m348rangeUntilVKZWuLQ(long j3, long j10) {
        return URangesKt.m1414untileb3DHEI(j3, j10);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final long m349rem7apg3OU(long j3, byte b3) {
        long m319constructorimpl = m319constructorimpl(b3 & 255);
        if (m319constructorimpl < 0) {
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                return j3;
            }
        } else {
            if (j3 >= 0) {
                return j3 % m319constructorimpl;
            }
            j3 -= (((j3 >>> 1) / m319constructorimpl) << 1) * m319constructorimpl;
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                m319constructorimpl = 0;
            }
        }
        return j3 - m319constructorimpl;
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m350remVKZWuLQ(long j3, long j10) {
        return UnsignedKt.m499ulongRemaindereb3DHEI(j3, j10);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns */
    private static final long m351remWZ4Q5Ns(long j3, int i10) {
        long m319constructorimpl = m319constructorimpl(i10 & 4294967295L);
        if (m319constructorimpl < 0) {
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                return j3;
            }
        } else {
            if (j3 >= 0) {
                return j3 % m319constructorimpl;
            }
            j3 -= (((j3 >>> 1) / m319constructorimpl) << 1) * m319constructorimpl;
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                m319constructorimpl = 0;
            }
        }
        return j3 - m319constructorimpl;
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final long m352remxj2QHRw(long j3, short s5) {
        long m319constructorimpl = m319constructorimpl(s5 & 65535);
        if (m319constructorimpl < 0) {
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                return j3;
            }
        } else {
            if (j3 >= 0) {
                return j3 % m319constructorimpl;
            }
            j3 -= (((j3 >>> 1) / m319constructorimpl) << 1) * m319constructorimpl;
            if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ m319constructorimpl)) {
                m319constructorimpl = 0;
            }
        }
        return j3 - m319constructorimpl;
    }

    @InlineOnly
    /* renamed from: shl-s-VKNKU */
    private static final long m353shlsVKNKU(long j3, int i10) {
        return m319constructorimpl(j3 << i10);
    }

    @InlineOnly
    /* renamed from: shr-s-VKNKU */
    private static final long m354shrsVKNKU(long j3, int i10) {
        return m319constructorimpl(j3 >>> i10);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final long m355times7apg3OU(long j3, byte b3) {
        return m319constructorimpl(m319constructorimpl(b3 & 255) * j3);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m356timesVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 * j10);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final long m357timesWZ4Q5Ns(long j3, int i10) {
        return m319constructorimpl(m319constructorimpl(i10 & 4294967295L) * j3);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final long m358timesxj2QHRw(long j3, short s5) {
        return m319constructorimpl(m319constructorimpl(s5 & 65535) * j3);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m359toByteimpl(long j3) {
        return (byte) j3;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m360toDoubleimpl(long j3) {
        return UnsignedKt.ulongToDouble(j3);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m361toFloatimpl(long j3) {
        return (float) UnsignedKt.ulongToDouble(j3);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m362toIntimpl(long j3) {
        return (int) j3;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m363toLongimpl(long j3) {
        return j3;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m364toShortimpl(long j3) {
        return (short) j3;
    }

    /* renamed from: toString-impl */
    public static String m365toStringimpl(long j3) {
        return UnsignedKt.ulongToString(j3);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m366toUBytew2LRezQ(long j3) {
        return UByte.m163constructorimpl((byte) j3);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m367toUIntpVg5ArA(long j3) {
        return UInt.m240constructorimpl((int) j3);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m368toULongsVKNKU(long j3) {
        return j3;
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m369toUShortMh2AYeg(long j3) {
        return UShort.m426constructorimpl((short) j3);
    }

    @InlineOnly
    /* renamed from: xor-VKZWuLQ */
    private static final long m370xorVKZWuLQ(long j3, long j10) {
        return m319constructorimpl(j3 ^ j10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object obj) {
        return m325equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m331hashCodeimpl(this.data);
    }

    public String toString() {
        return m365toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static int m316compareToVKZWuLQ(long j3, long j10) {
        return UnsignedKt.ulongCompare(j3, j10);
    }
}
