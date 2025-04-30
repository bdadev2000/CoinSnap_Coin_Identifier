package U4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.applovin.impl.bc;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tools.arruler.ui.component.arruler.ArRulerActivity;
import u6.AbstractC2785a;

/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3330c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3331d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3332f;

    public /* synthetic */ v(int i9, Object obj, Object obj2, boolean z8) {
        this.b = i9;
        this.f3330c = z8;
        this.f3331d = obj;
        this.f3332f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        int i9 = 1;
        boolean z9 = this.f3330c;
        Object obj = this.f3332f;
        Object obj2 = this.f3331d;
        switch (this.b) {
            case 0:
                Context context = (Context) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = y8.a.l(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z9) {
                            u.i(notificationManager);
                        } else if ("com.google.android.gms".equals(u.f(notificationManager))) {
                            u.y(notificationManager);
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    taskCompletionSource.trySetResult(null);
                    return;
                } catch (Throwable th) {
                    taskCompletionSource.trySetResult(null);
                    throw th;
                }
            case 1:
                bc.Q(z9, (MaxAdRequestListener) obj2, (String) obj);
                return;
            case 2:
                bc.k(z9, (MaxAdRevenueListener) obj2, (MaxAd) obj);
                return;
            default:
                int i10 = ArRulerActivity.f19637r;
                ArRulerActivity arRulerActivity = (ArRulerActivity) obj2;
                G7.j.e(arRulerActivity, "this$0");
                String str = (String) obj;
                G7.j.e(str, "$msg");
                int i11 = 8;
                if (z9) {
                    if (arRulerActivity.f19642j) {
                        Group group = ((AbstractC2785a) arRulerActivity.k()).f23253t;
                        G7.j.d(group, "groupRulerPrompt");
                        group.setVisibility(0);
                        LottieAnimationView lottieAnimationView = ((AbstractC2785a) arRulerActivity.k()).f23245C;
                        G7.j.d(lottieAnimationView, "lottieViewLoadPlane");
                        lottieAnimationView.setVisibility(8);
                    } else {
                        Group group2 = ((AbstractC2785a) arRulerActivity.k()).f23253t;
                        G7.j.d(group2, "groupRulerPrompt");
                        group2.setVisibility(8);
                        LottieAnimationView lottieAnimationView2 = ((AbstractC2785a) arRulerActivity.k()).f23245C;
                        G7.j.d(lottieAnimationView2, "lottieViewLoadPlane");
                        lottieAnimationView2.setVisibility(0);
                        j6.m mVar = arRulerActivity.l;
                        if (mVar != null) {
                            mVar.f();
                        }
                        j6.m mVar2 = arRulerActivity.m;
                        if (mVar2 != null && mVar2.f21175h) {
                            mVar2.f();
                        }
                        arRulerActivity.f19647q = false;
                    }
                    j6.m mVar3 = arRulerActivity.f19643k;
                    if (mVar3 != null) {
                        mVar3.f();
                    }
                } else {
                    if (arRulerActivity.f19642j) {
                        arRulerActivity.f19642j = false;
                    }
                    Group group3 = ((AbstractC2785a) arRulerActivity.k()).f23253t;
                    G7.j.d(group3, "groupRulerPrompt");
                    group3.setVisibility(8);
                    LottieAnimationView lottieAnimationView3 = ((AbstractC2785a) arRulerActivity.k()).f23245C;
                    G7.j.d(lottieAnimationView3, "lottieViewLoadPlane");
                    lottieAnimationView3.setVisibility(8);
                    j6.m mVar4 = arRulerActivity.f19643k;
                    if (mVar4 != null) {
                        z8 = mVar4.f21175h;
                    } else {
                        z8 = false;
                    }
                    if (arRulerActivity.f19646p && !z8 && arRulerActivity.f19647q) {
                        new Handler(Looper.getMainLooper()).postDelayed(new z6.d(arRulerActivity, i9), 200L);
                    }
                }
                Group group4 = ((AbstractC2785a) arRulerActivity.k()).f23252s;
                G7.j.d(group4, "groupFeature");
                if (true ^ z9) {
                    i11 = 0;
                }
                group4.setVisibility(i11);
                ((AbstractC2785a) arRulerActivity.k()).f23248F.setText(str);
                return;
        }
    }

    public /* synthetic */ v(Context context, boolean z8, TaskCompletionSource taskCompletionSource) {
        this.b = 0;
        this.f3331d = context;
        this.f3330c = z8;
        this.f3332f = taskCompletionSource;
    }
}
