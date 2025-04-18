package kotlin;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

@SinceKotlin(version = "1.5")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b%\u0010\u000fJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b&\u0010\u000bJ\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0005J\u0013\u0010+\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b,\u0010\u0005J\u0013\u0010-\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b.\u0010\u0005J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b0\u0010\u000fJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b1\u0010\u000bJ\u0018\u0010/\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b2\u0010\u001dJ\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\b3\u0010\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u000bJ\u0018\u00104\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b8\u0010\u001dJ\u0018\u00104\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b<\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\b>\u0010\u000fJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u000bJ\u0018\u0010=\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b@\u0010\u001dJ\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bA\u0010\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020C2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bG\u0010EJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bI\u0010\u000fJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bJ\u0010\u000bJ\u0018\u0010H\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bK\u0010\u001dJ\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bL\u0010\u0016J\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bO\u0010\u000bJ\u001b\u0010P\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0003H\u0087\fø\u0001\u0000¢\u0006\u0004\bQ\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0087\n¢\u0006\u0004\bS\u0010\u000fJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bT\u0010\u000bJ\u0018\u0010R\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\bU\u0010\u001dJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0014H\u0087\n¢\u0006\u0004\bV\u0010\u0016J\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\\H\u0087\b¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020`H\u0087\b¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bd\u0010\u0005J\u0010\u0010e\u001a\u00020fH\u0087\b¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020jH\u0087\b¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020nH\u0016¢\u0006\u0004\bo\u0010pJ\u0013\u0010q\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\br\u0010ZJ\u0013\u0010s\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bt\u0010\u0005J\u0013\u0010u\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\bv\u0010hJ\u0013\u0010w\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\bx\u0010lJ\u0018\u0010y\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bz\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006|"}, d2 = {"Lkotlin/UInt;", "", DataSchemeDataSource.SCHEME_DATA, "", "constructor-impl", "(I)I", "getData$annotations", "()V", "and", "other", "and-WZ4Q5Ns", "(II)I", "compareTo", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec", "dec-pVg5ArA", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "inc", "inc-pVg5ArA", "inv", "inv-pVg5ArA", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(IB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or", "or-WZ4Q5Ns", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-WZ4Q5Ns", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "shl", "bitCount", "shl-pVg5ArA", "shr", "shr-pVg5ArA", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(I)B", "toDouble", "", "toDouble-impl", "(I)D", "toFloat", "", "toFloat-impl", "(I)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(I)J", "toShort", "", "toShort-impl", "(I)S", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-WZ4Q5Ns", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes4.dex */
public final class UInt implements Comparable<UInt> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UInt$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UInt;", "I", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    private /* synthetic */ UInt(int i10) {
        this.data = i10;
    }

    @InlineOnly
    /* renamed from: and-WZ4Q5Ns */
    private static final int m233andWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 & i11);
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ UInt m234boximpl(int i10) {
        return new UInt(i10);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU */
    private static final int m235compareTo7apg3OU(int i10, byte b3) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, m240constructorimpl(b3 & UByte.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ */
    private static final int m236compareToVKZWuLQ(int i10, long j3) {
        return Long.compare(ULong.m319constructorimpl(i10 & 4294967295L) ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private int m237compareToWZ4Q5Ns(int i10) {
        return UnsignedKt.uintCompare(getData(), i10);
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw */
    private static final int m239compareToxj2QHRw(int i10, short s5) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, m240constructorimpl(s5 & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl */
    public static int m240constructorimpl(int i10) {
        return i10;
    }

    @InlineOnly
    /* renamed from: dec-pVg5ArA */
    private static final int m241decpVg5ArA(int i10) {
        return m240constructorimpl(i10 - 1);
    }

    @InlineOnly
    /* renamed from: div-7apg3OU */
    private static final int m242div7apg3OU(int i10, byte b3) {
        return (int) ((i10 & 4294967295L) / (m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ */
    private static final long m243divVKZWuLQ(int i10, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(i10 & 4294967295L);
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
    private static final int m244divWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.m496uintDivideJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw */
    private static final int m245divxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) / (m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    /* renamed from: equals-impl */
    public static boolean m246equalsimpl(int i10, Object obj) {
        return (obj instanceof UInt) && i10 == ((UInt) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m247equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU */
    private static final int m248floorDiv7apg3OU(int i10, byte b3) {
        return (int) ((i10 & 4294967295L) / (m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m249floorDivVKZWuLQ(int i10, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(i10 & 4294967295L);
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
    private static final int m250floorDivWZ4Q5Ns(int i10, int i11) {
        return (int) ((i10 & 4294967295L) / (i11 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw */
    private static final int m251floorDivxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) / (m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m252hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    @InlineOnly
    /* renamed from: inc-pVg5ArA */
    private static final int m253incpVg5ArA(int i10) {
        return m240constructorimpl(i10 + 1);
    }

    @InlineOnly
    /* renamed from: inv-pVg5ArA */
    private static final int m254invpVg5ArA(int i10) {
        return m240constructorimpl(~i10);
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU */
    private static final int m255minus7apg3OU(int i10, byte b3) {
        return m240constructorimpl(i10 - m240constructorimpl(b3 & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ */
    private static final long m256minusVKZWuLQ(int i10, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(i10 & 4294967295L) - j3);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns */
    private static final int m257minusWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 - i11);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw */
    private static final int m258minusxj2QHRw(int i10, short s5) {
        return m240constructorimpl(i10 - m240constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU */
    private static final byte m259mod7apg3OU(int i10, byte b3) {
        return UByte.m163constructorimpl((byte) ((i10 & 4294967295L) % (m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ */
    private static final long m260modVKZWuLQ(int i10, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(i10 & 4294967295L);
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
    private static final int m261modWZ4Q5Ns(int i10, int i11) {
        return (int) ((i10 & 4294967295L) % (i11 & 4294967295L));
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw */
    private static final short m262modxj2QHRw(int i10, short s5) {
        return UShort.m426constructorimpl((short) ((i10 & 4294967295L) % (m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L)));
    }

    @InlineOnly
    /* renamed from: or-WZ4Q5Ns */
    private static final int m263orWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 | i11);
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU */
    private static final int m264plus7apg3OU(int i10, byte b3) {
        return m240constructorimpl(m240constructorimpl(b3 & UByte.MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ */
    private static final long m265plusVKZWuLQ(int i10, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(i10 & 4294967295L) + j3);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns */
    private static final int m266plusWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 + i11);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw */
    private static final int m267plusxj2QHRw(int i10, short s5) {
        return m240constructorimpl(m240constructorimpl(s5 & UShort.MAX_VALUE) + i10);
    }

    @InlineOnly
    /* renamed from: rangeTo-WZ4Q5Ns */
    private static final UIntRange m268rangeToWZ4Q5Ns(int i10, int i11) {
        return new UIntRange(i10, i11, null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: rangeUntil-WZ4Q5Ns */
    private static final UIntRange m269rangeUntilWZ4Q5Ns(int i10, int i11) {
        return URangesKt.m1412untilJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU */
    private static final int m270rem7apg3OU(int i10, byte b3) {
        return (int) ((i10 & 4294967295L) % (m240constructorimpl(b3 & UByte.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ */
    private static final long m271remVKZWuLQ(int i10, long j3) {
        long m319constructorimpl = ULong.m319constructorimpl(i10 & 4294967295L);
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
    private static final int m272remWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.m497uintRemainderJ1ME1BU(i10, i11);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw */
    private static final int m273remxj2QHRw(int i10, short s5) {
        return (int) ((i10 & 4294967295L) % (m240constructorimpl(s5 & UShort.MAX_VALUE) & 4294967295L));
    }

    @InlineOnly
    /* renamed from: shl-pVg5ArA */
    private static final int m274shlpVg5ArA(int i10, int i11) {
        return m240constructorimpl(i10 << i11);
    }

    @InlineOnly
    /* renamed from: shr-pVg5ArA */
    private static final int m275shrpVg5ArA(int i10, int i11) {
        return m240constructorimpl(i10 >>> i11);
    }

    @InlineOnly
    /* renamed from: times-7apg3OU */
    private static final int m276times7apg3OU(int i10, byte b3) {
        return m240constructorimpl(m240constructorimpl(b3 & UByte.MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ */
    private static final long m277timesVKZWuLQ(int i10, long j3) {
        return ULong.m319constructorimpl(ULong.m319constructorimpl(i10 & 4294967295L) * j3);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns */
    private static final int m278timesWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 * i11);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw */
    private static final int m279timesxj2QHRw(int i10, short s5) {
        return m240constructorimpl(m240constructorimpl(s5 & UShort.MAX_VALUE) * i10);
    }

    @InlineOnly
    /* renamed from: toByte-impl */
    private static final byte m280toByteimpl(int i10) {
        return (byte) i10;
    }

    @InlineOnly
    /* renamed from: toDouble-impl */
    private static final double m281toDoubleimpl(int i10) {
        return UnsignedKt.uintToDouble(i10);
    }

    @InlineOnly
    /* renamed from: toFloat-impl */
    private static final float m282toFloatimpl(int i10) {
        return (float) UnsignedKt.uintToDouble(i10);
    }

    @InlineOnly
    /* renamed from: toInt-impl */
    private static final int m283toIntimpl(int i10) {
        return i10;
    }

    @InlineOnly
    /* renamed from: toLong-impl */
    private static final long m284toLongimpl(int i10) {
        return i10 & 4294967295L;
    }

    @InlineOnly
    /* renamed from: toShort-impl */
    private static final short m285toShortimpl(int i10) {
        return (short) i10;
    }

    /* renamed from: toString-impl */
    public static String m286toStringimpl(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ */
    private static final byte m287toUBytew2LRezQ(int i10) {
        return UByte.m163constructorimpl((byte) i10);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA */
    private static final int m288toUIntpVg5ArA(int i10) {
        return i10;
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU */
    private static final long m289toULongsVKNKU(int i10) {
        return ULong.m319constructorimpl(i10 & 4294967295L);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg */
    private static final short m290toUShortMh2AYeg(int i10) {
        return UShort.m426constructorimpl((short) i10);
    }

    @InlineOnly
    /* renamed from: xor-WZ4Q5Ns */
    private static final int m291xorWZ4Q5Ns(int i10, int i11) {
        return m240constructorimpl(i10 ^ i11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    public boolean equals(Object obj) {
        return m246equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m252hashCodeimpl(this.data);
    }

    public String toString() {
        return m286toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns */
    private static int m238compareToWZ4Q5Ns(int i10, int i11) {
        return UnsignedKt.uintCompare(i10, i11);
    }
}
