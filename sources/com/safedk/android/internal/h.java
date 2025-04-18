package com.safedk.android.internal;

import android.os.Bundle;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29971a = "master";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29972b = "collect_host_urls";

    /* renamed from: c, reason: collision with root package name */
    private static final String f29973c = "SafeDKToggles";
    private static final String d = "network";
    private static final String e = "location";

    /* renamed from: f, reason: collision with root package name */
    private static final String f29974f = "calllog";

    /* renamed from: g, reason: collision with root package name */
    private static final String f29975g = "accounts";

    /* renamed from: h, reason: collision with root package name */
    private static final String f29976h = "contacts";

    /* renamed from: i, reason: collision with root package name */
    private static final String f29977i = "calendar";

    /* renamed from: j, reason: collision with root package name */
    private static final String f29978j = "browser";

    /* renamed from: k, reason: collision with root package name */
    private static final String f29979k = "sms";

    /* renamed from: l, reason: collision with root package name */
    private static final String f29980l = "files";

    /* renamed from: m, reason: collision with root package name */
    private static final String f29981m = "camera";

    /* renamed from: n, reason: collision with root package name */
    private static final String f29982n = "microphone";

    /* renamed from: o, reason: collision with root package name */
    private static final String f29983o = "accelerometer";

    /* renamed from: p, reason: collision with root package name */
    private static final String f29984p = "notifications";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29985q = "packagemanager";

    /* renamed from: r, reason: collision with root package name */
    private static final String f29986r = "advertising_identifier";

    /* renamed from: s, reason: collision with root package name */
    private boolean f29987s = true;

    /* renamed from: t, reason: collision with root package name */
    private boolean f29988t = true;

    /* renamed from: u, reason: collision with root package name */
    private boolean f29989u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f29990v = true;
    private boolean w = true;
    private boolean x = true;

    /* renamed from: y, reason: collision with root package name */
    private boolean f29991y = true;

    /* renamed from: z, reason: collision with root package name */
    private boolean f29992z = true;
    private boolean A = true;
    private boolean B = true;
    private boolean C = true;
    private boolean D = true;
    private boolean E = true;
    private boolean F = true;
    private boolean G = true;
    private boolean H = true;
    private boolean I = false;

    public h(boolean z2) {
        b(z2);
    }

    private void b(boolean z2) {
        this.H = z2;
        this.G = z2;
        this.F = z2;
        this.E = z2;
        this.D = z2;
        this.C = z2;
        this.B = z2;
        this.A = z2;
        this.f29992z = z2;
        this.f29991y = z2;
        this.x = z2;
        this.w = z2;
        this.f29990v = z2;
        this.f29989u = z2;
        this.f29988t = z2;
        this.f29987s = z2;
        this.I = false;
    }

    public h(String str) {
        a(str);
    }

    public h(JSONObject jSONObject) {
        a(jSONObject);
    }

    private Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f29971a, this.f29987s);
        bundle.putBoolean("network", this.f29988t);
        bundle.putBoolean("location", this.f29989u);
        bundle.putBoolean(f29975g, this.w);
        bundle.putBoolean(f29974f, this.f29990v);
        bundle.putBoolean(f29976h, this.x);
        bundle.putBoolean(f29977i, this.f29991y);
        bundle.putBoolean(f29978j, this.f29992z);
        bundle.putBoolean(f29979k, this.A);
        bundle.putBoolean(f29980l, this.B);
        bundle.putBoolean(f29981m, this.C);
        bundle.putBoolean(f29982n, this.D);
        bundle.putBoolean(f29983o, this.E);
        bundle.putBoolean(f29984p, this.F);
        bundle.putBoolean(f29985q, this.G);
        bundle.putBoolean(f29986r, this.H);
        bundle.putBoolean(f29972b, this.I);
        return bundle;
    }

    private void a(String str) {
        try {
            a(new JSONObject(str));
        } catch (JSONException e2) {
            Logger.e(f29973c, "Failed to convert toggles to json", e2);
        }
    }

    public void a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(f29971a)) {
                this.f29987s = jSONObject.getBoolean(f29971a);
            }
            if (jSONObject.has("network")) {
                this.f29988t = jSONObject.getBoolean("network");
            }
            if (jSONObject.has("location")) {
                this.f29989u = jSONObject.getBoolean("location");
            }
            if (jSONObject.has(f29975g)) {
                this.w = jSONObject.getBoolean(f29975g);
            }
            if (jSONObject.has(f29974f)) {
                this.f29990v = jSONObject.getBoolean(f29974f);
            }
            if (jSONObject.has(f29976h)) {
                this.x = jSONObject.getBoolean(f29976h);
            }
            if (jSONObject.has(f29977i)) {
                this.f29991y = jSONObject.getBoolean(f29977i);
            }
            if (jSONObject.has(f29978j)) {
                this.f29992z = jSONObject.getBoolean(f29978j);
            }
            if (jSONObject.has(f29979k)) {
                this.A = jSONObject.getBoolean(f29979k);
            }
            if (jSONObject.has(f29980l)) {
                this.B = jSONObject.getBoolean(f29980l);
            }
            if (jSONObject.has(f29981m)) {
                this.C = jSONObject.getBoolean(f29981m);
            }
            if (jSONObject.has(f29982n)) {
                this.D = jSONObject.getBoolean(f29982n);
            }
            if (jSONObject.has(f29983o)) {
                this.E = jSONObject.getBoolean(f29983o);
            }
            if (jSONObject.has(f29984p)) {
                this.F = jSONObject.getBoolean(f29984p);
            }
            if (jSONObject.has(f29985q)) {
                this.G = jSONObject.getBoolean(f29985q);
            }
            if (jSONObject.has(f29986r)) {
                this.H = jSONObject.getBoolean(f29986r);
            }
            if (jSONObject.has(f29972b)) {
                this.I = jSONObject.getBoolean(f29972b);
            }
        } catch (Throwable th) {
            Logger.e(f29973c, "Failed to parse toggles: " + (jSONObject == null ? "null" : jSONObject.toString()), th);
            new CrashReporter().caughtException(th);
            b(true);
        }
    }

    public ArrayList<String> a() {
        return a(true);
    }

    public ArrayList<String> a(boolean z2) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Bundle s2 = s();
            for (String str : s2.keySet()) {
                if (!str.equals(f29972b) && !s2.getBoolean(str)) {
                    arrayList.add(str);
                }
            }
        } catch (Throwable th) {
            Logger.e(f29973c, "caught exception", th);
            if (z2) {
                new CrashReporter().caughtException(th);
            }
        }
        return arrayList;
    }

    public boolean b() {
        return this.f29987s;
    }

    public boolean c() {
        return this.f29988t;
    }

    public boolean d() {
        return this.f29989u;
    }

    public boolean e() {
        return this.w;
    }

    public boolean f() {
        return this.f29990v;
    }

    public boolean g() {
        return this.x;
    }

    public boolean h() {
        return this.f29991y;
    }

    public boolean i() {
        return this.f29992z;
    }

    public boolean j() {
        return this.A;
    }

    public boolean k() {
        return this.B;
    }

    public boolean l() {
        return this.C;
    }

    public boolean m() {
        return this.D;
    }

    public boolean n() {
        return this.E;
    }

    public boolean o() {
        return this.F;
    }

    public boolean p() {
        return this.G;
    }

    public boolean q() {
        return this.H;
    }

    public boolean r() {
        return this.I;
    }

    public String toString() {
        return "SafeDKToggles: master=" + this.f29987s + "; network=" + this.f29988t + "; location=" + this.f29989u + "; ; accounts=" + this.w + "; call_log=" + this.f29990v + "; contacts=" + this.x + "; calendar=" + this.f29991y + "; browser=" + this.f29992z + "; sms_mms=" + this.A + "; files=" + this.B + "; camera=" + this.C + "; microphone=" + this.D + "; accelerometer=" + this.E + "; notifications=" + this.F + "; packageManager=" + this.G + "; advertisingId=" + this.H;
    }
}
