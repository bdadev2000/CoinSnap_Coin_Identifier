package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fe implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final sn F;
    private final boolean G;
    private final String H;
    private final Map I;
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4694b;

    /* renamed from: c, reason: collision with root package name */
    private int f4695c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4696d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4697f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4698g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4699h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f4700i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f4701j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4702k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4703l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f4704m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f4705n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f4706o;

    /* renamed from: p, reason: collision with root package name */
    private final String f4707p;

    /* renamed from: q, reason: collision with root package name */
    private final String f4708q;

    /* renamed from: r, reason: collision with root package name */
    private String f4709r;

    /* renamed from: s, reason: collision with root package name */
    private String f4710s;

    /* renamed from: t, reason: collision with root package name */
    private final String f4711t;
    private final String u;

    /* renamed from: v, reason: collision with root package name */
    private final String f4712v;

    /* renamed from: w, reason: collision with root package name */
    private final String f4713w;

    /* renamed from: x, reason: collision with root package name */
    private final int f4714x;

    /* renamed from: y, reason: collision with root package name */
    private final List f4715y;

    /* renamed from: z, reason: collision with root package name */
    private final List f4716z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");

        private final String a;

        a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4728b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4729c;

        b(String str, int i10, String str2) {
            this.a = str;
            this.f4728b = i10;
            this.f4729c = str2;
        }

        public String b() {
            return this.f4729c;
        }

        public String c() {
            return this.a;
        }

        public int d() {
            return this.f4728b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fe(org.json.JSONObject r19, com.applovin.impl.sdk.k r20) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fe.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    public boolean A() {
        return this.G;
    }

    public boolean B() {
        return this.f4706o;
    }

    public boolean C() {
        return this.f4696d;
    }

    public boolean D() {
        return this.f4705n;
    }

    public boolean E() {
        return this.f4694b == a.MISSING && this.f4702k;
    }

    public boolean F() {
        return this.E;
    }

    public boolean G() {
        return this.f4703l;
    }

    public boolean H() {
        return this.f4704m;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fe feVar) {
        return this.f4708q.compareToIgnoreCase(feVar.f4708q);
    }

    public String b() {
        return this.f4709r;
    }

    public String c() {
        return this.f4711t;
    }

    public Map d() {
        return this.I;
    }

    public String e() {
        return this.H;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f4708q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f4714x;
    }

    public int i() {
        return this.f4695c;
    }

    public final String j() {
        String str;
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f4707p);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f4694b.b());
        sb2.append("\nSDK     - ");
        String str2 = "UNAVAILABLE";
        if (!this.f4696d || TextUtils.isEmpty(this.f4710s)) {
            str = "UNAVAILABLE";
        } else {
            str = this.f4710s;
        }
        sb2.append(str);
        sb2.append("\nAdapter - ");
        if (this.f4697f && !TextUtils.isEmpty(this.f4711t)) {
            str2 = this.f4711t;
        }
        sb2.append(str2);
        for (eh ehVar : n()) {
            if (!ehVar.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(ehVar.b());
                sb2.append(": ");
                sb2.append(ehVar.a());
            }
        }
        for (n6 n6Var : f()) {
            if (!n6Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(n6Var.b());
                sb2.append(": ");
                sb2.append(n6Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f4707p;
    }

    public List n() {
        return this.f4716z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f4709r.equals(string)) {
            this.f4695c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a10 = ve.a(string, this.a);
            if (a10 != null) {
                String a11 = ve.a(a10);
                if (!this.f4710s.equals(a11)) {
                    this.f4710s = a11;
                    this.a.o().a(this.f4710s, string);
                }
            }
        }
    }

    public String p() {
        return this.f4710s;
    }

    public a q() {
        return this.f4694b;
    }

    public List r() {
        return this.f4715y;
    }

    public List s() {
        return this.B;
    }

    public sn t() {
        return this.F;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f4707p);
        sb2.append(", displayName=");
        sb2.append(this.f4708q);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f4696d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f4710s);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f4697f);
        sb2.append(", adapterVersion=");
        return vd.e.h(sb2, this.f4711t, "}");
    }

    public String u() {
        return this.f4712v;
    }

    public String v() {
        return this.f4713w;
    }

    public Map w() {
        return this.D;
    }

    public b x() {
        if (!this.f4700i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f4694b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !C() || !y())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.a.n0().c()) {
            return b.DISABLED;
        }
        if (this.f4701j && (this.f4695c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f4695c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.NOT_INITIALIZED;
        }
        return b.READY;
    }

    public boolean y() {
        return this.f4697f;
    }

    public boolean z() {
        return this.f4698g;
    }

    private a a() {
        a aVar;
        if (this.f4696d) {
            if (this.f4697f) {
                aVar = a.COMPLETE;
            } else if (this.f4699h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f4697f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f4716z.iterator();
        while (it.hasNext()) {
            if (!((eh) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((n6) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f4706o || com.applovin.impl.sdk.k.B0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n6(jSONObject2, kVar));
            }
        }
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null);
            if (jSONObject3 != null && n6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new n6(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f4709r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            eh ehVar = new eh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.k());
            if (ehVar.c()) {
                arrayList.add(ehVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new eh(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.k()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }
}
