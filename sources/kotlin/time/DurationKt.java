package kotlin.time;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001d\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010G\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010H\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"\u001e\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1495:1\n1447#1,6:1497\n1450#1,3:1503\n1447#1,6:1506\n1447#1,6:1512\n1450#1,3:1521\n1#2:1496\n1726#3,3:1518\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1497,6\n1405#1:1503,3\n1408#1:1506,6\n1411#1:1512,6\n1447#1:1521,3\n1436#1:1518,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long j3, int i10) {
        return durationOf(j3, i10);
    }

    public static final /* synthetic */ long access$durationOfMillis(long j3) {
        return durationOfMillis(j3);
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long j3) {
        return durationOfMillisNormalized(j3);
    }

    public static final /* synthetic */ long access$durationOfNanos(long j3) {
        return durationOfNanos(j3);
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long j3) {
        return durationOfNanosNormalized(j3);
    }

    public static final /* synthetic */ long access$millisToNanos(long j3) {
        return millisToNanos(j3);
    }

    public static final /* synthetic */ long access$nanosToMillis(long j3) {
        return nanosToMillis(j3);
    }

    public static final /* synthetic */ long access$parseDuration(String str, boolean z10) {
        return parseDuration(str, z10);
    }

    public static final long durationOf(long j3, int i10) {
        return Duration.m1484constructorimpl((j3 << 1) + i10);
    }

    public static final long durationOfMillis(long j3) {
        return Duration.m1484constructorimpl((j3 << 1) + 1);
    }

    public static final long durationOfMillisNormalized(long j3) {
        if (new LongRange(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j3)) {
            return durationOfNanos(millisToNanos(j3));
        }
        return durationOfMillis(RangesKt.coerceIn(j3, -4611686018427387903L, MAX_MILLIS));
    }

    public static final long durationOfNanos(long j3) {
        return Duration.m1484constructorimpl(j3 << 1);
    }

    public static final long durationOfNanosNormalized(long j3) {
        if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(j3)) {
            return durationOfNanos(j3);
        }
        return durationOfMillis(nanosToMillis(j3));
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d10) {
    }

    public static final long millisToNanos(long j3) {
        return j3 * NANOS_IN_MILLIS;
    }

    public static final long nanosToMillis(long j3) {
        return j3 / NANOS_IN_MILLIS;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[LOOP:1: B:25:0x0062->B:33:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[EDGE_INSN: B:34:0x008b->B:35:0x008b BREAK  A[LOOP:1: B:25:0x0062->B:33:0x0087], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long parseDuration(java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.parseDuration(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long parseOverLongIsoComponent(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L16
            java.lang.String r3 = "+-"
            char r4 = r7.charAt(r2)
            boolean r3 = kotlin.text.StringsKt.c(r3, r4)
            if (r3 == 0) goto L16
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r0 = r0 - r3
            r4 = 16
            if (r0 <= r4) goto L6b
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r4 = kotlin.text.StringsKt.getLastIndex(r7)
            r0.<init>(r3, r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L33
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L33
            goto L58
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            r3 = r0
            kotlin.collections.IntIterator r3 = (kotlin.collections.IntIterator) r3
            int r3 = r3.nextInt()
            kotlin.ranges.CharRange r4 = new kotlin.ranges.CharRange
            r5 = 48
            r6 = 57
            r4.<init>(r5, r6)
            char r3 = r7.charAt(r3)
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L37
            r1 = r2
        L58:
            if (r1 == 0) goto L6b
            char r7 = r7.charAt(r2)
            r0 = 45
            if (r7 != r0) goto L65
            r0 = -9223372036854775808
            goto L6a
        L65:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.StringsKt.z(r7, r0)
            if (r0 == 0) goto L77
            java.lang.String r7 = kotlin.text.StringsKt.e(r7)
        L77:
            long r0 = java.lang.Long.parseLong(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.DurationKt.parseOverLongIsoComponent(java.lang.String):long");
    }

    private static final int skipWhile(String str, int i10, Function1<? super Character, Boolean> function1) {
        while (i10 < str.length() && function1.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    private static final String substringWhile(String str, int i10, Function1<? super Character, Boolean> function1) {
        int i11 = i10;
        while (i11 < str.length() && function1.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-kIfJnKk */
    private static final long m1610timeskIfJnKk(double d10, long j3) {
        return Duration.m1521timesUwyO8pc(j3, d10);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-mvk6XK0 */
    private static final long m1611timesmvk6XK0(int i10, long j3) {
        return Duration.m1522timesUwyO8pc(j3, i10);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i10, unit, DurationUnit.NANOSECONDS));
        }
        return toDuration(i10, unit);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i10) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j3) {
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j3) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if (new LongRange(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j3)) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j3, unit, durationUnit));
        }
        return durationOfMillis(RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j3, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d10, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            long roundToLong = MathKt.roundToLong(convertDurationUnit);
            if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(roundToLong)) {
                return durationOfNanos(roundToLong);
            }
            return durationOfMillisNormalized(MathKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d10, unit, DurationUnit.MILLISECONDS)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
