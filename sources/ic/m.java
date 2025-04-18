package ic;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f19562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f19563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f19564d;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, String str, u uVar) {
        this.f19562b = firebaseMessaging;
        this.f19563c = str;
        this.f19564d = uVar;
    }

    public final Task a() {
        FirebaseMessaging firebaseMessaging = this.f19562b;
        androidx.appcompat.widget.v vVar = firebaseMessaging.f12076c;
        return vVar.d(vVar.k(new Bundle(), com.facebook.i.a((va.g) vVar.a), "*")).onSuccessTask(firebaseMessaging.f12080g, new m(firebaseMessaging, this.f19563c, this.f19564d));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        y7.q qVar;
        String d10;
        String str;
        FirebaseMessaging firebaseMessaging = this.f19562b;
        String str2 = this.f19563c;
        u uVar = this.f19564d;
        String str3 = (String) obj;
        Context context = firebaseMessaging.f12075b;
        synchronized (FirebaseMessaging.class) {
            if (FirebaseMessaging.f12072k == null) {
                FirebaseMessaging.f12072k = new y7.q(context);
            }
            qVar = FirebaseMessaging.f12072k;
        }
        va.g gVar = firebaseMessaging.a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f26388b)) {
            d10 = "";
        } else {
            d10 = gVar.d();
        }
        com.facebook.i iVar = firebaseMessaging.f12081h;
        synchronized (iVar) {
            if (iVar.a == null) {
                iVar.d();
            }
            str = iVar.a;
        }
        synchronized (qVar) {
            String a = u.a(System.currentTimeMillis(), str3, str);
            if (a != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) qVar.f27991b).edit();
                edit.putString(d10 + "|T|" + str2 + "|*", a);
                edit.commit();
            }
        }
        if (uVar == null || !str3.equals(uVar.a)) {
            va.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f26388b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f26388b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(BidResponsed.KEY_TOKEN, str3);
                new i(firebaseMessaging.f12075b).b(intent);
            }
        }
        return Tasks.forResult(str3);
    }
}
