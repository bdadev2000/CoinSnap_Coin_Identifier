package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* compiled from: UByte.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b'\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0013\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u000fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b4\u0010\u0012J\u0018\u00102\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b5\u0010\u001fJ\u0018\u00102\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b6\u0010\u0018J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u0010\u000bJ\u0018\u00107\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b9\u0010\u0012J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b:\u0010\u001fJ\u0018\u00107\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u000bJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u000fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010?\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bB\u0010\u001fJ\u0018\u0010?\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bC\u0010\u0018J\u0018\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bI\u0010GJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bK\u0010\u000fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bL\u0010\u0012J\u0018\u0010J\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bM\u0010\u001fJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bP\u0010\u000fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\bQ\u0010\u0012J\u0018\u0010O\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\bR\u0010\u001fJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\rH\u0087\b¢\u0006\u0004\b_\u0010-J\u0010\u0010`\u001a\u00020aH\u0087\b¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020eH\u0087\b¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0013\u0010l\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\bm\u0010\u0005J\u0013\u0010n\u001a\u00020\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0013\u0010p\u001a\u00020\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\bq\u0010cJ\u0013\u0010r\u001a\u00020\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\bs\u0010gJ\u0018\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0004\n\u0002\b!¨\u0006w"}, d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "and", "other", "and-7apg3OU", "(BB)B", "compareTo", "", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec", "dec-w2LRezQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(B)I", "inc", "inc-w2LRezQ", "inv", "inv-w2LRezQ", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or", "or-7apg3OU", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "toByte-impl", "toDouble", "", "toDouble-impl", "(B)D", "toFloat", "", "toFloat-impl", "(B)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(B)J", "toShort", "", "toShort-impl", "(B)S", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-7apg3OU", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes6.dex */
public final class UByte implements Comparable<UByte> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* renamed from: box-impl */
    public static final /* synthetic */ UByte m8286boximpl(byte b) {
        return new UByte(b);
    }

    /* renamed from: constructor-impl */
    public static byte m8292constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl */
    public static boolean m8298equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).getData();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m8299equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl */
    public static int m8304hashCodeimpl(byte b) {
        return Byte.hashCode(b);
    }

    /* renamed from: toByte-impl */
    private static final byte m8330toByteimpl(byte b) {
        return b;
    }

    /* renamed from: toDouble-impl */
    private static final double m8331toDoubleimpl(byte b) {
        return b & 255;
    }

    /* renamed from: toFloat-impl */
    private static final float m8332toFloatimpl(byte b) {
        return b & 255;
    }

    /* renamed from: toInt-impl */
    private static final int m8333toIntimpl(byte b) {
        return b & 255;
    }

    /* renamed from: toLong-impl */
    private static final long m8334toLongimpl(byte b) {
        return b & 255;
    }

    /* renamed from: toShort-impl */
    private static final short m8335toShortimpl(byte b) {
        return (short) (b & 255);
    }

    /* renamed from: toUByte-w2LRezQ */
    private static final byte m8337toUBytew2LRezQ(byte b) {
        return b;
    }

    public boolean equals(Object obj) {
        return m8298equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m8304hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & 255, uByte.getData() & 255);
    }

    private /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    /* compiled from: UByte.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UByte;", "B", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: compareTo-7apg3OU */
    private int m8287compareTo7apg3OU(byte b) {
        return Intrinsics.compare(getData() & 255, b & 255);
    }

    /* renamed from: compareTo-7apg3OU */
    private static int m8288compareTo7apg3OU(byte b, byte b2) {
        return Intrinsics.compare(b & 255, b2 & 255);
    }

    /* renamed from: compareTo-xj2QHRw */
    private static final int m8291compareToxj2QHRw(byte b, short s) {
        return Intrinsics.compare(b & 255, s & UShort.MAX_VALUE);
    }

    /* renamed from: compareTo-WZ4Q5Ns */
    private static final int m8290compareToWZ4Q5Ns(byte b, int i) {
        return Integer.compareUnsigned(UInt.m8369constructorimpl(b & 255), i);
    }

    /* renamed from: compareTo-VKZWuLQ */
    private static final int m8289compareToVKZWuLQ(byte b, long j) {
        return Long.compareUnsigned(ULong.m8448constructorimpl(b & 255), j);
    }

    /* renamed from: plus-7apg3OU */
    private static final int m8316plus7apg3OU(byte b, byte b2) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) + UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: plus-xj2QHRw */
    private static final int m8319plusxj2QHRw(byte b, short s) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) + UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: plus-WZ4Q5Ns */
    private static final int m8318plusWZ4Q5Ns(byte b, int i) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) + i);
    }

    /* renamed from: plus-VKZWuLQ */
    private static final long m8317plusVKZWuLQ(byte b, long j) {
        return ULong.m8448constructorimpl(ULong.m8448constructorimpl(b & 255) + j);
    }

    /* renamed from: minus-7apg3OU */
    private static final int m8307minus7apg3OU(byte b, byte b2) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) - UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: minus-xj2QHRw */
    private static final int m8310minusxj2QHRw(byte b, short s) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) - UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: minus-WZ4Q5Ns */
    private static final int m8309minusWZ4Q5Ns(byte b, int i) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) - i);
    }

    /* renamed from: minus-VKZWuLQ */
    private static final long m8308minusVKZWuLQ(byte b, long j) {
        return ULong.m8448constructorimpl(ULong.m8448constructorimpl(b & 255) - j);
    }

    /* renamed from: times-7apg3OU */
    private static final int m8326times7apg3OU(byte b, byte b2) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) * UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: times-xj2QHRw */
    private static final int m8329timesxj2QHRw(byte b, short s) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) * UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: times-WZ4Q5Ns */
    private static final int m8328timesWZ4Q5Ns(byte b, int i) {
        return UInt.m8369constructorimpl(UInt.m8369constructorimpl(b & 255) * i);
    }

    /* renamed from: times-VKZWuLQ */
    private static final long m8327timesVKZWuLQ(byte b, long j) {
        return ULong.m8448constructorimpl(ULong.m8448constructorimpl(b & 255) * j);
    }

    /* renamed from: div-7apg3OU */
    private static final int m8294div7apg3OU(byte b, byte b2) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: div-xj2QHRw */
    private static final int m8297divxj2QHRw(byte b, short s) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: div-WZ4Q5Ns */
    private static final int m8296divWZ4Q5Ns(byte b, int i) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), i);
    }

    /* renamed from: div-VKZWuLQ */
    private static final long m8295divVKZWuLQ(byte b, long j) {
        return Long.divideUnsigned(ULong.m8448constructorimpl(b & 255), j);
    }

    /* renamed from: rem-7apg3OU */
    private static final int m8322rem7apg3OU(byte b, byte b2) {
        return Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: rem-xj2QHRw */
    private static final int m8325remxj2QHRw(byte b, short s) {
        return Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: rem-WZ4Q5Ns */
    private static final int m8324remWZ4Q5Ns(byte b, int i) {
        return Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), i);
    }

    /* renamed from: rem-VKZWuLQ */
    private static final long m8323remVKZWuLQ(byte b, long j) {
        return Long.remainderUnsigned(ULong.m8448constructorimpl(b & 255), j);
    }

    /* renamed from: floorDiv-7apg3OU */
    private static final int m8300floorDiv7apg3OU(byte b, byte b2) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: floorDiv-xj2QHRw */
    private static final int m8303floorDivxj2QHRw(byte b, short s) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(s & UShort.MAX_VALUE));
    }

    /* renamed from: floorDiv-WZ4Q5Ns */
    private static final int m8302floorDivWZ4Q5Ns(byte b, int i) {
        return Integer.divideUnsigned(UInt.m8369constructorimpl(b & 255), i);
    }

    /* renamed from: floorDiv-VKZWuLQ */
    private static final long m8301floorDivVKZWuLQ(byte b, long j) {
        return Long.divideUnsigned(ULong.m8448constructorimpl(b & 255), j);
    }

    /* renamed from: mod-7apg3OU */
    private static final byte m8311mod7apg3OU(byte b, byte b2) {
        return m8292constructorimpl((byte) Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255)));
    }

    /* renamed from: mod-xj2QHRw */
    private static final short m8314modxj2QHRw(byte b, short s) {
        return UShort.m8555constructorimpl((short) Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(s & UShort.MAX_VALUE)));
    }

    /* renamed from: mod-WZ4Q5Ns */
    private static final int m8313modWZ4Q5Ns(byte b, int i) {
        return Integer.remainderUnsigned(UInt.m8369constructorimpl(b & 255), i);
    }

    /* renamed from: mod-VKZWuLQ */
    private static final long m8312modVKZWuLQ(byte b, long j) {
        return Long.remainderUnsigned(ULong.m8448constructorimpl(b & 255), j);
    }

    /* renamed from: inc-w2LRezQ */
    private static final byte m8305incw2LRezQ(byte b) {
        return m8292constructorimpl((byte) (b + 1));
    }

    /* renamed from: dec-w2LRezQ */
    private static final byte m8293decw2LRezQ(byte b) {
        return m8292constructorimpl((byte) (b - 1));
    }

    /* renamed from: rangeTo-7apg3OU */
    private static final UIntRange m8320rangeTo7apg3OU(byte b, byte b2) {
        return new UIntRange(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255), null);
    }

    /* renamed from: rangeUntil-7apg3OU */
    private static final UIntRange m8321rangeUntil7apg3OU(byte b, byte b2) {
        return URangesKt.m9542untilJ1ME1BU(UInt.m8369constructorimpl(b & 255), UInt.m8369constructorimpl(b2 & 255));
    }

    /* renamed from: and-7apg3OU */
    private static final byte m8285and7apg3OU(byte b, byte b2) {
        return m8292constructorimpl((byte) (b & b2));
    }

    /* renamed from: or-7apg3OU */
    private static final byte m8315or7apg3OU(byte b, byte b2) {
        return m8292constructorimpl((byte) (b | b2));
    }

    /* renamed from: xor-7apg3OU */
    private static final byte m8341xor7apg3OU(byte b, byte b2) {
        return m8292constructorimpl((byte) (b ^ b2));
    }

    /* renamed from: inv-w2LRezQ */
    private static final byte m8306invw2LRezQ(byte b) {
        return m8292constructorimpl((byte) (~b));
    }

    /* renamed from: toUShort-Mh2AYeg */
    private static final short m8340toUShortMh2AYeg(byte b) {
        return UShort.m8555constructorimpl((short) (b & 255));
    }

    /* renamed from: toUInt-pVg5ArA */
    private static final int m8338toUIntpVg5ArA(byte b) {
        return UInt.m8369constructorimpl(b & 255);
    }

    /* renamed from: toULong-s-VKNKU */
    private static final long m8339toULongsVKNKU(byte b) {
        return ULong.m8448constructorimpl(b & 255);
    }

    /* renamed from: toString-impl */
    public static String m8336toStringimpl(byte b) {
        return String.valueOf(b & 255);
    }

    public String toString() {
        return m8336toStringimpl(this.data);
    }
}
