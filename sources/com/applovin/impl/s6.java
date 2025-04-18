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
    private u6 a;

    /* renamed from: b */
    private com.applovin.impl.sdk.k f7449b;

    /* renamed from: c */
    private TextView f7450c;

    /* renamed from: d */
    private Button f7451d;

    private void b() {
        lc lcVar = new lc();
        lcVar.a(this.f7449b.v().a(this.a));
        String b3 = this.f7449b.v().b(this.a.a());
        if (b3 != null) {
            lcVar.a("\nBid Response Preview:\n");
            lcVar.a(b3);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f7450c = textView;
        textView.setText(lcVar.toString());
        this.f7450c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.a.c() + " - " + this.a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f7451d = button;
        button.setOnClickListener(new gu(this, 1));
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
            this.f7449b.v().a(this.a, (Context) this, false);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void a(u6 u6Var, com.applovin.impl.sdk.k kVar) {
        this.a = u6Var;
        this.f7449b = kVar;
    }

    private boolean a() {
        return (this.a == null || this.f7449b == null) ? false : true;
    }

    public /* synthetic */ void a(View view) {
        this.f7449b.v().a(this.a, (Context) this, true);
    }
}
