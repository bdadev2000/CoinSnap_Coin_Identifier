package J4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f implements G4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f1577f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f1578g = new G4.c("key", o.r(o.q(e.class, new a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final G4.c f1579h = new G4.c(AppMeasurementSdk.ConditionalUserProperty.VALUE, o.r(o.q(e.class, new a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final I4.a f1580i = new I4.a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f1581a;
    public final Map b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f1582c;

    /* renamed from: d, reason: collision with root package name */
    public final G4.d f1583d;

    /* renamed from: e, reason: collision with root package name */
    public final h f1584e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, G4.d dVar) {
        this.f1581a = byteArrayOutputStream;
        this.b = map;
        this.f1582c = map2;
        this.f1583d = dVar;
    }

    public static int j(G4.c cVar) {
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).f1575a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // G4.e
    public final G4.e a(G4.c cVar, int i9) {
        g(cVar, i9, true);
        return this;
    }

    @Override // G4.e
    public final G4.e b(G4.c cVar, long j7) {
        if (j7 != 0) {
            e eVar = (e) ((Annotation) cVar.b.get(e.class));
            if (eVar != null) {
                k(((a) eVar).f1575a << 3);
                l(j7);
            } else {
                throw new RuntimeException("Field has no @Protobuf config");
            }
        }
        return this;
    }

    @Override // G4.e
    public final G4.e c(G4.c cVar, double d2) {
        f(cVar, d2, true);
        return this;
    }

    @Override // G4.e
    public final G4.e d(G4.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override // G4.e
    public final G4.e e(G4.c cVar, boolean z8) {
        g(cVar, z8 ? 1 : 0, true);
        return this;
    }

    public final void f(G4.c cVar, double d2, boolean z8) {
        if (z8 && d2 == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f1581a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d2).array());
    }

    public final void g(G4.c cVar, int i9, boolean z8) {
        if (z8 && i9 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) cVar.b.get(e.class));
        if (eVar != null) {
            k(((a) eVar).f1575a << 3);
            k(i9);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(G4.c cVar, Object obj, boolean z8) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z8 && charSequence.length() == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f1577f);
            k(bytes.length);
            this.f1581a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f1580i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z8);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z8 || floatValue != 0.0f) {
                k((j(cVar) << 3) | 5);
                this.f1581a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                return;
            }
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (!z8 || longValue != 0) {
                e eVar = (e) ((Annotation) cVar.b.get(e.class));
                if (eVar != null) {
                    k(((a) eVar).f1575a << 3);
                    l(longValue);
                    return;
                }
                throw new RuntimeException("Field has no @Protobuf config");
            }
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z8);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z8 && bArr.length == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            k(bArr.length);
            this.f1581a.write(bArr);
            return;
        }
        G4.d dVar = (G4.d) this.b.get(obj.getClass());
        if (dVar != null) {
            i(dVar, cVar, obj, z8);
            return;
        }
        G4.f fVar = (G4.f) this.f1582c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f1584e;
            hVar.f1586a = false;
            hVar.f1587c = cVar;
            hVar.b = z8;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            g(cVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f1583d, cVar, obj, z8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, J4.b] */
    public final void i(G4.d dVar, G4.c cVar, Object obj, boolean z8) {
        ?? outputStream = new OutputStream();
        outputStream.b = 0L;
        try {
            OutputStream outputStream2 = this.f1581a;
            this.f1581a = outputStream;
            try {
                dVar.a(obj, this);
                this.f1581a = outputStream2;
                long j7 = outputStream.b;
                outputStream.close();
                if (z8 && j7 == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                l(j7);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f1581a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i9) {
        while ((i9 & (-128)) != 0) {
            this.f1581a.write((i9 & 127) | 128);
            i9 >>>= 7;
        }
        this.f1581a.write(i9 & 127);
    }

    public final void l(long j7) {
        while (((-128) & j7) != 0) {
            this.f1581a.write((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        this.f1581a.write(((int) j7) & 127);
    }
}
