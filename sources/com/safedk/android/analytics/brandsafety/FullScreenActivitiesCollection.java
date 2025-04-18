package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class FullScreenActivitiesCollection extends ConcurrentHashMap<String, WeakReference<Activity>> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f29249b = "FullScreenActivitiesCollection";

    /* renamed from: a, reason: collision with root package name */
    Set<WeakReference<Activity>> f29250a = Collections.synchronizedSet(new LinkedHashSet());

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> put(@NonNull String str, @NonNull WeakReference<Activity> weakReference) {
        WeakReference<Activity> weakReference2;
        Logger.d(f29249b, "put activity = " + weakReference.get() + " activities : " + keySet());
        weakReference2 = (WeakReference) super.put(str, weakReference);
        if (weakReference2 != null) {
            this.f29250a.remove(weakReference2);
        }
        this.f29250a.add(weakReference);
        return weakReference2;
    }

    public synchronized Activity a(String str) {
        Activity activity;
        Logger.d(f29249b, "get by activity address, viewAddress = " + str);
        if (str == null) {
            Logger.d(f29249b, "get by activity address, view is null, exiting");
            activity = null;
        } else {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    activity = null;
                    break;
                }
                WeakReference<Activity> weakReference = get(it.next());
                Logger.d(f29249b, "get by activity address, activity address :  " + weakReference);
                if (weakReference != null && weakReference.get() != null && weakReference.get().toString().endsWith(str)) {
                    Logger.d(f29249b, "get by activity address, found by " + str);
                    activity = weakReference.get();
                    break;
                }
            }
        }
        return activity;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (String str : keySet()) {
            WeakReference weakReference = (WeakReference) get(str);
            sb.append(str).append(" - ").append((weakReference == null || weakReference.get() == null) ? "NA" : "alive");
        }
        return sb.toString();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized WeakReference<Activity> remove(@NonNull Object obj) {
        Logger.d(f29249b, "remove key = " + obj + " activities : " + keySet());
        this.f29250a.remove(get(obj));
        return (WeakReference) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        Logger.d(f29249b, "remove activity = " + value + " activities : " + keySet());
        this.f29250a.remove(value);
        return super.remove(key, value);
    }

    public synchronized WeakReference<Activity> b(String str) {
        WeakReference<Activity> weakReference;
        Logger.d(f29249b, "get activity ref by sdk , viewAddress = " + str);
        if (str == null) {
            Logger.d(f29249b, "get activity ref by sdk, sdk package is null, exiting");
            weakReference = null;
        } else {
            b();
            Iterator<WeakReference<Activity>> it = this.f29250a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    weakReference = null;
                    break;
                }
                weakReference = it.next();
                if (weakReference != null && weakReference.get() != null && SdksMapping.getSdkPackageByClass(weakReference.get().getClass().getName()).equals(str)) {
                    Logger.d(f29249b, "get activity ref by sdk, activity found :  " + weakReference.get().toString() + ", activity class name = " + weakReference.get().getClass().getName());
                    break;
                }
            }
        }
        return weakReference;
    }

    private synchronized void b() {
        Iterator<Map.Entry<String, WeakReference<Activity>>> it = entrySet().iterator();
        while (it.hasNext()) {
            WeakReference<Activity> value = it.next().getValue();
            if (value == null || value.get() == null) {
                this.f29250a.remove(value);
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("{ items: ").append(keySet()).append(", by order: [");
        Iterator<WeakReference<Activity>> it = this.f29250a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().get()).append(", ");
        }
        sb.append("] }");
        return sb.toString();
    }
}
