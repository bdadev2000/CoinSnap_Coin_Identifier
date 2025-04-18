package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* loaded from: classes4.dex */
public interface TimeSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @SinceKotlin(version = "1.9")
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004\u0082\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", "", "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        /* loaded from: classes4.dex */
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j3) {
                this.reading = j3;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1624boximpl(long j3) {
                return new ValueTimeMark(j3);
            }

            /* renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m1625compareTo6eNON_k(long j3, long j10) {
                return Duration.m1483compareToLRDsOJo(m1634minus6eNON_k(j3, j10), Duration.INSTANCE.m1587getZEROUwyO8pc());
            }

            /* renamed from: compareTo-impl, reason: not valid java name */
            public static int m1626compareToimpl(long j3, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1624boximpl(j3).compareTo(other);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m1627constructorimpl(long j3) {
                return j3;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1629equalsimpl(long j3, Object obj) {
                return (obj instanceof ValueTimeMark) && j3 == ((ValueTimeMark) obj).getReading();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1630equalsimpl0(long j3, long j10) {
                return j3 == j10;
            }

            /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1631hasNotPassedNowimpl(long j3) {
                return Duration.m1517isNegativeimpl(m1628elapsedNowUwyO8pc(j3));
            }

            /* renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1632hasPassedNowimpl(long j3) {
                return !Duration.m1517isNegativeimpl(m1628elapsedNowUwyO8pc(j3));
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1633hashCodeimpl(long j3) {
                return Long.hashCode(j3);
            }

            /* renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m1634minus6eNON_k(long j3, long j10) {
                return MonotonicTimeSource.INSTANCE.m1616differenceBetweenfRLX17w(j3, j10);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1638toStringimpl(long j3) {
                return "ValueTimeMark(reading=" + j3 + ')';
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo1474elapsedNowUwyO8pc() {
                return m1628elapsedNowUwyO8pc(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object obj) {
                return m1629equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1631hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1632hasPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m1633hashCodeimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1475minusLRDsOJo(long j3) {
                return m1624boximpl(m1639minusLRDsOJo(j3));
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public long mo1476minusUwyO8pc(ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1636minusUwyO8pc(this.reading, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1477plusLRDsOJo(long j3) {
                return m1624boximpl(m1640plusLRDsOJo(j3));
            }

            public String toString() {
                return m1638toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1628elapsedNowUwyO8pc(long j3) {
                return MonotonicTimeSource.INSTANCE.m1617elapsedFrom6eNON_k(j3);
            }

            /* renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m1636minusUwyO8pc(long j3, ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m1634minus6eNON_k(j3, ((ValueTimeMark) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m1638toStringimpl(j3)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1475minusLRDsOJo(long j3) {
                return m1624boximpl(m1639minusLRDsOJo(j3));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1477plusLRDsOJo(long j3) {
                return m1624boximpl(m1640plusLRDsOJo(j3));
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1639minusLRDsOJo(long j3) {
                return m1635minusLRDsOJo(this.reading, j3);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1640plusLRDsOJo(long j3) {
                return m1637plusLRDsOJo(this.reading, j3);
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1635minusLRDsOJo(long j3, long j10) {
                return MonotonicTimeSource.INSTANCE.m1615adjustReading6QKq23U(j3, Duration.m1537unaryMinusUwyO8pc(j10));
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1637plusLRDsOJo(long j3, long j10) {
                return MonotonicTimeSource.INSTANCE.m1615adjustReading6QKq23U(j3, j10);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m1624boximpl(m1623markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1623markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1618markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m1624boximpl(m1623markNowz9LOYto());
        }
    }

    @SinceKotlin(version = "1.9")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @WasExperimental(markerClass = {ExperimentalTime.class})
    /* loaded from: classes4.dex */
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
