package kotlin.comparisons;

import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, d2 = {"maxOf", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", com.mbridge.msdk.foundation.controller.a.a, "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes4.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    public static <T extends Comparable<? super T>> T maxOf(T a, T b3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        return a.compareTo(b3) >= 0 ? a : b3;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a, T b3) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        return a.compareTo(b3) <= 0 ? a : b3;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b3, byte b10) {
        return (byte) Math.max((int) b3, (int) b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b3, byte b10) {
        return (byte) Math.min((int) b3, (int) b10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s5, short s10) {
        return (short) Math.max((int) s5, (int) s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s5, short s10) {
        return (short) Math.min((int) s5, (int) s10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j3, long j10) {
        return Math.max(j3, j10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j3, long j10) {
        return Math.min(j3, j10);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T maxOf(T a, T b3, T c10) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) maxOf(a, maxOf(b3, c10));
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a, T b3, T c10) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b3, "b");
        Intrinsics.checkNotNullParameter(c10, "c");
        return (T) minOf(a, minOf(b3, c10));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b3, byte b10, byte b11) {
        return (byte) Math.max((int) b3, Math.max((int) b10, (int) b11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b3, byte b10, byte b11) {
        return (byte) Math.min((int) b3, Math.min((int) b10, (int) b11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s5, short s10, short s11) {
        return (short) Math.max((int) s5, Math.max((int) s10, (int) s11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s5, short s10, short s11) {
        return (short) Math.min((int) s5, Math.min((int) s10, (int) s11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i10, int i11, int i12) {
        return Math.max(i10, Math.max(i11, i12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i10, int i11, int i12) {
        return Math.min(i10, Math.min(i11, i12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j3, long j10, long j11) {
        return Math.max(j3, Math.max(j10, j11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j3, long j10, long j11) {
        return Math.min(j3, Math.min(j10, j11));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f10, float f11, float f12) {
        return Math.max(f10, Math.max(f11, f12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f10, float f11, float f12) {
        return Math.min(f10, Math.min(f11, f12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d10, double d11, double d12) {
        return Math.max(d10, Math.max(d11, d12));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d10, double d11, double d12) {
        return Math.min(d10, Math.min(d11, d12));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOf(T a, T... other) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t5 : other) {
            a = (T) maxOf(a, t5);
        }
        return a;
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOf(T a, T... other) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t5 : other) {
            a = (T) minOf(a, t5);
        }
        return a;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b3, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b3 = (byte) Math.max((int) b3, (int) b10);
        }
        return b3;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b3, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b10 : other) {
            b3 = (byte) Math.min((int) b3, (int) b10);
        }
        return b3;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s5, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s10 : other) {
            s5 = (short) Math.max((int) s5, (int) s10);
        }
        return s5;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s5, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s10 : other) {
            s5 = (short) Math.min((int) s5, (int) s10);
        }
        return s5;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i10, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i10, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j3, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j10 : other) {
            j3 = Math.max(j3, j10);
        }
        return j3;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j3, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j10 : other) {
            j3 = Math.min(j3, j10);
        }
        return j3;
    }

    @SinceKotlin(version = "1.4")
    public static final float maxOf(float f10, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    @SinceKotlin(version = "1.4")
    public static final float minOf(float f10, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d10, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d11 : other) {
            d10 = Math.max(d10, d11);
        }
        return d10;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d10, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d11 : other) {
            d10 = Math.min(d10, d11);
        }
        return d10;
    }
}
