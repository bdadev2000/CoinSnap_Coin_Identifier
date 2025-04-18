package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
final class ClassesInfoCache {

    /* renamed from: c, reason: collision with root package name */
    public static final ClassesInfoCache f19936c = new ClassesInfoCache();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f19937a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19938b = new HashMap();

    @Deprecated
    /* loaded from: classes3.dex */
    public static class CallbackInfo {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f19939a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f19940b;

        public CallbackInfo(HashMap hashMap) {
            this.f19940b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.f19939a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f19939a.put(event, list);
                }
                list.add((MethodReference) entry.getKey());
            }
        }

        public static void a(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    methodReference.getClass();
                    try {
                        int i2 = methodReference.f19941a;
                        Method method = methodReference.f19942b;
                        if (i2 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            method.invoke(obj, lifecycleOwner);
                        } else if (i2 == 2) {
                            method.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public static final class MethodReference {

        /* renamed from: a, reason: collision with root package name */
        public final int f19941a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f19942b;

        public MethodReference(Method method, int i2) {
            this.f19941a = i2;
            this.f19942b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.f19941a == methodReference.f19941a && this.f19942b.getName().equals(methodReference.f19942b.getName());
        }

        public final int hashCode() {
            return this.f19942b.getName().hashCode() + (this.f19941a * 31);
        }
    }

    public static void b(HashMap hashMap, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(methodReference);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                hashMap.put(methodReference, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + methodReference.f19942b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }

    public final CallbackInfo a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f19937a;
        if (superclass != null) {
            CallbackInfo callbackInfo = (CallbackInfo) hashMap2.get(superclass);
            if (callbackInfo == null) {
                callbackInfo = a(superclass, null);
            }
            hashMap.putAll(callbackInfo.f19940b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfo2 = (CallbackInfo) hashMap2.get(cls2);
            if (callbackInfo2 == null) {
                callbackInfo2 = a(cls2, null);
            }
            for (Map.Entry entry : callbackInfo2.f19940b.entrySet()) {
                b(hashMap, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new MethodReference(method, i2), value, cls);
                z2 = true;
            }
        }
        CallbackInfo callbackInfo3 = new CallbackInfo(hashMap);
        hashMap2.put(cls, callbackInfo3);
        this.f19938b.put(cls, Boolean.valueOf(z2));
        return callbackInfo3;
    }
}
