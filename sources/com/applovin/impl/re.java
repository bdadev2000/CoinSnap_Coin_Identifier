package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.ec;
import com.applovin.impl.i4;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.te;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes2.dex */
public abstract class re extends se {

    /* renamed from: a */
    private te f26289a;

    /* renamed from: b */
    private DataSetObserver f26290b;

    /* renamed from: c */
    private FrameLayout f26291c;
    private ListView d;

    /* renamed from: f */
    private o f26292f;

    /* loaded from: classes2.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            re.this.a();
            re reVar = re.this;
            reVar.b((Context) reVar);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ec.a {

        /* renamed from: a */
        final /* synthetic */ q f26294a;

        /* loaded from: classes2.dex */
        public class a implements r.b {

            /* renamed from: a */
            final /* synthetic */ com.applovin.impl.sdk.j f26296a;

            public a(com.applovin.impl.sdk.j jVar) {
                this.f26296a = jVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(this.f26296a);
            }
        }

        /* renamed from: com.applovin.impl.re$b$b */
        /* loaded from: classes2.dex */
        public class C0094b implements r.b {
            public C0094b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class c implements r.b {
            public c() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class d implements r.b {
            public d() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(re.this.f26289a.e(), false, re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class e implements r.b {
            public e() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(re.this.f26289a.j(), re.this.f26289a.w(), re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class f implements r.b {
            public f() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(re.this.f26289a.v(), re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class g implements r.b {
            public g() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(re.this.f26289a.n(), true, re.this.f26289a.t());
            }
        }

        /* loaded from: classes2.dex */
        public class h implements r.b {

            /* renamed from: a */
            final /* synthetic */ dc f26304a;

            public h(dc dcVar) {
                this.f26304a = dcVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((cg) this.f26304a).r());
            }
        }

        public b(q qVar) {
            this.f26294a = qVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            int b2 = lbVar.b();
            if (b2 == te.f.APP_INFO.ordinal()) {
                yp.a(dcVar.c(), dcVar.b(), re.this);
                return;
            }
            if (b2 == te.f.MAX.ordinal()) {
                com.applovin.impl.sdk.j t2 = re.this.f26289a.t();
                if (t2.u().k()) {
                    int a2 = lbVar.a();
                    if (t2.u().e() != i4.a.UNIFIED) {
                        int i2 = a2 + 1;
                        if (i2 == te.d.PRIVACY_POLICY_URL.ordinal()) {
                            if (t2.u().h() != null) {
                                tp.a(t2.u().h(), com.applovin.impl.sdk.j.l(), t2);
                                return;
                            } else {
                                yp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", re.this);
                                return;
                            }
                        }
                        if (i2 == te.d.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (t2.u().i() != null) {
                                tp.a(t2.u().i(), com.applovin.impl.sdk.j.l(), t2);
                                return;
                            }
                            return;
                        }
                    } else if (re.this.f26289a.a(dcVar)) {
                        r.a(re.this, MaxDebuggerUnifiedFlowActivity.class, this.f26294a, new a(t2));
                        return;
                    }
                }
                yp.a(dcVar.c(), dcVar.b(), re.this);
                return;
            }
            if (b2 == te.f.PRIVACY.ordinal()) {
                if (lbVar.a() != te.e.CMP.ordinal()) {
                    if (lbVar.a() == te.e.NETWORK_CONSENT_STATUSES.ordinal()) {
                        r.a(re.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f26294a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(re.this.f26289a.t().k0().k())) {
                    r.a(re.this, MaxDebuggerTcfInfoListActivity.class, this.f26294a, new C0094b());
                    return;
                } else {
                    yp.a(dcVar.c(), dcVar.b(), re.this);
                    return;
                }
            }
            if (b2 != te.f.ADS.ordinal()) {
                if ((b2 == te.f.INCOMPLETE_NETWORKS.ordinal() || b2 == te.f.COMPLETED_NETWORKS.ordinal()) && (dcVar instanceof cg)) {
                    r.a(re.this, MaxDebuggerDetailActivity.class, this.f26294a, new h(dcVar));
                    return;
                }
                return;
            }
            if (lbVar.a() == te.b.AD_UNITS.ordinal()) {
                if (re.this.f26289a.e().size() > 0) {
                    r.a(re.this, MaxDebuggerAdUnitsListActivity.class, this.f26294a, new d());
                    return;
                } else {
                    yp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", re.this);
                    return;
                }
            }
            if (lbVar.a() == te.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (re.this.f26289a.j().size() <= 0 && re.this.f26289a.w().size() <= 0) {
                    yp.a("Complete Integrations", "Please complete integrations in order to access this.", re.this);
                    return;
                } else if (re.this.f26289a.t().l0().c()) {
                    yp.a("Restart Required", dcVar.b(), re.this);
                    return;
                } else {
                    r.a(re.this, MaxDebuggerTestLiveNetworkActivity.class, this.f26294a, new e());
                    return;
                }
            }
            if (lbVar.a() != te.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (lbVar.a() == te.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(re.this, MaxDebuggerAdUnitsListActivity.class, this.f26294a, new g());
                }
            } else if (!re.this.f26289a.t().l0().c()) {
                re.this.getSdk().l0().a();
                yp.a("Restart Required", dcVar.b(), re.this);
            } else if (re.this.f26289a.v().size() > 0) {
                r.a(re.this, MaxDebuggerTestModeNetworkActivity.class, this.f26294a, new f());
            } else {
                yp.a("Complete Integrations", "Please complete integrations in order to access this.", re.this);
            }
        }
    }

    public static /* synthetic */ void b(re reVar, Context context) {
        reVar.a(context);
    }

    private void c() {
        a();
        o oVar = new o(this, 50, R.attr.progressBarStyleLarge);
        this.f26292f = oVar;
        oVar.setColor(-3355444);
        this.f26291c.addView(this.f26292f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f26291c.bringChildToFront(this.f26292f);
        this.f26292f.a();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        te teVar = this.f26289a;
        if (teVar != null) {
            return teVar.t();
        }
        return null;
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f26291c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.f26289a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        te teVar = this.f26289a;
        if (teVar != null) {
            teVar.unregisterDataSetObserver(this.f26290b);
            this.f26289a.a((ec.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        te teVar = this.f26289a;
        if (teVar == null || teVar.x()) {
            return;
        }
        c();
    }

    public void setListAdapter(te teVar, q qVar) {
        DataSetObserver dataSetObserver;
        te teVar2 = this.f26289a;
        if (teVar2 != null && (dataSetObserver = this.f26290b) != null) {
            teVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f26289a = teVar;
        this.f26290b = new a();
        b((Context) this);
        this.f26289a.registerDataSetObserver(this.f26290b);
        this.f26289a.a(new b(qVar));
    }

    public /* synthetic */ void a(Context context) {
        yp.a(this.f26289a.h(), this.f26289a.g(), context);
    }

    public void b(Context context) {
        if (!StringUtils.isValidString(this.f26289a.g()) || this.f26289a.d()) {
            return;
        }
        this.f26289a.b(true);
        runOnUiThread(new ms(24, this, context));
    }

    public void a() {
        o oVar = this.f26292f;
        if (oVar != null) {
            oVar.b();
            this.f26291c.removeView(this.f26292f);
            this.f26292f = null;
        }
    }

    private void b() {
        String o2 = this.f26289a.o();
        if (TextUtils.isEmpty(o2)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", o2);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }
}
