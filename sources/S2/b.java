package S2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class b extends Binder implements c {
    /* JADX WARN: Type inference failed for: r0v2, types: [S2.c, S2.a, java.lang.Object] */
    public static c b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.b = iBinder;
        return obj;
    }
}
