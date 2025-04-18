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
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class ke implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final rn F;
    private final boolean G;
    private final String H;
    private final Map I;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f24882a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24883b;

    /* renamed from: c, reason: collision with root package name */
    private int f24884c;
    private final boolean d;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24885f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24886g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24887h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f24888i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f24889j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24890k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f24891l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f24892m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f24893n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24894o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24895p;

    /* renamed from: q, reason: collision with root package name */
    private String f24896q;

    /* renamed from: r, reason: collision with root package name */
    private String f24897r;

    /* renamed from: s, reason: collision with root package name */
    private final String f24898s;

    /* renamed from: t, reason: collision with root package name */
    private final String f24899t;

    /* renamed from: u, reason: collision with root package name */
    private final String f24900u;

    /* renamed from: v, reason: collision with root package name */
    private final String f24901v;
    private final int w;
    private final List x;

    /* renamed from: y, reason: collision with root package name */
    private final List f24902y;

    /* renamed from: z, reason: collision with root package name */
    private final List f24903z;

    /* loaded from: classes.dex */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f24908a;

        a(String str) {
            this.f24908a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f24908a;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NOT_SUPPORTED("Not Supported", Opcodes.V_PREVIEW, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", Opcodes.V_PREVIEW, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", Opcodes.V_PREVIEW, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f24914a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24915b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24916c;

        b(String str, int i2, String str2) {
            this.f24914a = str;
            this.f24915b = i2;
            this.f24916c = str2;
        }

        public String b() {
            return this.f24916c;
        }

        public String c() {
            return this.f24914a;
        }

        public int d() {
            return this.f24915b;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:29|30|31|32|33|35|36|(5:38|(2:40|(3:42|43|44))|102|43|44)(1:103)|(3:45|46|47)|48|49) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        r22.J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ec, code lost:
    
        if (com.applovin.impl.sdk.n.a() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        r22.J().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f7, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ke(org.json.JSONObject r21, com.applovin.impl.sdk.j r22) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ke.<init>(org.json.JSONObject, com.applovin.impl.sdk.j):void");
    }

    public boolean A() {
        return this.f24886g;
    }

    public boolean B() {
        return this.G;
    }

    public boolean C() {
        return this.f24893n;
    }

    public boolean D() {
        return this.d;
    }

    public boolean E() {
        return this.f24883b == a.MISSING && this.f24890k;
    }

    public boolean F() {
        return this.E;
    }

    public boolean G() {
        return this.f24891l;
    }

    public boolean H() {
        return this.f24892m;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ke keVar) {
        return this.f24895p.compareToIgnoreCase(keVar.f24895p);
    }

    public String b() {
        return this.f24896q;
    }

    public String c() {
        return this.f24898s;
    }

    public Map d() {
        return this.I;
    }

    public String e() {
        return this.H;
    }

    public List f() {
        return this.f24903z;
    }

    public String g() {
        return this.f24895p;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.w;
    }

    public int i() {
        return this.f24884c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("\n---------- ");
        sb.append(this.f24894o);
        sb.append(" ----------\nStatus  - ");
        sb.append(this.f24883b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.d || TextUtils.isEmpty(this.f24897r)) ? "UNAVAILABLE" : this.f24897r);
        sb.append("\nAdapter - ");
        if (this.f24885f && !TextUtils.isEmpty(this.f24898s)) {
            str = this.f24898s;
        }
        sb.append(str);
        for (hh hhVar : n()) {
            if (!hhVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(hhVar.b());
                sb.append(": ");
                sb.append(hhVar.a());
            }
        }
        for (p6 p6Var : f()) {
            if (!p6Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(p6Var.b());
                sb.append(": ");
                sb.append(p6Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.f24899t;
    }

    public List l() {
        return this.B;
    }

    public String m() {
        return this.f24894o;
    }

    public List n() {
        return this.f24902y;
    }

    public final com.applovin.impl.sdk.j o() {
        return this.f24882a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f24896q.equals(string)) {
            this.f24884c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = af.a(string, this.f24882a);
            if (a2 != null) {
                String a3 = af.a(a2);
                if (this.f24897r.equals(a3)) {
                    return;
                }
                this.f24897r = a3;
                this.f24882a.p().a(this.f24897r, string);
            }
        }
    }

    public String p() {
        return this.f24897r;
    }

    public a q() {
        return this.f24883b;
    }

    public List r() {
        return this.x;
    }

    public List s() {
        return this.A;
    }

    public rn t() {
        return this.F;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediatedNetwork{name=");
        sb.append(this.f24894o);
        sb.append(", displayName=");
        sb.append(this.f24895p);
        sb.append(", sdkAvailable=");
        sb.append(this.d);
        sb.append(", sdkVersion=");
        sb.append(this.f24897r);
        sb.append(", adapterAvailable=");
        sb.append(this.f24885f);
        sb.append(", adapterVersion=");
        return android.support.v4.media.d.r(sb, this.f24898s, "}");
    }

    public List u() {
        return this.C;
    }

    public String v() {
        return this.f24900u;
    }

    public String w() {
        return this.f24901v;
    }

    public Map x() {
        return this.D;
    }

    public b y() {
        if (!this.f24888i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f24883b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && D() && z())) ? !this.f24882a.l0().c() ? b.DISABLED : (this.f24889j && (this.f24884c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f24884c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.f24885f;
    }

    private a a() {
        a aVar;
        if (this.d) {
            if (this.f24885f) {
                aVar = a.COMPLETE;
            } else if (this.f24887h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f24885f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.f24902y.iterator();
        while (it.hasNext()) {
            if (!((hh) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.f24903z.iterator();
        while (it2.hasNext()) {
            if (!((p6) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.f24893n || com.applovin.impl.sdk.j.y0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray2.length() + jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new p6(jSONObject2, jVar));
            }
        }
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null);
            if (jSONObject3 != null && p6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new p6(jSONObject3, jVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f24896q.equals(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29540j)) {
            hh hhVar = new hh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.j.l());
            if (hhVar.c()) {
                arrayList.add(hhVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                arrayList.add(new hh(next, jSONObject2.getString(next), com.applovin.impl.sdk.j.l()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(MaxAdapter maxAdapter, boolean z2) {
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
            if (z2) {
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
