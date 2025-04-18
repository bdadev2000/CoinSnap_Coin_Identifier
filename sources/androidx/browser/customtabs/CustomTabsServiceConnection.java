package androidx.browser.customtabs;

import a.e;
import a.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    @Nullable
    private Context mApplicationContext;

    /* renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends CustomTabsClient {
    }

    @Nullable
    @RestrictTo
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient);

    /* JADX WARN: Type inference failed for: r1v3, types: [a.d, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        f fVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i2 = e.f55a;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                ?? obj = new Object();
                obj.f54a = iBinder;
                fVar = obj;
            } else {
                fVar = (f) queryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new CustomTabsClient(fVar, componentName));
    }

    @RestrictTo
    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
