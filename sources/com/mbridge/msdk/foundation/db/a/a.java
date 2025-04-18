package com.mbridge.msdk.foundation.db.a;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.same.f.b;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    private com.mbridge.msdk.foundation.same.a.a a;

    /* renamed from: b, reason: collision with root package name */
    private k f13107b;

    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0170a {
        private static a a = new a();
    }

    private a() {
        this.a = new com.mbridge.msdk.foundation.same.a.a(1000);
        try {
            k a = k.a(g.a(c.m().c()));
            this.f13107b = a;
            a(a.a(), false);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject, final boolean z10) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            final com.mbridge.msdk.foundation.same.a.a aVar = new com.mbridge.msdk.foundation.same.a.a(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.a.a(next, optJSONObject);
                aVar.a(next, optJSONObject);
            }
            b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.db.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (z10 && a.this.f13107b != null) {
                        for (String str : aVar.a()) {
                            a.this.f13107b.a(str, a.this.a.a(str));
                        }
                    }
                }
            });
        }
    }

    public final JSONArray b() {
        return new JSONArray((Collection) this.a.a());
    }

    public static a a() {
        return C0170a.a;
    }

    public final JSONObject a(String str) {
        k kVar;
        JSONObject a = this.a.a(str);
        if (a != null || (kVar = this.f13107b) == null) {
            return a;
        }
        JSONObject a10 = kVar.a(str);
        if (a10 != null) {
            this.a.a(str, a10);
        }
        return a10;
    }
}
