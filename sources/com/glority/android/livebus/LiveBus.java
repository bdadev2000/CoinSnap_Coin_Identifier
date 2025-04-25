package com.glority.android.livebus;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.xx.constants.LogEvents;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveBus.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0086\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u001a\u0010\u0015\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011R-\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/glority/android/livebus/LiveBus;", "", "()V", "map", "", "", "Lcom/glority/android/livebus/EventLiveData;", "getMap", "()Ljava/util/Map;", "map$delegate", "Lkotlin/Lazy;", "clear", "", "containsKey", "", ExifInterface.GPS_DIRECTION_TRUE, "keyRef", "Lcom/glority/android/livebus/KeyRef;", LogEvents.exportemptyalert_close_click_type_get, "Landroidx/lifecycle/MutableLiveData;", "key", "remove", "livebus_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class LiveBus {
    public static final LiveBus INSTANCE = new LiveBus();

    /* renamed from: map$delegate, reason: from kotlin metadata */
    private static final Lazy map = LazyKt.lazy(new Function0<ConcurrentHashMap<String, EventLiveData<Object>>>() { // from class: com.glority.android.livebus.LiveBus$map$2
        @Override // kotlin.jvm.functions.Function0
        public final ConcurrentHashMap<String, EventLiveData<Object>> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    private LiveBus() {
    }

    private final Map<String, EventLiveData<Object>> getMap() {
        return (Map) map.getValue();
    }

    private final <T> MutableLiveData<T> get(String key) {
        if (!getMap().containsKey(key)) {
            getMap().put(key, new EventLiveData<>());
        }
        EventLiveData<Object> eventLiveData = getMap().get(key);
        Intrinsics.checkNotNull(eventLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of com.glority.android.livebus.LiveBus.get>");
        return eventLiveData;
    }

    public final <T> MutableLiveData<T> get(KeyRef<T> keyRef) {
        Intrinsics.checkNotNullParameter(keyRef, "keyRef");
        return get(keyRef.getKey());
    }

    public final <T> void remove(KeyRef<T> keyRef) {
        Intrinsics.checkNotNullParameter(keyRef, "keyRef");
        getMap().remove(keyRef.getKey());
    }

    public final void clear() {
        getMap().clear();
    }

    public final <T> boolean containsKey(KeyRef<T> keyRef) {
        Intrinsics.checkNotNullParameter(keyRef, "keyRef");
        return getMap().containsKey(keyRef.getKey());
    }
}
