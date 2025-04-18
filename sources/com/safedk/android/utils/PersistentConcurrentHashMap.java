package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Build;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoAndCountPair;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class PersistentConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30010a = "SafeDKCache";
    private static final String d = "PersistentConcurrentHashMap";

    /* renamed from: b, reason: collision with root package name */
    public String f30011b;

    /* renamed from: h, reason: collision with root package name */
    private LinkedHashSet<K> f30015h;
    private final String e = d();

    /* renamed from: f, reason: collision with root package name */
    private String f30013f = "";

    /* renamed from: g, reason: collision with root package name */
    private int f30014g = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30012c = true;

    public void a(String str) {
        this.f30013f += ImpressionLog.Q + str;
        Logger.d(d, "sdk_null_check added value " + str);
    }

    public String a() {
        return this.f30013f;
    }

    public PersistentConcurrentHashMap(String sharePrefsKey) {
        a(sharePrefsKey, -1);
    }

    public PersistentConcurrentHashMap(String sharePrefsKey, int capacityLimit) {
        a(sharePrefsKey, capacityLimit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0009, code lost:
    
        if (r4.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a(java.lang.String r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto Lb
            if (r4 == 0) goto L16
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
        Lb:
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "argument sharePrefsKey cannot be empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L16:
            r3.f30011b = r4     // Catch: java.lang.Throwable -> L13
            r3.f30014g = r5     // Catch: java.lang.Throwable -> L13
            r0 = -1
            if (r5 <= r0) goto L4c
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L13
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L13
            r3.f30015h = r0     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = ", capacity limit = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
        L4c:
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap instance created, filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
            r3.i()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.PersistentConcurrentHashMap.a(java.lang.String, int):void");
    }

    public PersistentConcurrentHashMap() {
    }

    public synchronized K b() {
        K k2;
        if (this.f30015h != null) {
            Iterator<K> it = this.f30015h.iterator();
            if (it.hasNext()) {
                k2 = it.next();
                Logger.d(d, "instance created, filename = " + f() + "getFirst returned key " + k2.toString());
            }
        }
        k2 = null;
        return k2;
    }

    private PersistentConcurrentHashMap(int initialCapacity) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(Map m2) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        Logger.v(d, "putAll started");
        for (K k2 : map.keySet()) {
            put(k2, map.get(k2));
            if (this.f30015h != null) {
                this.f30015h.add(k2);
            }
        }
        if (this.f30012c) {
            g();
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (keySet().contains(key)) {
            super.remove(key);
            if (this.f30015h != null) {
                this.f30015h.remove(key);
            }
            Logger.d(d, "put filename = " + f() + ", removed existing key " + key);
        }
        super.put(key, value);
        e();
        if (this.f30015h != null) {
            this.f30015h.add(key);
        }
        Logger.d(d, "put filename = " + f() + ", added key " + key);
        if (this.f30012c) {
            g();
        }
        return value;
    }

    private synchronized void e() {
        if (this.f30014g > -1 && size() > this.f30014g) {
            K b2 = b();
            if (b2 != null) {
                remove(b2);
                Logger.d(d, "removeOldestEntryIfNecessary filename = " + f() + ", removed key " + b2);
            } else {
                Logger.d(d, "removeOldestEntryIfNecessary filename = " + f() + ", first item is null");
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        V remove;
        remove = remove(key);
        if (this.f30015h != null) {
            this.f30015h.remove(key);
        }
        Logger.d(d, "remove filename = " + f() + ", removed key " + remove);
        return remove != null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        V v2;
        if (obj == null) {
            Logger.d(d, "remove filename = " + f() + ", key is null, skipping");
            v2 = null;
        } else {
            v2 = (V) super.remove(obj);
            if (this.f30015h != null) {
                this.f30015h.remove(obj);
            }
            Logger.v(d, "remove filename=" + f() + ", removed key " + obj);
            if (this.f30012c) {
                g();
            }
        }
        return v2;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean replace(K key, V oldValue, V newValue) {
        boolean replace;
        replace = super.replace(key, oldValue, newValue);
        Logger.d(d, "replace filename = " + f() + ", replace key " + key.toString());
        if (this.f30012c) {
            g();
        }
        return replace;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized V replace(K k2, V v2) {
        V v3;
        v3 = (V) super.replace(k2, v2);
        Logger.d(d, "replace filename = " + f() + ", replace key " + k2.toString());
        if (this.f30012c) {
            g();
        }
        return v3;
    }

    private String f() {
        return "SafeDKCache_" + this.f30011b;
    }

    public boolean c() {
        return this.f30012c;
    }

    public void a(boolean z2) {
        this.f30012c = z2;
        if (this.f30012c) {
            g();
        }
    }

    private synchronized void g() {
        Logger.d(d, "saveMap started, map key=" + f() + ", size before filtering=" + entrySet().size());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
            if (sharedPreferences != null) {
                String a2 = h.a(h());
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (sharedPreferences.contains(this.f30011b)) {
                    edit.remove(this.f30011b).apply();
                }
                edit.putString(this.f30011b, a2);
                edit.apply();
                Logger.v(d, "Map saved, key=" + f() + ", content length=" + (a2 != null ? Integer.valueOf(a2.length()) : "null"));
            } else {
                Logger.d(d, "saveMap cannot get share prefs object");
            }
        } catch (Exception e) {
            Logger.d(d, "Exception while saving map data", e);
        }
    }

    private ConcurrentHashMap<K, V> h() {
        Logger.d(d, "filtering items for saving started, key=" + this.f30011b + ", max items=" + SafeDK.getInstance().P());
        ConcurrentHashMap<K, V> concurrentHashMap = new ConcurrentHashMap<>();
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.size() <= SafeDK.getInstance().P()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (entry.getValue() instanceof CreativeInfo) {
                        if (a((CreativeInfo) entry.getValue())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                        CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                        if (creativeInfoAndCountPair != null && a(creativeInfoAndCountPair.a())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else {
                        concurrentHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        Logger.d(d, "filtering items for saving " + f() + " Filtered map contains " + concurrentHashMap.size());
        return concurrentHashMap;
    }

    private boolean a(CreativeInfo creativeInfo) {
        if (!SafeDK.getInstance().Q().contains(creativeInfo.Q())) {
            return false;
        }
        if (creativeInfo.Y() != null && creativeInfo.Y().before(new Timestamp(System.currentTimeMillis()))) {
            return false;
        }
        return true;
    }

    private void i() {
        Logger.d(d, "loadMap started, map key=" + f());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
            new ConcurrentHashMap();
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(this.f30011b, null);
                if (string != null) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h.a(string);
                    Logger.d(d, "loadMap (" + f() + ") content length = " + string.length() + ", concurrentHashMap size = " + concurrentHashMap.size());
                    this.f30012c = false;
                    for (Map.Entry<K, V> entry : concurrentHashMap.entrySet()) {
                        if (entry.getValue() instanceof CreativeInfo) {
                            CreativeInfo creativeInfo = (CreativeInfo) entry.getValue();
                            if (creativeInfo != null) {
                                Logger.d(d, "loadMap including item " + creativeInfo.L() + " ,AdType is " + creativeInfo.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                creativeInfo.a(ImpressionLog.f29253c, new ImpressionLog.a[0]);
                                creativeInfo.ac();
                                put(entry.getKey(), entry.getValue());
                                if (this.f30015h != null) {
                                    this.f30015h.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                            CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                            if (creativeInfoAndCountPair != null && creativeInfoAndCountPair.a() != null) {
                                CreativeInfo a2 = creativeInfoAndCountPair.a();
                                Logger.d(d, "loadMap including item " + a2.L() + " ,AdType is " + a2.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                a2.a(ImpressionLog.f29253c, new ImpressionLog.a[0]);
                                a2.ac();
                                put(entry.getKey(), entry.getValue());
                                if (this.f30015h != null) {
                                    this.f30015h.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof Boolean) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f30015h != null) {
                                this.f30015h.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof StatsEvent) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f30015h != null) {
                                this.f30015h.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof RedirectData) {
                            Logger.d(d, "loadMap item key: " + entry.getKey() + ", value: " + entry.getValue());
                            put(entry.getKey(), entry.getValue());
                            if (this.f30015h != null) {
                                this.f30015h.add(entry.getKey());
                            }
                        }
                    }
                } else {
                    Logger.d(d, "loadMap map is empty");
                }
                Logger.d(d, "loadMap loaded map " + f() + " : " + size() + " items");
            }
        } catch (InvalidClassException e) {
            Logger.d(d, "loadMap Exception loading Map from file : " + e.getMessage(), e);
            g();
        } catch (IllegalArgumentException e2) {
            Logger.d(d, "loadMap Data mismatch exception loading Map from file : " + e2.getMessage(), e2);
            g();
        } catch (Throwable th) {
            Logger.e(d, "loadMap Error loading Map from file", th);
            g();
        } finally {
            this.f30012c = true;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
        g();
    }

    public static String d() {
        try {
            String str = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod(Build.VERSION.SDK_INT >= 18 ? "currentProcessName" : "currentPackageName", new Class[0]).invoke(null, new Object[0]);
            Logger.d(d, "getProcessName : " + str);
            return str;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
