package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;

/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f21313b;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f21313b = multiInstanceInvalidationService;
        attachInterface(this, IMultiInstanceInvalidationService.m8);
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int B(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        p0.a.s(iMultiInstanceInvalidationCallback, "callback");
        int i2 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f21313b;
        synchronized (multiInstanceInvalidationService.f21312c) {
            try {
                int i3 = multiInstanceInvalidationService.f21310a + 1;
                multiInstanceInvalidationService.f21310a = i3;
                if (multiInstanceInvalidationService.f21312c.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i3))) {
                    multiInstanceInvalidationService.f21311b.put(Integer.valueOf(i3), str);
                    i2 = i3;
                } else {
                    multiInstanceInvalidationService.f21310a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void Q(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
        p0.a.s(iMultiInstanceInvalidationCallback, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f21313b;
        synchronized (multiInstanceInvalidationService.f21312c) {
            multiInstanceInvalidationService.f21312c.unregister(iMultiInstanceInvalidationCallback);
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void s(int i2, String[] strArr) {
        p0.a.s(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f21313b;
        synchronized (multiInstanceInvalidationService.f21312c) {
            String str = (String) multiInstanceInvalidationService.f21311b.get(Integer.valueOf(i2));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f21312c.beginBroadcast();
            for (int i3 = 0; i3 < beginBroadcast; i3++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f21312c.getBroadcastCookie(i3);
                    p0.a.q(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = (String) multiInstanceInvalidationService.f21311b.get(Integer.valueOf(intValue));
                    if (i2 != intValue && p0.a.g(str, str2)) {
                        try {
                            multiInstanceInvalidationService.f21312c.getBroadcastItem(i3).g(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f21312c.finishBroadcast();
                }
            }
        }
    }
}
