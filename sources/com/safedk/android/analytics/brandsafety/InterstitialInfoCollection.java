package com.safedk.android.analytics.brandsafety;

import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class InterstitialInfoCollection extends ConcurrentHashMap<String, n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29310a = "InterstitialInfoCollection";

    public List<n> a(String str) {
        Logger.d(f29310a, "get items by sdk package started, sdk: " + str);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (String str2 : keySet()) {
                n nVar = (n) get(str2);
                Logger.d(f29310a, "get items by sdk package, key: " + str2);
                if (nVar != null && !nVar.U && nVar.c() != null && nVar.c().equals(str)) {
                    Logger.d(f29310a, "get items by sdk package, adding " + nVar);
                    arrayList.add(nVar);
                }
            }
        }
        return arrayList;
    }

    public n a(String str, boolean z2) {
        Logger.d(f29310a, "get by view address, viewAddress = " + str);
        if (str == null) {
            Logger.d(f29310a, "get by view address, view is null, exiting");
            return null;
        }
        if (str.contains("@")) {
            str = str.substring(str.indexOf(64) + 1);
            Logger.d(f29310a, "get by view address, viewAddress cut to " + str);
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (it.hasNext()) {
                n nVar = get(it.next());
                if (nVar != null) {
                    if (z2 && nVar.U) {
                        Logger.d(f29310a, "get by view address - skipping ad that was already finished with event id - " + nVar.w());
                    } else {
                        Logger.d(f29310a, "get by view address, searching by viewAddress " + str + ", view hierarchy : " + nVar.x());
                        if (nVar.K != null && nVar.K.equals(str)) {
                            Logger.d(f29310a, "get by view address, found. viewAddress = " + str + " with event id: " + nVar.w());
                            return nVar;
                        }
                        if (nVar.x() != null && nVar.x().contains(str)) {
                            Logger.d(f29310a, "get by view address, found in views hierarchy . viewAddress = " + str + " with event id: " + nVar.w());
                            return nVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    public n b(String str) {
        n nVar;
        Logger.d(f29310a, "get by activity address, viewAddress = " + str);
        if (str == null) {
            Logger.d(f29310a, "get by activity address, view is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                }
                nVar = get(it.next());
                if (nVar != null && nVar.ac != null && nVar.ac.endsWith(str)) {
                    Logger.d(f29310a, "get by activity address, found by " + nVar.ac);
                    break;
                }
            }
        }
        return nVar;
    }

    public boolean c(String str) {
        boolean z2;
        Logger.d(f29310a, "contains activity address, viewAddress = " + str + ", keys = " + keySet());
        if (str == null) {
            Logger.d(f29310a, "contains activity address, view is null, exiting");
            return false;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                n nVar = get(it.next());
                if (nVar != null && nVar.ac != null && nVar.ac.endsWith(str)) {
                    Logger.d(f29310a, "contains activity address, found by " + nVar.ac);
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }

    public n d(String str) {
        if (str == null) {
            Logger.d(f29310a, "get by eventId, eventId is null, exiting");
            return null;
        }
        if (!containsKey(str)) {
            return null;
        }
        Logger.d(f29310a, "get by eventId, found by eventId " + str);
        return get(str);
    }

    public n e(String str) {
        n nVar;
        if (str == null) {
            Logger.d(f29310a, "get by adId, adId is null, exiting");
            return null;
        }
        synchronized (this) {
            Iterator<String> it = keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    nVar = null;
                    break;
                }
                nVar = get(it.next());
                if (nVar != null && nVar.i() != null && nVar.i().L().equals(str)) {
                    Logger.d(f29310a, "get by adId, found by adid " + str);
                    break;
                }
            }
        }
        return nVar;
    }

    public boolean a() {
        Iterator<n> it = values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            z2 = z2 && it.next().an;
        }
        return z2;
    }

    public String b() {
        HashSet hashSet = new HashSet();
        synchronized (this) {
            Iterator<n> it = values().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c());
            }
        }
        return hashSet.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(boolean z2) {
        int i2 = 0;
        if (!z2) {
            return size();
        }
        synchronized (this) {
            Iterator<n> it = values().iterator();
            while (it.hasNext()) {
                n next = it.next();
                i2 = (next == null || next.am != null) ? i2 : i2 + 1;
            }
        }
        return i2;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        return -1;
    }

    public synchronized List<n> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (n nVar : values()) {
            if (nVar != null && nVar.am == null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InterstitialInfoCollection : ");
        synchronized (this) {
            for (n nVar : values()) {
                sb.append("[ ");
                if (nVar != null) {
                    if (nVar.f29388v != null) {
                        sb.append("maxSdk=").append(nVar.f29388v);
                    }
                    if (nVar.L != null) {
                        sb.append(",eventId=").append(nVar.L);
                    }
                    if (nVar.am != null && nVar.am.get() != null) {
                        sb.append(",interstitialActivity=").append(nVar.am.get().toString());
                    }
                    if (nVar.K != null) {
                        sb.append(",viewAddress=").append(nVar.K);
                    }
                    sb.append(",isAdFinished=").append(nVar.U);
                }
                sb.append(" ] ");
            }
        }
        return sb.toString();
    }
}
