package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f12027a;
    private List b;

    /* renamed from: c, reason: collision with root package name */
    private zb f12028c;

    /* renamed from: d, reason: collision with root package name */
    private List f12029d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f12030f;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f12031f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f12031f = list;
        }

        @Override // com.applovin.impl.zb
        public yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            return wn.this.f12029d;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            return this.f12031f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            return new bj("TEST MODE NETWORKS");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f12033a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.f12033a = list;
            this.b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            List singletonList = Collections.singletonList(((fe) this.f12033a.get(hbVar.a())).m());
            if (singletonList.equals(this.b.n0().b())) {
                this.b.n0().a((List) null);
            } else {
                this.b.n0().a(singletonList);
            }
            wn.this.f12028c.notifyDataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    public class c extends xf {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ fe f12035p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fe feVar, Context context, fe feVar2) {
            super(feVar, context);
            this.f12035p = feVar2;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (Collections.singletonList(this.f12035p.m()).equals(wn.this.f12027a.n0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (Collections.singletonList(this.f12035p.m()).equals(wn.this.f12027a.n0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.yb
        public SpannedString k() {
            int i9;
            if (o()) {
                i9 = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i9 = -7829368;
            }
            return StringUtils.createSpannedString(this.f12035p.g(), i9, 18, 1);
        }
    }

    public wn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f12027a;
    }

    public void initialize(List<fe> list, com.applovin.impl.sdk.k kVar) {
        this.f12027a = kVar;
        this.b = list;
        this.f12029d = a(list);
        a aVar = new a(this, list);
        this.f12028c = aVar;
        aVar.a(new b(list, kVar));
        this.f12028c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f12030f = listView;
        listView.setAdapter((ListAdapter) this.f12028c);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f12029d = a(this.b);
        this.f12028c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            arrayList.add(new c(feVar, this, feVar));
        }
        return arrayList;
    }
}
