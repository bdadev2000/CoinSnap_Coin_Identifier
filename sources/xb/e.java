package xb;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vb.g;

/* loaded from: classes3.dex */
public final class e implements vb.e, g {
    public boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f27623b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f27624c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f27625d;

    /* renamed from: e, reason: collision with root package name */
    public final vb.d f27626e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27627f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z10) {
        this.f27623b = new JsonWriter(writer);
        this.f27624c = hashMap;
        this.f27625d = hashMap2;
        this.f27626e = aVar;
        this.f27627f = z10;
    }

    @Override // vb.e
    public final vb.e a(vb.c cVar, Object obj) {
        return i(obj, cVar.a);
    }

    @Override // vb.e
    public final vb.e b(vb.c cVar, int i10) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.f27623b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i10);
        return this;
    }

    @Override // vb.e
    public final vb.e c(vb.c cVar, long j3) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.f27623b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j3);
        return this;
    }

    @Override // vb.e
    public final vb.e d(vb.c cVar, double d10) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.f27623b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d10);
        return this;
    }

    @Override // vb.e
    public final vb.e e(vb.c cVar, boolean z10) {
        String str = cVar.a;
        j();
        JsonWriter jsonWriter = this.f27623b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z10);
        return this;
    }

    @Override // vb.g
    public final g f(String str) {
        j();
        this.f27623b.value(str);
        return this;
    }

    @Override // vb.g
    public final g g(boolean z10) {
        j();
        this.f27623b.value(z10);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.f27623b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i10 < length) {
                    jsonWriter.value(r7[i10]);
                    i10++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i10 < length2) {
                    long j3 = jArr[i10];
                    j();
                    jsonWriter.value(j3);
                    i10++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i10 < length3) {
                    jsonWriter.value(dArr[i10]);
                    i10++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i10 < length4) {
                    jsonWriter.value(zArr[i10]);
                    i10++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i10 < length5) {
                    h(numberArr[i10]);
                    i10++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i10 < length6) {
                    h(objArr[i10]);
                    i10++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e2) {
                    throw new vb.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        vb.d dVar = (vb.d) this.f27624c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        vb.f fVar = (vb.f) this.f27625d.get(obj.getClass());
        if (fVar != null) {
            fVar.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof f) {
                int number = ((f) obj).getNumber();
                j();
                jsonWriter.value(number);
            } else {
                String name = ((Enum) obj).name();
                j();
                jsonWriter.value(name);
            }
            return this;
        }
        jsonWriter.beginObject();
        this.f27626e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final e i(Object obj, String str) {
        boolean z10 = this.f27627f;
        JsonWriter jsonWriter = this.f27623b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            return h(obj);
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return h(obj);
    }

    public final void j() {
        if (this.a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
