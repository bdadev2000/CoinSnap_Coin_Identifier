package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l3 extends ne {
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private zb f5810b;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f5811f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f5812g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f5813h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f5814i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f5815j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f5811f = list;
            this.f5812g = list2;
            this.f5813h = list3;
            this.f5814i = list4;
            this.f5815j = list5;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f5811f;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f5812g;
            } else {
                z10 = false;
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f5813h;
                } else if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.f5814i;
                } else {
                    list = this.f5815j;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l3.this.a((sn) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f5811f.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f5812g.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f5813h.size();
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.f5814i.size();
            }
            return this.f5815j.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new bj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new bj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new bj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return new bj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new bj("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {
        public b() {
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            zp.a(ybVar.c(), ybVar.b(), l3.this);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List<sn> list, List<sn> list2, List<sn> list3, List<sn> list4, List<sn> list5, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f5810b = aVar;
        aVar.a(new b());
        this.f5810b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f5810b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb a(sn snVar, boolean z10) {
        yb.b a10 = yb.a();
        boolean b3 = this.a.m0().b();
        sn.a f10 = snVar.f();
        sn.a aVar = sn.a.TCF_VENDOR;
        if (f10 != aVar && (snVar.f() != sn.a.ATP_NETWORK || !b3)) {
            a10.d(snVar.b());
        } else {
            String c10 = snVar.c();
            String str = snVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            yb.b b10 = a10.d(c10).d(z10 ? -65536 : ViewCompat.MEASURED_STATE_MASK).b(c10);
            StringBuilder m10 = eb.j.m(str);
            m10.append(snVar.d());
            b10.a(m10.toString()).a(true);
        }
        return a10.a();
    }
}
