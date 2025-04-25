package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/network/RequestType;", "", "(Ljava/lang/String;I)V", "CACHE_ELSE_NETWORK", "CACHE_THEN_NETWORK", "NETWORK_ELSE_CACHE", "NETWORK_ONLY", "CACHE_ONLY", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class RequestType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RequestType[] $VALUES;
    public static final RequestType CACHE_ELSE_NETWORK = new RequestType("CACHE_ELSE_NETWORK", 0);
    public static final RequestType CACHE_THEN_NETWORK = new RequestType("CACHE_THEN_NETWORK", 1);
    public static final RequestType NETWORK_ELSE_CACHE = new RequestType("NETWORK_ELSE_CACHE", 2);
    public static final RequestType NETWORK_ONLY = new RequestType("NETWORK_ONLY", 3);
    public static final RequestType CACHE_ONLY = new RequestType("CACHE_ONLY", 4);

    private static final /* synthetic */ RequestType[] $values() {
        return new RequestType[]{CACHE_ELSE_NETWORK, CACHE_THEN_NETWORK, NETWORK_ELSE_CACHE, NETWORK_ONLY, CACHE_ONLY};
    }

    public static EnumEntries<RequestType> getEntries() {
        return $ENTRIES;
    }

    public static RequestType valueOf(String str) {
        return (RequestType) Enum.valueOf(RequestType.class, str);
    }

    public static RequestType[] values() {
        return (RequestType[]) $VALUES.clone();
    }

    private RequestType(String str, int i) {
    }

    static {
        RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
