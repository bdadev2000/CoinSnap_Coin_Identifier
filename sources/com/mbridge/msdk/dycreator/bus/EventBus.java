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

/* loaded from: classes4.dex */
public final class EventBus {

    /* renamed from: b, reason: collision with root package name */
    private static volatile EventBus f12888b;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12900n;
    static ExecutorService a = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f12889c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f12890d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map<Object, List<Class<?>>> f12891e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, Object> f12892f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    private final ThreadLocal<List<Object>> f12893g = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        public /* synthetic */ List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final ThreadLocal<BooleanWrapper> f12894h = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        public /* synthetic */ BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private String f12895i = "onEvent";

    /* renamed from: j, reason: collision with root package name */
    private final HandlerPoster f12896j = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: k, reason: collision with root package name */
    private final BackgroundPoster f12897k = new BackgroundPoster(this);

    /* renamed from: l, reason: collision with root package name */
    private final AsyncPoster f12898l = new AsyncPoster(this);

    /* renamed from: m, reason: collision with root package name */
    private final SubscriberMethodFinder f12899m = new SubscriberMethodFinder();

    /* renamed from: o, reason: collision with root package name */
    private boolean f12901o = true;

    /* renamed from: p, reason: collision with root package name */
    private Map<String, Object> f12902p = new ConcurrentHashMap();

    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class BooleanWrapper {
        boolean a;
    }

    /* loaded from: classes4.dex */
    public interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    private void a(Object obj, String str, boolean z10) {
        Iterator<SubscriberMethod> it = this.f12899m.a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            a(obj, it.next(), z10);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.a();
        f12889c.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f12888b == null) {
            synchronized (EventBus.class) {
                if (f12888b == null) {
                    f12888b = new EventBus();
                }
            }
        }
        return f12888b;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.a(cls);
    }

    public final void configureLogSubscriberExceptions(boolean z10) {
        if (!this.f12900n) {
            this.f12901o = z10;
            return;
        }
        throw new EventBusException("This method must be called before any registration");
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f12892f) {
            obj = this.f12892f.get(cls);
        }
        return obj;
    }

    public final void post(Object obj) {
        boolean z10;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        List<Object> list = this.f12893g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f12894h.get();
        if (!booleanWrapper.a) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            booleanWrapper.a = true;
            while (!list.isEmpty()) {
                try {
                    Object remove = list.remove(0);
                    if (remove != null) {
                        try {
                            Class<?> cls = remove.getClass();
                            List<Class<?>> a10 = a(cls);
                            int size = a10.size();
                            boolean z11 = false;
                            for (int i10 = 0; i10 < size; i10++) {
                                Class<?> cls2 = a10.get(i10);
                                synchronized (this) {
                                    copyOnWriteArrayList = this.f12890d.get(cls2);
                                }
                                if (copyOnWriteArrayList != null) {
                                    Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        a(it.next(), remove, z10);
                                    }
                                    z11 = true;
                                }
                            }
                            if (!z11) {
                                Log.d(TAG, "No subscripers registered for event " + cls);
                                if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                                    post(new NoSubscriberEvent(this, remove));
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } finally {
                    booleanWrapper.a = false;
                }
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f12892f) {
            this.f12892f.put(obj.getClass(), obj);
        }
    }

    public final void register(Object obj) {
        a(obj, this.f12895i, false);
    }

    public final void registerSticky(Object obj) {
        a(obj, this.f12895i, true);
    }

    public final void release() {
        if (f12888b != null) {
            f12888b = null;
            a = null;
            Map<Class<?>, List<Class<?>>> map = f12889c;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f12890d;
            if (map2 != null && map2.size() > 0) {
                this.f12890d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f12891e;
            if (map3 != null && map3.size() > 0) {
                this.f12891e.clear();
            }
            Map<Class<?>, Object> map4 = this.f12892f;
            if (map4 != null && map4.size() > 0) {
                this.f12892f.clear();
            }
            Map<String, Object> map5 = this.f12902p;
            if (map5 != null && map5.size() > 0) {
                this.f12902p.clear();
            }
        }
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object remove;
        synchronized (this.f12892f) {
            remove = this.f12892f.remove(cls);
        }
        return remove;
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length != 0) {
            List<Class<?>> list = this.f12891e.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f12891e.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } else {
            throw new IllegalArgumentException("Provide at least one event class");
        }
    }

    public final void register(String str, Object obj) {
        Map<String, Object> map = this.f12902p;
        if (map != null && map.containsKey(str)) {
            unregister(this.f12902p.get(str));
        }
        this.f12902p.put(str, obj);
        a(obj, this.f12895i, false);
    }

    public final void registerSticky(Object obj, String str) {
        a(obj, str, true);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f12895i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, true, cls, clsArr);
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f12892f) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f12892f.get(cls))) {
                return false;
            }
            this.f12892f.remove(cls);
            return true;
        }
    }

    private synchronized void a(Object obj, String str, boolean z10, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod subscriberMethod : this.f12899m.a(obj.getClass(), str)) {
            if (cls == subscriberMethod.f12911c) {
                a(obj, subscriberMethod, z10);
            } else if (clsArr != null) {
                int length = clsArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (clsArr[i10] == subscriberMethod.f12911c) {
                        a(obj, subscriberMethod, z10);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    public final void register(Object obj, String str) {
        a(obj, str, false);
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        a(obj, this.f12895i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        a(obj, str, false, cls, clsArr);
    }

    public final synchronized void unregister(Object obj) {
        List<Class<?>> list = this.f12891e.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                a(obj, it.next());
            }
            this.f12891e.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    private void a(Object obj, SubscriberMethod subscriberMethod, boolean z10) {
        Object obj2;
        this.f12900n = true;
        Class<?> cls = subscriberMethod.f12911c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f12890d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f12890d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> list = this.f12891e.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f12891e.put(obj, list);
        }
        list.add(cls);
        if (z10) {
            synchronized (this.f12892f) {
                obj2 = this.f12892f.get(cls);
            }
            if (obj2 != null) {
                a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public final synchronized void unregister(String str) {
        Map<String, Object> map = this.f12902p;
        if (map != null && map.containsKey(str)) {
            Object remove = this.f12902p.remove(str);
            List<Class<?>> list = this.f12891e.get(remove);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    a(remove, it.next());
                }
                this.f12891e.remove(remove);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + remove.getClass());
            }
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f12890d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                if (copyOnWriteArrayList.get(i10).a == obj) {
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    private void a(Subscription subscription, Object obj, boolean z10) {
        int i10 = AnonymousClass3.a[subscription.f12914b.f12910b.ordinal()];
        if (i10 == 1) {
            a(subscription, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                a(subscription, obj);
                return;
            } else {
                this.f12896j.a(subscription, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f12897k.enqueue(subscription, obj);
                return;
            } else {
                a(subscription, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f12898l.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f12914b.f12910b);
        }
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f12889c;
        synchronized (map) {
            List<Class<?>> list2 = map.get(cls);
            list = list2;
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    arrayList.add(cls2);
                    a(arrayList, cls2.getInterfaces());
                }
                f12889c.put(cls, arrayList);
                list = arrayList;
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
        Object obj = pendingPost.a;
        Subscription subscription = pendingPost.f12907b;
        PendingPost.a(pendingPost);
        a(subscription, obj);
    }

    private void a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f12914b.a.invoke(subscription.a, obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f12901o) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.a));
        }
    }
}
