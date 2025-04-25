package com.glority.android.picturexx.view.me;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeCollectionSummaryFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/view/me/SummarySectionType;", "", "logTag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLogTag", "()Ljava/lang/String;", "MELT_PRICE", "BEST_VARIETIES", "GEOGRAPHIC_DISTRIBUTION", "BEST_OFFICIAL_SET", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SummarySectionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SummarySectionType[] $VALUES;
    private final String logTag;
    public static final SummarySectionType MELT_PRICE = new SummarySectionType("MELT_PRICE", 0, "meltprice");
    public static final SummarySectionType BEST_VARIETIES = new SummarySectionType("BEST_VARIETIES", 1, "bestvarieties");
    public static final SummarySectionType GEOGRAPHIC_DISTRIBUTION = new SummarySectionType("GEOGRAPHIC_DISTRIBUTION", 2, "geodistribution");
    public static final SummarySectionType BEST_OFFICIAL_SET = new SummarySectionType("BEST_OFFICIAL_SET", 3, "bestofficial");

    private static final /* synthetic */ SummarySectionType[] $values() {
        return new SummarySectionType[]{MELT_PRICE, BEST_VARIETIES, GEOGRAPHIC_DISTRIBUTION, BEST_OFFICIAL_SET};
    }

    public static EnumEntries<SummarySectionType> getEntries() {
        return $ENTRIES;
    }

    private SummarySectionType(String str, int i, String str2) {
        this.logTag = str2;
    }

    public final String getLogTag() {
        return this.logTag;
    }

    static {
        SummarySectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SummarySectionType valueOf(String str) {
        return (SummarySectionType) Enum.valueOf(SummarySectionType.class, str);
    }

    public static SummarySectionType[] values() {
        return (SummarySectionType[]) $VALUES.clone();
    }
}
