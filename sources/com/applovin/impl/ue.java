package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d4;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ue implements d4.e {

    /* renamed from: m */
    private static WeakReference f27317m;

    /* renamed from: n */
    private static final AtomicBoolean f27318n = new AtomicBoolean();

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f27319a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.n f27320b;

    /* renamed from: c */
    private final Context f27321c;
    private final te d;

    /* renamed from: h */
    private boolean f27324h;

    /* renamed from: j */
    private boolean f27326j;

    /* renamed from: k */
    private Map f27327k;

    /* renamed from: l */
    private final y0 f27328l;

    /* renamed from: f */
    private final Map f27322f = new HashMap();

    /* renamed from: g */
    private final AtomicBoolean f27323g = new AtomicBoolean();

    /* renamed from: i */
    private int f27325i = 2;

    /* loaded from: classes.dex */
    public class a extends p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Started mediation debugger");
                if (!ue.this.c() || ue.f27317m.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = ue.f27317m = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(ue.this.d, ue.this.f27319a.e());
                }
                ue.f27318n.set(false);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.n.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = ue.f27317m = null;
            }
        }
    }

    public ue(com.applovin.impl.sdk.j jVar) {
        this.f27319a = jVar;
        this.f27320b = jVar.J();
        Context l2 = com.applovin.impl.sdk.j.l();
        this.f27321c = l2;
        te teVar = new te(l2);
        this.d = teVar;
        this.f27328l = new y0(jVar, teVar);
    }

    private void f() {
        this.f27319a.e().a(new a());
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public boolean g() {
        return this.f27324h;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.d + "}";
    }

    public boolean c() {
        WeakReference weakReference = f27317m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public /* synthetic */ void d() {
        Activity n02 = this.f27319a.n0();
        if (n02 != null && !n02.isFinishing()) {
            new AlertDialog.Builder(n02).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new yt(this, 2)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        } else {
            com.applovin.impl.sdk.n.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        }
    }

    public void e() {
        if (this.f27323g.compareAndSet(false, true)) {
            this.f27319a.j0().a((yl) new mm(this, this.f27319a), tm.b.OTHER);
        }
    }

    public void a(boolean z2, int i2) {
        this.f27324h = z2;
        this.f27325i = i2;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new z(jSONObject2, this.f27322f, jVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public List a(String str) {
        Map map = this.f27327k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f27327k.get(str);
    }

    private List a(List list, com.applovin.impl.sdk.j jVar) {
        List<String> adUnitIds;
        if (jVar.z0().get()) {
            adUnitIds = jVar.g0().getInitializationAdUnitIds();
        } else {
            adUnitIds = jVar.H() != null ? jVar.H().getAdUnitIds() : null;
        }
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z zVar = (z) it.next();
                if (adUnitIds.contains(zVar.c())) {
                    arrayList.add(zVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                ke keVar = new ke(jSONObject2, jVar);
                arrayList.add(keVar);
                this.f27322f.put(keVar.b(), keVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            x0 x0Var = new x0(str);
            if (x0Var.h()) {
                arrayList.add(x0Var);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f27320b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        h();
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke keVar = (ke) it.next();
            if (keVar.z() && keVar.q() == ke.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new fw(this, 0), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    @Override // com.applovin.impl.d4.e
    public void a(String str, JSONObject jSONObject, int i2) {
        List a2 = a(jSONObject, this.f27319a);
        List a3 = a(jSONObject, a2, this.f27319a);
        List a4 = a(a3, this.f27319a);
        List a5 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.d.a(a2, a3, a4, a5, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "complies_with_google_families_policy", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f27319a);
        if (!a5.isEmpty()) {
            this.f27328l.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new fw(this, 1), TimeUnit.SECONDS.toMillis(this.f27325i));
        } else {
            a(a2);
        }
    }

    public void a(Map map) {
        this.f27327k = map;
        e();
        if (!c() && f27318n.compareAndSet(false, true)) {
            if (!this.f27326j) {
                f();
                this.f27326j = true;
            }
            Intent intent = new Intent(this.f27321c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.n.g("AppLovinSdk", "Starting mediation debugger...");
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f27321c, intent);
            return;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    @Override // com.applovin.impl.d4.e
    public void a(String str, int i2, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f27320b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i2);
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.d.a(null, null, null, null, null, null, null, null, false, this.f27319a);
        this.f27323g.set(false);
    }
}
