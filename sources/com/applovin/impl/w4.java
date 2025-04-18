package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.ec;
import com.applovin.impl.r;
import com.applovin.impl.x4;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public abstract class w4 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private x4 f27688a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f27689b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f27690c;

    /* loaded from: classes2.dex */
    public class a implements ec.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f27691a;

        /* renamed from: com.applovin.impl.w4$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0101a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ lb f27693a;

            public C0101a(lb lbVar) {
                this.f27693a = lbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((w6) w4.this.f27688a.d().get(this.f27693a.a()), w4.this.f27688a.e());
            }
        }

        public a(q qVar) {
            this.f27691a = qVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            if (lbVar.b() != x4.a.RECENT_ADS.ordinal()) {
                return;
            }
            r.a(w4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f27691a, new C0101a(lbVar));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f27689b = (FrameLayout) findViewById(android.R.id.content);
        this.f27690c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x4 x4Var = this.f27688a;
        if (x4Var != null) {
            x4Var.a((ec.a) null);
            this.f27688a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        x4 x4Var = this.f27688a;
        if (x4Var == null) {
            finish();
            return;
        }
        this.f27690c.setAdapter((ListAdapter) x4Var);
        x4 x4Var2 = this.f27688a;
        if (x4Var2 != null && !x4Var2.e().w().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        x4 x4Var3 = this.f27688a;
        if (x4Var3 == null || !x4Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(x4 x4Var, q qVar) {
        this.f27688a = x4Var;
        x4Var.a(new a(qVar));
    }

    private void a(int i2) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i2);
        this.f27689b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f27689b.bringChildToFront(textView);
    }
}
