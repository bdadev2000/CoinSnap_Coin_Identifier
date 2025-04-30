package com.vungle.ads.internal.util;

import java.util.HashSet;

/* loaded from: classes3.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    public static final synchronized void addToSet(HashSet<String> hashSet, String str) {
        synchronized (i.class) {
            G7.j.e(hashSet, "hashset");
            G7.j.e(str, "set");
            hashSet.add(str);
        }
    }

    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        HashSet<String> hashSet2;
        synchronized (i.class) {
            hashSet2 = new HashSet<>(hashSet);
        }
        return hashSet2;
    }
}
