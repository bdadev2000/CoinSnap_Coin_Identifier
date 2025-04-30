package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class tn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f11506a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f11507c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f11507c);
        intent.putExtra("android.intent.extra.TITLE", this.b);
        intent.putExtra("android.intent.extra.SUBJECT", this.b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        return this.f11506a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.f11506a = kVar;
        this.b = str;
        this.f11507c = str2;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.b);
        ((TextView) findViewById(R.id.textView)).setText(this.f11507c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
