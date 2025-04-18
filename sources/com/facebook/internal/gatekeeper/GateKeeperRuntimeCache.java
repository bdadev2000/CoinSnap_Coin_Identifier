package com.facebook.internal.gatekeeper;

import com.facebook.FacebookSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class GateKeeperRuntimeCache {

    @NotNull
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, GateKeeper>> gateKeepers = new ConcurrentHashMap<>();

    public static /* synthetic */ List dumpGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.dumpGateKeepers(str);
    }

    public static /* synthetic */ GateKeeper getGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeper(str, str2);
    }

    public static /* synthetic */ boolean getGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeperValue(str, str2, z2);
    }

    public static /* synthetic */ void resetCache$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.resetCache(str);
    }

    public static /* synthetic */ void setGateKeeper$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, GateKeeper gateKeeper, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeper(str, gateKeeper);
    }

    public static /* synthetic */ void setGateKeeperValue$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeperValue(str, str2, z2);
    }

    public static /* synthetic */ void setGateKeepers$default(GateKeeperRuntimeCache gateKeeperRuntimeCache, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeepers(str, list);
    }

    @Nullable
    public final List<GateKeeper> dumpGateKeepers(@NotNull String str) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, GateKeeper>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    @Nullable
    public final GateKeeper getGateKeeper(@NotNull String str, @NotNull String str2) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        a.s(str2, "name");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(str2);
    }

    public final boolean getGateKeeperValue(@NotNull String str, @NotNull String str2, boolean z2) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        a.s(str2, "name");
        GateKeeper gateKeeper = getGateKeeper(str, str2);
        return gateKeeper == null ? z2 : gateKeeper.getValue();
    }

    public final void resetCache(@NotNull String str) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        this.gateKeepers.remove(str);
    }

    public final void setGateKeeper(@NotNull String str, @NotNull GateKeeper gateKeeper) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        a.s(gateKeeper, "gateKeeper");
        if (!this.gateKeepers.containsKey(str)) {
            this.gateKeepers.put(str, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = this.gateKeepers.get(str);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
    }

    public final void setGateKeeperValue(@NotNull String str, @NotNull String str2, boolean z2) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        a.s(str2, "name");
        setGateKeeper(str, new GateKeeper(str2, z2));
    }

    public final void setGateKeepers(@NotNull String str, @NotNull List<GateKeeper> list) {
        a.s(str, RemoteConfigConstants.RequestFieldKey.APP_ID);
        a.s(list, "gateKeeperList");
        ConcurrentHashMap<String, GateKeeper> concurrentHashMap = new ConcurrentHashMap<>();
        for (GateKeeper gateKeeper : list) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(str, concurrentHashMap);
    }
}
