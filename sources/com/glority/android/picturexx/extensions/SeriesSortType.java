package com.glority.android.picturexx.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SeriesItemListExt.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/glority/android/picturexx/extensions/SeriesSortType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DATE_UPDATE", "COLLECTION_PROGRESS", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class SeriesSortType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SeriesSortType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final SeriesSortType DATE_UPDATE = new SeriesSortType("DATE_UPDATE", 0, 0);
    public static final SeriesSortType COLLECTION_PROGRESS = new SeriesSortType("COLLECTION_PROGRESS", 1, 1);

    private static final /* synthetic */ SeriesSortType[] $values() {
        return new SeriesSortType[]{DATE_UPDATE, COLLECTION_PROGRESS};
    }

    @JvmStatic
    public static final SeriesSortType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SeriesSortType> getEntries() {
        return $ENTRIES;
    }

    private SeriesSortType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        SeriesSortType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: SeriesItemListExt.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/extensions/SeriesSortType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/glority/android/picturexx/extensions/SeriesSortType;", "value", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SeriesSortType fromValue(int value) {
            SeriesSortType seriesSortType;
            SeriesSortType[] values = SeriesSortType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    seriesSortType = null;
                    break;
                }
                seriesSortType = values[i];
                if (seriesSortType.getValue() == value) {
                    break;
                }
                i++;
            }
            return seriesSortType == null ? SeriesSortType.DATE_UPDATE : seriesSortType;
        }
    }

    public static SeriesSortType valueOf(String str) {
        return (SeriesSortType) Enum.valueOf(SeriesSortType.class, str);
    }

    public static SeriesSortType[] values() {
        return (SeriesSortType[]) $VALUES.clone();
    }
}
