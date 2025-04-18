package com.safedk.android.utils;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30005a = 15;

    /* renamed from: b, reason: collision with root package name */
    private static final String f30006b = "LimitedConcurrentHashMap";

    /* renamed from: c, reason: collision with root package name */
    private int f30007c;
    private final ArrayDeque<K> d;

    public LimitedConcurrentHashMap() {
        this(15);
    }

    public LimitedConcurrentHashMap(int maxSize) {
        this.f30007c = -1;
        this.d = new ArrayDeque<>();
        if (maxSize > 0) {
            this.f30007c = maxSize;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (containsKey(key)) {
            this.d.remove(key);
            this.d.addLast(key);
            super.put(key, value);
        } else {
            if (this.f30007c > 0 && this.d.size() > 0 && size() == this.f30007c) {
                super.remove(this.d.removeFirst());
            }
            this.d.addLast(key);
            super.put(key, value);
        }
        return value;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        this.d.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        this.d.remove(key);
        return super.remove(key, value);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        return "LimitedConcurrentHashMap size=" + size() + " map is: " + super.toString();
    }

    @Override // java.util.AbstractMap
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LimitedConcurrentHashMap<K, V> clone() {
        LimitedConcurrentHashMap<K, V> limitedConcurrentHashMap = new LimitedConcurrentHashMap<>(this.f30007c);
        limitedConcurrentHashMap.putAll(this);
        return limitedConcurrentHashMap;
    }
}
