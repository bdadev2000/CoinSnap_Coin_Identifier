package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c.AbstractBinderC0579c;
import c.InterfaceC0580d;

/* renamed from: u.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC2741j implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    @Nullable
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2736e abstractC2736e);

    /* JADX WARN: Type inference failed for: r1v3, types: [c.b, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        InterfaceC0580d interfaceC0580d;
        if (this.mApplicationContext != null) {
            int i9 = AbstractBinderC0579c.b;
            if (iBinder == null) {
                interfaceC0580d = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0580d.b8);
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0580d)) {
                    interfaceC0580d = (InterfaceC0580d) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.b = iBinder;
                    interfaceC0580d = obj;
                }
            }
            onCustomTabsServiceConnected(componentName, new AbstractC2736e(interfaceC0580d, componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
