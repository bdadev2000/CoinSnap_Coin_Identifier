package com.google.common.math;

import com.applovin.impl.adview.t;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes2.dex */
public final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z2, double d, RoundingMode roundingMode) {
        if (z2) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(valueOf.length() + 83);
        sb.append("rounded value is out of range for input ");
        sb.append(d);
        sb.append(" and rounding mode ");
        sb.append(valueOf);
        throw new ArithmeticException(sb.toString());
    }

    public static void checkNoOverflow(boolean z2, String str, int i2, int i3) {
        if (z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 36));
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static int checkNonNegative(String str, int i2) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 27));
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static int checkPositive(String str, int i2) {
        if (i2 > 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 26));
        sb.append(str);
        sb.append(" (");
        sb.append(i2);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRoundingUnnecessary(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void checkNoOverflow(boolean z2, String str, long j2, long j3) {
        if (z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 54));
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    public static long checkNonNegative(String str, long j2) {
        if (j2 >= 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 36));
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static long checkPositive(String str, long j2) {
        if (j2 > 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 35));
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(t.k(valueOf.length() + t.b(str, 16), str, " (", valueOf, ") must be >= 0"));
    }

    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(t.k(valueOf.length() + t.b(str, 15), str, " (", valueOf, ") must be > 0"));
    }

    public static double checkNonNegative(String str, double d) {
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return d;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 40));
        sb.append(str);
        sb.append(" (");
        sb.append(d);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
