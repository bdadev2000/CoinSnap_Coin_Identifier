package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallKeywordsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0673b0 extends ne {

    /* renamed from: a, reason: collision with root package name */
    private C0781z f6787a;
    private com.applovin.impl.sdk.k b;

    /* renamed from: c, reason: collision with root package name */
    private zb f6788c;

    /* renamed from: com.applovin.impl.b0$a */
    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C0781z f6789f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C0781z c0781z) {
            super(context);
            this.f6789f = c0781z;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return this.f6789f.g().size();
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            ArrayList arrayList = new ArrayList();
            C0668a0 c0668a0 = (C0668a0) this.f6789f.g().get(i9);
            arrayList.add(AbstractActivityC0673b0.this.c(c0668a0.c()));
            if (c0668a0.b() != null) {
                arrayList.add(AbstractActivityC0673b0.this.a("AB Test Experiment Name", c0668a0.b()));
            }
            lr d2 = c0668a0.d();
            AbstractActivityC0673b0 abstractActivityC0673b0 = AbstractActivityC0673b0.this;
            arrayList.add(abstractActivityC0673b0.a("Device ID Targeting", abstractActivityC0673b0.a(d2.a())));
            AbstractActivityC0673b0 abstractActivityC0673b02 = AbstractActivityC0673b0.this;
            arrayList.add(abstractActivityC0673b02.a("Device Type Targeting", abstractActivityC0673b02.b(d2.b())));
            if (d2.c() != null) {
                AbstractActivityC0673b0 abstractActivityC0673b03 = AbstractActivityC0673b0.this;
                arrayList.add(abstractActivityC0673b03.a("Gender", abstractActivityC0673b03.a(d2.c())));
            }
            if (d2.f() != null && d2.e() != null) {
                arrayList.add(AbstractActivityC0673b0.this.a("Age", d2.f() + "-" + d2.e()));
            }
            if (d2.d() != null) {
                arrayList.add(AbstractActivityC0673b0.this.b(d2.d()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            int i10;
            int i11;
            C0668a0 c0668a0 = (C0668a0) this.f6789f.g().get(i9);
            if (c0668a0.b() != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            lr d2 = c0668a0.d();
            if (d2.f() != null && d2.e() != null) {
                i11 = 3;
            } else {
                i11 = 2;
            }
            if (d2.c() != null) {
                i11++;
            }
            if (d2.d() != null) {
                i11++;
            }
            return i10 + 1 + i11;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            if (i9 == b.TARGETED_WATERFALL.ordinal()) {
                return new bj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i9 == b.OTHER_WATERFALLS.ordinal()) {
                return new bj("OTHER WATERFALLS");
            }
            return new bj("");
        }
    }

    /* renamed from: com.applovin.impl.b0$b */
    /* loaded from: classes.dex */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.b;
    }

    public void initialize(C0781z c0781z, com.applovin.impl.sdk.k kVar) {
        this.f6787a = c0781z;
        this.b = kVar;
        a aVar = new a(this, c0781z);
        this.f6788c = aVar;
        aVar.a(new N(this, kVar, c0781z, 0));
        this.f6788c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f6787a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f6788c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f6788c;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb c(String str) {
        return yb.a(yb.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("m")) {
                arrayList.add("Male");
            } else if (str.equals("f")) {
                arrayList.add("Female");
            } else {
                arrayList.add("Unknown");
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb b(List list) {
        return yb.a(yb.c.DETAIL).d("Keywords").a(StringUtils.createSpannedString(list.size() + " keyword group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C0781z c0781z, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c0781z, (C0668a0) c0781z.g().get(hbVar.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C0781z c0781z, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallKeywordsActivity maxDebuggerWaterfallKeywordsActivity) {
        C0668a0 c0668a0 = (C0668a0) c0781z.g().get(hbVar.b());
        maxDebuggerWaterfallKeywordsActivity.initialize(c0668a0.c(), c0668a0.d().d(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final C0781z c0781z, final hb hbVar, yb ybVar) {
        if (hbVar.a() == 0) {
            final int i9 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.M
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (i9) {
                        case 0:
                            AbstractActivityC0673b0.a(c0781z, hbVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            AbstractActivityC0673b0.a(c0781z, hbVar, kVar, (MaxDebuggerWaterfallKeywordsActivity) activity);
                            return;
                    }
                }
            });
        } else if (ybVar.k().toString().equals("Keywords")) {
            final int i10 = 1;
            r.a(this, MaxDebuggerWaterfallKeywordsActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.M
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            AbstractActivityC0673b0.a(c0781z, hbVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            AbstractActivityC0673b0.a(c0781z, hbVar, kVar, (MaxDebuggerWaterfallKeywordsActivity) activity);
                            return;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb a(String str, String str2) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(str2).a();
    }
}
