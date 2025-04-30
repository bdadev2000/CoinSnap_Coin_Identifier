package j3;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {
    public static final SparseArray b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H[] f21028c;

    /* JADX INFO: Fake field, exist only in values array */
    H EF15;

    /* JADX WARN: Type inference failed for: r0v8, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [j3.H, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [j3.H, java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [j3.H, java.lang.Enum, java.lang.Object] */
    static {
        ?? r15 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        ?? r13 = new Enum("GPRS", 1);
        ?? r11 = new Enum("EDGE", 2);
        ?? r9 = new Enum("UMTS", 3);
        ?? r72 = new Enum("CDMA", 4);
        ?? r52 = new Enum("EVDO_0", 5);
        ?? r32 = new Enum("EVDO_A", 6);
        ?? r12 = new Enum("RTT", 7);
        ?? r02 = new Enum("HSDPA", 8);
        ?? r22 = new Enum("HSUPA", 9);
        ?? r42 = new Enum("HSPA", 10);
        ?? r62 = new Enum("IDEN", 11);
        ?? r82 = new Enum("EVDO_B", 12);
        ?? r10 = new Enum("LTE", 13);
        ?? r122 = new Enum("EHRPD", 14);
        ?? r14 = new Enum("HSPAP", 15);
        ?? r102 = new Enum("GSM", 16);
        ?? r123 = new Enum("TD_SCDMA", 17);
        ?? r142 = new Enum("IWLAN", 18);
        ?? r103 = new Enum("LTE_CA", 19);
        f21028c = new H[]{r15, r13, r11, r9, r72, r52, r32, r12, r02, r22, r42, r62, r82, r10, r122, r14, r102, r123, r142, r103, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(0, r15);
        sparseArray.put(1, r13);
        sparseArray.put(2, r11);
        sparseArray.put(3, r9);
        sparseArray.put(4, r72);
        sparseArray.put(5, r52);
        sparseArray.put(6, r32);
        sparseArray.put(7, r12);
        sparseArray.put(8, r02);
        sparseArray.put(9, r22);
        sparseArray.put(10, r42);
        sparseArray.put(11, r62);
        sparseArray.put(12, r82);
        sparseArray.put(13, r10);
        sparseArray.put(14, r122);
        sparseArray.put(15, r14);
        sparseArray.put(16, r102);
        sparseArray.put(17, r123);
        sparseArray.put(18, r142);
        sparseArray.put(19, r103);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f21028c.clone();
    }
}
