package a6;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static j f286g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f287h = new AtomicBoolean(false);
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f288b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f289c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f290d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f291e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f292f;

    public j(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.a = skuDetailsParamsClazz;
        this.f288b = builderClazz;
        this.f289c = newBuilderMethod;
        this.f290d = setTypeMethod;
        this.f291e = setSkusListMethod;
        this.f292f = buildMethod;
    }

    public final Object a(ArrayList arrayList) {
        Object D;
        Object D2;
        Class cls = this.f288b;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Object D3 = k.D(this.a, null, this.f289c, new Object[0]);
            if (D3 != null && (D = k.D(cls, D3, this.f290d, "inapp")) != null && (D2 = k.D(cls, D, this.f291e, arrayList)) != null) {
                return k.D(cls, D2, this.f292f, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
