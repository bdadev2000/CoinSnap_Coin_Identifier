package q6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class b extends Binder implements c {
    public static c d(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        return new a(iBinder);
    }
}
