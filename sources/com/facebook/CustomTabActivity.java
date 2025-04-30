package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.internal.C1835d;
import u0.C2747b;

/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13390c = G7.j.j(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: d, reason: collision with root package name */
    public static final String f13391d = G7.j.j(".action_destroy", "CustomTabActivity");
    public C1835d b;

    @Override // android.app.Activity
    public final void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i10 == 0) {
            Intent intent2 = new Intent(f13390c);
            intent2.putExtra(CustomTabMainActivity.f13395h, getIntent().getDataString());
            C2747b.a(this).c(intent2);
            C1835d c1835d = new C1835d(this, 4);
            C2747b.a(this).b(c1835d, new IntentFilter(f13391d));
            this.b = c1835d;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f13390c);
        intent.putExtra(CustomTabMainActivity.f13395h, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C1835d c1835d = this.b;
        if (c1835d != null) {
            C2747b.a(this).d(c1835d);
        }
        super.onDestroy();
    }
}
