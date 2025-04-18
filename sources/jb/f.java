package jb;

import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 jb.f, still in use, count: 1, list:
  (r0v0 jb.f) from 0x008c: INVOKE (r2v5 java.util.HashMap), ("x86"), (r0v0 jb.f) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:141)
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
public final class f {
    /* JADX INFO: Fake field, exist only in values array */
    X86_32,
    /* JADX INFO: Fake field, exist only in values array */
    X86_64,
    /* JADX INFO: Fake field, exist only in values array */
    ARM_UNKNOWN,
    /* JADX INFO: Fake field, exist only in values array */
    PPC,
    /* JADX INFO: Fake field, exist only in values array */
    PPC64,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV6,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV7,
    UNKNOWN,
    /* JADX INFO: Fake field, exist only in values array */
    ARMV7S,
    /* JADX INFO: Fake field, exist only in values array */
    ARM64;


    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f19882c;

    static {
        HashMap hashMap = new HashMap(4);
        f19882c = hashMap;
        hashMap.put("armeabi-v7a", r11);
        hashMap.put("armeabi", r9);
        hashMap.put("arm64-v8a", r14);
        hashMap.put("x86", r0);
    }

    public f() {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f19883d.clone();
    }
}
