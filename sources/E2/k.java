package E2;

import G7.r;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f996a;
    public final /* synthetic */ r b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f997c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Condition f998d;

    public k(Object obj, r rVar, ReentrantLock reentrantLock, Condition condition) {
        this.f996a = obj;
        this.b = rVar;
        this.f997c = reentrantLock;
        this.f998d = condition;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ReentrantLock reentrantLock = this.f997c;
        G7.j.e(method, "method");
        G7.j.e(objArr, "objects");
        try {
            if (G7.j.a(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", null);
                            G7.j.d(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", null);
                            G7.j.d(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, null) == null && G7.j.a(method3.invoke(obj3, null), this.f996a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", null);
                                G7.j.d(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object invoke = method4.invoke(obj3, null);
                                if (invoke != null) {
                                    this.b.b = new BigInteger(1, (byte[]) invoke).toString(16);
                                    reentrantLock.lock();
                                    try {
                                        this.f998d.signalAll();
                                        return null;
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.d("l", "Can't fetch checksum.", th);
        }
        return null;
    }
}
