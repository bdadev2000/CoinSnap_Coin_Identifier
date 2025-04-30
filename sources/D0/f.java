package D0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f603a;

    public f(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f603a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap hashMap = this.f603a.f5146c;
        Integer num = (Integer) obj;
        num.intValue();
        hashMap.remove(num);
    }
}
