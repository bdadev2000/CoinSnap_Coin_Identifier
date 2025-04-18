package kotlin.ranges;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\r\u001a#\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\b*\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u00101\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u00103\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\b4\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001c\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\b?\u0010@\u001a\u001c\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010C\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0011\u0010G\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010G\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0012\u0010I\u001a\u00020\u0005*\u00020%H\u0087\b¢\u0006\u0002\u0010J\u001a\u0019\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010L\u001a\u0012\u0010I\u001a\u00020\b*\u00020/H\u0087\b¢\u0006\u0002\u0010M\u001a\u0019\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010N\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes4.dex */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1385coerceAtLeast5PvTz6A(short s5, short s10) {
        return Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s10) < 0 ? s10 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1386coerceAtLeastJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) < 0 ? i11 : i10;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1387coerceAtLeastKr8caGY(byte b3, byte b10) {
        return Intrinsics.compare(b3 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) < 0 ? b10 : b3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1388coerceAtLeasteb3DHEI(long j3, long j10) {
        return Long.compare(j3 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j10) < 0 ? j10 : j3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1389coerceAtMost5PvTz6A(short s5, short s10) {
        return Intrinsics.compare(s5 & UShort.MAX_VALUE, 65535 & s10) > 0 ? s10 : s5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1390coerceAtMostJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i11) > 0 ? i11 : i10;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1391coerceAtMostKr8caGY(byte b3, byte b10) {
        return Intrinsics.compare(b3 & UByte.MAX_VALUE, b10 & UByte.MAX_VALUE) > 0 ? b10 : b3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1392coerceAtMosteb3DHEI(long j3, long j10) {
        return Long.compare(j3 ^ Long.MIN_VALUE, Long.MIN_VALUE ^ j10) > 0 ? j10 : j3;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1393coerceInJPwROB0(long j3, ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m313boximpl(j3), (ClosedFloatingPointRange<ULong>) range)).getData();
        }
        if (!range.isEmpty()) {
            long j10 = j3 ^ Long.MIN_VALUE;
            if (Long.compare(j10, range.getStart().getData() ^ Long.MIN_VALUE) < 0) {
                return range.getStart().getData();
            }
            if (Long.compare(j10, range.getEndInclusive().getData() ^ Long.MIN_VALUE) > 0) {
                return range.getEndInclusive().getData();
            }
            return j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1394coerceInVKSA0NQ(short s5, short s10, short s11) {
        int i10 = s10 & UShort.MAX_VALUE;
        int i11 = s11 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = 65535 & s5;
            if (Intrinsics.compare(i12, i10) < 0) {
                return s10;
            }
            if (Intrinsics.compare(i12, i11) > 0) {
                return s11;
            }
            return s5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m470toStringimpl(s11)) + " is less than minimum " + ((Object) UShort.m470toStringimpl(s10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1395coerceInWZ9TVnA(int i10, int i11, int i12) {
        int i13 = i11 ^ Integer.MIN_VALUE;
        int i14 = i12 ^ Integer.MIN_VALUE;
        if (Integer.compare(i13, i14) <= 0) {
            int i15 = Integer.MIN_VALUE ^ i10;
            if (Integer.compare(i15, i13) < 0) {
                return i11;
            }
            if (Integer.compare(i15, i14) > 0) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m286toStringimpl(i12)) + " is less than minimum " + ((Object) UInt.m286toStringimpl(i11)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1396coerceInb33U2AM(byte b3, byte b10, byte b11) {
        int i10 = b10 & UByte.MAX_VALUE;
        int i11 = b11 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i10, i11) <= 0) {
            int i12 = b3 & UByte.MAX_VALUE;
            if (Intrinsics.compare(i12, i10) < 0) {
                return b10;
            }
            if (Intrinsics.compare(i12, i11) > 0) {
                return b11;
            }
            return b3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m207toStringimpl(b11)) + " is less than minimum " + ((Object) UByte.m207toStringimpl(b10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1397coerceInsambcqE(long j3, long j10, long j11) {
        long j12 = j10 ^ Long.MIN_VALUE;
        long j13 = j11 ^ Long.MIN_VALUE;
        if (Long.compare(j12, j13) <= 0) {
            long j14 = Long.MIN_VALUE ^ j3;
            if (Long.compare(j14, j12) < 0) {
                return j10;
            }
            if (Long.compare(j14, j13) > 0) {
                return j11;
            }
            return j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m365toStringimpl(j11)) + " is less than minimum " + ((Object) ULong.m365toStringimpl(j10)) + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1398coerceInwuiCnnA(int i10, ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m234boximpl(i10), (ClosedFloatingPointRange<UInt>) range)).getData();
        }
        if (!range.isEmpty()) {
            int i11 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i11, range.getStart().getData() ^ Integer.MIN_VALUE) < 0) {
                return range.getStart().getData();
            }
            if (Integer.compare(i11, range.getEndInclusive().getData() ^ Integer.MIN_VALUE) > 0) {
                return range.getEndInclusive().getData();
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1399contains68kG9v0(UIntRange contains, byte b3) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1372containsWZ4Q5Ns(UInt.m240constructorimpl(b3 & UByte.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1400containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        if (uLong != null && contains.m1381containsVKZWuLQ(uLong.getData())) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1401containsGab390E(ULongRange contains, int i10) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1381containsVKZWuLQ(ULong.m319constructorimpl(i10 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1402containsULbyJY(ULongRange contains, byte b3) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1381containsVKZWuLQ(ULong.m319constructorimpl(b3 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1403containsZsK3CEQ(UIntRange contains, short s5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1372containsWZ4Q5Ns(UInt.m240constructorimpl(s5 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1404containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        if (uInt != null && contains.m1372containsWZ4Q5Ns(uInt.getData())) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1405containsfz5IDCE(UIntRange contains, long j3) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        if (ULong.m319constructorimpl(j3 >>> 32) == 0 && contains.m1372containsWZ4Q5Ns(UInt.m240constructorimpl((int) j3))) {
            return true;
        }
        return false;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1406containsuhHAxoY(ULongRange contains, short s5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1381containsVKZWuLQ(ULong.m319constructorimpl(s5 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m1407downTo5PvTz6A(short s5, short s10) {
        return UIntProgression.INSTANCE.m1369fromClosedRangeNkh28Cs(UInt.m240constructorimpl(s5 & UShort.MAX_VALUE), UInt.m240constructorimpl(s10 & UShort.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m1408downToJ1ME1BU(int i10, int i11) {
        return UIntProgression.INSTANCE.m1369fromClosedRangeNkh28Cs(i10, i11, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m1409downToKr8caGY(byte b3, byte b10) {
        return UIntProgression.INSTANCE.m1369fromClosedRangeNkh28Cs(UInt.m240constructorimpl(b3 & UByte.MAX_VALUE), UInt.m240constructorimpl(b10 & UByte.MAX_VALUE), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m1410downToeb3DHEI(long j3, long j10) {
        return ULongProgression.INSTANCE.m1378fromClosedRange7ftBX0g(j3, j10, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m234boximpl(uIntProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m234boximpl(uIntProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.INSTANCE.m1369fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UIntProgression step(UIntProgression uIntProgression, int i10) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i10 > 0, Integer.valueOf(i10));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.m1369fromClosedRangeNkh28Cs(first, last, i10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m1411until5PvTz6A(short s5, short s10) {
        if (Intrinsics.compare(s10 & UShort.MAX_VALUE, 0) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(UInt.m240constructorimpl(s5 & UShort.MAX_VALUE), UInt.m240constructorimpl(UInt.m240constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static UIntRange m1412untilJ1ME1BU(int i10, int i11) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, Integer.MIN_VALUE) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(i10, UInt.m240constructorimpl(i11 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m1413untilKr8caGY(byte b3, byte b10) {
        if (Intrinsics.compare(b10 & UByte.MAX_VALUE, 0) <= 0) {
            return UIntRange.INSTANCE.getEMPTY();
        }
        return new UIntRange(UInt.m240constructorimpl(b3 & UByte.MAX_VALUE), UInt.m240constructorimpl(UInt.m240constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static ULongRange m1414untileb3DHEI(long j3, long j10) {
        if (Long.compare(j10 ^ Long.MIN_VALUE, Long.MIN_VALUE) <= 0) {
            return ULongRange.INSTANCE.getEMPTY();
        }
        return new ULongRange(j3, ULong.m319constructorimpl(j10 - ULong.m319constructorimpl(1 & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.7")
    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m313boximpl(uLongProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m313boximpl(uLongProgression.getLast());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.INSTANCE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.INSTANCE.m1378fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m234boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULongProgression step(ULongProgression uLongProgression, long j3) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j3 > 0, Long.valueOf(j3));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j3 = -j3;
        }
        return companion.m1378fromClosedRange7ftBX0g(first, last, j3);
    }

    @SinceKotlin(version = "1.7")
    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m313boximpl(URandomKt.nextULong(random, uLongRange));
    }
}
