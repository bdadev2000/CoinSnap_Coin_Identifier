package com.apm.insight.l;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {
    final Writer a;

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f3234b = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public l(Writer writer) {
        this.a = writer;
    }

    private a e() {
        return this.f3234b.get(r0.size() - 1);
    }

    private void f() {
        a e2 = e();
        if (e2 == a.NONEMPTY_OBJECT) {
            this.a.write(44);
        } else if (e2 != a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        a(a.DANGLING_KEY);
    }

    private void g() {
        a aVar;
        if (this.f3234b.isEmpty()) {
            return;
        }
        a e2 = e();
        if (e2 == a.EMPTY_ARRAY) {
            aVar = a.NONEMPTY_ARRAY;
        } else if (e2 == a.NONEMPTY_ARRAY) {
            this.a.write(44);
            return;
        } else if (e2 != a.DANGLING_KEY) {
            if (e2 != a.NULL) {
                throw new JSONException("Nesting problem");
            }
            return;
        } else {
            this.a.write(":");
            aVar = a.NONEMPTY_OBJECT;
        }
        a(aVar);
    }

    public l a() {
        return a(a.EMPTY_ARRAY, "[");
    }

    public l b() {
        return a(a.EMPTY_ARRAY, a.NONEMPTY_ARRAY, "]");
    }

    public l c() {
        return a(a.EMPTY_OBJECT, "{");
    }

    public l d() {
        return a(a.EMPTY_OBJECT, a.NONEMPTY_OBJECT, "}");
    }

    public String toString() {
        return "";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0027. Please report as an issue. */
    private void b(String str) {
        Writer writer;
        String str2;
        this.a.write("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\f') {
                writer = this.a;
                str2 = "\\f";
            } else if (charAt != '\r') {
                if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                    this.a.write(92);
                } else {
                    switch (charAt) {
                        case '\b':
                            writer = this.a;
                            str2 = "\\b";
                            break;
                        case '\t':
                            writer = this.a;
                            str2 = "\\t";
                            break;
                        case '\n':
                            writer = this.a;
                            str2 = "\\n";
                            break;
                        default:
                            if (charAt <= 31) {
                                this.a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                                break;
                            }
                            break;
                    }
                }
                this.a.write(charAt);
            } else {
                writer = this.a;
                str2 = "\\r";
            }
            writer.write(str2);
        }
        this.a.write("\"");
    }

    public l a(a aVar, a aVar2, String str) {
        e();
        this.f3234b.remove(r1.size() - 1);
        this.a.write(str);
        return this;
    }

    public l a(a aVar, String str) {
        g();
        this.f3234b.add(aVar);
        this.a.write(str);
        return this;
    }

    public l a(Object obj) {
        Writer writer;
        String numberToString;
        if (obj instanceof JSONArray) {
            a((JSONArray) obj);
            return this;
        }
        if (obj instanceof JSONObject) {
            a((JSONObject) obj);
            return this;
        }
        g();
        if (obj == null || obj == JSONObject.NULL) {
            this.a.write(AbstractJsonLexerKt.NULL);
        } else {
            if (obj instanceof Boolean) {
                writer = this.a;
                numberToString = String.valueOf(obj);
            } else if (obj instanceof Number) {
                writer = this.a;
                numberToString = JSONObject.numberToString((Number) obj);
            } else {
                b(obj.toString());
            }
            writer.write(numberToString);
        }
        return this;
    }

    public l a(String str) {
        f();
        b(str);
        return this;
    }

    private void a(a aVar) {
        this.f3234b.set(r0.size() - 1, aVar);
    }

    private void a(JSONArray jSONArray) {
        a();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(jSONArray.get(i10));
        }
        b();
    }

    public static void a(JSONArray jSONArray, Writer writer) {
        new l(writer).a(jSONArray);
        writer.flush();
    }

    private void a(JSONObject jSONObject) {
        c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next).a(jSONObject.get(next));
        }
        d();
    }

    public static void a(JSONObject jSONObject, Writer writer) {
        new l(writer).a(jSONObject);
        writer.flush();
    }
}
