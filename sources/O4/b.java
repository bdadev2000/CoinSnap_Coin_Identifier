package O4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import g4.C2296f;
import java.lang.reflect.InvocationTargetException;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements N4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2179a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.f2179a = i9;
        this.b = obj;
    }

    @Override // N4.b
    public final Object get() {
        switch (this.f2179a) {
            case 0:
                return new P4.c((C2296f) this.b);
            case 1:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(AbstractC2914a.e("Could not instantiate ", str, "."), e4);
                } catch (InstantiationException e9) {
                    throw new RuntimeException(AbstractC2914a.e("Could not instantiate ", str, "."), e9);
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(AbstractC2914a.d("Could not instantiate ", str), e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(AbstractC2914a.d("Could not instantiate ", str), e11);
                }
            default:
                return (ComponentRegistrar) this.b;
        }
    }
}
