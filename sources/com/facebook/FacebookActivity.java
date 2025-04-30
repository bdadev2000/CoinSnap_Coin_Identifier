package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.internal.C1841j;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FacebookActivity extends FragmentActivity {
    public Fragment b;

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            G7.j.e(str, "prefix");
            G7.j.e(printWriter, "writer");
            if (G7.j.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(str, fileDescriptor, printWriter, strArr);
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    @Override // f.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        G7.j.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.b;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.facebook.internal.j, androidx.fragment.app.Fragment, androidx.fragment.app.w] */
    @Override // androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.facebook.login.w wVar;
        C1849l c1849l;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!r.f13812o.get()) {
            Context applicationContext = getApplicationContext();
            G7.j.d(applicationContext, "applicationContext");
            r.j(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            Intent intent2 = getIntent();
            com.facebook.internal.B b = com.facebook.internal.B.f13569a;
            G7.j.d(intent2, "requestIntent");
            Bundle h6 = com.facebook.internal.B.h(intent2);
            if (!O2.a.b(com.facebook.internal.B.class) && h6 != null) {
                try {
                    String string = h6.getString("error_type");
                    if (string == null) {
                        string = h6.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = h6.getString("error_description");
                    if (string2 == null) {
                        string2 = h6.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    if (string != null && string.equalsIgnoreCase("UserCanceled")) {
                        c1849l = new C1849l(string2);
                    } else {
                        c1849l = new C1849l(string2);
                    }
                } catch (Throwable th) {
                    O2.a.a(com.facebook.internal.B.class, th);
                }
                com.facebook.internal.B b8 = com.facebook.internal.B.f13569a;
                Intent intent3 = getIntent();
                G7.j.d(intent3, "intent");
                setResult(0, com.facebook.internal.B.e(intent3, null, c1849l));
                finish();
                return;
            }
            c1849l = null;
            com.facebook.internal.B b82 = com.facebook.internal.B.f13569a;
            Intent intent32 = getIntent();
            G7.j.d(intent32, "intent");
            setResult(0, com.facebook.internal.B.e(intent32, null, c1849l));
            finish();
            return;
        }
        Intent intent4 = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        G7.j.d(supportFragmentManager, "supportFragmentManager");
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("SingleFragment");
        if (findFragmentByTag == null) {
            if ("FacebookDialogFragment".equals(intent4.getAction())) {
                ?? c1841j = new C1841j();
                c1841j.setRetainInstance(true);
                c1841j.show(supportFragmentManager, "SingleFragment");
                wVar = c1841j;
            } else {
                com.facebook.login.w wVar2 = new com.facebook.login.w();
                wVar2.setRetainInstance(true);
                supportFragmentManager.beginTransaction().add(R.id.com_facebook_fragment_container, wVar2, "SingleFragment").commit();
                wVar = wVar2;
            }
            findFragmentByTag = wVar;
        }
        this.b = findFragmentByTag;
    }
}
