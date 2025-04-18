package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes2.dex */
public abstract class sn extends se {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.j f26968a;

    /* renamed from: b, reason: collision with root package name */
    private String f26969b;

    /* renamed from: c, reason: collision with root package name */
    private String f26970c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f26970c);
        intent.putExtra("android.intent.extra.TITLE", this.f26969b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f26969b);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f26968a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.j jVar) {
        this.f26968a = jVar;
        this.f26969b = str;
        this.f26970c = str2;
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f26969b);
        ((TextView) findViewById(R.id.textView)).setText(this.f26970c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
