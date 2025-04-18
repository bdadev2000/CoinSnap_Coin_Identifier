package kotlin.time;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes4.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m1612checkInfiniteSumDefinedPjuGub4(long j3, long j10, long j11) {
        if (!Duration.m1516isInfiniteimpl(j10) || (j3 ^ j11) >= 0) {
            return j3;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j3) {
        return j3 < 0 ? Duration.INSTANCE.m1586getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m1585getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j3) {
        return ((j3 - 1) | 1) == Long.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m1613saturatingAddNuflL3o(long j3, DurationUnit unit, long j10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(unit, "unit");
        long m1530toLongimpl = Duration.m1530toLongimpl(j10, unit);
        boolean z11 = true;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return m1612checkInfiniteSumDefinedPjuGub4(j3, j10, m1530toLongimpl);
        }
        if ((1 | (m1530toLongimpl - 1)) != Long.MAX_VALUE) {
            z11 = false;
        }
        if (z11) {
            return m1614saturatingAddInHalvesNuflL3o(j3, unit, j10);
        }
        long j11 = j3 + m1530toLongimpl;
        if (((j3 ^ j11) & (m1530toLongimpl ^ j11)) < 0) {
            if (j3 >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j11;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m1614saturatingAddInHalvesNuflL3o(long j3, DurationUnit durationUnit, long j10) {
        boolean z10;
        long m1487divUwyO8pc = Duration.m1487divUwyO8pc(j10, 2);
        long m1530toLongimpl = Duration.m1530toLongimpl(m1487divUwyO8pc, durationUnit);
        if ((1 | (m1530toLongimpl - 1)) == Long.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return m1530toLongimpl;
        }
        return m1613saturatingAddNuflL3o(m1613saturatingAddNuflL3o(j3, durationUnit, m1487divUwyO8pc), durationUnit, Duration.m1519minusLRDsOJo(j10, m1487divUwyO8pc));
    }

    public static final long saturatingDiff(long j3, long j10, DurationUnit unit) {
        boolean z10;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if ((1 | (j10 - 1)) == Long.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Duration.m1537unaryMinusUwyO8pc(infinityOfSign(j10));
        }
        return saturatingFiniteDiff(j3, j10, unit);
    }

    private static final long saturatingFiniteDiff(long j3, long j10, DurationUnit durationUnit) {
        long j11 = j3 - j10;
        if (((j11 ^ j3) & (~(j11 ^ j10))) < 0) {
            DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
            if (durationUnit.compareTo(durationUnit2) < 0) {
                long convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
                long j12 = (j3 / convertDurationUnit) - (j10 / convertDurationUnit);
                long j13 = (j3 % convertDurationUnit) - (j10 % convertDurationUnit);
                Duration.Companion companion = Duration.INSTANCE;
                return Duration.m1520plusLRDsOJo(DurationKt.toDuration(j12, durationUnit2), DurationKt.toDuration(j13, durationUnit));
            }
            return Duration.m1537unaryMinusUwyO8pc(infinityOfSign(j11));
        }
        return DurationKt.toDuration(j11, durationUnit);
    }

    public static final long saturatingOriginsDiff(long j3, long j10, DurationUnit unit) {
        boolean z10;
        Intrinsics.checkNotNullParameter(unit, "unit");
        boolean z11 = true;
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j3 == j10) {
                return Duration.INSTANCE.m1587getZEROUwyO8pc();
            }
            return Duration.m1537unaryMinusUwyO8pc(infinityOfSign(j10));
        }
        if ((1 | (j3 - 1)) != Long.MAX_VALUE) {
            z11 = false;
        }
        if (z11) {
            return infinityOfSign(j3);
        }
        return saturatingFiniteDiff(j3, j10, unit);
    }
}
