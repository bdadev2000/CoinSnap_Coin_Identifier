package s6;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import k.C2426o;
import o7.C2517f;
import q1.C2639a;
import q7.InterfaceC2649b;
import u1.AbstractC2748a;
import v0.AbstractC2831a;

/* loaded from: classes3.dex */
public abstract class h extends Application implements InterfaceC2649b {
    public C2639a b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22985c = false;

    /* renamed from: d, reason: collision with root package name */
    public final C2517f f22986d = new C2517f(new C2426o(this, 6));

    @Override // q7.InterfaceC2649b
    public final Object a() {
        return this.f22986d.a();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        HashSet hashSet = AbstractC2831a.f23452a;
        Log.i("MultiDex", "Installing application");
        try {
            if (AbstractC2831a.b) {
                Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
                return;
            }
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException e4) {
                Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e4);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                AbstractC2831a.b(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e9) {
            Log.e("MultiDex", "MultiDex installation failure", e9);
            throw new RuntimeException("MultiDex installation failed (" + e9.getMessage() + ").");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q1.a, java.lang.Object] */
    public final void b() {
        super.onCreate();
        new ArrayList();
        ?? obj = new Object();
        obj.f22746a = false;
        obj.f22747c = new ArrayList();
        obj.f22749e = "client_token";
        obj.f22751g = 0;
        obj.f22748d = this;
        this.b = obj;
        if (getSharedPreferences("mia_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L) == 0) {
            getSharedPreferences("mia_ad_pref", 0).edit().putLong("KEY_INSTALL_TIME", System.currentTimeMillis()).apply();
        }
        AbstractC2748a.b = getSharedPreferences("mia_ad_pref", 0).getFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", 0.0f);
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f22985c) {
            this.f22985c = true;
            ((InterfaceC2700a) this.f22986d.a()).getClass();
        }
        b();
    }
}
