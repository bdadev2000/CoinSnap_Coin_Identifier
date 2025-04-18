package com.vungle.ads.internal.util;

import java.util.HashSet;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {
    public static final i INSTANCE = new i();

    private i() {
    }

    @JvmStatic
    public static final synchronized void addToSet(HashSet<String> hashset, String set) {
        synchronized (i.class) {
            Intrinsics.checkNotNullParameter(hashset, "hashset");
            Intrinsics.checkNotNullParameter(set, "set");
            hashset.add(set);
        }
    }

    @JvmStatic
    public static final synchronized HashSet<String> getNewHashSet(HashSet<String> hashSet) {
        HashSet<String> hashSet2;
        synchronized (i.class) {
            hashSet2 = new HashSet<>(hashSet);
        }
        return hashSet2;
    }
}
