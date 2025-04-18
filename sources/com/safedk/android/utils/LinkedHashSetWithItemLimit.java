package com.safedk.android.utils;

import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class LinkedHashSetWithItemLimit<T> extends LinkedHashSet<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30008a = "LinkedHashSetWithItemLimit";

    /* renamed from: b, reason: collision with root package name */
    private long f30009b;

    public LinkedHashSetWithItemLimit(long maxSize) {
        this.f30009b = maxSize;
        Logger.d(f30008a, "LinkedHashSetWithItemLimit created. maxSize = " + maxSize);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T item) {
        Logger.d(f30008a, "LinkedHashSetWithItemLimit add started. item = " + item);
        if (size() >= this.f30009b) {
            a();
        }
        return super.add(item);
    }

    private void a() {
        if (size() > 0) {
            Object next = iterator().next();
            remove(next);
            Logger.d(f30008a, "LinkedHashSetWithItemLimit removeFirst . item = " + next);
        }
    }
}
