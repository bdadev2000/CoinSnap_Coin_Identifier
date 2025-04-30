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
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class vn extends ne {

    /* renamed from: a */
    private com.applovin.impl.sdk.k f11785a;
    private List b;

    /* renamed from: c */
    private List f11786c;

    /* renamed from: d */
    private zb f11787d;

    /* renamed from: f */
    private List f11788f;

    /* renamed from: g */
    private List f11789g;

    /* renamed from: h */
    private ListView f11790h;

    /* loaded from: classes.dex */
    public class a extends zb {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        public yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            if (i9 != c.BIDDERS.ordinal()) {
                return vn.this.f11789g;
            }
            return vn.this.f11788f;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            if (i9 == c.BIDDERS.ordinal()) {
                return vn.this.f11788f.size();
            }
            return vn.this.f11789g.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            if (i9 == c.BIDDERS.ordinal()) {
                return new bj("BIDDERS");
            }
            return new bj("WATERFALL");
        }
    }

    /* loaded from: classes.dex */
    public class b extends xf {

        /* renamed from: p */
        final /* synthetic */ ec f11792p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, Context context, ec ecVar) {
            super(feVar, context);
            this.f11792p = ecVar;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (vn.this.f11785a.n0().b() != null && vn.this.f11785a.n0().b().equals(this.f11792p.b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (vn.this.f11785a.n0().b() != null && vn.this.f11785a.n0().b().equals(this.f11792p.b())) {
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
            return StringUtils.createSpannedString(this.f11792p.a(), i9, 18, 1);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ void a(vn vnVar, com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        vnVar.a(kVar, hbVar, ybVar);
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11785a;
    }

    public void initialize(List<ec> list, List<ec> list2, com.applovin.impl.sdk.k kVar) {
        this.f11785a = kVar;
        this.b = list;
        this.f11786c = list2;
        this.f11788f = a(list);
        this.f11789g = a(list2);
        a aVar = new a(this);
        this.f11787d = aVar;
        aVar.a(new B(11, this, kVar));
        this.f11787d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f11790h = listView;
        listView.setAdapter((ListAdapter) this.f11787d);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f11788f = a(this.b);
        this.f11789g = a(this.f11786c);
        this.f11787d.c();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ec ecVar = (ec) it.next();
            arrayList.add(new b(ecVar.d(), this, ecVar));
        }
        return arrayList;
    }

    private ec a(hb hbVar) {
        if (hbVar.b() == c.BIDDERS.ordinal()) {
            return (ec) this.b.get(hbVar.a());
        }
        return (ec) this.f11786c.get(hbVar.a());
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        List b8 = a(hbVar).b();
        if (b8.equals(kVar.n0().b())) {
            kVar.n0().a((List) null);
        } else {
            kVar.n0().a(b8);
        }
        this.f11787d.notifyDataSetChanged();
    }
}
