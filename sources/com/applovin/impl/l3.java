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
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class l3 extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8775a;
    private zb b;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f8776f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f8777g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f8778h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f8779i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f8780j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f8776f = list;
            this.f8777g = list2;
            this.f8778h = list3;
            this.f8779i = list4;
            this.f8780j = list5;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            List list;
            boolean z8 = true;
            if (i9 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f8776f;
            } else if (i9 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f8777g;
            } else {
                z8 = false;
                if (i9 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f8778h;
                } else if (i9 == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.f8779i;
                } else {
                    list = this.f8780j;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l3.this.a((sn) it.next(), z8));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            if (i9 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f8776f.size();
            }
            if (i9 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f8777g.size();
            }
            if (i9 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f8778h.size();
            }
            if (i9 == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.f8779i.size();
            }
            return this.f8780j.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            if (i9 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new bj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i9 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new bj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i9 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new bj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i9 == c.LISTED_AC_NETWORKS.ordinal()) {
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
        return this.f8775a;
    }

    public void initialize(List<sn> list, List<sn> list2, List<sn> list3, List<sn> list4, List<sn> list5, com.applovin.impl.sdk.k kVar) {
        this.f8775a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new b());
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb a(sn snVar, boolean z8) {
        yb.b a6 = yb.a();
        boolean b8 = this.f8775a.m0().b();
        sn.a f9 = snVar.f();
        sn.a aVar = sn.a.TCF_VENDOR;
        if (f9 != aVar && (snVar.f() != sn.a.ATP_NETWORK || !b8)) {
            a6.d(snVar.b());
        } else {
            String c9 = snVar.c();
            String str = snVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            yb.b b9 = a6.d(c9).d(z8 ? -65536 : ViewCompat.MEASURED_STATE_MASK).b(c9);
            StringBuilder b10 = AbstractC2965e.b(str);
            b10.append(snVar.d());
            b9.a(b10.toString()).a(true);
        }
        return a6.a();
    }
}
