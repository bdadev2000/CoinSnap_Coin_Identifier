package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class EventBus {
    private static volatile EventBus b;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15247n;

    /* renamed from: a, reason: collision with root package name */
    static ExecutorService f15237a = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f15238c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f15239d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f15240e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, Object> f15241f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f15242g = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        public /* synthetic */ List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f15243h = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        public /* synthetic */ BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private String f15244i = "onEvent";

    /* renamed from: j, reason: collision with root package name */
    private final HandlerPoster f15245j = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: k, reason: collision with root package name */
    private final BackgroundPoster f15246k = new BackgroundPoster(this);
    private final AsyncPoster l = new AsyncPoster(this);
    private final SubscriberMethodFinder m = new SubscriberMethodFinder();

    /* renamed from: o, reason: collision with root package name */
    private boolean f15248o = true;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, Object> f15249p = new ConcurrentHashMap();

    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15252a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f15252a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15252a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15252a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15252a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class BooleanWrapper {

        /* renamed from: a, reason: collision with root package name */
        boolean f15253a;
    }

    /* loaded from: classes3.dex */
    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z8) {
        Iterator<SubscriberMethod> it = this.m.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z8);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f15238c.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (b == null) {
            synchronized (EventBus.class) {
                try {
                    if (b == null) {
                        b = new EventBus();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public final void configureLogSubscriberExceptions(boolean z8) {
        if (!this.f15247n) {
            this.f15248o = z8;
            return;
        }
        throw new EventBusException("This method must be called before any registration");
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f15241f) {
            obj = this.f15241f.get(cls);
        }
        return obj;
    }

    public final void post(Object obj) {
        boolean z8;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        List<Object> list = this.f15242g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f15243h.get();
        if (!booleanWrapper.f15253a) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z8 = true;
            } else {
                z8 = false;
            }
            booleanWrapper.f15253a = true;
            while (!list.isEmpty()) {
                try {
                    Object remove = list.remove(0);
                    if (remove != null) {
                        try {
                            Class<?> cls = remove.getClass();
                            List<Class<?>> a6 = a(cls);
                            int size = a6.size();
                            boolean z9 = false;
                            for (int i9 = 0; i9 < size; i9++) {
                                Class<?> cls2 = a6.get(i9);
                                synchronized (this) {
                                    copyOnWriteArrayList = this.f15239d.get(cls2);
                                }
                                if (copyOnWriteArrayList != null) {
                                    Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        a(it.next(), remove, z8);
                                    }
                                    z9 = true;
                                }
                            }
                            if (!z9) {
                                Log.d(TAG, "No subscripers registered for event " + cls);
                                if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                                    post(new NoSubscriberEvent(this, remove));
                                }
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                } finally {
                    booleanWrapper.f15253a = false;
                }
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f15241f) {
            this.f15241f.put(obj.getClass(), obj);
        }
    }

    public final void register(Object obj) {
        a(obj, this.f15244i, false);
    }

    public final void registerSticky(Object obj) {
        a(obj, this.f15244i, true);
    }

    public final void release() {
        if (b != null) {
            b = null;
            f15237a = null;
            Map<Class<?>, List<Class<?>>> map = f15238c;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f15239d;
            if (map2 != null && map2.size() > 0) {
                this.f15239d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f15240e;
            if (map3 != null && map3.size() > 0) {
                this.f15240e.clear();
            }
            Map<Class<?>, Object> map4 = this.f15241f;
            if (map4 != null && map4.size() > 0) {
                this.f15241f.clear();
            }
            Map<String, Object> map5 = this.f15249p;
            if (map5 != null && map5.size() > 0) {
                this.f15249p.clear();
            }
        }
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object remove;
        synchronized (this.f15241f) {
            remove = this.f15241f.remove(cls);
        }
        return remove;
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        try {
            if (clsArr.length != 0) {
                List<Class<?>> list = this.f15240e.get(obj);
                if (list != null) {
                    for (Class<?> cls : clsArr) {
                        a(obj, cls);
                        list.remove(cls);
                    }
                    if (list.isEmpty()) {
                        this.f15240e.remove(obj);
                    }
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
                }
            } else {
                throw new IllegalArgumentException("Provide at least one event class");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void register(String str, Object obj) {
        Map<String, Object> map = this.f15249p;
        if (map != null && map.containsKey(str)) {
            unregister(this.f15249p.get(str));
        }
        this.f15249p.put(str, obj);
        a(obj, this.f15244i, false);
    }

    public final void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f15244i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f15241f) {
            try {
                Class<?> cls = obj.getClass();
                if (!obj.equals(this.f15241f.get(cls))) {
                    return false;
                }
                this.f15241f.remove(cls);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void a(Object obj, String str, boolean z8, Class<?> cls, Class<?>... clsArr) {
        try {
            for (SubscriberMethod subscriberMethod : this.m.a(obj.getClass(), str)) {
                if (cls == subscriberMethod.f15262c) {
                    a(obj, subscriberMethod, z8);
                } else if (clsArr != null) {
                    int length = clsArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (clsArr[i9] == subscriberMethod.f15262c) {
                            a(obj, subscriberMethod, z8);
                            break;
                        }
                        i9++;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void register(Object obj, String str) {
        a(obj, str, false);
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f15244i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public final synchronized void unregister(Object obj) {
        try {
            List<Class<?>> list = this.f15240e.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(obj, it.next());
                }
                this.f15240e.remove(obj);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z8) {
        Object obj2;
        this.f15247n = true;
        Class<?> cls = subscriberMethod.f15262c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f15239d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f15239d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f15261a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> list = this.f15240e.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f15240e.put(obj, list);
        }
        list.add(cls);
        if (z8) {
            synchronized (this.f15241f) {
                obj2 = this.f15241f.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public final synchronized void unregister(String str) {
        try {
            Map<String, Object> map = this.f15249p;
            if (map != null && map.containsKey(str)) {
                Object remove = this.f15249p.remove(str);
                List<Class<?>> list = this.f15240e.get(remove);
                if (list != null) {
                    Iterator<Class<?>> it = list.iterator();
                    while (it.hasNext()) {
                        a(remove, it.next());
                    }
                    this.f15240e.remove(remove);
                } else {
                    Log.w(TAG, "Subscriber to unregister was not registered before: " + remove.getClass());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f15239d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i9 = 0;
            while (i9 < size) {
                if (copyOnWriteArrayList.get(i9).f15265a == obj) {
                    copyOnWriteArrayList.remove(i9);
                    i9--;
                    size--;
                }
                i9++;
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z8) {
        int i9 = AnonymousClass3.f15252a[subscription.b.b.ordinal()];
        if (i9 == 1) {
            a(subscription, obj);
            return;
        }
        if (i9 == 2) {
            if (z8) {
                a(subscription, obj);
                return;
            } else {
                this.f15245j.a(subscription, obj);
                return;
            }
        }
        if (i9 == 3) {
            if (z8) {
                this.f15246k.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i9 == 4) {
            this.l.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.b.b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f15238c;
        synchronized (map) {
            try {
                List<Class<?>> list2 = map.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList.add(cls2);
                        a(arrayList, cls2.getInterfaces());
                    }
                    f15238c.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public final void a(PendingPost pendingPost) {
        Object obj = pendingPost.f15258a;
        Subscription subscription = pendingPost.b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    private void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.b.f15261a.invoke(subscription.f15265a, obj);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Unexpected exception", e4);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f15265a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f15248o) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f15265a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f15265a));
        }
    }
}
