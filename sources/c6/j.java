package c6;

import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ni.b0;
import ni.o0;
import ni.s;
import ni.u0;

/* loaded from: classes3.dex */
public final class j implements InvocationHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2638b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f2639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2641e;

    public j(Object obj, Ref.ObjectRef objectRef, ReentrantLock reentrantLock, Condition condition) {
        this.a = 0;
        this.f2638b = obj;
        this.f2639c = objectRef;
        this.f2640d = reentrantLock;
        this.f2641e = condition;
    }

    /* JADX WARN: Type inference failed for: r10v25, types: [T, java.lang.String] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objects) {
        boolean z10 = true;
        int i10 = this.a;
        Object obj2 = this.f2641e;
        Object obj3 = this.f2639c;
        Object obj4 = this.f2638b;
        Serializable serializable = this.f2640d;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(objects, "objects");
                try {
                    if (Intrinsics.areEqual(method.getName(), "onChecksumsReady") && objects.length == 1) {
                        Object obj5 = objects[0];
                        if (obj5 instanceof List) {
                            for (Object obj6 : (List) obj5) {
                                if (obj6 != null) {
                                    Method method2 = obj6.getClass().getMethod("getSplitName", new Class[0]);
                                    Intrinsics.checkNotNullExpressionValue(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                    Method method3 = obj6.getClass().getMethod("getType", new Class[0]);
                                    Intrinsics.checkNotNullExpressionValue(method3, "c.javaClass.getMethod(\"getType\")");
                                    if (method2.invoke(obj6, new Object[0]) == null && Intrinsics.areEqual(method3.invoke(obj6, new Object[0]), obj4)) {
                                        Method method4 = obj6.getClass().getMethod("getValue", new Class[0]);
                                        Intrinsics.checkNotNullExpressionValue(method4, "c.javaClass.getMethod(\"getValue\")");
                                        Object invoke = method4.invoke(obj6, new Object[0]);
                                        if (invoke != null) {
                                            ((Ref.ObjectRef) obj3).element = new BigInteger(1, (byte[]) invoke).toString(16);
                                            ((ReentrantLock) serializable).lock();
                                            try {
                                                ((Condition) obj2).signalAll();
                                                ((ReentrantLock) serializable).unlock();
                                                return null;
                                            } catch (Throwable th2) {
                                                ((ReentrantLock) serializable).unlock();
                                                throw th2;
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th3) {
                    String[] strArr = k.a;
                    Log.d(CampaignEx.JSON_KEY_AD_K, "Can't fetch checksum.", th3);
                    return null;
                }
            default:
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objects);
                }
                if (objects == null) {
                    objects = (Object[]) obj3;
                }
                o0 o0Var = (o0) obj4;
                if (!o0Var.a || !method.isDefault()) {
                    z10 = false;
                }
                if (z10) {
                    return o0Var.b((Class) serializable, obj, method, objects);
                }
                s c10 = ((u0) obj2).c(method);
                return c10.a(new b0(c10.a, objects, c10.f22875b, c10.f22876c), objects);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[], java.io.Serializable] */
    public j(u0 u0Var, Class cls) {
        this.a = 1;
        this.f2641e = u0Var;
        this.f2640d = cls;
        this.f2638b = o0.f22825c;
        this.f2639c = new Object[0];
    }
}
