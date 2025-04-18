package com.google.common.math;

import com.google.android.gms.common.api.Api;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.math.RoundingMode;
import okhttp3.internal.http2.Http2Connection;
import org.objectweb.asm.Opcodes;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes3.dex */
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    @VisibleForTesting
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    static int[] biggestBinomials = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 65536, 2345, 477, Opcodes.INSTANCEOF, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private IntMath() {
    }

    public static int binomial(int i2, int i3) {
        MathPreconditions.checkNonNegative(c.f29536f, i2);
        MathPreconditions.checkNonNegative("k", i3);
        int i4 = 0;
        Preconditions.checkArgument(i3 <= i2, "k (%s) > n (%s)", i3, i2);
        if (i3 > (i2 >> 1)) {
            i3 = i2 - i3;
        }
        int[] iArr = biggestBinomials;
        if (i3 >= iArr.length || i2 > iArr[i3]) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return i2;
        }
        long j2 = 1;
        while (i4 < i3) {
            long j3 = j2 * (i2 - i4);
            i4++;
            j2 = j3 / i4;
        }
        return (int) j2;
    }

    @Beta
    public static int ceilingPowerOfTwo(int i2) {
        MathPreconditions.checkPositive("x", i2);
        if (i2 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i2 - 1));
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("ceilingPowerOfTwo(");
        sb.append(i2);
        sb.append(") not representable as an int");
        throw new ArithmeticException(sb.toString());
    }

    public static int checkedAdd(int i2, int i3) {
        long j2 = i2 + i3;
        int i4 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i4), "checkedAdd", i2, i3);
        return i4;
    }

    public static int checkedMultiply(int i2, int i3) {
        long j2 = i2 * i3;
        int i4 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i4), "checkedMultiply", i2, i3);
        return i4;
    }

    public static int checkedPow(int i2, int i3) {
        MathPreconditions.checkNonNegative("exponent", i3);
        if (i2 == -2) {
            MathPreconditions.checkNoOverflow(i3 < 32, "checkedPow", i2, i3);
            return (i3 & 1) == 0 ? 1 << i3 : (-1) << i3;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            MathPreconditions.checkNoOverflow(i3 < 31, "checkedPow", i2, i3);
            return 1 << i3;
        }
        int i4 = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return checkedMultiply(i4, i2);
            }
            if ((i3 & 1) != 0) {
                i4 = checkedMultiply(i4, i2);
            }
            i3 >>= 1;
            if (i3 > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= i2) & (i2 <= FLOOR_SQRT_MAX_INT), "checkedPow", i2, i3);
                i2 *= i2;
            }
        }
        return i4;
    }

    public static int checkedSubtract(int i2, int i3) {
        long j2 = i2 - i3;
        int i4 = (int) j2;
        MathPreconditions.checkNoOverflow(j2 == ((long) i4), "checkedSubtract", i2, i3);
        return i4;
    }

    public static int divide(int i2, int i3, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i5);
                int abs2 = abs - (Math.abs(i3) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i4 & 1) != 0))) {
                            return i4;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static int factorial(int i2) {
        MathPreconditions.checkNonNegative(c.f29536f, i2);
        int[] iArr = factorials;
        return i2 < iArr.length ? iArr[i2] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Beta
    public static int floorPowerOfTwo(int i2) {
        MathPreconditions.checkPositive("x", i2);
        return Integer.highestOneBit(i2);
    }

    public static int gcd(int i2, int i3) {
        MathPreconditions.checkNonNegative("a", i2);
        MathPreconditions.checkNonNegative("b", i3);
        if (i2 == 0) {
            return i3;
        }
        if (i3 == 0) {
            return i2;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2);
        int i4 = i2 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i3);
        int i5 = i3 >> numberOfTrailingZeros2;
        while (i4 != i5) {
            int i6 = i4 - i5;
            int i7 = (i6 >> 31) & i6;
            int i8 = (i6 - i7) - i7;
            i5 += i7;
            i4 = i8 >> Integer.numberOfTrailingZeros(i8);
        }
        return i4 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(int i2) {
        return (i2 > 0) & ((i2 & (i2 + (-1))) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i2) {
        return LongMath.isPrime(i2);
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int i2, int i3) {
        return (~(~(i2 - i3))) >>> 31;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    @GwtIncompatible
    public static int log10(int i2, RoundingMode roundingMode) {
        int lessThanBranchFree;
        MathPreconditions.checkPositive("x", i2);
        int log10Floor = log10Floor(i2);
        int i3 = powersOf10[log10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i2 == i3);
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(i3, i2);
                return lessThanBranchFree + log10Floor;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], i2);
                return lessThanBranchFree + log10Floor;
            default:
                throw new AssertionError();
        }
    }

    private static int log10Floor(int i2) {
        byte b2 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i2)];
        return b2 - lessThanBranchFree(i2, powersOf10[b2]);
    }

    public static int log2(int i2, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i2));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, i2) + (31 - numberOfLeadingZeros);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int mean(int i2, int i3) {
        return (i2 & i3) + ((i2 ^ i3) >> 1);
    }

    public static int mod(int i2, int i3) {
        if (i3 > 0) {
            int i4 = i2 % i3;
            return i4 >= 0 ? i4 : i4 + i3;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i3);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }

    @GwtIncompatible
    public static int pow(int i2, int i3) {
        MathPreconditions.checkNonNegative("exponent", i3);
        if (i2 == -2) {
            if (i3 < 32) {
                return (i3 & 1) == 0 ? 1 << i3 : -(1 << i3);
            }
            return 0;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            if (i3 < 32) {
                return 1 << i3;
            }
            return 0;
        }
        int i4 = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return i2 * i4;
            }
            i4 *= (i3 & 1) == 0 ? 1 : i2;
            i2 *= i2;
            i3 >>= 1;
        }
        return i4;
    }

    @Beta
    public static int saturatedAdd(int i2, int i3) {
        return Ints.saturatedCast(i2 + i3);
    }

    @Beta
    public static int saturatedMultiply(int i2, int i3) {
        return Ints.saturatedCast(i2 * i3);
    }

    @Beta
    public static int saturatedPow(int i2, int i3) {
        MathPreconditions.checkNonNegative("exponent", i3);
        if (i2 == -2) {
            return i3 >= 32 ? (i3 & 1) + Api.BaseClientBuilder.API_PRIORITY_OTHER : (i3 & 1) == 0 ? 1 << i3 : (-1) << i3;
        }
        if (i2 == -1) {
            return (i3 & 1) == 0 ? 1 : -1;
        }
        if (i2 == 0) {
            return i3 == 0 ? 1 : 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return i3 >= 31 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1 << i3;
        }
        int i4 = ((i2 >>> 31) & i3 & 1) + Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i5 = 1;
        while (i3 != 0) {
            if (i3 == 1) {
                return saturatedMultiply(i5, i2);
            }
            if ((i3 & 1) != 0) {
                i5 = saturatedMultiply(i5, i2);
            }
            i3 >>= 1;
            if (i3 > 0) {
                if ((-46340 > i2) || (i2 > FLOOR_SQRT_MAX_INT)) {
                    return i4;
                }
                i2 *= i2;
            }
        }
        return i5;
    }

    @Beta
    public static int saturatedSubtract(int i2, int i3) {
        return Ints.saturatedCast(i2 - i3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    @GwtIncompatible
    public static int sqrt(int i2, RoundingMode roundingMode) {
        int lessThanBranchFree;
        MathPreconditions.checkNonNegative("x", i2);
        int sqrtFloor = sqrtFloor(i2);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(sqrtFloor * sqrtFloor == i2);
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(sqrtFloor * sqrtFloor, i2);
                return lessThanBranchFree + sqrtFloor;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree((sqrtFloor * sqrtFloor) + sqrtFloor, i2);
                return lessThanBranchFree + sqrtFloor;
            default:
                throw new AssertionError();
        }
    }

    private static int sqrtFloor(int i2) {
        return (int) Math.sqrt(i2);
    }
}
