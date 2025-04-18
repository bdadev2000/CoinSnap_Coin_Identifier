package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.dc;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class un extends se {

    /* renamed from: a */
    private com.applovin.impl.sdk.j f27374a;

    /* renamed from: b */
    private List f27375b;

    /* renamed from: c */
    private List f27376c;
    private ec d;

    /* renamed from: f */
    private List f27377f;

    /* renamed from: g */
    private List f27378g;

    /* renamed from: h */
    private ListView f27379h;

    /* loaded from: classes.dex */
    public class a extends ec {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.ec
        public dc a() {
            return new dc.b(dc.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return i2 == c.BIDDERS.ordinal() ? un.this.f27377f : un.this.f27378g;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return i2 == c.BIDDERS.ordinal() ? un.this.f27377f.size() : un.this.f27378g.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return i2 == c.BIDDERS.ordinal() ? new fj("BIDDERS") : new fj("WATERFALL");
        }
    }

    /* loaded from: classes.dex */
    public class b extends cg {

        /* renamed from: p */
        final /* synthetic */ jc f27381p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ke keVar, Context context, jc jcVar) {
            super(keVar, context);
            this.f27381p = jcVar;
        }

        @Override // com.applovin.impl.cg, com.applovin.impl.dc
        public int d() {
            if (un.this.f27374a.l0().b() == null || !un.this.f27374a.l0().b().equals(this.f27381p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.cg, com.applovin.impl.dc
        public int e() {
            if (un.this.f27374a.l0().b() == null || !un.this.f27374a.l0().b().equals(this.f27381p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.dc
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f27381p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public un() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ void a(un unVar, com.applovin.impl.sdk.j jVar, lb lbVar, dc dcVar) {
        unVar.a(jVar, lbVar, dcVar);
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f27374a;
    }

    public void initialize(List<jc> list, List<jc> list2, com.applovin.impl.sdk.j jVar) {
        this.f27374a = jVar;
        this.f27375b = list;
        this.f27376c = list2;
        this.f27377f = a(list);
        this.f27378g = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new zs(10, this, jVar));
        this.d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f27379h = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.se, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f27377f = a(this.f27375b);
        this.f27378g = a(this.f27376c);
        this.d.c();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc jcVar = (jc) it.next();
            arrayList.add(new b(jcVar.d(), this, jcVar));
        }
        return arrayList;
    }

    private jc a(lb lbVar) {
        if (lbVar.b() == c.BIDDERS.ordinal()) {
            return (jc) this.f27375b.get(lbVar.a());
        }
        return (jc) this.f27376c.get(lbVar.a());
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.j jVar, lb lbVar, dc dcVar) {
        List b2 = a(lbVar).b();
        if (b2.equals(jVar.l0().b())) {
            jVar.l0().a((List) null);
        } else {
            jVar.l0().a(b2);
        }
        this.d.notifyDataSetChanged();
    }
}
