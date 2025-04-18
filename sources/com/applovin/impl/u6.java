package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes2.dex */
public abstract class u6 extends Activity {

    /* renamed from: a */
    private w6 f27279a;

    /* renamed from: b */
    private com.applovin.impl.sdk.j f27280b;

    /* renamed from: c */
    private TextView f27281c;
    private Button d;

    private void b() {
        qc qcVar = new qc();
        qcVar.a(this.f27280b.w().a(this.f27279a));
        String b2 = this.f27280b.w().b(this.f27279a.a());
        if (b2 != null) {
            qcVar.a("\nBid Response Preview:\n");
            qcVar.a(b2);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f27281c = textView;
        textView.setText(qcVar.toString());
        this.f27281c.setTextColor(-16777216);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f27279a.c() + " - " + this.f27279a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.d = button;
        button.setOnClickListener(new ou(this, 1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f27280b.w().a(this.f27279a, (Context) this, false);
        return true;
    }

    public void a(w6 w6Var, com.applovin.impl.sdk.j jVar) {
        this.f27279a = w6Var;
        this.f27280b = jVar;
    }

    private boolean a() {
        return (this.f27279a == null || this.f27280b == null) ? false : true;
    }

    public /* synthetic */ void a(View view) {
        this.f27280b.w().a(this.f27279a, (Context) this, true);
    }
}
