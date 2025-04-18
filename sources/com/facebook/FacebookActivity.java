package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plantcare.ai.identifier.plantid.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "com/facebook/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends FragmentActivity {

    /* renamed from: b, reason: collision with root package name */
    public Fragment f10879b;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            int i10 = o6.a.a;
            if (Intrinsics.areEqual((Object) null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f10879b;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.fragment.app.r, com.facebook.internal.n, androidx.fragment.app.Fragment] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.facebook.login.x xVar;
        q qVar;
        String string;
        String string2;
        boolean equals;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!x.h()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            x.k(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (Intrinsics.areEqual("PassThrough", intent.getAction())) {
            Intent requestIntent = getIntent();
            com.facebook.internal.g0 g0Var = com.facebook.internal.g0.a;
            Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
            Bundle h10 = com.facebook.internal.g0.h(requestIntent);
            if (!m6.a.b(com.facebook.internal.g0.class) && h10 != null) {
                try {
                    string = h10.getString("error_type");
                    if (string == null) {
                        string = h10.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    string2 = h10.getString("error_description");
                    if (string2 == null) {
                        string2 = h10.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                } catch (Throwable th2) {
                    m6.a.a(com.facebook.internal.g0.class, th2);
                }
                if (string != null) {
                    equals = StringsKt__StringsJVMKt.equals(string, "UserCanceled", true);
                    if (equals) {
                        qVar = new s(string2);
                        com.facebook.internal.g0 g0Var2 = com.facebook.internal.g0.a;
                        Intent intent2 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "intent");
                        setResult(0, com.facebook.internal.g0.e(intent2, null, qVar));
                        finish();
                        return;
                    }
                }
                qVar = new q(string2);
                com.facebook.internal.g0 g0Var22 = com.facebook.internal.g0.a;
                Intent intent22 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent22, "intent");
                setResult(0, com.facebook.internal.g0.e(intent22, null, qVar));
                finish();
                return;
            }
            qVar = null;
            com.facebook.internal.g0 g0Var222 = com.facebook.internal.g0.a;
            Intent intent222 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent222, "intent");
            setResult(0, com.facebook.internal.g0.e(intent222, null, qVar));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
        if (findFragmentByTag == null) {
            if (Intrinsics.areEqual("FacebookDialogFragment", intent3.getAction())) {
                ?? nVar = new com.facebook.internal.n();
                nVar.setRetainInstance(true);
                nVar.show(supportFragmentManager, "SingleFragment");
                xVar = nVar;
            } else {
                com.facebook.login.x xVar2 = new com.facebook.login.x();
                xVar2.setRetainInstance(true);
                supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, xVar2, "SingleFragment").commit();
                xVar = xVar2;
            }
            findFragmentByTag = xVar;
        }
        this.f10879b = findFragmentByTag;
    }
}
