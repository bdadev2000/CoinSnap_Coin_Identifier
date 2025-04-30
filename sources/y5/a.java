package Y5;

import J1.d;
import L4.f;
import M0.C0219j;
import R3.e;
import R5.j;
import U5.c;
import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import b6.C0574a;
import b6.C0575b;
import com.facebook.appevents.n;
import e6.AbstractC2224b;
import q4.C2645d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3816a = new Object();

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, q4.d] */
    public static void a(Context context) {
        boolean z8;
        int i9 = 1;
        d dVar = f3816a;
        Context applicationContext = context.getApplicationContext();
        C0219j.b(applicationContext, "Application Context cannot be null");
        if (!dVar.f1512a) {
            dVar.f1512a = true;
            j c9 = j.c();
            ((f) c9.f2756d).getClass();
            ?? obj = new Object();
            Handler handler = new Handler();
            ((e) c9.f2755c).getClass();
            c9.f2757e = new Q5.a(handler, applicationContext, (C2645d) obj, c9);
            C0575b c0575b = C0575b.f5336g;
            boolean z9 = applicationContext instanceof Application;
            if (z9) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(c0575b);
            }
            n.f13498a = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = AbstractC2224b.f20113a;
            AbstractC2224b.f20114c = applicationContext.getResources().getDisplayMetrics().density;
            AbstractC2224b.f20113a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new c(i9), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            b6.f.b.f5340a = applicationContext.getApplicationContext();
            C0574a c0574a = C0574a.f5331f;
            if (!c0574a.f5333c) {
                R5.e eVar = c0574a.f5334d;
                eVar.getClass();
                if (z9) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(eVar);
                }
                eVar.f2745f = c0574a;
                eVar.f2743c = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100 || eVar.d()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                eVar.f2744d = z8;
                eVar.a(z8);
                c0574a.f5335e = eVar.f2744d;
                c0574a.f5333c = true;
            }
        }
    }
}
