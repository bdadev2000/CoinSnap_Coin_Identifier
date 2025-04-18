package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.g0;
import com.facebook.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class u {
    public final com.facebook.internal.c a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10972b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10973c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10974d;

    /* renamed from: e, reason: collision with root package name */
    public int f10975e;

    public u(com.facebook.internal.c attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.a = attributionIdentifiers;
        this.f10972b = anonymousAppDeviceGUID;
        this.f10973c = new ArrayList();
        this.f10974d = new ArrayList();
    }

    public final synchronized void a(e event) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (this.f10973c.size() + this.f10974d.size() >= 1000) {
                this.f10975e++;
            } else {
                this.f10973c.add(event);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final synchronized void b(boolean z10) {
        if (m6.a.b(this)) {
            return;
        }
        if (z10) {
            try {
                this.f10973c.addAll(this.f10974d);
            } catch (Throwable th2) {
                m6.a.a(this, th2);
                return;
            }
        }
        this.f10974d.clear();
        this.f10975e = 0;
    }

    public final synchronized List c() {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f10973c;
            this.f10973c = new ArrayList();
            return arrayList;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    public final int d(g0 request, Context applicationContext, boolean z10, boolean z11) {
        boolean areEqual;
        if (m6.a.b(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                try {
                    int i10 = this.f10975e;
                    z5.b bVar = z5.b.a;
                    z5.b.b(this.f10973c);
                    this.f10974d.addAll(this.f10973c);
                    this.f10973c.clear();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f10974d.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        String str = eVar.f10936g;
                        if (str == null) {
                            areEqual = true;
                        } else {
                            String jSONObject = eVar.f10932b.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
                            areEqual = Intrinsics.areEqual(com.facebook.b.t(jSONObject), str);
                        }
                        if (areEqual) {
                            if (z10 || !eVar.f10933c) {
                                jSONArray.put(eVar.f10932b);
                            }
                        } else {
                            Intrinsics.stringPlus("Event with invalid checksum: ", eVar);
                            x xVar = x.a;
                        }
                    }
                    if (jSONArray.length() == 0) {
                        return 0;
                    }
                    Unit unit = Unit.INSTANCE;
                    e(request, applicationContext, i10, jSONArray, z11);
                    return jSONArray.length();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return 0;
        }
    }

    public final void e(g0 g0Var, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                HashMap hashMap = c6.e.a;
                jSONObject = c6.e.a(c6.d.CUSTOM_APP_EVENTS, this.a, this.f10972b, z10, context);
                if (this.f10975e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            g0Var.f11005c = jSONObject;
            Bundle bundle = g0Var.f11006d;
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            bundle.putString("custom_events", jSONArray2);
            g0Var.f11007e = jSONArray2;
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            g0Var.f11006d = bundle;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
