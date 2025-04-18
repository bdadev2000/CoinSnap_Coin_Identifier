package db;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements cc.c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16945b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.f16945b = obj;
    }

    @Override // cc.c
    public final Object get() {
        int i10 = this.a;
        Object obj = this.f16945b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new m(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new m(String.format("Could not instantiate %s.", str), e2);
                } catch (InstantiationException e10) {
                    throw new m(String.format("Could not instantiate %s.", str), e10);
                } catch (NoSuchMethodException e11) {
                    throw new m(String.format("Could not instantiate %s", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new m(String.format("Could not instantiate %s", str), e12);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                Object obj2 = dc.d.f16973m;
                return new ec.b((va.g) obj);
        }
    }
}
