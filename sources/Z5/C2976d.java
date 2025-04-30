package z5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import java.lang.reflect.InvocationTargetException;

/* renamed from: z5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2976d {

    /* renamed from: a, reason: collision with root package name */
    public Context f24551a;
    public ILoadedInstanceCreator b;

    /* renamed from: c, reason: collision with root package name */
    public final C2977e f24552c;

    public C2976d(C2977e c2977e) {
        this.f24552c = c2977e;
    }

    public static IBinder c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e4) {
            throw new IllegalStateException("Unable to find dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e4);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e9);
        } catch (InstantiationException e10) {
            throw new IllegalStateException("Unable to instantiate the remote class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e10);
        } catch (NoSuchMethodException e11) {
            throw new IllegalStateException("No constructor for dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e11);
        } catch (InvocationTargetException e12) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class ".concat("com.google.vr.dynamite.LoadedInstanceCreator"), e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.vr.dynamite.client.ILoadedInstanceCreator] */
    public final synchronized ILoadedInstanceCreator a(Context context) {
        ?? cVar;
        try {
            if (this.b == null) {
                IBinder c9 = c(b(context).getClassLoader());
                if (c9 == null) {
                    cVar = 0;
                } else {
                    IInterface queryLocalInterface = c9.queryLocalInterface("com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    if (queryLocalInterface instanceof ILoadedInstanceCreator) {
                        cVar = (ILoadedInstanceCreator) queryLocalInterface;
                    } else {
                        cVar = new com.google.ar.core.dependencies.c(c9, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
                    }
                }
                this.b = cVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final synchronized Context b(Context context) {
        if (this.f24551a == null) {
            try {
                this.f24551a = context.createPackageContext(this.f24552c.f24553a, 3);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C2975c();
            }
        }
        return this.f24551a;
    }
}
