package y7;

import android.net.Uri;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import i8.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v8.u0;

/* loaded from: classes3.dex */
public final class j implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f27986c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: d, reason: collision with root package name */
    public static final h.c f27987d = new h.c(new nb.a(22));

    /* renamed from: f, reason: collision with root package name */
    public static final h.c f27988f = new h.c(new nb.a(23));

    /* renamed from: b, reason: collision with root package name */
    public z1 f27989b;

    @Override // y7.o
    public final synchronized l[] a(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f27986c;
        arrayList = new ArrayList(16);
        int F = u0.F(map);
        if (F != -1) {
            b(F, arrayList);
        }
        int G = u0.G(uri);
        if (G != -1 && G != F) {
            b(G, arrayList);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            int i11 = iArr[i10];
            if (i11 != F && i11 != G) {
                b(i11, arrayList);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    public final void b(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new i8.a());
                return;
            case 1:
                arrayList.add(new i8.c());
                return;
            case 2:
                arrayList.add(new i8.e());
                return;
            case 3:
                arrayList.add(new z7.a());
                return;
            case 4:
                l v10 = f27987d.v(0);
                if (v10 != null) {
                    arrayList.add(v10);
                    return;
                } else {
                    arrayList.add(new b8.b());
                    return;
                }
            case 5:
                arrayList.add(new c8.b());
                return;
            case 6:
                arrayList.add(new e8.d(0));
                return;
            case 7:
                arrayList.add(new f8.d());
                return;
            case 8:
                arrayList.add(new g8.l());
                arrayList.add(new g8.n(0));
                return;
            case 9:
                arrayList.add(new h8.e());
                return;
            case 10:
                arrayList.add(new i8.a0());
                return;
            case 11:
                if (this.f27989b == null) {
                    n0 n0Var = r0.f12026c;
                    this.f27989b = z1.f12062g;
                }
                arrayList.add(new f0(new n9.f0(0L), new i8.g(this.f27989b)));
                return;
            case 12:
                arrayList.add(new j8.d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new d8.a());
                return;
            case 15:
                l v11 = f27988f.v(new Object[0]);
                if (v11 != null) {
                    arrayList.add(v11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new a8.c());
                return;
        }
    }

    @Override // y7.o
    public final synchronized l[] createExtractors() {
        return a(Uri.EMPTY, new HashMap());
    }
}
