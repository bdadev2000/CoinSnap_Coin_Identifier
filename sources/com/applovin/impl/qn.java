package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f10398a;
    private zb b;

    /* renamed from: c, reason: collision with root package name */
    private final List f10399c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f10400d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f10401f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f10402g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f10403h = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends zb {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            return i9 == e.IAB_TCF_PARAMETERS.ordinal() ? qn.this.c() : qn.this.a();
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            if (i9 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            if (i9 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new bj("IAB TCF Parameters");
            }
            return new bj("CMP CONFIGURATION");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rn f10405a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        /* loaded from: classes.dex */
        public class a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f10407a;
            final /* synthetic */ String b;

            public a(String str, String str2) {
                this.f10407a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f10407a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.qn$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0032b implements r.b {
            public C0032b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(qn.this.f10401f, qn.this.f10402g, qn.this.f10399c, qn.this.f10400d, qn.this.f10403h, b.this.b);
            }
        }

        public b(rn rnVar, com.applovin.impl.sdk.k kVar) {
            this.f10405a = rnVar;
            this.b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            String a6;
            String c9;
            if (hbVar.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (hbVar.a() == d.TC_STRING.ordinal()) {
                    a6 = qj.f10381s.a();
                    c9 = this.f10405a.k();
                } else {
                    a6 = qj.f10382t.a();
                    c9 = this.f10405a.c();
                }
                r.a(qn.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(a6, c9));
                return;
            }
            if (hbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                r.a(qn.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0032b());
            } else {
                zp.a(ybVar.c(), ybVar.b(), qn.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* loaded from: classes.dex */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* loaded from: classes.dex */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f10398a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f10398a = kVar;
        rn m02 = kVar.m0();
        a(m02.i());
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(m02, kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private void a(sn snVar, List list) {
        if (snVar.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (snVar.d().equals(((sn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(snVar);
    }

    private yb b() {
        yb.b a6;
        String a9 = qj.f10378p.a();
        Integer e4 = this.f10398a.m0().e();
        if (StringUtils.isValidString(this.f10398a.m0().d())) {
            a6 = yb.a(yb.c.RIGHT_DETAIL);
        } else {
            yb.b b8 = yb.a(yb.c.DETAIL).b("Unknown CMP SDK ID");
            a6 = b8.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a9 + " is " + e4 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(r3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a6.d(a9);
        a6.c(e4 != null ? e4.toString() : "No value set");
        a6.c(e4 != null ? ViewCompat.MEASURED_STATE_MASK : -65536);
        return a6.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g9 = this.f10398a.m0().g();
        String k6 = this.f10398a.m0().k();
        String c9 = this.f10398a.m0().c();
        arrayList.add(a(qj.f10380r.a(), g9));
        arrayList.add(a(qj.f10381s.a(), k6, !un.b(k6)));
        arrayList.add(a(qj.f10382t.a(), c9, false));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f10402g.size() + this.f10401f.size();
        arrayList.add(b());
        arrayList.add(a(qj.f10379q.a(), this.f10398a.m0().f()));
        arrayList.add(yb.a(yb.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        yb.b d2 = yb.a(yb.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = Q7.n0.f(size, "Missing ", " network(s)");
        } else {
            str = "";
        }
        arrayList.add(d2.c(str).c(size > 0 ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private yb a(String str, String str2, boolean z8) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        yb.b d2 = yb.a(yb.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        yb.b a6 = d2.c(str2).c(z8 ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(isValidString);
        if (isValidString) {
            a6.a(this);
        }
        return a6.a();
    }

    private yb a(String str, Integer num) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : -65536).a();
    }

    private void a(List list) {
        boolean b8 = this.f10398a.m0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            if (snVar.f() == sn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.f10399c);
                } else {
                    a(snVar, this.f10401f);
                }
            } else if (snVar.f() != sn.a.ATP_NETWORK) {
                this.f10403h.add(snVar);
            } else if (b8) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.f10400d);
                } else {
                    a(snVar, this.f10402g);
                }
            } else {
                this.f10403h.add(snVar);
            }
        }
    }
}
