package I2;

import G7.j;
import android.content.SharedPreferences;
import com.facebook.appevents.t;
import java.util.HashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1448d;

    public /* synthetic */ g(String str) {
        this.b = 1;
        this.f1447c = "com.facebook.appevents.UserDataStore.internalUserData";
        this.f1448d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f1448d;
        String str2 = this.f1447c;
        switch (this.b) {
            case 0:
                j.e(str2, "$queriedEvent");
                j.e(str, "$buttonText");
                HashSet hashSet = h.f1449g;
                a.j(str2, str, new float[0]);
                return;
            default:
                if (!O2.a.b(t.class)) {
                    try {
                        j.e(str2, "$key");
                        j.e(str, "$value");
                        if (!t.f13518c.get()) {
                            t.f13517a.b();
                        }
                        SharedPreferences sharedPreferences = t.b;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().putString(str2, str).apply();
                            return;
                        } else {
                            j.k("sharedPreferences");
                            throw null;
                        }
                    } catch (Throwable th) {
                        O2.a.a(t.class, th);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ g(String str, String str2) {
        this.b = 0;
        this.f1447c = str;
        this.f1448d = str2;
    }
}
