package j3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class K {
    public static final K b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ K[] f21030c;

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, j3.K, java.lang.Object] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        b = r62;
        ?? r82 = new Enum("UNMETERED_ONLY", 1);
        ?? r10 = new Enum("UNMETERED_OR_DAILY", 2);
        ?? r12 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        ?? r14 = new Enum("NEVER", 4);
        ?? r52 = new Enum("UNRECOGNIZED", 5);
        f21030c = new K[]{r62, r82, r10, r12, r14, r52};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r82);
        sparseArray.put(2, r10);
        sparseArray.put(3, r12);
        sparseArray.put(4, r14);
        sparseArray.put(-1, r52);
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f21030c.clone();
    }
}
