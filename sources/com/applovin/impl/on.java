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

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9924a;
    private zb b;

    /* loaded from: classes.dex */
    public class a extends zb {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9925f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9926g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9927h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z8) {
            super(context);
            this.f9925f = arrayList;
            this.f9926g = arrayList2;
            this.f9927h = z8;
        }

        @Override // com.applovin.impl.zb
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.zb
        public List c(int i9) {
            if (i9 == b.TC_NETWORKS.ordinal()) {
                return this.f9925f;
            }
            return this.f9926g;
        }

        @Override // com.applovin.impl.zb
        public int d(int i9) {
            if (i9 == b.TC_NETWORKS.ordinal()) {
                return this.f9925f.size();
            }
            return this.f9926g.size();
        }

        @Override // com.applovin.impl.zb
        public yb e(int i9) {
            String str;
            if (i9 == b.TC_NETWORKS.ordinal()) {
                return new bj("TCF VENDORS (TC STRING)");
            }
            if (this.f9927h) {
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
        return this.f9924a;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f9924a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a6 = y3.b().a(this);
        boolean b8 = kVar.m0().b();
        if (!b8) {
            arrayList2.add(a("Has User Consent", a6));
        }
        for (sn snVar : kVar.m0().i()) {
            Boolean a9 = snVar.a();
            if (a9 != null) {
                if (snVar.f() == sn.a.TCF_VENDOR) {
                    arrayList.add(a(snVar.b(), String.valueOf(a9)));
                } else if (snVar.f() == sn.a.ATP_NETWORK) {
                    arrayList2.add(a(snVar.b(), String.valueOf(a9)));
                }
            } else if (b8 && snVar.f() == sn.a.ATP_NETWORK) {
                arrayList2.add(a(snVar.b(), a6));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b8);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}
