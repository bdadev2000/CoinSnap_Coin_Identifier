package com.mbridge.msdk.foundation.db.a;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import com.mbridge.msdk.foundation.same.f.b;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.a.a f15472a;
    private k b;

    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0158a {

        /* renamed from: a, reason: collision with root package name */
        private static a f15475a = new a();
    }

    private a() {
        this.f15472a = new com.mbridge.msdk.foundation.same.a.a(1000);
        try {
            k a6 = k.a(g.a(c.m().c()));
            this.b = a6;
            a(a6.a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject, final boolean z8) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            final com.mbridge.msdk.foundation.same.a.a aVar = new com.mbridge.msdk.foundation.same.a.a(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f15472a.a(next, optJSONObject);
                aVar.a(next, optJSONObject);
            }
            b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.db.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (z8 && a.this.b != null) {
                        for (String str : aVar.a()) {
                            a.this.b.a(str, a.this.f15472a.a(str));
                        }
                    }
                }
            });
        }
    }

    public final JSONArray b() {
        return new JSONArray((Collection) this.f15472a.a());
    }

    public static a a() {
        return C0158a.f15475a;
    }

    public final JSONObject a(String str) {
        k kVar;
        JSONObject a6 = this.f15472a.a(str);
        if (a6 != null || (kVar = this.b) == null) {
            return a6;
        }
        JSONObject a9 = kVar.a(str);
        if (a9 != null) {
            this.f15472a.a(str, a9);
        }
        return a9;
    }
}
