package androidx.lifecycle;

import Q7.n0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0515z {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f4911a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            G7.j.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            n0.r(newInstance);
            throw null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z8;
        boolean z9;
        boolean z10;
        String str;
        HashMap hashMap = f4911a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i9 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r32 != null) {
                    str = r32.getName();
                } else {
                    str = "";
                }
                G7.j.d(str, "fullPackage");
                if (str.length() != 0) {
                    G7.j.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    G7.j.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                G7.j.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = O7.o.A(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap hashMap2 = b;
            if (constructor != null) {
                hashMap2.put(cls, android.support.v4.media.session.a.w(constructor));
            } else {
                C0494d c0494d = C0494d.f4886c;
                HashMap hashMap3 = c0494d.b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                if (((E) declaredMethods[i10].getAnnotation(E.class)) != null) {
                                    c0494d.a(cls, declaredMethods);
                                    z8 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z8 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e9) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
                    }
                }
                if (!z8) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0510u.class.isAssignableFrom(superclass)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        G7.j.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            G7.j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    G7.j.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class<?> cls2 = interfaces[i11];
                            if (cls2 != null && InterfaceC0510u.class.isAssignableFrom(cls2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                G7.j.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                G7.j.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i11++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i9 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i9));
        return i9;
    }
}
