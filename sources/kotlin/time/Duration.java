package kotlin.time;

import a4.j;
import com.applovin.impl.mediation.ads.e;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsKt;

@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", TtmlNode.TAG_DIV, "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalTime.class})
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1495:1\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n38#1:1500\n683#1,2:1501\n700#1,2:1510\n163#2,6:1503\n1#3:1509\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1496\n40#1:1497\n458#1:1498\n478#1:1499\n662#1:1500\n979#1:1501,2\n1070#1:1510,2\n1021#1:1503,6\n*E\n"})
/* loaded from: classes4.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m1484constructorimpl(0);
    private static final long INFINITE = DurationKt.access$durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1541getDaysUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1543getDaysUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1547getHoursUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1549getHoursUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1553getMicrosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1555getMicrosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1559getMillisecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1561getMillisecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1565getMinutesUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1567getMinutesUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1571getNanosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1573getNanosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1577getSecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1579getSecondsUwyO8pc$annotations(double d10) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1583daysUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1585getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1586getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1587getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1589hoursUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1592microsecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1595millisecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1598minutesUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1601nanosecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1603parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, false);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(e.f("Invalid duration string format: '", value, "'."), e2);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1604parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.access$parseDuration(value, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(e.f("Invalid ISO duration string format: '", value, "'."), e2);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m1605parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1482boximpl(DurationKt.access$parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m1606parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m1482boximpl(DurationKt.access$parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1608secondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1542getDaysUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1544getDaysUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1548getHoursUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1550getHoursUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1554getMicrosecondsUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1556getMicrosecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1560getMillisecondsUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1562getMillisecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1566getMinutesUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1568getMinutesUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1572getNanosecondsUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1574getNanosecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1578getSecondsUwyO8pc(long j3) {
            return DurationKt.toDuration(j3, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1580getSecondsUwyO8pc$annotations(int i10) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1584daysUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1590hoursUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1593microsecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1596millisecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1599minutesUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1602nanosecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1609secondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1540getDaysUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1545getDaysUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1546getHoursUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1551getHoursUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1552getMicrosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1557getMicrosecondsUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1558getMillisecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1563getMillisecondsUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1564getMinutesUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1569getMinutesUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1570getNanosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1575getNanosecondsUwyO8pc$annotations(long j3) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1576getSecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1581getSecondsUwyO8pc$annotations(long j3) {
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1582daysUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1588hoursUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1591microsecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1594millisecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1597minutesUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1600nanosecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @SinceKotlin(version = "1.5")
        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @ExperimentalTime
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1607secondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j3) {
        this.rawValue = j3;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m1480addValuesMixedRangesUwyO8pc(long j3, long j10, long j11) {
        long access$nanosToMillis = DurationKt.access$nanosToMillis(j11);
        long j12 = j10 + access$nanosToMillis;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(j12)) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(j12) + (j11 - DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(j12, -4611686018427387903L, DurationKt.MAX_MILLIS));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m1481appendFractionalimpl(long j3, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        String padStart;
        boolean z11;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) padStart, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) padStart, 0, ((i15 + 2) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m1482boximpl(long j3) {
        return new Duration(j3);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1484constructorimpl(long j3) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1515isInNanosimpl(j3)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m1511getValueimpl(j3))) {
                    throw new AssertionError(j.j(new StringBuilder(), m1511getValueimpl(j3), " ns is out of nanoseconds range"));
                }
            } else if (new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m1511getValueimpl(j3))) {
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m1511getValueimpl(j3))) {
                    throw new AssertionError(j.j(new StringBuilder(), m1511getValueimpl(j3), " ms is denormalized"));
                }
            } else {
                throw new AssertionError(j.j(new StringBuilder(), m1511getValueimpl(j3), " ms is out of milliseconds range"));
            }
        }
        return j3;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m1485divLRDsOJo(long j3, long j10) {
        Comparable maxOf;
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(m1509getStorageUnitimpl(j3), m1509getStorageUnitimpl(j10));
        DurationUnit durationUnit = (DurationUnit) maxOf;
        return m1527toDoubleimpl(j3, durationUnit) / m1527toDoubleimpl(j10, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1487divUwyO8pc(long j3, int i10) {
        if (i10 == 0) {
            if (m1518isPositiveimpl(j3)) {
                return INFINITE;
            }
            if (m1517isNegativeimpl(j3)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1515isInNanosimpl(j3)) {
            return DurationKt.access$durationOfNanos(m1511getValueimpl(j3) / i10);
        }
        if (m1516isInfiniteimpl(j3)) {
            return m1522timesUwyO8pc(j3, MathKt.getSign(i10));
        }
        long j10 = i10;
        long m1511getValueimpl = m1511getValueimpl(j3) / j10;
        if (new LongRange(-4611686018426L, 4611686018426L).contains(m1511getValueimpl)) {
            return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(m1511getValueimpl) + (DurationKt.access$millisToNanos(m1511getValueimpl(j3) - (m1511getValueimpl * j10)) / j10));
        }
        return DurationKt.access$durationOfMillis(m1511getValueimpl);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1488equalsimpl(long j3, Object obj) {
        return (obj instanceof Duration) && j3 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1489equalsimpl0(long j3, long j10) {
        return j3 == j10;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m1490getAbsoluteValueUwyO8pc(long j3) {
        return m1517isNegativeimpl(j3) ? m1537unaryMinusUwyO8pc(j3) : j3;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m1491getHoursComponentimpl(long j3) {
        if (m1516isInfiniteimpl(j3)) {
            return 0;
        }
        return (int) (m1500getInWholeHoursimpl(j3) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m1499getInWholeDaysimpl(long j3) {
        return m1530toLongimpl(j3, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m1500getInWholeHoursimpl(long j3) {
        return m1530toLongimpl(j3, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m1501getInWholeMicrosecondsimpl(long j3) {
        return m1530toLongimpl(j3, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m1502getInWholeMillisecondsimpl(long j3) {
        return (m1514isInMillisimpl(j3) && m1513isFiniteimpl(j3)) ? m1511getValueimpl(j3) : m1530toLongimpl(j3, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m1503getInWholeMinutesimpl(long j3) {
        return m1530toLongimpl(j3, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m1504getInWholeNanosecondsimpl(long j3) {
        long m1511getValueimpl = m1511getValueimpl(j3);
        if (!m1515isInNanosimpl(j3)) {
            if (m1511getValueimpl > 9223372036854L) {
                return Long.MAX_VALUE;
            }
            if (m1511getValueimpl < -9223372036854L) {
                return Long.MIN_VALUE;
            }
            return DurationKt.access$millisToNanos(m1511getValueimpl);
        }
        return m1511getValueimpl;
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m1505getInWholeSecondsimpl(long j3) {
        return m1530toLongimpl(j3, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m1506getMinutesComponentimpl(long j3) {
        if (m1516isInfiniteimpl(j3)) {
            return 0;
        }
        return (int) (m1503getInWholeMinutesimpl(j3) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m1507getNanosecondsComponentimpl(long j3) {
        long m1511getValueimpl;
        if (m1516isInfiniteimpl(j3)) {
            return 0;
        }
        if (m1514isInMillisimpl(j3)) {
            m1511getValueimpl = DurationKt.access$millisToNanos(m1511getValueimpl(j3) % 1000);
        } else {
            m1511getValueimpl = m1511getValueimpl(j3) % 1000000000;
        }
        return (int) m1511getValueimpl;
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m1508getSecondsComponentimpl(long j3) {
        if (m1516isInfiniteimpl(j3)) {
            return 0;
        }
        return (int) (m1505getInWholeSecondsimpl(j3) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m1509getStorageUnitimpl(long j3) {
        return m1515isInNanosimpl(j3) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m1510getUnitDiscriminatorimpl(long j3) {
        return ((int) j3) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m1511getValueimpl(long j3) {
        return j3 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1512hashCodeimpl(long j3) {
        return Long.hashCode(j3);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1513isFiniteimpl(long j3) {
        return !m1516isInfiniteimpl(j3);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1514isInMillisimpl(long j3) {
        return (((int) j3) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1515isInNanosimpl(long j3) {
        return (((int) j3) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1516isInfiniteimpl(long j3) {
        return j3 == INFINITE || j3 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1517isNegativeimpl(long j3) {
        return j3 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1518isPositiveimpl(long j3) {
        return j3 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1519minusLRDsOJo(long j3, long j10) {
        return m1520plusLRDsOJo(j3, m1537unaryMinusUwyO8pc(j10));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1520plusLRDsOJo(long j3, long j10) {
        if (m1516isInfiniteimpl(j3)) {
            if (!m1513isFiniteimpl(j10) && (j10 ^ j3) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j3;
        }
        if (m1516isInfiniteimpl(j10)) {
            return j10;
        }
        if ((((int) j3) & 1) == (((int) j10) & 1)) {
            long m1511getValueimpl = m1511getValueimpl(j3) + m1511getValueimpl(j10);
            if (m1515isInNanosimpl(j3)) {
                return DurationKt.access$durationOfNanosNormalized(m1511getValueimpl);
            }
            return DurationKt.access$durationOfMillisNormalized(m1511getValueimpl);
        }
        if (m1514isInMillisimpl(j3)) {
            return m1480addValuesMixedRangesUwyO8pc(j3, m1511getValueimpl(j3), m1511getValueimpl(j10));
        }
        return m1480addValuesMixedRangesUwyO8pc(j3, m1511getValueimpl(j10), m1511getValueimpl(j3));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1522timesUwyO8pc(long j3, int i10) {
        if (m1516isInfiniteimpl(j3)) {
            if (i10 != 0) {
                return i10 > 0 ? j3 : m1537unaryMinusUwyO8pc(j3);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return ZERO;
        }
        long m1511getValueimpl = m1511getValueimpl(j3);
        long j10 = i10;
        long j11 = m1511getValueimpl * j10;
        if (!m1515isInNanosimpl(j3)) {
            if (j11 / j10 == m1511getValueimpl) {
                return DurationKt.access$durationOfMillis(RangesKt.b(j11, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return MathKt.getSign(i10) * MathKt.getSign(m1511getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (new LongRange(-2147483647L, 2147483647L).contains(m1511getValueimpl)) {
            return DurationKt.access$durationOfNanos(j11);
        }
        if (j11 / j10 == m1511getValueimpl) {
            return DurationKt.access$durationOfNanosNormalized(j11);
        }
        long access$nanosToMillis = DurationKt.access$nanosToMillis(m1511getValueimpl);
        long j12 = access$nanosToMillis * j10;
        long access$nanosToMillis2 = DurationKt.access$nanosToMillis((m1511getValueimpl - DurationKt.access$millisToNanos(access$nanosToMillis)) * j10) + j12;
        if (j12 / j10 != access$nanosToMillis || (access$nanosToMillis2 ^ j12) < 0) {
            return MathKt.getSign(i10) * MathKt.getSign(m1511getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.access$durationOfMillis(RangesKt.b(access$nanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1526toComponentsimpl(long j3, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1499getInWholeDaysimpl(j3)), Integer.valueOf(m1491getHoursComponentimpl(j3)), Integer.valueOf(m1506getMinutesComponentimpl(j3)), Integer.valueOf(m1508getSecondsComponentimpl(j3)), Integer.valueOf(m1507getNanosecondsComponentimpl(j3)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1527toDoubleimpl(long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j3 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j3 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1511getValueimpl(j3), m1509getStorageUnitimpl(j3), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1528toIntimpl(long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m1530toLongimpl(j3, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m1529toIsoStringimpl(long j3) {
        boolean z10;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        if (m1517isNegativeimpl(j3)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long m1490getAbsoluteValueUwyO8pc = m1490getAbsoluteValueUwyO8pc(j3);
        long m1500getInWholeHoursimpl = m1500getInWholeHoursimpl(m1490getAbsoluteValueUwyO8pc);
        int m1506getMinutesComponentimpl = m1506getMinutesComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int m1508getSecondsComponentimpl = m1508getSecondsComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int m1507getNanosecondsComponentimpl = m1507getNanosecondsComponentimpl(m1490getAbsoluteValueUwyO8pc);
        if (m1516isInfiniteimpl(j3)) {
            m1500getInWholeHoursimpl = 9999999999999L;
        }
        boolean z12 = true;
        if (m1500getInWholeHoursimpl != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m1508getSecondsComponentimpl == 0 && m1507getNanosecondsComponentimpl == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (m1506getMinutesComponentimpl == 0 && (!z11 || !z10)) {
            z12 = false;
        }
        if (z10) {
            sb2.append(m1500getInWholeHoursimpl);
            sb2.append('H');
        }
        if (z12) {
            sb2.append(m1506getMinutesComponentimpl);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z12)) {
            m1481appendFractionalimpl(j3, sb2, m1508getSecondsComponentimpl, m1507getNanosecondsComponentimpl, 9, "S", true);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1530toLongimpl(long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j3 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j3 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m1511getValueimpl(j3), m1509getStorageUnitimpl(j3), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1533toStringimpl(long j3) {
        if (j3 == 0) {
            return "0s";
        }
        if (j3 == INFINITE) {
            return "Infinity";
        }
        if (j3 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1517isNegativeimpl = m1517isNegativeimpl(j3);
        StringBuilder sb2 = new StringBuilder();
        if (m1517isNegativeimpl) {
            sb2.append('-');
        }
        long m1490getAbsoluteValueUwyO8pc = m1490getAbsoluteValueUwyO8pc(j3);
        long m1499getInWholeDaysimpl = m1499getInWholeDaysimpl(m1490getAbsoluteValueUwyO8pc);
        int m1491getHoursComponentimpl = m1491getHoursComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int m1506getMinutesComponentimpl = m1506getMinutesComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int m1508getSecondsComponentimpl = m1508getSecondsComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int m1507getNanosecondsComponentimpl = m1507getNanosecondsComponentimpl(m1490getAbsoluteValueUwyO8pc);
        int i10 = 0;
        boolean z10 = m1499getInWholeDaysimpl != 0;
        boolean z11 = m1491getHoursComponentimpl != 0;
        boolean z12 = m1506getMinutesComponentimpl != 0;
        boolean z13 = (m1508getSecondsComponentimpl == 0 && m1507getNanosecondsComponentimpl == 0) ? false : true;
        if (z10) {
            sb2.append(m1499getInWholeDaysimpl);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1491getHoursComponentimpl);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(m1506getMinutesComponentimpl);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (m1508getSecondsComponentimpl != 0 || z10 || z11 || z12) {
                m1481appendFractionalimpl(j3, sb2, m1508getSecondsComponentimpl, m1507getNanosecondsComponentimpl, 9, "s", false);
            } else if (m1507getNanosecondsComponentimpl >= 1000000) {
                m1481appendFractionalimpl(j3, sb2, m1507getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, m1507getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m1507getNanosecondsComponentimpl >= 1000) {
                m1481appendFractionalimpl(j3, sb2, m1507getNanosecondsComponentimpl / 1000, m1507getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb2.append(m1507getNanosecondsComponentimpl);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (m1517isNegativeimpl && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m1535toStringimpl$default(long j3, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m1534toStringimpl(j3, durationUnit, i10);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1536truncateToUwyO8pc$kotlin_stdlib(long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit m1509getStorageUnitimpl = m1509getStorageUnitimpl(j3);
        if (unit.compareTo(m1509getStorageUnitimpl) > 0 && !m1516isInfiniteimpl(j3)) {
            return DurationKt.toDuration(m1511getValueimpl(j3) - (m1511getValueimpl(j3) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, m1509getStorageUnitimpl)), m1509getStorageUnitimpl);
        }
        return j3;
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1537unaryMinusUwyO8pc(long j3) {
        return DurationKt.access$durationOf(-m1511getValueimpl(j3), ((int) j3) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m1538compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1538compareToLRDsOJo(long j3) {
        return m1483compareToLRDsOJo(this.rawValue, j3);
    }

    public boolean equals(Object obj) {
        return m1488equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m1512hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m1533toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m1483compareToLRDsOJo(long j3, long j10) {
        long j11 = j3 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return Intrinsics.compare(j3, j10);
        }
        int i10 = (((int) j3) & 1) - (((int) j10) & 1);
        return m1517isNegativeimpl(j3) ? -i10 : i10;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1525toComponentsimpl(long j3, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1500getInWholeHoursimpl(j3)), Integer.valueOf(m1506getMinutesComponentimpl(j3)), Integer.valueOf(m1508getSecondsComponentimpl(j3)), Integer.valueOf(m1507getNanosecondsComponentimpl(j3)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1524toComponentsimpl(long j3, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1503getInWholeMinutesimpl(j3)), Integer.valueOf(m1508getSecondsComponentimpl(j3)), Integer.valueOf(m1507getNanosecondsComponentimpl(j3)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1523toComponentsimpl(long j3, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m1505getInWholeSecondsimpl(j3)), Integer.valueOf(m1507getNanosecondsComponentimpl(j3)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m1486divUwyO8pc(long j3, double d10) {
        int roundToInt = MathKt.roundToInt(d10);
        if ((((double) roundToInt) == d10) && roundToInt != 0) {
            return m1487divUwyO8pc(j3, roundToInt);
        }
        DurationUnit m1509getStorageUnitimpl = m1509getStorageUnitimpl(j3);
        return DurationKt.toDuration(m1527toDoubleimpl(j3, m1509getStorageUnitimpl) / d10, m1509getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1521timesUwyO8pc(long j3, double d10) {
        int roundToInt = MathKt.roundToInt(d10);
        if (((double) roundToInt) == d10) {
            return m1522timesUwyO8pc(j3, roundToInt);
        }
        DurationUnit m1509getStorageUnitimpl = m1509getStorageUnitimpl(j3);
        return DurationKt.toDuration(m1527toDoubleimpl(j3, m1509getStorageUnitimpl) * d10, m1509getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m1534toStringimpl(long j3, DurationUnit unit, int i10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i10 >= 0) {
            double m1527toDoubleimpl = m1527toDoubleimpl(j3, unit);
            if (Double.isInfinite(m1527toDoubleimpl)) {
                return String.valueOf(m1527toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m1527toDoubleimpl, RangesKt.coerceAtMost(i10, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(eb.j.i("decimals must be not negative, but was ", i10).toString());
    }
}
