package yg;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class o {
    public final String[] a;

    /* renamed from: b, reason: collision with root package name */
    public final ki.z f28242b;

    public o(String[] strArr, ki.z zVar) {
        this.a = strArr;
        this.f28242b = zVar;
    }

    public static o a(String... strArr) {
        try {
            ki.l[] lVarArr = new ki.l[strArr.length];
            ki.i iVar = new ki.i();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                r.w(iVar, strArr[i10]);
                iVar.readByte();
                lVarArr[i10] = iVar.readByteString();
            }
            String[] strArr2 = (String[]) strArr.clone();
            int i11 = ki.z.f21034d;
            return new o(strArr2, wh.a0.B(lVarArr));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
