package com.glority.android.picturexx.payment.skumanager.internal;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VirtualSkuMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/payment/skumanager/internal/VirtualSkuMapper;", "", "<init>", "()V", "virtualSkuMap", "", "", "getVirtualSkuMap", "()Ljava/util/Map;", "setVirtualSkuMap", "(Ljava/util/Map;)V", "mapSku", "unconfirmedSku", "purchase_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class VirtualSkuMapper {
    public static final VirtualSkuMapper INSTANCE = new VirtualSkuMapper();
    private static Map<String, String> virtualSkuMap = MapsKt.emptyMap();

    private VirtualSkuMapper() {
    }

    public final Map<String, String> getVirtualSkuMap() {
        return virtualSkuMap;
    }

    public final void setVirtualSkuMap(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        virtualSkuMap = map;
    }

    public final String mapSku(String unconfirmedSku) {
        Intrinsics.checkNotNullParameter(unconfirmedSku, "unconfirmedSku");
        if (ActualSkuManager.INSTANCE.isActualSku(unconfirmedSku)) {
            return unconfirmedSku;
        }
        String str = virtualSkuMap.get(unconfirmedSku);
        String str2 = str;
        if (str2 != null && str2.length() != 0) {
            return str;
        }
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage") || Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "dev")) {
            throw new Exception("virtual sku:" + unconfirmedSku + " can't find actual sku");
        }
        new SendErrorEventRequest(unconfirmedSku, "virtual sku:" + unconfirmedSku + " can't find actual sku").post();
        return unconfirmedSku;
    }
}
