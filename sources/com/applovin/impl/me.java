package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.g4;
import com.applovin.impl.oe;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;

/* loaded from: classes.dex */
public abstract class me extends ne {
    private oe a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f5959b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f5960c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f5961d;

    /* renamed from: f, reason: collision with root package name */
    private o f5962f;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            me.this.a();
            me meVar = me.this;
            meVar.b((Context) meVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {
        final /* synthetic */ q a;

        /* loaded from: classes.dex */
        public class a implements r.b {
            final /* synthetic */ com.applovin.impl.sdk.k a;

            public a(com.applovin.impl.sdk.k kVar) {
                this.a = kVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(this.a);
            }
        }

        /* renamed from: com.applovin.impl.me$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0021b implements r.b {
            public C0021b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class c implements r.b {
            public c() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class d implements r.b {
            public d() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.a.e(), false, me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class e implements r.b {
            public e() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(me.this.a.j(), me.this.a.w(), me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class f implements r.b {
            public f() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(me.this.a.v(), me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class g implements r.b {
            public g() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.a.n(), true, me.this.a.t());
            }
        }

        /* loaded from: classes.dex */
        public class h implements r.b {
            final /* synthetic */ yb a;

            public h(yb ybVar) {
                this.a = ybVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((xf) this.a).r());
            }
        }

        public b(q qVar) {
            this.a = qVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            int b3 = hbVar.b();
            if (b3 == oe.f.APP_INFO.ordinal()) {
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (b3 == oe.f.MAX.ordinal()) {
                com.applovin.impl.sdk.k t5 = me.this.a.t();
                if (t5.t().k()) {
                    int a10 = hbVar.a();
                    if (t5.t().e() == g4.a.UNIFIED) {
                        if (a10 == oe.d.CONSENT_FLOW.ordinal()) {
                            r.a(me.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a(t5));
                            return;
                        }
                    } else {
                        int i10 = a10 + 1;
                        if (i10 == oe.d.PRIVACY_POLICY_URL.ordinal()) {
                            if (t5.t().h() != null) {
                                up.a(t5.t().h(), com.applovin.impl.sdk.k.k(), t5);
                                return;
                            } else {
                                zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", me.this);
                                return;
                            }
                        }
                        if (i10 == oe.d.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (t5.t().i() != null) {
                                up.a(t5.t().i(), com.applovin.impl.sdk.k.k(), t5);
                                return;
                            }
                            return;
                        }
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (b3 == oe.f.PRIVACY.ordinal()) {
                if (hbVar.a() == oe.e.CMP.ordinal()) {
                    if (StringUtils.isValidString(me.this.a.t().m0().k())) {
                        r.a(me.this, MaxDebuggerTcfInfoListActivity.class, this.a, new C0021b());
                        return;
                    } else {
                        zp.a(ybVar.c(), ybVar.b(), me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.e.NETWORK_CONSENT_STATUSES.ordinal()) {
                    r.a(me.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                    return;
                }
                return;
            }
            if (b3 == oe.f.ADS.ordinal()) {
                if (hbVar.a() == oe.b.AD_UNITS.ordinal()) {
                    if (me.this.a.e().size() > 0) {
                        r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                        return;
                    } else {
                        zp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (me.this.a.j().size() <= 0 && me.this.a.w().size() <= 0) {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                        return;
                    } else if (me.this.a.t().n0().c()) {
                        zp.a("Restart Required", ybVar.b(), me.this);
                        return;
                    } else {
                        r.a(me.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                        return;
                    }
                }
                if (hbVar.a() == oe.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!me.this.a.t().n0().c()) {
                        me.this.getSdk().n0().a();
                        zp.a("Restart Required", ybVar.b(), me.this);
                        return;
                    } else if (me.this.a.v().size() > 0) {
                        r.a(me.this, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
                        return;
                    } else {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                    return;
                }
                return;
            }
            if ((b3 == oe.f.INCOMPLETE_NETWORKS.ordinal() || b3 == oe.f.COMPLETED_NETWORKS.ordinal()) && (ybVar instanceof xf)) {
                r.a(me.this, MaxDebuggerDetailActivity.class, this.a, new h(ybVar));
            }
        }
    }

    private void c() {
        a();
        o oVar = new o(this, 50, R.attr.progressBarStyleLarge);
        this.f5962f = oVar;
        oVar.setColor(-3355444);
        this.f5960c.addView(this.f5962f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f5960c.bringChildToFront(this.f5962f);
        this.f5962f.a();
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        oe oeVar = this.a;
        if (oeVar != null) {
            return oeVar.t();
        }
        return null;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f5960c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f5961d = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        oe oeVar = this.a;
        if (oeVar != null) {
            oeVar.unregisterDataSetObserver(this.f5959b);
            this.a.a((zb.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share == menuItem.getItemId()) {
            b();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        oe oeVar = this.a;
        if (oeVar != null && !oeVar.x()) {
            c();
        }
    }

    public void setListAdapter(oe oeVar, q qVar) {
        DataSetObserver dataSetObserver;
        oe oeVar2 = this.a;
        if (oeVar2 != null && (dataSetObserver = this.f5959b) != null) {
            oeVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.a = oeVar;
        this.f5959b = new a();
        b((Context) this);
        this.a.registerDataSetObserver(this.f5959b);
        this.a.a(new b(qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        zp.a(this.a.h(), this.a.g(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.a.g()) || this.a.d()) {
            return;
        }
        this.a.b(true);
        runOnUiThread(new rs(19, this, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        o oVar = this.f5962f;
        if (oVar != null) {
            oVar.b();
            this.f5960c.removeView(this.f5962f);
            this.f5962f = null;
        }
    }

    private void b() {
        String o10 = this.a.o();
        if (TextUtils.isEmpty(o10)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", o10);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }
}
