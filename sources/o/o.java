package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class o implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    @Nullable
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, h hVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        b.e cVar;
        if (this.mApplicationContext != null) {
            int i10 = b.d.f2246b;
            if (iBinder == null) {
                cVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(b.e.V7);
                if (queryLocalInterface != null && (queryLocalInterface instanceof b.e)) {
                    cVar = (b.e) queryLocalInterface;
                } else {
                    cVar = new b.c(iBinder);
                }
            }
            onCustomTabsServiceConnected(componentName, new n(cVar, componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
