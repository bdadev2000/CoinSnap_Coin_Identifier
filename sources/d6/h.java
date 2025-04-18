package d6;

import android.text.TextUtils;
import com.facebook.x;
import h7.b0;
import h7.c0;
import h7.d0;
import h7.f0;
import h7.g0;
import h7.i;
import h7.j;
import h7.j0;
import h7.k;
import h7.m;
import h7.n;
import h7.o;
import h7.p;
import h7.q;
import h7.r;
import h7.s;
import h7.t;
import h7.u;
import h7.w;
import h7.z;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ni.l;
import w3.e0;
import wh.s0;

/* loaded from: classes3.dex */
public final class h implements l, e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f16896b = new h();

    /* renamed from: c, reason: collision with root package name */
    public static final h f16897c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final h f16898d = new h();

    /* renamed from: f, reason: collision with root package name */
    public static final h f16899f = new h();

    public static final File b() {
        if (m6.a.b(h.class)) {
            return null;
        }
        try {
            File file = new File(x.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            m6.a.a(h.class, th2);
            return null;
        }
    }

    public void a(wb.a aVar) {
        h7.c cVar = h7.c.a;
        xb.d dVar = (xb.d) aVar;
        dVar.a(h7.x.class, cVar);
        dVar.a(n.class, cVar);
        j jVar = j.a;
        dVar.a(g0.class, jVar);
        dVar.a(u.class, jVar);
        h7.d dVar2 = h7.d.a;
        dVar.a(z.class, dVar2);
        dVar.a(o.class, dVar2);
        h7.b bVar = h7.b.a;
        dVar.a(h7.a.class, bVar);
        dVar.a(m.class, bVar);
        i iVar = i.a;
        dVar.a(f0.class, iVar);
        dVar.a(t.class, iVar);
        h7.e eVar = h7.e.a;
        dVar.a(b0.class, eVar);
        dVar.a(p.class, eVar);
        h7.h hVar = h7.h.a;
        dVar.a(h7.e0.class, hVar);
        dVar.a(s.class, hVar);
        h7.g gVar = h7.g.a;
        dVar.a(d0.class, gVar);
        dVar.a(r.class, gVar);
        k kVar = k.a;
        dVar.a(j0.class, kVar);
        dVar.a(w.class, kVar);
        h7.f fVar = h7.f.a;
        dVar.a(c0.class, fVar);
        dVar.a(q.class, fVar);
    }

    public String c(String str) {
        int i10;
        boolean z10;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (Intrinsics.compare((int) str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z10) {
                        break;
                    }
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").split(str.subSequence(i11, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    @Override // ni.l
    public Object convert(Object obj) {
        return (s0) obj;
    }

    public int[] d(String texts) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[128];
            String c10 = c(texts);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (c10 != null) {
                byte[] bytes = c10.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < bytes.length) {
                        iArr[i10] = bytes[i10] & UByte.MAX_VALUE;
                    } else {
                        iArr[i10] = 0;
                    }
                    if (i11 >= 128) {
                        return iArr;
                    }
                    i10 = i11;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    @Override // w3.e0
    public Object f(x3.b bVar, float f10) {
        return Integer.valueOf(Math.round(w3.o.d(bVar) * f10));
    }
}
