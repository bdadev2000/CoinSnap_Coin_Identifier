package jb;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.setting.SettingActivity;
import com.vungle.ads.a1;
import com.vungle.ads.internal.y0;
import com.vungle.ads.n1;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.ads.r0;
import com.vungle.ads.s0;
import com.vungle.ads.t1;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19896c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19897d;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f19895b = i10;
        this.f19896c = obj;
        this.f19897d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19895b;
        Object obj = this.f19897d;
        Object obj2 = this.f19896c;
        switch (i10) {
            case 0:
                ((m) obj2).c(Boolean.FALSE, (String) obj);
                return;
            case 1:
                ob.c cVar = (ob.c) obj2;
                ((lb.g) cVar.f23292b).h((String) cVar.a, (List) obj);
                return;
            case 2:
                pb.c cVar2 = (pb.c) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                cVar2.getClass();
                try {
                    i7.p pVar = cVar2.f23575h;
                    f7.d dVar = f7.d.HIGHEST;
                    if (pVar instanceof i7.p) {
                        i7.r.a().f19196d.a(pVar.a.c(dVar), 1);
                    } else {
                        String C = com.bumptech.glide.c.C("ForcedSender");
                        if (Log.isLoggable(C, 5)) {
                            Log.w(C, String.format("Expected instance of `TransportImpl`, got `%s`.", pVar));
                        }
                    }
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 3:
                ((ic.j) obj2).a((Intent) obj);
                return;
            case 4:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                y7.q qVar = FirebaseMessaging.f12072k;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 5:
                ic.n nVar = (ic.n) obj2;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj;
                nVar.getClass();
                try {
                    taskCompletionSource2.setResult(nVar.d());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 6:
                Context context = (Context) obj2;
                Intent shareIntent = (Intent) obj;
                int i11 = SettingActivity.f16736h;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(shareIntent, "$shareIntent");
                context.startActivity(Intent.createChooser(shareIntent, context.getString(R.string.share_to)));
                return;
            case 7:
                o0.a((o0) obj2, (n3) obj);
                return;
            case 8:
                r0.f((s0) obj2, (n3) obj);
                return;
            case 9:
                n1.b((t1) obj2, (n3) obj);
                return;
            case 10:
                y0.d((a1) obj2, (n3) obj);
                return;
            case 11:
                y0.b((y0) obj2, (a1) obj);
                return;
            case 12:
                com.vungle.ads.internal.load.j.a((com.vungle.ads.internal.load.j) obj2, (com.vungle.ads.internal.load.a) obj);
                return;
            case 13:
                com.vungle.ads.internal.network.l.b((com.vungle.ads.internal.network.l) obj2, (String) obj);
                return;
            case 14:
                eh.b.m131apply$lambda0((eh.b) obj2, (Serializable) obj);
                return;
            case 15:
                com.vungle.ads.internal.platform.b.a((com.vungle.ads.internal.platform.b) obj2, (m0.a) obj);
                return;
            case 16:
                gh.c.b((gh.c) obj2, (String) obj);
                return;
            default:
                com.vungle.ads.internal.ui.p.b((com.vungle.ads.internal.ui.p) obj2, (WebView) obj);
                return;
        }
    }
}
