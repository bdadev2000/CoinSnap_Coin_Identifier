package f3;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import h3.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class a extends Application {

    /* renamed from: b, reason: collision with root package name */
    public b f17667b;

    @Override // android.content.ContextWrapper
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        HashSet hashSet = n1.b.a;
        Log.i("MultiDex", "Installing application");
        try {
            if (n1.b.f22377b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e2) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                n1.b.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e10) {
            Log.e("MultiDex", "MultiDex installation failure", e10);
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        new ArrayList();
        this.f17667b = new b(this);
        if (getSharedPreferences("itg_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L) == 0) {
            getSharedPreferences("itg_ad_pref", 0).edit().putLong("KEY_INSTALL_TIME", System.currentTimeMillis()).apply();
        }
        l3.a.f21122b = getSharedPreferences("itg_ad_pref", 0).getFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", 0.0f);
    }
}
