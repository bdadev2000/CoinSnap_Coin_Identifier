package org.koin.core.registry;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.mp.KoinPlatformTools;
import p0.a;

/* loaded from: classes4.dex */
public final class PropertyRegistry {

    @NotNull
    private final Koin _koin;

    @NotNull
    private final Map<String, Object> _values;

    public PropertyRegistry(@NotNull Koin koin) {
        a.s(koin, "_koin");
        this._koin = koin;
        this._values = KoinPlatformTools.INSTANCE.safeHashMap();
    }

    public final void close() {
        this._values.clear();
    }

    public final void deleteProperty(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        this._values.remove(str);
    }

    @Nullable
    public final <T> T getProperty(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        T t2 = (T) this._values.get(str);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @NotNull
    public final Koin get_koin$koin_core() {
        return this._koin;
    }

    public final void saveProperties(@NotNull Map<String, ? extends Object> map) {
        a.s(map, "properties");
        this._koin.getLogger().debug("load " + map.size() + " properties");
        this._values.putAll(map);
    }

    public final <T> void saveProperty$koin_core(@NotNull String str, @NotNull T t2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(t2, "value");
        this._values.put(str, t2);
    }
}
