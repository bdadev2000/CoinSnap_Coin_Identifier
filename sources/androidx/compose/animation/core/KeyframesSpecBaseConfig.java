package androidx.compose.animation.core;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.animation.core.KeyframeBaseEntity;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends KeyframeBaseEntity<T>> {

    /* renamed from: a, reason: collision with root package name */
    public int f2132a = 300;

    /* renamed from: b, reason: collision with root package name */
    public final MutableIntObjectMap f2133b;

    public KeyframesSpecBaseConfig() {
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        this.f2133b = new MutableIntObjectMap();
    }
}
