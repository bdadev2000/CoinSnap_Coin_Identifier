package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/facebook/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10867c = Intrinsics.stringPlus("CustomTabActivity", ".action_customTabRedirect");

    /* renamed from: d, reason: collision with root package name */
    public static final String f10868d = Intrinsics.stringPlus("CustomTabActivity", ".action_destroy");

    /* renamed from: b, reason: collision with root package name */
    public h.c0 f10869b;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f10867c);
            intent2.putExtra(CustomTabMainActivity.f10873h, getIntent().getDataString());
            m1.b.a(this).c(intent2);
            h.c0 c0Var = new h.c0(this, 4);
            m1.b.a(this).b(c0Var, new IntentFilter(f10868d));
            this.f10869b = c0Var;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f10867c);
        intent.putExtra(CustomTabMainActivity.f10873h, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        h.c0 c0Var = this.f10869b;
        if (c0Var != null) {
            m1.b.a(this).d(c0Var);
        }
        super.onDestroy();
    }
}
