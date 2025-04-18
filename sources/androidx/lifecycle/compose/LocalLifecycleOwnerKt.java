package androidx.lifecycle.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;

/* loaded from: classes4.dex */
public final class LocalLifecycleOwnerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f20226a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.CompositionLocal] */
    static {
        /*
            r0 = 0
            java.lang.Class<androidx.lifecycle.LifecycleOwner> r1 = androidx.lifecycle.LifecycleOwner.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c
            p0.a.p(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.annotation.Annotation[] r3 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2c
            r5 = r2
        L1f:
            if (r5 >= r4) goto L2e
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2c
            boolean r6 = r6 instanceof d0.a     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L29
        L27:
            r1 = r0
            goto L3f
        L29:
            int r5 = r5 + 1
            goto L1f
        L2c:
            r1 = move-exception
            goto L3b
        L2e:
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L27
            androidx.compose.runtime.ProvidableCompositionLocal r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L3b:
            d0.m r1 = kotlin.jvm.internal.q.d(r1)
        L3f:
            boolean r2 = r1 instanceof d0.m
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = (androidx.compose.runtime.ProvidableCompositionLocal) r0
            if (r0 != 0) goto L51
            androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1 r0 = androidx.lifecycle.compose.LocalLifecycleOwnerKt$LocalLifecycleOwner$1$1.f20227a
            androidx.compose.runtime.StaticProvidableCompositionLocal r1 = new androidx.compose.runtime.StaticProvidableCompositionLocal
            r1.<init>(r0)
            r0 = r1
        L51:
            androidx.lifecycle.compose.LocalLifecycleOwnerKt.f20226a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LocalLifecycleOwnerKt.<clinit>():void");
    }
}
