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
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private zb f7256b;

    /* renamed from: c, reason: collision with root package name */
    private final List f7257c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f7258d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f7259f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f7260g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f7261h = new ArrayList();

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
        public List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? qn.this.c() : qn.this.a();
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new bj("IAB TCF Parameters");
            }
            return new bj("CMP CONFIGURATION");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {
        final /* synthetic */ rn a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f7263b;

        /* loaded from: classes.dex */
        public class a implements r.b {
            final /* synthetic */ String a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f7265b;

            public a(String str, String str2) {
                this.a = str;
                this.f7265b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.a, this.f7265b, b.this.f7263b);
            }
        }

        /* renamed from: com.applovin.impl.qn$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0032b implements r.b {
            public C0032b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(qn.this.f7259f, qn.this.f7260g, qn.this.f7257c, qn.this.f7258d, qn.this.f7261h, b.this.f7263b);
            }
        }

        public b(rn rnVar, com.applovin.impl.sdk.k kVar) {
            this.a = rnVar;
            this.f7263b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            String a10;
            String c10;
            if (hbVar.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (hbVar.a() == d.TC_STRING.ordinal()) {
                    a10 = qj.f7238s.a();
                    c10 = this.a.k();
                } else {
                    a10 = qj.f7239t.a();
                    c10 = this.a.c();
                }
                r.a(qn.this, MaxDebuggerTcfStringActivity.class, this.f7263b.e(), new a(a10, c10));
                return;
            }
            if (hbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                r.a(qn.this, MaxDebuggerCmpNetworksListActivity.class, this.f7263b.e(), new C0032b());
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
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        rn m02 = kVar.m0();
        a(m02.i());
        a aVar = new a(this);
        this.f7256b = aVar;
        aVar.a(new b(m02, kVar));
        this.f7256b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7256b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f7256b;
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
        yb.b a10;
        String a11 = qj.f7235p.a();
        Integer e2 = this.a.m0().e();
        if (StringUtils.isValidString(this.a.m0().d())) {
            a10 = yb.a(yb.c.RIGHT_DETAIL);
        } else {
            yb.b b3 = yb.a(yb.c.DETAIL).b("Unknown CMP SDK ID");
            a10 = b3.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a11 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(r3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a10.d(a11);
        a10.c(e2 != null ? e2.toString() : "No value set");
        a10.c(e2 != null ? ViewCompat.MEASURED_STATE_MASK : -65536);
        return a10.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g10 = this.a.m0().g();
        String k10 = this.a.m0().k();
        String c10 = this.a.m0().c();
        arrayList.add(a(qj.f7237r.a(), g10));
        arrayList.add(a(qj.f7238s.a(), k10, !un.b(k10)));
        arrayList.add(a(qj.f7239t.a(), c10, false));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f7260g.size() + this.f7259f.size();
        arrayList.add(b());
        arrayList.add(a(qj.f7236q.a(), this.a.m0().f()));
        arrayList.add(yb.a(yb.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        arrayList.add(yb.a(yb.c.RIGHT_DETAIL).d("Configured CMP Networks").c(size > 0 ? kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Missing ", size, " network(s)") : "").c(size > 0 ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private yb a(String str, String str2, boolean z10) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        yb.b d10 = yb.a(yb.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        yb.b a10 = d10.c(str2).c(z10 ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(isValidString);
        if (isValidString) {
            a10.a(this);
        }
        return a10.a();
    }

    private yb a(String str, Integer num) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : -65536).a();
    }

    private void a(List list) {
        boolean b3 = this.a.m0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            if (snVar.f() == sn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.f7257c);
                } else {
                    a(snVar, this.f7259f);
                }
            } else if (snVar.f() != sn.a.ATP_NETWORK) {
                this.f7261h.add(snVar);
            } else if (b3) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.f7258d);
                } else {
                    a(snVar, this.f7260g);
                }
            } else {
                this.f7261h.add(snVar);
            }
        }
    }
}
