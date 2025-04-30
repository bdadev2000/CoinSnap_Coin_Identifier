package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.C;
import com.facebook.internal.C1834c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final C1834c f13513a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f13514c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13515d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f13516e;

    public s(C1834c c1834c, String str) {
        this.f13513a = c1834c;
        this.b = str;
    }

    public final synchronized void a(e eVar) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(eVar, NotificationCompat.CATEGORY_EVENT);
            if (this.f13514c.size() + this.f13515d.size() >= 1000) {
                this.f13516e++;
            } else {
                this.f13514c.add(eVar);
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final synchronized void b(boolean z8) {
        if (O2.a.b(this)) {
            return;
        }
        if (z8) {
            try {
                this.f13514c.addAll(this.f13515d);
            } catch (Throwable th) {
                O2.a.a(this, th);
                return;
            }
        }
        this.f13515d.clear();
        this.f13516e = 0;
    }

    public final synchronized List c() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f13514c;
            this.f13514c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final int d(C c9, Context context, boolean z8, boolean z9) {
        boolean equals;
        if (O2.a.b(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                try {
                    int i9 = this.f13516e;
                    B2.b bVar = B2.b.f275a;
                    B2.b.b(this.f13514c);
                    this.f13515d.addAll(this.f13514c);
                    this.f13514c.clear();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f13515d.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        String str = eVar.f13481g;
                        if (str == null) {
                            equals = true;
                        } else {
                            String jSONObject = eVar.b.toString();
                            G7.j.d(jSONObject, "jsonObject.toString()");
                            equals = L4.f.b(jSONObject).equals(str);
                        }
                        if (equals) {
                            if (z8 || !eVar.f13478c) {
                                jSONArray.put(eVar.b);
                            }
                        } else {
                            G7.j.j(eVar, "Event with invalid checksum: ");
                            com.facebook.r rVar = com.facebook.r.f13801a;
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    e(c9, context, i9, jSONArray, z9);
                    return jSONArray.length();
                } finally {
                }
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
            return 0;
        }
    }

    public final void e(C c9, Context context, int i9, JSONArray jSONArray, boolean z8) {
        JSONObject jSONObject;
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = E2.g.f992a;
                jSONObject = E2.g.a(E2.f.f990c, this.f13513a, this.b, z8, context);
                if (this.f13516e > 0) {
                    jSONObject.put("num_skipped_events", i9);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            c9.f13383c = jSONObject;
            Bundle bundle = c9.f13384d;
            String jSONArray2 = jSONArray.toString();
            G7.j.d(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            c9.f13385e = jSONArray2;
            c9.f13384d = bundle;
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
