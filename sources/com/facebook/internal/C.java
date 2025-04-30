package com.facebook.internal;

import Q7.AbstractC0255x;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import u0.C2746a;
import u0.C2747b;

/* loaded from: classes.dex */
public final class C extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13572a = 1;
    public Object b;

    public /* synthetic */ C() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        int size;
        r4.c[] cVarArr;
        switch (this.f13572a) {
            case 0:
                if (!O2.a.b(this)) {
                    try {
                        if (!O2.a.b(this)) {
                            try {
                                G7.j.e(message, "message");
                                com.facebook.login.l lVar = (com.facebook.login.l) this.b;
                                lVar.getClass();
                                if (message.what == lVar.f13730i) {
                                    Bundle data = message.getData();
                                    if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                        lVar.a(null);
                                    } else {
                                        lVar.a(data);
                                    }
                                    try {
                                        lVar.b.unbindService(lVar);
                                    } catch (IllegalArgumentException unused) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th) {
                                O2.a.a(this, th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        O2.a.a(this, th2);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                int i9 = message.what;
                if (i9 != -3 && i9 != -2 && i9 != -1) {
                    if (i9 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                return;
            case 2:
                G7.j.e(message, NotificationCompat.CATEGORY_MESSAGE);
                if (message.what == 3) {
                    Bundle data2 = message.getData();
                    if (data2 == null || (str = data2.getString("SessionUpdateExtra")) == null) {
                        str = "";
                    }
                    Log.d("SessionLifecycleClient", "Session update received: ".concat(str));
                    AbstractC0255x.l(AbstractC0255x.a((w7.k) this.b), null, null, new p5.O(str, null), 3);
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                super.handleMessage(message);
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C2747b c2747b = (C2747b) this.b;
                while (true) {
                    synchronized (c2747b.b) {
                        try {
                            size = c2747b.f23064d.size();
                            if (size <= 0) {
                                return;
                            }
                            cVarArr = new r4.c[size];
                            c2747b.f23064d.toArray(cVarArr);
                            c2747b.f23064d.clear();
                        } finally {
                        }
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        r4.c cVar = cVarArr[i10];
                        int size2 = ((ArrayList) cVar.f22841d).size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            C2746a c2746a = (C2746a) ((ArrayList) cVar.f22841d).get(i11);
                            if (!c2746a.f23059d) {
                                c2746a.b.onReceive(c2747b.f23062a, (Intent) cVar.f22840c);
                            }
                        }
                    }
                }
        }
    }

    public C(w7.k kVar) {
        super(Looper.getMainLooper());
        this.b = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(C2747b c2747b, Looper looper) {
        super(looper);
        this.b = c2747b;
    }

    public C(com.facebook.login.l lVar) {
        this.b = lVar;
    }
}
