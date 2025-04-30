package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class s6 extends Activity {

    /* renamed from: a */
    private u6 f10573a;
    private com.applovin.impl.sdk.k b;

    /* renamed from: c */
    private TextView f10574c;

    /* renamed from: d */
    private Button f10575d;

    private void b() {
        lc lcVar = new lc();
        lcVar.a(this.b.v().a(this.f10573a));
        String b = this.b.v().b(this.f10573a.a());
        if (b != null) {
            lcVar.a("\nBid Response Preview:\n");
            lcVar.a(b);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f10574c = textView;
        textView.setText(lcVar.toString());
        this.f10574c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f10573a.c() + " - " + this.f10573a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f10575d = button;
        button.setOnClickListener(new W0(this, 1));
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
        if (R.id.action_share == menuItem.getItemId()) {
            this.b.v().a(this.f10573a, (Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void a(u6 u6Var, com.applovin.impl.sdk.k kVar) {
        this.f10573a = u6Var;
        this.b = kVar;
    }

    private boolean a() {
        return (this.f10573a == null || this.b == null) ? false : true;
    }

    public /* synthetic */ void a(View view) {
        this.b.v().a(this.f10573a, (Context) this, true);
    }
}
