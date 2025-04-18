package i8;

import com.google.common.collect.r0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.q0;

/* loaded from: classes3.dex */
public final class g {
    public final int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List f19303b;

    public g(r0 r0Var) {
        this.f19303b = r0Var;
    }

    public final List a(n9.w wVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        boolean z11;
        byte[] bArr;
        boolean b3 = b(32);
        List list2 = this.f19303b;
        if (b3) {
            return list2;
        }
        n9.x xVar = new n9.x((byte[]) wVar.f22595d);
        while (xVar.f22600c - xVar.f22599b > 0) {
            int v10 = xVar.v();
            int v11 = xVar.f22599b + xVar.v();
            if (v10 == 134) {
                ArrayList arrayList = new ArrayList();
                int v12 = xVar.v() & 31;
                for (int i11 = 0; i11 < v12; i11++) {
                    String s5 = xVar.s(3);
                    int v13 = xVar.v();
                    if ((v13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = v13 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte v14 = (byte) xVar.v();
                    xVar.H(1);
                    if (z10) {
                        if ((v14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    q0 q0Var = new q0();
                    q0Var.f24667k = str;
                    q0Var.f24659c = s5;
                    q0Var.C = i10;
                    q0Var.f24669m = list;
                    arrayList.add(new s7.r0(q0Var));
                }
                list2 = arrayList;
            }
            xVar.G(v11);
        }
        return list2;
    }

    public final boolean b(int i10) {
        return (i10 & this.a) != 0;
    }
}
