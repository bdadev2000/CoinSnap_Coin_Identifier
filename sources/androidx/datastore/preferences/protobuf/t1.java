package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class t1 {
    public static s1 a(Object obj) {
        e0 e0Var = (e0) obj;
        s1 s1Var = e0Var.unknownFields;
        if (s1Var == s1.f1462f) {
            s1 s1Var2 = new s1(0, new int[8], new Object[8], true);
            e0Var.unknownFields = s1Var2;
            return s1Var2;
        }
        return s1Var;
    }

    public static void b(Object obj) {
        ((e0) obj).unknownFields.f1466e = false;
    }

    public static boolean c(Object obj, o oVar) {
        int i10 = oVar.a;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            ((s1) obj).c((i11 << 3) | 5, Integer.valueOf(oVar.n()));
                        } else {
                            int i13 = j0.f1378c;
                            throw new i0();
                        }
                    } else {
                        s1 s1Var = new s1(0, new int[8], new Object[8], true);
                        int i14 = i11 << 3;
                        int i15 = i14 | 4;
                        while (oVar.d() != Integer.MAX_VALUE && c(s1Var, oVar)) {
                        }
                        if (i15 == oVar.a) {
                            s1Var.f1466e = false;
                            ((s1) obj).c(i14 | 3, s1Var);
                        } else {
                            throw new j0("Protocol message end-group tag did not match expected tag.");
                        }
                    }
                } else {
                    ((s1) obj).c((i11 << 3) | 2, oVar.i());
                }
            } else {
                ((s1) obj).c((i11 << 3) | 1, Long.valueOf(oVar.p()));
            }
        } else {
            ((s1) obj).c((i11 << 3) | 0, Long.valueOf(oVar.t()));
        }
        return true;
    }

    public static void d(Object obj, Object obj2) {
        ((e0) obj).unknownFields = (s1) obj2;
    }
}
