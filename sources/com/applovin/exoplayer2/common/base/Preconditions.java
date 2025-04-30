package com.applovin.exoplayer2.common.base;

import com.mbridge.msdk.foundation.entity.o;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i9, int i10, @NullableDecl String str) {
        if (i9 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.h(i10, "negative size: "));
    }

    private static String badPositionIndex(int i9, int i10, @NullableDecl String str) {
        if (i9 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.h(i10, "negative size: "));
    }

    private static String badPositionIndexes(int i9, int i10, int i11) {
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                return Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            }
            return badPositionIndex(i10, i11, "end index");
        }
        return badPositionIndex(i9, i11, "start index");
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i9, int i10) {
        return checkElementIndex(i9, i10, "index");
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9) {
        t9.getClass();
        return t9;
    }

    public static int checkPositionIndex(int i9, int i10) {
        return checkPositionIndex(i9, i10, "index");
    }

    public static void checkPositionIndexes(int i9, int i10, int i11) {
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(badPositionIndexes(i9, i10, i11));
        }
    }

    public static void checkState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i9, int i10, @NullableDecl String str) {
        if (i9 < 0 || i9 >= i10) {
            throw new IndexOutOfBoundsException(badElementIndex(i9, i10, str));
        }
        return i9;
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i9, int i10, @NullableDecl String str) {
        if (i9 < 0 || i9 > i10) {
            throw new IndexOutOfBoundsException(badPositionIndex(i9, i10, str));
        }
        return i9;
    }

    public static void checkState(boolean z8, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, char c9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, char c9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, int i9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, int i9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, long j7) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j7)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, long j7) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j7)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, long j7) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j7)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, char c9, char c10) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, char c9, char c10) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, char c9, char c10) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c9), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, char c9, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, char c9, int i9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, char c9, int i9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c9), Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, char c9, long j7) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j7)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, char c9, long j7) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j7)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, char c9, long j7) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c9), Long.valueOf(j7)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, char c9, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c9), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, char c9, @NullableDecl Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c9), obj));
    }

    public static void checkState(boolean z8, @NullableDecl String str, char c9, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c9), obj));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, int i9, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i9), Character.valueOf(c9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, int i9, char c9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i9), Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, int i9, char c9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i9), Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, int i9, int i10) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, int i9, int i10) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, int i9, int i10) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i9), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, int i9, long j7) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i9), Long.valueOf(j7)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, int i9, long j7) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i9), Long.valueOf(j7)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, int i9, long j7) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i9), Long.valueOf(j7)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, int i9, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i9), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, int i9, @NullableDecl Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i9), obj));
    }

    public static void checkState(boolean z8, @NullableDecl String str, int i9, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i9), obj));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, long j7, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j7), Character.valueOf(c9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, long j7, char c9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j7), Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, long j7, char c9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j7), Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, long j7, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j7), Integer.valueOf(i9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, long j7, int i9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j7), Integer.valueOf(i9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, long j7, int i9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j7), Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, long j7, long j9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j7), Long.valueOf(j9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, long j7, long j9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j7), Long.valueOf(j9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, long j7, long j9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j7), Long.valueOf(j9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, long j7, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j7), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, long j7, @NullableDecl Object obj) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j7), obj));
    }

    public static void checkState(boolean z8, @NullableDecl String str, long j7, @NullableDecl Object obj) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j7), obj));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, char c9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Character.valueOf(c9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, char c9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Character.valueOf(c9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, char c9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Character.valueOf(c9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, int i9) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Integer.valueOf(i9)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, int i9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Integer.valueOf(i9)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, int i9) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Integer.valueOf(i9)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, long j7) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Long.valueOf(j7)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, long j7) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Long.valueOf(j7)));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, long j7) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Long.valueOf(j7)));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z8) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t9, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z8, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z8) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
