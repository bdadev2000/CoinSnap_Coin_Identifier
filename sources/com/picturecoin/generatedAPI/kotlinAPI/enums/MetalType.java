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
/* compiled from: MetalType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/MetalType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "GOLD", "SILVER", "PLATINUM", "PALLADIUM", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MetalType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetalType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final MetalType UNKNOWN = new MetalType("UNKNOWN", 0, 0);
    public static final MetalType GOLD = new MetalType("GOLD", 1, 1);
    public static final MetalType SILVER = new MetalType("SILVER", 2, 2);
    public static final MetalType PLATINUM = new MetalType("PLATINUM", 3, 3);
    public static final MetalType PALLADIUM = new MetalType("PALLADIUM", 4, 4);

    private static final /* synthetic */ MetalType[] $values() {
        return new MetalType[]{UNKNOWN, GOLD, SILVER, PLATINUM, PALLADIUM};
    }

    public static EnumEntries<MetalType> getEntries() {
        return $ENTRIES;
    }

    private MetalType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MetalType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MetalType.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/MetalType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/MetalType;", "value", "", "fromName", "name", "", "getJsonArrayMap", "", "array", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MetalType fromValue(int value) {
            for (MetalType metalType : MetalType.values()) {
                if (metalType.getValue() == value) {
                    return metalType;
                }
            }
            for (MetalType metalType2 : MetalType.values()) {
                if (metalType2.getValue() == 0) {
                    return metalType2;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum MetalType");
        }

        public final MetalType fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (MetalType metalType : MetalType.values()) {
                if (Intrinsics.areEqual(metalType.name(), name)) {
                    return metalType;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum MetalType");
        }

        public final List<Integer> getJsonArrayMap(List<? extends MetalType> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((MetalType) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }

    public static MetalType valueOf(String str) {
        return (MetalType) Enum.valueOf(MetalType.class, str);
    }

    public static MetalType[] values() {
        return (MetalType[]) $VALUES.clone();
    }
}
