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
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class fe implements Comparable, AppLovinCommunicatorSubscriber {

    /* renamed from: A, reason: collision with root package name */
    private final List f7643A;

    /* renamed from: B, reason: collision with root package name */
    private final List f7644B;

    /* renamed from: C, reason: collision with root package name */
    private final List f7645C;

    /* renamed from: D, reason: collision with root package name */
    private final Map f7646D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f7647E;

    /* renamed from: F, reason: collision with root package name */
    private final sn f7648F;

    /* renamed from: G, reason: collision with root package name */
    private final boolean f7649G;

    /* renamed from: H, reason: collision with root package name */
    private final String f7650H;

    /* renamed from: I, reason: collision with root package name */
    private final Map f7651I;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7652a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private int f7653c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7654d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7655f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7656g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7657h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7658i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7659j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7660k;
    private final boolean l;
    private final boolean m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f7661n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7662o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7663p;

    /* renamed from: q, reason: collision with root package name */
    private final String f7664q;

    /* renamed from: r, reason: collision with root package name */
    private String f7665r;

    /* renamed from: s, reason: collision with root package name */
    private String f7666s;

    /* renamed from: t, reason: collision with root package name */
    private final String f7667t;

    /* renamed from: u, reason: collision with root package name */
    private final String f7668u;

    /* renamed from: v, reason: collision with root package name */
    private final String f7669v;

    /* renamed from: w, reason: collision with root package name */
    private final String f7670w;

    /* renamed from: x, reason: collision with root package name */
    private final int f7671x;

    /* renamed from: y, reason: collision with root package name */
    private final List f7672y;

    /* renamed from: z, reason: collision with root package name */
    private final List f7673z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f7678a;

        a(String str) {
            this.f7678a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f7678a;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f7685a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7686c;

        b(String str, int i9, String str2) {
            this.f7685a = str;
            this.b = i9;
            this.f7686c = str2;
        }

        public String b() {
            return this.f7686c;
        }

        public String c() {
            return this.f7685a;
        }

        public int d() {
            return this.b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:29|30|31|(5:32|33|35|36|(5:38|(2:40|(3:42|43|44))|112|43|44)(1:113))|(3:45|46|47)|48|49|50|51|52|(3:53|54|55)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d9, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d5, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0250  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fe(org.json.JSONObject r19, com.applovin.impl.sdk.k r20) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fe.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    public boolean A() {
        return this.f7649G;
    }

    public boolean B() {
        return this.f7662o;
    }

    public boolean C() {
        return this.f7654d;
    }

    public boolean D() {
        return this.f7661n;
    }

    public boolean E() {
        if (this.b == a.MISSING && this.f7660k) {
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.f7647E;
    }

    public boolean G() {
        return this.l;
    }

    public boolean H() {
        return this.m;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fe feVar) {
        return this.f7664q.compareToIgnoreCase(feVar.f7664q);
    }

    public String b() {
        return this.f7665r;
    }

    public String c() {
        return this.f7667t;
    }

    public Map d() {
        return this.f7651I;
    }

    public String e() {
        return this.f7650H;
    }

    public List f() {
        return this.f7643A;
    }

    public String g() {
        return this.f7664q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f7671x;
    }

    public int i() {
        return this.f7653c;
    }

    public final String j() {
        String str;
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f7663p);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.b.b());
        sb.append("\nSDK     - ");
        String str2 = "UNAVAILABLE";
        if (!this.f7654d || TextUtils.isEmpty(this.f7666s)) {
            str = "UNAVAILABLE";
        } else {
            str = this.f7666s;
        }
        sb.append(str);
        sb.append("\nAdapter - ");
        if (this.f7655f && !TextUtils.isEmpty(this.f7667t)) {
            str2 = this.f7667t;
        }
        sb.append(str2);
        for (eh ehVar : n()) {
            if (!ehVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(ehVar.b());
                sb.append(": ");
                sb.append(ehVar.a());
            }
        }
        for (n6 n6Var : f()) {
            if (!n6Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(n6Var.b());
                sb.append(": ");
                sb.append(n6Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f7668u;
    }

    public List l() {
        return this.f7645C;
    }

    public String m() {
        return this.f7663p;
    }

    public List n() {
        return this.f7673z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f7652a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7665r.equals(string)) {
            this.f7653c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a6 = ve.a(string, this.f7652a);
            if (a6 != null) {
                String a9 = ve.a(a6);
                if (!this.f7666s.equals(a9)) {
                    this.f7666s = a9;
                    this.f7652a.o().a(this.f7666s, string);
                }
            }
        }
    }

    public String p() {
        return this.f7666s;
    }

    public a q() {
        return this.b;
    }

    public List r() {
        return this.f7672y;
    }

    public List s() {
        return this.f7644B;
    }

    public sn t() {
        return this.f7648F;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.f7663p);
        sb.append(", displayName=");
        sb.append(this.f7664q);
        sb.append(", sdkAvailable=");
        sb.append(this.f7654d);
        sb.append(", sdkVersion=");
        sb.append(this.f7666s);
        sb.append(", adapterAvailable=");
        sb.append(this.f7655f);
        sb.append(", adapterVersion=");
        return AbstractC2914a.h(sb, this.f7667t, "}");
    }

    public String u() {
        return this.f7669v;
    }

    public String v() {
        return this.f7670w;
    }

    public Map w() {
        return this.f7646D;
    }

    public b x() {
        if (!this.f7658i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !C() || !y())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.f7652a.n0().c()) {
            return b.DISABLED;
        }
        if (this.f7659j && (this.f7653c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7653c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.NOT_INITIALIZED;
        }
        return b.READY;
    }

    public boolean y() {
        return this.f7655f;
    }

    public boolean z() {
        return this.f7656g;
    }

    private a a() {
        a aVar;
        if (this.f7654d) {
            if (this.f7655f) {
                aVar = a.COMPLETE;
            } else if (this.f7657h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f7655f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f7673z.iterator();
        while (it.hasNext()) {
            if (!((eh) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f7643A.iterator();
        while (it2.hasNext()) {
            if (!((n6) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f7662o || com.applovin.impl.sdk.k.B0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i9, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n6(jSONObject2, kVar));
            }
        }
        for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i10, (JSONObject) null);
            if (jSONObject3 != null && n6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new n6(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f7665r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
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

    private List a(MaxAdapter maxAdapter, boolean z8) {
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
            if (z8) {
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
