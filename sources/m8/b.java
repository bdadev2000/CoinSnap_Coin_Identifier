package m8;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import l8.d;
import n9.x;
import ra.f;
import y7.c0;

/* loaded from: classes3.dex */
public final class b extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21641f;

    public /* synthetic */ b(int i10) {
        this.f21641f = i10;
    }

    @Override // p6.a
    public final l8.b g(d dVar, ByteBuffer byteBuffer) {
        switch (this.f21641f) {
            case 0:
                if (byteBuffer.get() == 116) {
                    c0 c0Var = new c0(byteBuffer.array(), byteBuffer.limit());
                    int i10 = 12;
                    c0Var.r(12);
                    int f10 = (c0Var.f() + c0Var.i(12)) - 4;
                    c0Var.r(44);
                    c0Var.s(c0Var.i(12));
                    c0Var.r(16);
                    ArrayList arrayList = new ArrayList();
                    while (c0Var.f() < f10) {
                        c0Var.r(48);
                        int i11 = c0Var.i(8);
                        c0Var.r(4);
                        int f11 = c0Var.f() + c0Var.i(i10);
                        String str = null;
                        String str2 = null;
                        while (c0Var.f() < f11) {
                            int i12 = c0Var.i(8);
                            int i13 = c0Var.i(8);
                            int f12 = c0Var.f() + i13;
                            if (i12 == 2) {
                                int i14 = c0Var.i(16);
                                c0Var.r(8);
                                if (i14 == 3) {
                                    while (c0Var.f() < f12) {
                                        int i15 = c0Var.i(8);
                                        Charset charset = f.a;
                                        byte[] bArr = new byte[i15];
                                        c0Var.k(bArr, i15);
                                        String str3 = new String(bArr, charset);
                                        int i16 = c0Var.i(8);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            c0Var.s(c0Var.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i12 == 21) {
                                Charset charset2 = f.a;
                                byte[] bArr2 = new byte[i13];
                                c0Var.k(bArr2, i13);
                                str2 = new String(bArr2, charset2);
                            }
                            c0Var.o(f12 * 8);
                        }
                        c0Var.o(f11 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(i11, str.concat(str2)));
                        }
                        i10 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new l8.b(arrayList);
                    }
                }
                return null;
            default:
                x xVar = new x(byteBuffer.array(), byteBuffer.limit());
                String p10 = xVar.p();
                p10.getClass();
                String p11 = xVar.p();
                p11.getClass();
                return new l8.b(new n8.a(p10, p11, xVar.o(), xVar.o(), Arrays.copyOfRange(xVar.a, xVar.f22599b, xVar.f22600c)));
        }
    }
}
