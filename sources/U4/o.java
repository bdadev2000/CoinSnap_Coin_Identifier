package U4;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import w4.v0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements OnSuccessListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f3316c;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging, int i9) {
        this.b = i9;
        this.f3316c = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z8;
        switch (this.b) {
            case 0:
                F f9 = (F) obj;
                if (this.f3316c.f14332e.f() && f9.f3265h.a() != null) {
                    synchronized (f9) {
                        z8 = f9.f3264g;
                    }
                    if (!z8) {
                        f9.e(0L);
                        return;
                    }
                    return;
                }
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                A a6 = FirebaseMessaging.f14328k;
                FirebaseMessaging firebaseMessaging = this.f3316c;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    v0.u(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging.f14330c.f3318c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f14333f, new o(firebaseMessaging, 1));
                    return;
                }
                return;
        }
    }
}
