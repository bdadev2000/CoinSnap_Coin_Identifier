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
    private com.applovin.impl.sdk.k a;

    /* renamed from: b */
    private List f8567b;

    /* renamed from: c */
    private List f8568c;

    /* renamed from: d */
    private zb f8569d;

    /* renamed from: f */
    private List f8570f;

    /* renamed from: g */
    private List f8571g;

    /* renamed from: h */
    private ListView f8572h;

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
        public List c(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return vn.this.f8570f;
            }
            return vn.this.f8571g;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return vn.this.f8570f.size();
            }
            return vn.this.f8571g.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return new bj("BIDDERS");
            }
            return new bj("WATERFALL");
        }
    }

    /* loaded from: classes.dex */
    public class b extends xf {

        /* renamed from: p */
        final /* synthetic */ ec f8574p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fe feVar, Context context, ec ecVar) {
            super(feVar, context);
            this.f8574p = ecVar;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (vn.this.a.n0().b() != null && vn.this.a.n0().b().equals(this.f8574p.b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (vn.this.a.n0().b() != null && vn.this.a.n0().b().equals(this.f8574p.b())) {
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
            return StringUtils.createSpannedString(this.f8574p.a(), i10, 18, 1);
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
        return this.a;
    }

    public void initialize(List<ec> list, List<ec> list2, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f8567b = list;
        this.f8568c = list2;
        this.f8570f = a(list);
        this.f8571g = a(list2);
        a aVar = new a(this);
        this.f8569d = aVar;
        aVar.a(new os(11, this, kVar));
        this.f8569d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8572h = listView;
        listView.setAdapter((ListAdapter) this.f8569d);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f8570f = a(this.f8567b);
        this.f8571g = a(this.f8568c);
        this.f8569d.c();
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
            return (ec) this.f8567b.get(hbVar.a());
        }
        return (ec) this.f8568c.get(hbVar.a());
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        List b3 = a(hbVar).b();
        if (b3.equals(kVar.n0().b())) {
            kVar.n0().a((List) null);
        } else {
            kVar.n0().a(b3);
        }
        this.f8569d.notifyDataSetChanged();
    }
}
