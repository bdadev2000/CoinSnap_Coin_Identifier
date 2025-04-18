package com.applovin.exoplayer2.common.base;

import eb.j;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j.i("negative size: ", i11));
    }

    private static String badPositionIndex(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0) {
            return Strings.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(j.i("negative size: ", i11));
    }

    private static String badPositionIndexes(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                return Strings.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            return badPositionIndex(i11, i12, "end index");
        }
        return badPositionIndex(i10, i12, "start index");
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i10, int i11) {
        return checkElementIndex(i10, i11, "index");
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5) {
        t5.getClass();
        return t5;
    }

    public static int checkPositionIndex(int i10, int i11) {
        return checkPositionIndex(i10, i11, "index");
    }

    public static void checkPositionIndexes(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i10, i11, i12));
        }
    }

    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(badElementIndex(i10, i11, str));
        }
        return i10;
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i10, int i11, @NullableDecl String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(badPositionIndex(i10, i11, str));
        }
        return i10;
    }

    public static void checkState(boolean z10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, objArr));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, objArr));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, char c10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, char c10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, int i10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, int i10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, long j3) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j3)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, long j3) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j3)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, long j3) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, char c10, char c11) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, char c10, char c11) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c10), Character.valueOf(c11)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, char c10, int i10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, char c10, int i10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c10), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, char c10, long j3) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j3)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, char c10, long j3) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j3)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, char c10, long j3) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c10), Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, char c10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Character.valueOf(c10), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, char c10, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Character.valueOf(c10), obj));
    }

    public static void checkState(boolean z10, @NullableDecl String str, char c10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Character.valueOf(c10), obj));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, int i10, char c10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, int i10, char c10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i10), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, int i10, int i11) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, int i10, long j3) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j3)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, int i10, long j3) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j3)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, int i10, long j3) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i10), Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, int i10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Integer.valueOf(i10), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, int i10, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Integer.valueOf(i10), obj));
    }

    public static void checkState(boolean z10, @NullableDecl String str, int i10, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Integer.valueOf(i10), obj));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, long j3, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j3), Character.valueOf(c10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, long j3, char c10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j3), Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, long j3, char c10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j3), Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, long j3, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j3), Integer.valueOf(i10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, long j3, int i10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j3), Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, long j3, int i10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j3), Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, long j3, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j3), Long.valueOf(j10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, long j3, long j10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j3), Long.valueOf(j10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, long j3, long j10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j3), Long.valueOf(j10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, long j3, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, Long.valueOf(j3), obj));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, long j3, @NullableDecl Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, Long.valueOf(j3), obj));
    }

    public static void checkState(boolean z10, @NullableDecl String str, long j3, @NullableDecl Object obj) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, Long.valueOf(j3), obj));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Character.valueOf(c10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, char c10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Character.valueOf(c10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, char c10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Character.valueOf(c10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Integer.valueOf(i10)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, int i10) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Integer.valueOf(i10)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, int i10) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Integer.valueOf(i10)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, long j3) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, Long.valueOf(j3)));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, long j3) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, Long.valueOf(j3)));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, long j3) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, Long.valueOf(j3)));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z10) {
            throw new IllegalArgumentException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    @NonNullDecl
    public static <T> T checkNotNull(@NonNullDecl T t5, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static void checkState(boolean z10, @NullableDecl String str, @NullableDecl Object obj, @NullableDecl Object obj2, @NullableDecl Object obj3, @NullableDecl Object obj4) {
        if (!z10) {
            throw new IllegalStateException(Strings.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }
}
