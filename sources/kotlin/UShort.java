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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0010J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b'\u0010\u0010J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b(\u0010\u0013J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b3\u0010\u0010J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b4\u0010\u0013J\u0018\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b:\u0010\u0013J\u0018\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b;\u0010\u001fJ\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b@\u0010\u0010J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bA\u0010\u0013J\u0018\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bK\u0010\u0010J\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bL\u0010\u0013J\u0018\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\bP\u0010\u0010J\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bQ\u0010\u0013J\u0018\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0013\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0013\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UShort;", "", DataSchemeDataSource.SCHEME_DATA, "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", "other", "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes4.dex */
public final class UShort implements Comparable<UShort> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private /* synthetic */ UShort(short s5) {
        this.data = s5;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw */
    private static final short m419andxj2QHRw(short s5, short s10) {
        return m426constructorimpl((short) (s5 & s10));
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UShort m420boximpl(short s5) {
        return new UShort(s5);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m421compareTo7apg3OU(short s5, byte b3) {
        return Intrinsics.compare(s5 & MAX_VALUE, b3 & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m422compareToVKZWuLQ(short s5, long j3) {
        return Long.compare(ULong.m319constructorimpl(s5 & 65535) ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m423compareToWZ4Q5Ns(short s5, int i10) {
        return Integer.compare(UInt.m240constructorimpl(s5 & MAX_VALUE) ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private int m424compareToxj2QHRw(short s5) {
        return Intrinsics.compare(getData() & MAX_VALUE, s5 & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static short m426constructorimpl(short s5) {
        return s5;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg */
    private static final short m427decMh2AYeg(short s5) {
        return m426constructorimpl((short) (s5 - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m428div7apg3OU(short s5, byte b3) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m429divVKZWuLQ(short s5, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(s5 & 65535);
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
    private static final int m430divWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m431divxj2QHRw(short s5, short s10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(s10 & MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m432equalsimpl(short s5, Object obj) {
        return (obj instanceof UShort) && s5 == ((UShort) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m433equalsimpl0(short s5, short s10) {
        return s5 == s10;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m434floorDiv7apg3OU(short s5, byte b3) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m435floorDivVKZWuLQ(short s5, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(s5 & 65535);
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
    private static final int m436floorDivWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m437floorDivxj2QHRw(short s5, short s10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) / (UInt.m240constructorimpl(s10 & MAX_VALUE) & 4294967295L));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m438hashCodeimpl(short s5) {
        return Short.hashCode(s5);
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg */
    private static final short m439incMh2AYeg(short s5) {
        return m426constructorimpl((short) (s5 + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg */
    private static final short m440invMh2AYeg(short s5) {
        return m426constructorimpl((short) (~s5));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m441minus7apg3OU(short s5, byte b3) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & MAX_VALUE) - UInt.m240constructorimpl(b3 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m442minusVKZWuLQ(short s5, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(s5 & 65535) - j3);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m443minusWZ4Q5Ns(short s5, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & MAX_VALUE) - i10);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m444minusxj2QHRw(short s5, short s10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & MAX_VALUE) - UInt.m240constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m445mod7apg3OU(short s5, byte b3) {
        return UByte.m163constructorimpl((byte) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m446modVKZWuLQ(short s5, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(s5 & 65535);
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
    private static final int m447modWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m448modxj2QHRw(short s5, short s10) {
        return m426constructorimpl((short) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(s10 & MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw */
    private static final short m449orxj2QHRw(short s5, short s10) {
        return m426constructorimpl((short) (s5 | s10));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m450plus7apg3OU(short s5, byte b3) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) + UInt.m240constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m451plusVKZWuLQ(short s5, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(s5 & 65535) + j3);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m452plusWZ4Q5Ns(short s5, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m453plusxj2QHRw(short s5, short s10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s10 & MAX_VALUE) + UInt.m240constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw */
    private static final UIntRange m454rangeToxj2QHRw(short s5, short s10) {
        return new UIntRange(UInt.m240constructorimpl(s5 & MAX_VALUE), UInt.m240constructorimpl(s10 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw */
    private static final UIntRange m455rangeUntilxj2QHRw(short s5, short s10) {
        return URangesKt.m1412untilJ1ME1BU(UInt.m240constructorimpl(s5 & MAX_VALUE), UInt.m240constructorimpl(s10 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m456rem7apg3OU(short s5, byte b3) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m457remVKZWuLQ(short s5, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(s5 & 65535);
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
    private static final int m458remWZ4Q5Ns(short s5, int i10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (i10 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m459remxj2QHRw(short s5, short s10) {
        return (int) ((UInt.m240constructorimpl(s5 & MAX_VALUE) & 4294967295L) % (UInt.m240constructorimpl(s10 & MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m460times7apg3OU(short s5, byte b3) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(b3 & UByte.MAX_VALUE) * UInt.m240constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m461timesVKZWuLQ(short s5, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(s5 & 65535) * j3);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m462timesWZ4Q5Ns(short s5, int i10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s5 & MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m463timesxj2QHRw(short s5, short s10) {
        return UInt.m240constructorimpl(UInt.m240constructorimpl(s10 & MAX_VALUE) * UInt.m240constructorimpl(s5 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m464toByteimpl(short s5) {
        return (byte) s5;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m465toDoubleimpl(short s5) {
        return s5 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m466toFloatimpl(short s5) {
        return s5 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m467toIntimpl(short s5) {
        return s5 & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m468toLongimpl(short s5) {
        return s5 & 65535;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m469toShortimpl(short s5) {
        return s5;
    }

    /* renamed from: toString-impl */
    public static String m470toStringimpl(short s5) {
        return String.valueOf(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m471toUBytew2LRezQ(short s5) {
        return UByte.m163constructorimpl((byte) s5);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m472toUIntpVg5ArA(short s5) {
        return UInt.m240constructorimpl(s5 & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m473toULongsVKNKU(short s5) {
        return ULong.m319constructorimpl(s5 & 65535);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m474toUShortMh2AYeg(short s5) {
        return s5;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw */
    private static final short m475xorxj2QHRw(short s5, short s10) {
        return m426constructorimpl((short) (s5 ^ s10));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m432equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m438hashCodeimpl(this.data);
    }

    public String toString() {
        return m470toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static int m425compareToxj2QHRw(short s5, short s10) {
        return Intrinsics.compare(s5 & MAX_VALUE, s10 & MAX_VALUE);
    }
}
