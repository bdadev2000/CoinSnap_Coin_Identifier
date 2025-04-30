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

    /* renamed from: a */
    private oe f8909a;
    private DataSetObserver b;

    /* renamed from: c */
    private FrameLayout f8910c;

    /* renamed from: d */
    private ListView f8911d;

    /* renamed from: f */
    private C0730o f8912f;

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

        /* renamed from: a */
        final /* synthetic */ C0738q f8914a;

        /* loaded from: classes.dex */
        public class a implements r.b {

            /* renamed from: a */
            final /* synthetic */ com.applovin.impl.sdk.k f8915a;

            public a(com.applovin.impl.sdk.k kVar) {
                this.f8915a = kVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(this.f8915a);
            }
        }

        /* renamed from: com.applovin.impl.me$b$b */
        /* loaded from: classes.dex */
        public class C0021b implements r.b {
            public C0021b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class c implements r.b {
            public c() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class d implements r.b {
            public d() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f8909a.e(), false, me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class e implements r.b {
            public e() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(me.this.f8909a.j(), me.this.f8909a.w(), me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class f implements r.b {
            public f() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(me.this.f8909a.v(), me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class g implements r.b {
            public g() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f8909a.n(), true, me.this.f8909a.t());
            }
        }

        /* loaded from: classes.dex */
        public class h implements r.b {

            /* renamed from: a */
            final /* synthetic */ yb f8922a;

            public h(yb ybVar) {
                this.f8922a = ybVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((xf) this.f8922a).r());
            }
        }

        public b(C0738q c0738q) {
            this.f8914a = c0738q;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            int b = hbVar.b();
            if (b == oe.f.APP_INFO.ordinal()) {
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (b == oe.f.MAX.ordinal()) {
                com.applovin.impl.sdk.k t9 = me.this.f8909a.t();
                if (t9.t().k()) {
                    int a6 = hbVar.a();
                    if (t9.t().e() == g4.a.UNIFIED) {
                        if (a6 == oe.d.CONSENT_FLOW.ordinal()) {
                            r.a(me.this, MaxDebuggerUnifiedFlowActivity.class, this.f8914a, new a(t9));
                            return;
                        }
                    } else {
                        int i9 = a6 + 1;
                        if (i9 == oe.d.PRIVACY_POLICY_URL.ordinal()) {
                            if (t9.t().h() != null) {
                                up.a(t9.t().h(), com.applovin.impl.sdk.k.k(), t9);
                                return;
                            } else {
                                zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", me.this);
                                return;
                            }
                        }
                        if (i9 == oe.d.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (t9.t().i() != null) {
                                up.a(t9.t().i(), com.applovin.impl.sdk.k.k(), t9);
                                return;
                            }
                            return;
                        }
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (b == oe.f.PRIVACY.ordinal()) {
                if (hbVar.a() == oe.e.CMP.ordinal()) {
                    if (StringUtils.isValidString(me.this.f8909a.t().m0().k())) {
                        r.a(me.this, MaxDebuggerTcfInfoListActivity.class, this.f8914a, new C0021b());
                        return;
                    } else {
                        zp.a(ybVar.c(), ybVar.b(), me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.e.NETWORK_CONSENT_STATUSES.ordinal()) {
                    r.a(me.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f8914a, new c());
                    return;
                }
                return;
            }
            if (b == oe.f.ADS.ordinal()) {
                if (hbVar.a() == oe.b.AD_UNITS.ordinal()) {
                    if (me.this.f8909a.e().size() > 0) {
                        r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.f8914a, new d());
                        return;
                    } else {
                        zp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (me.this.f8909a.j().size() <= 0 && me.this.f8909a.w().size() <= 0) {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                        return;
                    } else if (me.this.f8909a.t().n0().c()) {
                        zp.a("Restart Required", ybVar.b(), me.this);
                        return;
                    } else {
                        r.a(me.this, MaxDebuggerTestLiveNetworkActivity.class, this.f8914a, new e());
                        return;
                    }
                }
                if (hbVar.a() == oe.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!me.this.f8909a.t().n0().c()) {
                        me.this.getSdk().n0().a();
                        zp.a("Restart Required", ybVar.b(), me.this);
                        return;
                    } else if (me.this.f8909a.v().size() > 0) {
                        r.a(me.this, MaxDebuggerTestModeNetworkActivity.class, this.f8914a, new f());
                        return;
                    } else {
                        zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.f8914a, new g());
                    return;
                }
                return;
            }
            if ((b == oe.f.INCOMPLETE_NETWORKS.ordinal() || b == oe.f.COMPLETED_NETWORKS.ordinal()) && (ybVar instanceof xf)) {
                r.a(me.this, MaxDebuggerDetailActivity.class, this.f8914a, new h(ybVar));
            }
        }
    }

    public static /* synthetic */ void b(me meVar, Context context) {
        meVar.a(context);
    }

    private void c() {
        a();
        C0730o c0730o = new C0730o(this, 50, R.attr.progressBarStyleLarge);
        this.f8912f = c0730o;
        c0730o.setColor(-3355444);
        this.f8910c.addView(this.f8912f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8910c.bringChildToFront(this.f8912f);
        this.f8912f.a();
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        oe oeVar = this.f8909a;
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
        this.f8910c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f8911d = listView;
        listView.setAdapter((ListAdapter) this.f8909a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        oe oeVar = this.f8909a;
        if (oeVar != null) {
            oeVar.unregisterDataSetObserver(this.b);
            this.f8909a.a((zb.a) null);
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
        oe oeVar = this.f8909a;
        if (oeVar != null && !oeVar.x()) {
            c();
        }
    }

    public void setListAdapter(oe oeVar, C0738q c0738q) {
        DataSetObserver dataSetObserver;
        oe oeVar2 = this.f8909a;
        if (oeVar2 != null && (dataSetObserver = this.b) != null) {
            oeVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f8909a = oeVar;
        this.b = new a();
        b((Context) this);
        this.f8909a.registerDataSetObserver(this.b);
        this.f8909a.a(new b(c0738q));
    }

    public /* synthetic */ void a(Context context) {
        zp.a(this.f8909a.h(), this.f8909a.g(), context);
    }

    public void b(Context context) {
        if (!StringUtils.isValidString(this.f8909a.g()) || this.f8909a.d()) {
            return;
        }
        this.f8909a.b(true);
        runOnUiThread(new F(19, this, context));
    }

    public void a() {
        C0730o c0730o = this.f8912f;
        if (c0730o != null) {
            c0730o.b();
            this.f8910c.removeView(this.f8912f);
            this.f8912f = null;
        }
    }

    private void b() {
        String o3 = this.f8909a.o();
        if (TextUtils.isEmpty(o3)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", o3);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }
}
