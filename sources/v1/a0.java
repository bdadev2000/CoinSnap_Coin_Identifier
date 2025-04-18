package v1;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public a0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        n callback = (n) iInterface;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.a.f2100c.remove((Integer) cookie);
    }
}
