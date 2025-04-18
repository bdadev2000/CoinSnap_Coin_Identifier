package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class v0 extends f.b {
    @Override // f.b
    public final Intent a(ComponentActivity componentActivity, Object obj) {
        Bundle bundleExtra;
        androidx.activity.result.j jVar = (androidx.activity.result.j) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = jVar.f613c;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                androidx.activity.result.i iVar = new androidx.activity.result.i(jVar.f612b);
                iVar.f611f = null;
                iVar.f609c = jVar.f615f;
                iVar.f608b = jVar.f614d;
                jVar = iVar.b();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jVar);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "CreateIntent created the following intent: " + intent);
        }
        return intent;
    }

    @Override // f.b
    public final Object c(int i10, Intent intent) {
        return new androidx.activity.result.a(i10, intent);
    }
}
