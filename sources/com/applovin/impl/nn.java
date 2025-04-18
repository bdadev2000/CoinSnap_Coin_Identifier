package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.rn;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class nn extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f25746a;

    /* renamed from: b, reason: collision with root package name */
    private ec f25747b;

    /* loaded from: classes.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f25748f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f25749g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f25750h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
            super(context);
            this.f25748f = arrayList;
            this.f25749g = arrayList2;
            this.f25750h = z2;
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            return i2 == b.TC_NETWORKS.ordinal() ? this.f25748f : this.f25749g;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            return i2 == b.TC_NETWORKS.ordinal() ? this.f25748f.size() : this.f25749g.size();
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            if (i2 == b.TC_NETWORKS.ordinal()) {
                return new fj("TCF VENDORS (TC STRING)");
            }
            return new fj(this.f25750h ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private dc a(String str, String str2) {
        return dc.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f25746a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f25746a = jVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = a4.b().a(this);
        boolean b2 = jVar.k0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        for (rn rnVar : jVar.k0().i()) {
            Boolean a3 = rnVar.a();
            if (a3 != null) {
                if (rnVar.f() == rn.a.TCF_VENDOR) {
                    arrayList.add(a(rnVar.b(), String.valueOf(a3)));
                } else if (rnVar.f() == rn.a.ATP_NETWORK) {
                    arrayList2.add(a(rnVar.b(), String.valueOf(a3)));
                }
            } else if (b2 && rnVar.f() == rn.a.ATP_NETWORK) {
                arrayList2.add(a(rnVar.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.f25747b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f25747b);
    }
}
