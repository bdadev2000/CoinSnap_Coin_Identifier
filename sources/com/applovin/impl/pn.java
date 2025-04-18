package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.ec;
import com.applovin.impl.r;
import com.applovin.impl.rn;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class pn extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f26063a;

    /* renamed from: b, reason: collision with root package name */
    private ec f26064b;

    /* renamed from: c, reason: collision with root package name */
    private final List f26065c = new ArrayList();
    private final List d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f26066f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f26067g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f26068h = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends ec {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return i2 == e.IAB_TCF_PARAMETERS.ordinal() ? pn.this.c() : pn.this.a();
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return i2 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return i2 == e.IAB_TCF_PARAMETERS.ordinal() ? new fj("IAB TCF Parameters") : new fj("CMP CONFIGURATION");
        }
    }

    /* loaded from: classes.dex */
    public class b implements ec.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ qn f26070a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f26071b;

        /* loaded from: classes.dex */
        public class a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f26073a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f26074b;

            public a(String str, String str2) {
                this.f26073a = str;
                this.f26074b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f26073a, this.f26074b, b.this.f26071b);
            }
        }

        /* renamed from: com.applovin.impl.pn$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0090b implements r.b {
            public C0090b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(pn.this.f26066f, pn.this.f26067g, pn.this.f26065c, pn.this.d, pn.this.f26068h, b.this.f26071b);
            }
        }

        public b(qn qnVar, com.applovin.impl.sdk.j jVar) {
            this.f26070a = qnVar;
            this.f26071b = jVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            String a2;
            String c2;
            if (lbVar.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (lbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    r.a(pn.this, MaxDebuggerCmpNetworksListActivity.class, this.f26071b.e(), new C0090b());
                    return;
                } else {
                    yp.a(dcVar.c(), dcVar.b(), pn.this);
                    return;
                }
            }
            if (lbVar.a() == d.TC_STRING.ordinal()) {
                a2 = uj.f27344s.a();
                c2 = this.f26070a.k();
            } else {
                a2 = uj.f27345t.a();
                c2 = this.f26070a.c();
            }
            r.a(pn.this, MaxDebuggerTcfStringActivity.class, this.f26071b.e(), new a(a2, c2));
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

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f26063a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f26063a = jVar;
        qn k02 = jVar.k0();
        a(k02.i());
        a aVar = new a(this);
        this.f26064b = aVar;
        aVar.a(new b(k02, jVar));
        this.f26064b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f26064b);
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ec ecVar = this.f26064b;
        if (ecVar != null) {
            ecVar.a((ec.a) null);
        }
    }

    private void a(rn rnVar, List list) {
        if (rnVar.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (rnVar.d().equals(((rn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(rnVar);
    }

    private dc b() {
        dc.b a2;
        String a3 = uj.f27341p.a();
        Integer e2 = this.f26063a.k0().e();
        if (StringUtils.isValidString(this.f26063a.k0().d())) {
            a2 = dc.a(dc.c.RIGHT_DETAIL);
        } else {
            dc.b b2 = dc.a(dc.c.DETAIL).b("Unknown CMP SDK ID");
            a2 = b2.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a3 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(t3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a2.d(a3);
        a2.c(e2 != null ? e2.toString() : "No value set");
        a2.c(e2 != null ? -16777216 : Opcodes.V_PREVIEW);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g2 = this.f26063a.k0().g();
        String k2 = this.f26063a.k0().k();
        String c2 = this.f26063a.k0().c();
        arrayList.add(a(uj.f27343r.a(), g2));
        arrayList.add(a(uj.f27344s.a(), k2, !tn.b(k2)));
        arrayList.add(a(uj.f27345t.a(), c2, false));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f26067g.size() + this.f26066f.size();
        arrayList.add(b());
        arrayList.add(a(uj.f27342q.a(), this.f26063a.k0().f()));
        arrayList.add(dc.a(dc.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        arrayList.add(dc.a(dc.c.RIGHT_DETAIL).d("Configured CMP Networks").c(size > 0 ? android.support.v4.media.d.j("Missing ", size, " network(s)") : "").c(size > 0 ? Opcodes.V_PREVIEW : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private dc a(String str, String str2, boolean z2) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        dc.b d2 = dc.a(dc.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        dc.b a2 = d2.c(str2).c(z2 ? Opcodes.V_PREVIEW : -16777216).a(isValidString);
        if (isValidString) {
            a2.a(this);
        }
        return a2.a();
    }

    private dc a(String str, Integer num) {
        return dc.a(dc.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : Opcodes.V_PREVIEW).a();
    }

    private void a(List list) {
        boolean b2 = this.f26063a.k0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rn rnVar = (rn) it.next();
            if (rnVar.f() == rn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.f26065c);
                } else {
                    a(rnVar, this.f26066f);
                }
            } else if (rnVar.f() != rn.a.ATP_NETWORK) {
                this.f26068h.add(rnVar);
            } else if (b2) {
                if (Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.d);
                } else {
                    a(rnVar, this.f26067g);
                }
            } else {
                this.f26068h.add(rnVar);
            }
        }
    }
}
