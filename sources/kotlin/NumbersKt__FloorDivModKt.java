package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes4.dex */
public class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b3, byte b10) {
        int i10 = b3 / b10;
        return ((b3 ^ b10) >= 0 || b10 * i10 == b3) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b3, byte b10) {
        int i10 = b3 % b10;
        return (byte) (i10 + (b10 & (((i10 ^ b10) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b3, short s5) {
        int i10 = b3 / s5;
        return ((b3 ^ s5) >= 0 || s5 * i10 == b3) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b3, short s5) {
        int i10 = b3 % s5;
        return (short) (i10 + (s5 & (((i10 ^ s5) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b3, int i10) {
        int i11 = b3 / i10;
        return ((b3 ^ i10) >= 0 || i10 * i11 == b3) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b3, int i10) {
        int i11 = b3 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b3, long j3) {
        long j10 = b3;
        long j11 = j10 / j3;
        return ((j10 ^ j3) >= 0 || j3 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b3, long j3) {
        long j10 = b3 % j3;
        return j10 + (j3 & (((j10 ^ j3) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s5, byte b3) {
        int i10 = s5 / b3;
        return ((s5 ^ b3) >= 0 || b3 * i10 == s5) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s5, byte b3) {
        int i10 = s5 % b3;
        return (byte) (i10 + (b3 & (((i10 ^ b3) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s5, short s10) {
        int i10 = s5 / s10;
        return ((s5 ^ s10) >= 0 || s10 * i10 == s5) ? i10 : i10 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s5, short s10) {
        int i10 = s5 % s10;
        return (short) (i10 + (s10 & (((i10 ^ s10) & ((-i10) | i10)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s5, int i10) {
        int i11 = s5 / i10;
        return ((s5 ^ i10) >= 0 || i10 * i11 == s5) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s5, int i10) {
        int i11 = s5 % i10;
        return i11 + (i10 & (((i11 ^ i10) & ((-i11) | i11)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s5, long j3) {
        long j10 = s5;
        long j11 = j10 / j3;
        return ((j10 ^ j3) >= 0 || j3 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s5, long j3) {
        long j10 = s5 % j3;
        return j10 + (j3 & (((j10 ^ j3) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i10, byte b3) {
        int i11 = i10 / b3;
        return ((i10 ^ b3) >= 0 || b3 * i11 == i10) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i10, byte b3) {
        int i11 = i10 % b3;
        return (byte) (i11 + (b3 & (((i11 ^ b3) & ((-i11) | i11)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i10, short s5) {
        int i11 = i10 / s5;
        return ((i10 ^ s5) >= 0 || s5 * i11 == i10) ? i11 : i11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i10, short s5) {
        int i11 = i10 % s5;
        return (short) (i11 + (s5 & (((i11 ^ s5) & ((-i11) | i11)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i10, long j3) {
        long j10 = i10;
        long j11 = j10 / j3;
        return ((j10 ^ j3) >= 0 || j3 * j11 == j10) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i10, long j3) {
        long j10 = i10 % j3;
        return j10 + (j3 & (((j10 ^ j3) & ((-j10) | j10)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j3, byte b3) {
        long j10 = b3;
        long j11 = j3 / j10;
        return ((j3 ^ j10) >= 0 || j10 * j11 == j3) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j3, byte b3) {
        long j10 = j3 % b3;
        return (byte) (j10 + (r0 & (((j10 ^ r0) & ((-j10) | j10)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j3, short s5) {
        long j10 = s5;
        long j11 = j3 / j10;
        return ((j3 ^ j10) >= 0 || j10 * j11 == j3) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j3, short s5) {
        long j10 = j3 % s5;
        return (short) (j10 + (r0 & (((j10 ^ r0) & ((-j10) | j10)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j3, int i10) {
        long j10 = i10;
        long j11 = j3 / j10;
        return ((j3 ^ j10) >= 0 || j10 * j11 == j3) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j3, int i10) {
        long j10 = i10;
        long j11 = j3 % j10;
        return (int) (j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j3, long j10) {
        long j11 = j3 / j10;
        return ((j3 ^ j10) >= 0 || j10 * j11 == j3) ? j11 : j11 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j3, long j10) {
        long j11 = j3 % j10;
        return j11 + (j10 & (((j11 ^ j10) & ((-j11) | j11)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f10, float f11) {
        float f12 = f10 % f11;
        if (f12 == 0.0f) {
            return f12;
        }
        return !(Math.signum(f12) == Math.signum(f11)) ? f12 + f11 : f12;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f10, double d10) {
        double d11 = f10 % d10;
        if (d11 == 0.0d) {
            return d11;
        }
        return !(Math.signum(d11) == Math.signum(d10)) ? d11 + d10 : d11;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d10, float f10) {
        double d11 = f10;
        double d12 = d10 % d11;
        if (d12 == 0.0d) {
            return d12;
        }
        return !(Math.signum(d12) == Math.signum(d11)) ? d12 + d11 : d12;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d10, double d11) {
        double d12 = d10 % d11;
        if (d12 == 0.0d) {
            return d12;
        }
        return !(Math.signum(d12) == Math.signum(d11)) ? d12 + d11 : d12;
    }
}
