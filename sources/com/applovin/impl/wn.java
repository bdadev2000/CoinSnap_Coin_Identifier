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
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private List f8817b;

    /* renamed from: c, reason: collision with root package name */
    private zb f8818c;

    /* renamed from: d, reason: collision with root package name */
    private List f8819d;

    /* renamed from: f, reason: collision with root package name */
    private ListView f8820f;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f8821f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f8821f = list;
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
        public List c(int i10) {
            return wn.this.f8819d;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            return this.f8821f.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            return new bj("TEST MODE NETWORKS");
        }
    }

    /* loaded from: classes.dex */
    public class b implements zb.a {
        final /* synthetic */ List a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f8823b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.a = list;
            this.f8823b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            List singletonList = Collections.singletonList(((fe) this.a.get(hbVar.a())).m());
            if (singletonList.equals(this.f8823b.n0().b())) {
                this.f8823b.n0().a((List) null);
            } else {
                this.f8823b.n0().a(singletonList);
            }
            wn.this.f8818c.notifyDataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    public class c extends xf {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ fe f8825p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fe feVar, Context context, fe feVar2) {
            super(feVar, context);
            this.f8825p = feVar2;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (Collections.singletonList(this.f8825p.m()).equals(wn.this.a.n0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (Collections.singletonList(this.f8825p.m()).equals(wn.this.a.n0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.yb
        public SpannedString k() {
            int i10;
            if (o()) {
                i10 = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i10 = -7829368;
            }
            return StringUtils.createSpannedString(this.f8825p.g(), i10, 18, 1);
        }
    }

    public wn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List<fe> list, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f8817b = list;
        this.f8819d = a(list);
        a aVar = new a(this, list);
        this.f8818c = aVar;
        aVar.a(new b(list, kVar));
        this.f8818c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8820f = listView;
        listView.setAdapter((ListAdapter) this.f8818c);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f8819d = a(this.f8817b);
        this.f8818c.notifyDataSetChanged();
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
