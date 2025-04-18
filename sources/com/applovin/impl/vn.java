package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.dc;
import com.applovin.impl.ec;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vn extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f27587a;

    /* renamed from: b, reason: collision with root package name */
    private List f27588b;

    /* renamed from: c, reason: collision with root package name */
    private ec f27589c;
    private List d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f27590f;

    /* loaded from: classes2.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f27591f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f27591f = list;
        }

        @Override // com.applovin.impl.ec
        public dc a() {
            return new dc.b(dc.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return vn.this.d;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return this.f27591f.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return new fj("TEST MODE NETWORKS");
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ec.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f27593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f27594b;

        public b(List list, com.applovin.impl.sdk.j jVar) {
            this.f27593a = list;
            this.f27594b = jVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            List u2 = ((ke) this.f27593a.get(lbVar.a())).u();
            if (u2.equals(this.f27594b.l0().b())) {
                this.f27594b.l0().a((List) null);
            } else {
                this.f27594b.l0().a(u2);
            }
            vn.this.f27589c.notifyDataSetChanged();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends cg {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ke f27596p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ke keVar, Context context, ke keVar2) {
            super(keVar, context);
            this.f27596p = keVar2;
        }

        @Override // com.applovin.impl.cg, com.applovin.impl.dc
        public int d() {
            if (this.f27596p.u().equals(vn.this.f27587a.l0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.cg, com.applovin.impl.dc
        public int e() {
            if (this.f27596p.u().equals(vn.this.f27587a.l0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.dc
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f27596p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f27587a;
    }

    public void initialize(List<ke> list, com.applovin.impl.sdk.j jVar) {
        this.f27587a = jVar;
        this.f27588b = list;
        this.d = a(list);
        a aVar = new a(this, list);
        this.f27589c = aVar;
        aVar.a(new b(list, jVar));
        this.f27589c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f27590f = listView;
        listView.setAdapter((ListAdapter) this.f27589c);
    }

    @Override // com.applovin.impl.se, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.f27588b);
        this.f27589c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ke keVar = (ke) it.next();
            arrayList.add(new c(keVar, this, keVar));
        }
        return arrayList;
    }
}
