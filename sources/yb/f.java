package yb;

import androidx.recyclerview.widget.s0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import eb.j;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l9.n;

/* loaded from: classes3.dex */
public final class f implements vb.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f28147f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f28148g;

    /* renamed from: h, reason: collision with root package name */
    public static final vb.c f28149h;

    /* renamed from: i, reason: collision with root package name */
    public static final xb.a f28150i;
    public OutputStream a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f28151b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f28152c;

    /* renamed from: d, reason: collision with root package name */
    public final vb.d f28153d;

    /* renamed from: e, reason: collision with root package name */
    public final h f28154e = new h(this);

    static {
        n nVar = new n("key");
        s0 g10 = s0.g();
        g10.f2031b = 1;
        f28148g = j.t(g10, nVar);
        n nVar2 = new n(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        s0 g11 = s0.g();
        g11.f2031b = 2;
        f28149h = j.t(g11, nVar2);
        f28150i = new xb.a(1);
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, vb.d dVar) {
        this.a = byteArrayOutputStream;
        this.f28151b = map;
        this.f28152c = map2;
        this.f28153d = dVar;
    }

    public static int k(vb.c cVar) {
        e eVar = (e) ((Annotation) cVar.f26412b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).a;
        }
        throw new vb.b("Field has no @Protobuf config");
    }

    @Override // vb.e
    public final vb.e a(vb.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    @Override // vb.e
    public final vb.e b(vb.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override // vb.e
    public final vb.e c(vb.c cVar, long j3) {
        i(cVar, j3, true);
        return this;
    }

    @Override // vb.e
    public final vb.e d(vb.c cVar, double d10) {
        g(cVar, d10, true);
        return this;
    }

    @Override // vb.e
    public final vb.e e(vb.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final f f(vb.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f28147f);
            l(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(f28150i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            g(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                l((k(cVar) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            i(cVar, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return this;
        }
        vb.d dVar = (vb.d) this.f28151b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return this;
        }
        vb.f fVar = (vb.f) this.f28152c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f28154e;
            hVar.a = false;
            hVar.f28159c = cVar;
            hVar.f28158b = z10;
            fVar.a(obj, hVar);
            return this;
        }
        if (obj instanceof c) {
            h(cVar, ((c) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            h(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        j(this.f28153d, cVar, obj, z10);
        return this;
    }

    public final void g(vb.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return;
        }
        l((k(cVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void h(vb.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f26412b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.f28143b.ordinal();
            int i11 = aVar.a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        l((i11 << 3) | 5);
                        this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
                        return;
                    }
                    return;
                }
                l(i11 << 3);
                l((i10 << 1) ^ (i10 >> 31));
                return;
            }
            l(i11 << 3);
            l(i10);
            return;
        }
        throw new vb.b("Field has no @Protobuf config");
    }

    public final void i(vb.c cVar, long j3, boolean z10) {
        if (z10 && j3 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.f26412b.get(e.class));
        if (eVar != null) {
            a aVar = (a) eVar;
            int ordinal = aVar.f28143b.ordinal();
            int i10 = aVar.a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        l((i10 << 3) | 1);
                        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j3).array());
                        return;
                    }
                    return;
                }
                l(i10 << 3);
                m((j3 >> 63) ^ (j3 << 1));
                return;
            }
            l(i10 << 3);
            m(j3);
            return;
        }
        throw new vb.b("Field has no @Protobuf config");
    }

    public final void j(vb.d dVar, vb.c cVar, Object obj, boolean z10) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.a;
            this.a = bVar;
            try {
                dVar.a(obj, this);
                this.a = outputStream;
                long j3 = bVar.f28144b;
                bVar.close();
                if (z10 && j3 == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                m(j3);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void l(int i10) {
        while ((i10 & (-128)) != 0) {
            this.a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.a.write(i10 & 127);
    }

    public final void m(long j3) {
        while (((-128) & j3) != 0) {
            this.a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.a.write(((int) j3) & 127);
    }
}
