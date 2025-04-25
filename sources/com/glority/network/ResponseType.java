package com.glority.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheableApiServer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/glority/network/ResponseType;", "", "(Ljava/lang/String;I)V", "CACHE", "NETWORK", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class ResponseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseType[] $VALUES;
    public static final ResponseType CACHE = new ResponseType("CACHE", 0);
    public static final ResponseType NETWORK = new ResponseType("NETWORK", 1);

    private static final /* synthetic */ ResponseType[] $values() {
        return new ResponseType[]{CACHE, NETWORK};
    }

    public static EnumEntries<ResponseType> getEntries() {
        return $ENTRIES;
    }

    public static ResponseType valueOf(String str) {
        return (ResponseType) Enum.valueOf(ResponseType.class, str);
    }

    public static ResponseType[] values() {
        return (ResponseType[]) $VALUES.clone();
    }

    private ResponseType(String str, int i) {
    }

    static {
        ResponseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
