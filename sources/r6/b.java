package r6;

import G7.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import o4.C2496b;
import u7.AbstractC2815f;
import w8.i;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[LOOP:1: B:14:0x0042->B:23:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w8.i a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.b.a(java.lang.String):w8.i");
    }

    public static i b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            int i9 = length - 1;
            if (i9 >= 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    int i12 = i10 * 2;
                    bArr[i10] = (byte) (x8.b.a(str.charAt(i12 + 1)) + (x8.b.a(str.charAt(i12)) << 4));
                    if (i11 > i9) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new i(bArr);
        }
        throw new IllegalArgumentException(j.j(str, "Unexpected hex string: ").toString());
    }

    public static i c(String str) {
        j.e(str, "<this>");
        byte[] bytes = str.getBytes(O7.a.f2244a);
        j.d(bytes, "(this as java.lang.String).getBytes(charset)");
        i iVar = new i(bytes);
        iVar.f24017d = str;
        return iVar;
    }

    public static i e(byte[] bArr) {
        i iVar = i.f24015f;
        int length = bArr.length;
        AbstractC2947c.h(bArr.length, 0, length);
        return new i(AbstractC2815f.x(0, length, bArr));
    }

    public synchronized c d() {
        c cVar;
        try {
            if (c.f22896h == null) {
                c.f22896h = new c();
            }
            cVar = c.f22896h;
            j.b(cVar);
        } catch (Throwable th) {
            throw th;
        }
        return cVar;
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C2496b c2496b : componentRegistrar.getComponents()) {
            String str = c2496b.f21944a;
            if (str != null) {
                F2.e eVar = new F2.e(15, str, c2496b);
                c2496b = new C2496b(str, c2496b.b, c2496b.f21945c, c2496b.f21946d, c2496b.f21947e, eVar, c2496b.f21949g);
            }
            arrayList.add(c2496b);
        }
        return arrayList;
    }
}
