package com.glority.android.picturexx.s3;

import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/s3/ItemType;", "", Args.itemType, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getItemType", "()Ljava/lang/String;", "ITEM_CONSULTATION", "ITEM_NORMAL_SUPPORT", "ITEM_VIP_SUPPORT", "ITEM_ADD_COLLECTION_DETAIL", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ItemType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ItemType[] $VALUES;
    private final String itemType;
    public static final ItemType ITEM_CONSULTATION = new ItemType("ITEM_CONSULTATION", 0, "item_consultation");
    public static final ItemType ITEM_NORMAL_SUPPORT = new ItemType("ITEM_NORMAL_SUPPORT", 1, "item_normal_support");
    public static final ItemType ITEM_VIP_SUPPORT = new ItemType("ITEM_VIP_SUPPORT", 2, "item_vip_support");
    public static final ItemType ITEM_ADD_COLLECTION_DETAIL = new ItemType("ITEM_ADD_COLLECTION_DETAIL", 3, "item_add_collection_detail");

    private static final /* synthetic */ ItemType[] $values() {
        return new ItemType[]{ITEM_CONSULTATION, ITEM_NORMAL_SUPPORT, ITEM_VIP_SUPPORT, ITEM_ADD_COLLECTION_DETAIL};
    }

    public static EnumEntries<ItemType> getEntries() {
        return $ENTRIES;
    }

    private ItemType(String str, int i, String str2) {
        this.itemType = str2;
    }

    public final String getItemType() {
        return this.itemType;
    }

    static {
        ItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ItemType valueOf(String str) {
        return (ItemType) Enum.valueOf(ItemType.class, str);
    }

    public static ItemType[] values() {
        return (ItemType[]) $VALUES.clone();
    }
}
