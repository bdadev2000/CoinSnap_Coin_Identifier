package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sn;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class on extends ne {
    private com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private zb f6834b;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f6835f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f6836g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f6837h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f6835f = arrayList;
            this.f6836g = arrayList2;
            this.f6837h = z10;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f6835f;
            }
            return this.f6836g;
        }

        @Override // com.applovin.impl.zb
        public int d(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f6835f.size();
            }
            return this.f6836g.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i10) {
            String str;
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new bj("TCF VENDORS (TC STRING)");
            }
            if (this.f6837h) {
                str = "ATP NETWORKS (AC STRING)";
            } else {
                str = "APPLOVIN PRIVACY SETTING";
            }
            return new bj(str);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private yb a(String str, String str2) {
        return yb.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a10 = y3.b().a(this);
        boolean b3 = kVar.m0().b();
        if (!b3) {
            arrayList2.add(a("Has User Consent", a10));
        }
        for (sn snVar : kVar.m0().i()) {
            Boolean a11 = snVar.a();
            if (a11 != null) {
                if (snVar.f() == sn.a.TCF_VENDOR) {
                    arrayList.add(a(snVar.b(), String.valueOf(a11)));
                } else if (snVar.f() == sn.a.ATP_NETWORK) {
                    arrayList2.add(a(snVar.b(), String.valueOf(a11)));
                }
            } else if (b3 && snVar.f() == sn.a.ATP_NETWORK) {
                arrayList2.add(a(snVar.b(), a10));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b3);
        this.f6834b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f6834b);
    }
}
