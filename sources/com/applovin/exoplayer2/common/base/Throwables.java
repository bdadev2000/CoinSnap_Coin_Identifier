package com.applovin.exoplayer2.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Throwables {
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";
    private static final Method getStackTraceDepthMethod;
    private static final Method getStackTraceElementMethod;
    private static final Object jla;

    /* loaded from: classes.dex */
    public class a extends AbstractList {
        final /* synthetic */ Throwable a;

        public a(Throwable th2) {
            this.a = th2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(Throwables.getStackTraceDepthMethod, Throwables.jla, this.a)).intValue();
        }

        @Override // java.util.AbstractList, java.util.List
        public StackTraceElement get(int i10) {
            return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(Throwables.getStackTraceElementMethod, Throwables.jla, this.a, Integer.valueOf(i10));
        }
    }

    static {
        Method getMethod;
        Object jla2 = getJLA();
        jla = jla2;
        Method method = null;
        if (jla2 == null) {
            getMethod = null;
        } else {
            getMethod = getGetMethod();
        }
        getStackTraceElementMethod = getMethod;
        if (jla2 != null) {
            method = getSizeMethod();
        }
        getStackTraceDepthMethod = method;
    }

    private Throwables() {
    }

    public static List<Throwable> getCausalChain(Throwable th2) {
        Preconditions.checkNotNull(th2);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th2);
        boolean z10 = false;
        Throwable th3 = th2;
        while (true) {
            th2 = th2.getCause();
            if (th2 != null) {
                arrayList.add(th2);
                if (th2 != th3) {
                    if (z10) {
                        th3 = th3.getCause();
                    }
                    z10 = !z10;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th2);
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public static <X extends Throwable> X getCauseAs(Throwable th2, Class<X> cls) {
        try {
            return cls.cast(th2.getCause());
        } catch (ClassCastException e2) {
            e2.initCause(th2);
            throw e2;
        }
    }

    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object getJLA() {
        try {
            return Class.forName(SHARED_SECRETS_CLASSNAME, false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method getJlaMethod(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName(JAVA_LANG_ACCESS_CLASSNAME, false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th2) {
        boolean z10 = false;
        Throwable th3 = th2;
        while (true) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                if (cause != th3) {
                    if (z10) {
                        th3 = th3.getCause();
                    }
                    z10 = !z10;
                    th2 = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                return th2;
            }
        }
    }

    private static Method getSizeMethod() {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(getJLA(), new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String getStackTraceAsString(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e10) {
            throw propagate(e10.getCause());
        }
    }

    private static List<StackTraceElement> jlaStackTrace(Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new a(th2);
    }

    public static List<StackTraceElement> lazyStackTrace(Throwable th2) {
        if (lazyStackTraceIsLazy()) {
            return jlaStackTrace(th2);
        }
        return Collections.unmodifiableList(Arrays.asList(th2.getStackTrace()));
    }

    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @Deprecated
    public static RuntimeException propagate(Throwable th2) {
        throwIfUnchecked(th2);
        throw new RuntimeException(th2);
    }

    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null) {
            throwIfInstanceOf(th2, cls);
        }
    }

    @Deprecated
    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            throwIfUnchecked(th2);
        }
    }

    public static <X extends Throwable> void throwIfInstanceOf(Throwable th2, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th2);
        if (!cls.isInstance(th2)) {
        } else {
            throw cls.cast(th2);
        }
    }

    public static void throwIfUnchecked(Throwable th2) {
        Preconditions.checkNotNull(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (!(th2 instanceof Error)) {
                return;
            } else {
                throw ((Error) th2);
            }
        }
        throw ((RuntimeException) th2);
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2);
    }

    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th2, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th2, cls);
        propagateIfPossible(th2, cls2);
    }
}
