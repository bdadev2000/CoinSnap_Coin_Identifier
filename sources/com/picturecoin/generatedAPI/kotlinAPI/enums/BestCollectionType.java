package com.picturecoin.generatedAPI.kotlinAPI.enums;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BestCollectionType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MOST_VALUABLE", "MOST_ANCIENT", "RAREST", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class BestCollectionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BestCollectionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final BestCollectionType MOST_VALUABLE = new BestCollectionType("MOST_VALUABLE", 0, 1);
    public static final BestCollectionType MOST_ANCIENT = new BestCollectionType("MOST_ANCIENT", 1, 2);
    public static final BestCollectionType RAREST = new BestCollectionType("RAREST", 2, 3);

    private static final /* synthetic */ BestCollectionType[] $values() {
        return new BestCollectionType[]{MOST_VALUABLE, MOST_ANCIENT, RAREST};
    }

    public static EnumEntries<BestCollectionType> getEntries() {
        return $ENTRIES;
    }

    private BestCollectionType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        BestCollectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: BestCollectionType.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;", "value", "", "fromName", "name", "", "getJsonArrayMap", "", "array", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BestCollectionType fromValue(int value) {
            for (BestCollectionType bestCollectionType : BestCollectionType.values()) {
                if (bestCollectionType.getValue() == value) {
                    return bestCollectionType;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum BestCollectionType");
        }

        public final BestCollectionType fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (BestCollectionType bestCollectionType : BestCollectionType.values()) {
                if (Intrinsics.areEqual(bestCollectionType.name(), name)) {
                    return bestCollectionType;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum BestCollectionType");
        }

        public final List<Integer> getJsonArrayMap(List<? extends BestCollectionType> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((BestCollectionType) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }

    public static BestCollectionType valueOf(String str) {
        return (BestCollectionType) Enum.valueOf(BestCollectionType.class, str);
    }

    public static BestCollectionType[] values() {
        return (BestCollectionType[]) $VALUES.clone();
    }
}
