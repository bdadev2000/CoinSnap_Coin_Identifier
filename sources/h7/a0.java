package h7;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 h7.a0, still in use, count: 1, list:
  (r0v0 h7.a0) from 0x0020: INVOKE (r3v3 android.util.SparseArray), (0 int), (r0v0 h7.a0) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:33)
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
public final class a0 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_SET,
    EVENT_OVERRIDE;

    static {
        a0 a0Var = EVENT_OVERRIDE;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r0);
        sparseArray.put(5, a0Var);
    }

    public a0() {
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f18780c.clone();
    }
}
