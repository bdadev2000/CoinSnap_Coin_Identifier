package j;

import android.content.Context;
import android.content.res.Configuration;
import java.lang.reflect.InvocationTargetException;
import k4.d0;
import k4.v;
import k4.y;
import k4.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements z, z1.f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19652c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final a f19653d = new a();

    /* renamed from: b, reason: collision with root package name */
    public Context f19654b;

    public /* synthetic */ a() {
    }

    public static void b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(eb.j.j("Expected instanceof GlideModule, but found: ", cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
            } catch (IllegalAccessException e2) {
                e(cls, e2);
                throw null;
            } catch (InstantiationException e10) {
                e(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                e(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                e(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static void e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public int a() {
        Configuration configuration = this.f19654b.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600) {
            if (i10 <= 960 || i11 <= 720) {
                if (i10 <= 720 || i11 <= 960) {
                    if (i10 < 500) {
                        if (i10 <= 640 || i11 <= 480) {
                            if (i10 <= 480 || i11 <= 640) {
                                if (i10 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    @Override // k4.z
    public y c(d0 d0Var) {
        return new v(this.f19654b, 0);
    }

    @Override // z1.f
    public z1.g d(z1.e eVar) {
        Context context = this.f19654b;
        Intrinsics.checkNotNullParameter(context, "context");
        z1.c cVar = new z1.c(context);
        cVar.f28457b = eVar.f28461b;
        z1.b callback = eVar.f28462c;
        Intrinsics.checkNotNullParameter(callback, "callback");
        cVar.f28458c = callback;
        cVar.f28459d = true;
        return new a6.c().d(cVar.a());
    }

    public /* synthetic */ a(Context context) {
        this.f19654b = context;
    }
}
