package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public abstract class z {
    public static final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1847b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            a4.j.t(newInstance);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static final String b(String className) {
        String replace$default;
        Intrinsics.checkNotNullParameter(className, "className");
        StringBuilder sb2 = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(className, ".", "_", false, 4, (Object) null);
        sb2.append(replace$default);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(Class cls) {
        Constructor constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String fullPackage;
        boolean z13;
        boolean z14;
        HashMap hashMap = a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String name = cls.getCanonicalName();
                if (r42 != null) {
                    fullPackage = r42.getName();
                } else {
                    fullPackage = "";
                }
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
                }
                Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b3 = b(name);
                if (fullPackage.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    b3 = fullPackage + '.' + b3;
                }
                Class<?> cls2 = Class.forName(b3);
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                constructor = cls2.getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap hashMap2 = f1847b;
            if (constructor != null) {
                hashMap2.put(cls, CollectionsKt.listOf(constructor));
            } else {
                d dVar = d.f1790c;
                HashMap hashMap3 = dVar.f1791b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (((g0) declaredMethods[i11].getAnnotation(g0.class)) != null) {
                                    dVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && u.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> intrface = interfaces[i12];
                            if (intrface != null && u.class.isAssignableFrom(intrface)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                                if (c(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                Intrinsics.checkNotNull(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
