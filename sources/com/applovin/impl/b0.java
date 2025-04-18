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

/* loaded from: classes.dex */
public abstract class b0 extends ne {
    private z a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f3803b;

    /* renamed from: c, reason: collision with root package name */
    private zb f3804c;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z f3805f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, z zVar) {
            super(context);
            this.f3805f = zVar;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return this.f3805f.g().size();
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            ArrayList arrayList = new ArrayList();
            a0 a0Var = (a0) this.f3805f.g().get(i10);
            arrayList.add(b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            lr d10 = a0Var.d();
            b0 b0Var = b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(d10.a())));
            b0 b0Var2 = b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(d10.b())));
            if (d10.c() != null) {
                b0 b0Var3 = b0.this;
                arrayList.add(b0Var3.a("Gender", b0Var3.a(d10.c())));
            }
            if (d10.f() != null && d10.e() != null) {
                arrayList.add(b0.this.a("Age", d10.f() + "-" + d10.e()));
            }
            if (d10.d() != null) {
                arrayList.add(b0.this.b(d10.d()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            int i11;
            int i12;
            a0 a0Var = (a0) this.f3805f.g().get(i10);
            if (a0Var.b() != null) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            lr d10 = a0Var.d();
            if (d10.f() != null && d10.e() != null) {
                i12 = 3;
            } else {
                i12 = 2;
            }
            if (d10.c() != null) {
                i12++;
            }
            if (d10.d() != null) {
                i12++;
            }
            return i11 + 1 + i12;
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            if (i10 == b.TARGETED_WATERFALL.ordinal()) {
                return new bj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i10 == b.OTHER_WATERFALLS.ordinal()) {
                return new bj("OTHER WATERFALLS");
            }
            return new bj("");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f3803b;
    }

    public void initialize(z zVar, com.applovin.impl.sdk.k kVar) {
        this.a = zVar;
        this.f3803b = kVar;
        a aVar = new a(this, zVar);
        this.f3804c = aVar;
        aVar.a(new us(0, this, kVar, zVar));
        this.f3804c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f3804c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        zb zbVar = this.f3804c;
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
        return str.equals("idfa") ? "IDFA Only" : str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
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
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb b(List list) {
        return yb.a(yb.c.DETAIL).d("Keywords").a(StringUtils.createSpannedString(list.size() + " keyword group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, (a0) zVar.g().get(hbVar.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallKeywordsActivity maxDebuggerWaterfallKeywordsActivity) {
        a0 a0Var = (a0) zVar.g().get(hbVar.b());
        maxDebuggerWaterfallKeywordsActivity.initialize(a0Var.c(), a0Var.d().d(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final z zVar, final hb hbVar, yb ybVar) {
        if (hbVar.a() == 0) {
            final int i10 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.vs
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i11 = i10;
                    hb hbVar2 = hbVar;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i11) {
                        case 0:
                            b0.a(zVar2, hbVar2, kVar2, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar2, hbVar2, kVar2, (MaxDebuggerWaterfallKeywordsActivity) activity);
                            return;
                    }
                }
            });
        } else if (ybVar.k().toString().equals("Keywords")) {
            final int i11 = 1;
            r.a(this, MaxDebuggerWaterfallKeywordsActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.vs
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i112 = i11;
                    hb hbVar2 = hbVar;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i112) {
                        case 0:
                            b0.a(zVar2, hbVar2, kVar2, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar2, hbVar2, kVar2, (MaxDebuggerWaterfallKeywordsActivity) activity);
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
