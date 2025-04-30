package I4;

import G4.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements G4.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1463a = true;
    public final JsonWriter b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f1464c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f1465d;

    /* renamed from: e, reason: collision with root package name */
    public final G4.d f1466e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1467f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z8) {
        this.b = new JsonWriter(writer);
        this.f1464c = hashMap;
        this.f1465d = hashMap2;
        this.f1466e = aVar;
        this.f1467f = z8;
    }

    @Override // G4.e
    public final G4.e a(G4.c cVar, int i9) {
        String str = cVar.f1274a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i9);
        return this;
    }

    @Override // G4.e
    public final G4.e b(G4.c cVar, long j7) {
        String str = cVar.f1274a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j7);
        return this;
    }

    @Override // G4.e
    public final G4.e c(G4.c cVar, double d2) {
        String str = cVar.f1274a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d2);
        return this;
    }

    @Override // G4.e
    public final G4.e d(G4.c cVar, Object obj) {
        i(obj, cVar.f1274a);
        return this;
    }

    @Override // G4.e
    public final G4.e e(G4.c cVar, boolean z8) {
        String str = cVar.f1274a;
        j();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z8);
        return this;
    }

    @Override // G4.g
    public final g f(String str) {
        j();
        this.b.value(str);
        return this;
    }

    @Override // G4.g
    public final g g(boolean z8) {
        j();
        this.b.value(z8);
        return this;
    }

    public final e h(Object obj) {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            int i9 = 0;
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i9 < length) {
                    jsonWriter.value(r6[i9]);
                    i9++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i9 < length2) {
                    long j7 = jArr[i9];
                    j();
                    jsonWriter.value(j7);
                    i9++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i9 < length3) {
                    jsonWriter.value(dArr[i9]);
                    i9++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i9 < length4) {
                    jsonWriter.value(zArr[i9]);
                    i9++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i9 < length5) {
                    h(numberArr[i9]);
                    i9++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i9 < length6) {
                    h(objArr[i9]);
                    i9++;
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
                } catch (ClassCastException e4) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        G4.d dVar = (G4.d) this.f1464c.get(obj.getClass());
        if (dVar != null) {
            jsonWriter.beginObject();
            dVar.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        G4.f fVar = (G4.f) this.f1465d.get(obj.getClass());
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
        this.f1466e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final e i(Object obj, String str) {
        boolean z8 = this.f1467f;
        JsonWriter jsonWriter = this.b;
        if (z8) {
            if (obj != null) {
                j();
                jsonWriter.name(str);
                h(obj);
            }
            return this;
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            h(obj);
        }
        return this;
    }

    public final void j() {
        if (this.f1463a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
