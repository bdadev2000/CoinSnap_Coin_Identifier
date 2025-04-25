package com.glority.android.picturexx.definition;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CollectionSortType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/definition/CollectionSortType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RELEASE_YEAR", "PRICE", "COLLECTION_DATE_ADDED", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionSortType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CollectionSortType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CollectionSortType RELEASE_YEAR = new CollectionSortType("RELEASE_YEAR", 0, 0);
    public static final CollectionSortType PRICE = new CollectionSortType("PRICE", 1, 1);
    public static final CollectionSortType COLLECTION_DATE_ADDED = new CollectionSortType("COLLECTION_DATE_ADDED", 2, 2);

    private static final /* synthetic */ CollectionSortType[] $values() {
        return new CollectionSortType[]{RELEASE_YEAR, PRICE, COLLECTION_DATE_ADDED};
    }

    public static EnumEntries<CollectionSortType> getEntries() {
        return $ENTRIES;
    }

    private CollectionSortType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CollectionSortType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CollectionSortType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/definition/CollectionSortType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/glority/android/picturexx/definition/CollectionSortType;", "value", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CollectionSortType fromValue(int value) {
            CollectionSortType collectionSortType;
            CollectionSortType[] values = CollectionSortType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    collectionSortType = null;
                    break;
                }
                collectionSortType = values[i];
                if (collectionSortType.getValue() == value) {
                    break;
                }
                i++;
            }
            return collectionSortType == null ? CollectionSortType.RELEASE_YEAR : collectionSortType;
        }
    }

    public static CollectionSortType valueOf(String str) {
        return (CollectionSortType) Enum.valueOf(CollectionSortType.class, str);
    }

    public static CollectionSortType[] values() {
        return (CollectionSortType[]) $VALUES.clone();
    }
}
