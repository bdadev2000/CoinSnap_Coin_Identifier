package U4;

import G7.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.view.MotionEvent;
import com.applovin.impl.ql;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import java.util.List;
import l5.C2451c;
import t.InterfaceC2702a;
import t7.y;

/* renamed from: U4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0314j implements Continuation, InterfaceC2702a, UserMessagingPlatform.OnConsentFormLoadSuccessListener, SuccessContinuation, OnCompleteListener {
    public final /* synthetic */ boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3310d;

    public /* synthetic */ C0314j(E1.d dVar, Activity activity) {
        this.f3309c = dVar;
        this.f3310d = activity;
        this.b = false;
    }

    @Override // t.InterfaceC2702a
    public Object apply(Object obj) {
        List a6;
        a6 = ((com.applovin.impl.sdk.ad.b) this.f3309c).a((MotionEvent) this.f3310d, this.b, (ql) obj);
        return a6;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Task task2;
        E1.d dVar = (E1.d) this.f3309c;
        G7.j.e(dVar, "$manager");
        final Activity activity = (Activity) this.f3310d;
        G7.j.e(activity, "$activity");
        G7.j.e(task, "task");
        if (task.isSuccessful()) {
            Object result = task.getResult();
            G7.j.d(result, "getResult(...)");
            X3.c cVar = (X3.c) ((X3.b) result);
            if (cVar.f3667c) {
                task2 = Tasks.forResult(null);
            } else {
                Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
                intent.putExtra("confirmation_intent", cVar.b);
                intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                intent.putExtra("result_receiver", new X3.d((Handler) dVar.f974d, taskCompletionSource));
                activity.startActivity(intent);
                task2 = taskCompletionSource.getTask();
            }
            G7.j.d(task2, "launchReviewFlow(...)");
            task2.addOnSuccessListener(new com.facebook.login.u(new F7.l() { // from class: x6.a
                public final /* synthetic */ boolean b = false;

                @Override // F7.l
                public final Object invoke(Object obj) {
                    Activity activity2 = activity;
                    j.e(activity2, "$activity");
                    a7.b bVar = a7.b.f4076f;
                    if (bVar != null) {
                        bVar.A("IS_RATE", true);
                        if (this.b) {
                            activity2.finishAffinity();
                            activity2.finish();
                        }
                        return y.f23029a;
                    }
                    throw new IllegalStateException(a7.b.class.getSimpleName().concat(" is not initialized, call initializeInstance(..) method first."));
                }
            }));
            return;
        }
        if (this.b) {
            activity.finishAffinity();
            activity.finish();
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        final E1.c cVar = (E1.c) this.f3309c;
        G7.j.e(cVar, "$callback");
        ConsentInformation consentInformation = (ConsentInformation) this.f3310d;
        G7.j.e(consentInformation, "$consentInformation");
        boolean z8 = this.b;
        if (!z8) {
            cVar.v(consentInformation.getConsentStatus());
        }
        if (consentInformation.getConsentStatus() == 2) {
            if (z8) {
                cVar.z();
                consentForm.show(cVar.t(), new ConsentForm.OnConsentFormDismissedListener() { // from class: i6.b
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0102, code lost:
                    
                        if (r0 != false) goto L31;
                     */
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onConsentFormDismissed(com.google.android.ump.FormError r12) {
                        /*
                            Method dump skipped, instructions count: 266
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: i6.C2363b.onConsentFormDismissed(com.google.android.ump.FormError):void");
                    }
                });
                return;
            }
            return;
        }
        if (consentInformation.getConsentStatus() == 1) {
            cVar.y();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        C2451c c2451c = (C2451c) this.f3309c;
        boolean z8 = this.b;
        l5.d dVar = (l5.d) this.f3310d;
        if (z8) {
            synchronized (c2451c) {
                c2451c.f21584c = Tasks.forResult(dVar);
            }
        } else {
            c2451c.getClass();
        }
        return Tasks.forResult(dVar);
    }

    public /* synthetic */ C0314j(Object obj, Parcelable parcelable, boolean z8) {
        this.f3309c = obj;
        this.f3310d = parcelable;
        this.b = z8;
    }

    public /* synthetic */ C0314j(Object obj, Object obj2) {
        this.b = true;
        this.f3309c = obj;
        this.f3310d = obj2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? C0315k.a((Context) this.f3309c, (Intent) this.f3310d, this.b).continueWith(new A0.c(0), new A4.a(17)) : task;
    }
}
