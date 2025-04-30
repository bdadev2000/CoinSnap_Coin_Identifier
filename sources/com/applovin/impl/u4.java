package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.r;
import com.applovin.impl.v4;
import com.applovin.impl.zb;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class u4 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private v4 f11560a;
    private FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f11561c;

    /* loaded from: classes.dex */
    public class a implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0738q f11562a;

        /* renamed from: com.applovin.impl.u4$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0038a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ hb f11563a;

            public C0038a(hb hbVar) {
                this.f11563a = hbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((u6) u4.this.f11560a.d().get(this.f11563a.a()), u4.this.f11560a.e());
            }
        }

        public a(C0738q c0738q) {
            this.f11562a = c0738q;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() != v4.a.RECENT_ADS.ordinal()) {
                return;
            }
            r.a(u4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f11562a, new C0038a(hbVar));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(android.R.id.content);
        this.f11561c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v4 v4Var = this.f11560a;
        if (v4Var != null) {
            v4Var.a((zb.a) null);
            this.f11560a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        v4 v4Var = this.f11560a;
        if (v4Var == null) {
            finish();
            return;
        }
        this.f11561c.setAdapter((ListAdapter) v4Var);
        v4 v4Var2 = this.f11560a;
        if (v4Var2 != null && !v4Var2.e().v().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        v4 v4Var3 = this.f11560a;
        if (v4Var3 != null && v4Var3.f()) {
            a(R.string.applovin_creative_debugger_no_ads_text);
        }
    }

    public void a(v4 v4Var, C0738q c0738q) {
        this.f11560a = v4Var;
        v4Var.a(new a(c0738q));
    }

    private void a(int i9) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i9);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
