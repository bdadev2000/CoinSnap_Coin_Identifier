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
    private v4 a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f8347b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f8348c;

    /* loaded from: classes.dex */
    public class a implements zb.a {
        final /* synthetic */ q a;

        /* renamed from: com.applovin.impl.u4$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0038a implements r.b {
            final /* synthetic */ hb a;

            public C0038a(hb hbVar) {
                this.a = hbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((u6) u4.this.a.d().get(this.a.a()), u4.this.a.e());
            }
        }

        public a(q qVar) {
            this.a = qVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() != v4.a.RECENT_ADS.ordinal()) {
                return;
            }
            r.a(u4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.a, new C0038a(hbVar));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f8347b = (FrameLayout) findViewById(android.R.id.content);
        this.f8348c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v4 v4Var = this.a;
        if (v4Var != null) {
            v4Var.a((zb.a) null);
            this.a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        v4 v4Var = this.a;
        if (v4Var == null) {
            finish();
            return;
        }
        this.f8348c.setAdapter((ListAdapter) v4Var);
        v4 v4Var2 = this.a;
        if (v4Var2 != null && !v4Var2.e().v().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        v4 v4Var3 = this.a;
        if (v4Var3 != null && v4Var3.f()) {
            a(R.string.applovin_creative_debugger_no_ads_text);
        }
    }

    public void a(v4 v4Var, q qVar) {
        this.a = v4Var;
        v4Var.a(new a(qVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f8347b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f8347b.bringChildToFront(textView);
    }
}
