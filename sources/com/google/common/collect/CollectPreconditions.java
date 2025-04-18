package com.google.common.collect;

import com.applovin.impl.adview.t;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            throw new NullPointerException(t.i(valueOf.length() + 24, "null key in entry: null=", valueOf));
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        throw new NullPointerException(t.j(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 40));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 38));
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRemove(boolean z2) {
        Preconditions.checkState(z2, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j2, String str) {
        if (j2 >= 0) {
            return j2;
        }
        StringBuilder sb = new StringBuilder(t.b(str, 49));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }
}
