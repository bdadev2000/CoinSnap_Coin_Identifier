package h7;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 h7.i0, still in use, count: 1, list:
  (r0v0 h7.i0) from 0x0108: INVOKE (r4v8 android.util.SparseArray), (0 int), (r0v0 h7.i0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:265)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class i0 {
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE(0),
    /* JADX INFO: Fake field, exist only in values array */
    WIFI(1),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_MMS(2),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_SUPL(3),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_DUN(4),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_HIPRI(5),
    /* JADX INFO: Fake field, exist only in values array */
    WIMAX(6),
    /* JADX INFO: Fake field, exist only in values array */
    BLUETOOTH(7),
    /* JADX INFO: Fake field, exist only in values array */
    DUMMY(8),
    /* JADX INFO: Fake field, exist only in values array */
    ETHERNET(9),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_FOTA(10),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_IMS(11),
    /* JADX INFO: Fake field, exist only in values array */
    MOBILE_CBS(12),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(13),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(14),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(15),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY(16),
    /* JADX INFO: Fake field, exist only in values array */
    VPN(17),
    /* JADX INFO: Fake field, exist only in values array */
    NONE(-1);


    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f18813b;

    static {
        SparseArray sparseArray = new SparseArray();
        f18813b = sparseArray;
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(5, r9);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r12);
        sparseArray.put(11, r10);
        sparseArray.put(12, r8);
        sparseArray.put(13, r6);
        sparseArray.put(14, r4);
        sparseArray.put(15, r2);
        sparseArray.put(16, r6);
        sparseArray.put(17, r4);
        sparseArray.put(-1, r2);
    }

    public i0(int i10) {
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f18814c.clone();
    }
}
