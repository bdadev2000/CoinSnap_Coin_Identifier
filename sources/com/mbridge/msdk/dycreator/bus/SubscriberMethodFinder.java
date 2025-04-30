package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class SubscriberMethodFinder {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, List<SubscriberMethod>> f15264a = new HashMap();
    private static final Map<Class<?>, Class<?>> b = new ConcurrentHashMap();

    public static void clearSkipMethodNameVerifications() {
        b.clear();
    }

    public final List<SubscriberMethod> a(Class<?> cls, String str) {
        List<SubscriberMethod> list;
        ThreadMode threadMode;
        String str2 = cls.getName() + '.' + str;
        Map<String, List<SubscriberMethod>> map = f15264a;
        synchronized (map) {
            list = map.get(str2);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name = cls2.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            for (Method method : cls2.getDeclaredMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String substring = name2.substring(str.length());
                        if (substring.length() == 0) {
                            threadMode = ThreadMode.PostThread;
                        } else if (substring.equals("MainThread")) {
                            threadMode = ThreadMode.MainThread;
                        } else if (substring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.BackgroundThread;
                        } else if (!substring.equals("Async")) {
                            if (!b.containsKey(cls2)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                        } else {
                            threadMode = ThreadMode.Async;
                        }
                        Class<?> cls3 = parameterTypes[0];
                        sb.setLength(0);
                        sb.append(name2);
                        sb.append('>');
                        sb.append(cls3.getName());
                        if (hashSet.add(sb.toString())) {
                            arrayList.add(new SubscriberMethod(method, threadMode, cls3));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<SubscriberMethod>> map2 = f15264a;
            synchronized (map2) {
                map2.put(str2, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no methods called " + str);
    }

    public static void a() {
        f15264a.clear();
    }

    public static void a(Class<?> cls) {
        if (f15264a.isEmpty()) {
            b.put(cls, cls);
            return;
        }
        throw new IllegalStateException("This method must be called before registering anything");
    }
}
