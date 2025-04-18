package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.ec;
import com.applovin.impl.rn;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class n3 extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f25629a;

    /* renamed from: b, reason: collision with root package name */
    private ec f25630b;

    /* loaded from: classes.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f25631f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f25632g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f25633h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f25634i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List f25635j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f25631f = list;
            this.f25632g = list2;
            this.f25633h = list3;
            this.f25634i = list4;
            this.f25635j = list5;
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            List list;
            boolean z2 = true;
            if (i2 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f25631f;
            } else if (i2 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f25632g;
            } else {
                z2 = false;
                list = i2 == c.LISTED_TC_NETWORKS.ordinal() ? this.f25633h : i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f25634i : this.f25635j;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n3.this.a((rn) it.next(), z2));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return i2 == c.MISSING_TC_NETWORKS.ordinal() ? this.f25631f.size() : i2 == c.MISSING_AC_NETWORKS.ordinal() ? this.f25632g.size() : i2 == c.LISTED_TC_NETWORKS.ordinal() ? this.f25633h.size() : i2 == c.LISTED_AC_NETWORKS.ordinal() ? this.f25634i.size() : this.f25635j.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return i2 == c.MISSING_TC_NETWORKS.ordinal() ? new fj("MISSING TCF VENDORS (TC STRING)") : i2 == c.MISSING_AC_NETWORKS.ordinal() ? new fj("MISSING ATP NETWORKS (AC STRING)") : i2 == c.LISTED_TC_NETWORKS.ordinal() ? new fj("LISTED TCF VENDORS (TC STRING)") : i2 == c.LISTED_AC_NETWORKS.ordinal() ? new fj("LISTED ATP NETWORKS (AC STRING)") : new fj("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* loaded from: classes.dex */
    public class b implements ec.a {
        public b() {
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            yp.a(dcVar.c(), dcVar.b(), n3.this);
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

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f25629a;
    }

    public void initialize(List<rn> list, List<rn> list2, List<rn> list3, List<rn> list4, List<rn> list5, com.applovin.impl.sdk.j jVar) {
        this.f25629a = jVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f25630b = aVar;
        aVar.a(new b());
        this.f25630b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f25630b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dc a(rn rnVar, boolean z2) {
        dc.b a2 = dc.a();
        boolean b2 = this.f25629a.k0().b();
        rn.a f2 = rnVar.f();
        rn.a aVar = rn.a.TCF_VENDOR;
        if (f2 != aVar && (rnVar.f() != rn.a.ATP_NETWORK || !b2)) {
            a2.d(rnVar.b());
        } else {
            String c2 = rnVar.c();
            String str = rnVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            dc.b b3 = a2.d(c2).d(z2 ? Opcodes.V_PREVIEW : -16777216).b(c2);
            StringBuilder q2 = androidx.compose.foundation.text.input.a.q(str);
            q2.append(rnVar.d());
            b3.a(q2.toString()).a(true);
        }
        return a2.a();
    }
}
