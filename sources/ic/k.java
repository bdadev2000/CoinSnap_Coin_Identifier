package ic;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f19559c;

    public /* synthetic */ k(FirebaseMessaging firebaseMessaging, int i10) {
        this.f19558b = i10;
        this.f19559c = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f19558b) {
            case 1:
                FirebaseMessaging firebaseMessaging = this.f19559c;
                z zVar = (z) obj;
                y7.q qVar = FirebaseMessaging.f12072k;
                if (firebaseMessaging.f12078e.f()) {
                    if (zVar.f19600h.a() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (zVar) {
                            z11 = zVar.f19599g;
                        }
                        if (!z11) {
                            zVar.f(0L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                y7.q qVar2 = FirebaseMessaging.f12072k;
                FirebaseMessaging firebaseMessaging2 = this.f19559c;
                firebaseMessaging2.getClass();
                if (cloudMessage != null) {
                    c6.c.v(cloudMessage.getIntent());
                    ((Rpc) firebaseMessaging2.f12076c.f1058c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f12079f, new k(firebaseMessaging2, 2));
                    return;
                }
                return;
        }
    }
}
