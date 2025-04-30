package j3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2385A {
    public static final EnumC2385A b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2385A[] f21027c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2385A EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, java.lang.Object, j3.A] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, java.lang.Object, j3.A] */
    static {
        ?? r02 = new Enum("NOT_SET", 0);
        ?? r12 = new Enum("EVENT_OVERRIDE", 1);
        b = r12;
        f21027c = new EnumC2385A[]{r02, r12};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(5, r12);
    }

    public static EnumC2385A valueOf(String str) {
        return (EnumC2385A) Enum.valueOf(EnumC2385A.class, str);
    }

    public static EnumC2385A[] values() {
        return (EnumC2385A[]) f21027c.clone();
    }
}
