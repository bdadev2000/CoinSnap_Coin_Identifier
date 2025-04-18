package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

@RestrictTo
/* loaded from: classes2.dex */
public final class Lifecycling {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f20024a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f20025b = new HashMap();

    public static GeneratedAdapter a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            p0.a.r(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r8.booleanValue() != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Lifecycling.b(java.lang.Class):int");
    }
}
