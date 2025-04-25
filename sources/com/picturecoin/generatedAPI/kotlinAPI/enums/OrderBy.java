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
/* compiled from: OrderBy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/OrderBy;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASC", "DESC", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OrderBy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderBy[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final OrderBy ASC = new OrderBy("ASC", 0, 0);
    public static final OrderBy DESC = new OrderBy("DESC", 1, 1);

    private static final /* synthetic */ OrderBy[] $values() {
        return new OrderBy[]{ASC, DESC};
    }

    public static EnumEntries<OrderBy> getEntries() {
        return $ENTRIES;
    }

    private OrderBy(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        OrderBy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: OrderBy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/picturecoin/generatedAPI/kotlinAPI/enums/OrderBy$Companion;", "", "<init>", "()V", "fromValue", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/OrderBy;", "value", "", "fromName", "name", "", "getJsonArrayMap", "", "array", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderBy fromValue(int value) {
            for (OrderBy orderBy : OrderBy.values()) {
                if (orderBy.getValue() == value) {
                    return orderBy;
                }
            }
            for (OrderBy orderBy2 : OrderBy.values()) {
                if (orderBy2.getValue() == 0) {
                    return orderBy2;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum OrderBy");
        }

        public final OrderBy fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (OrderBy orderBy : OrderBy.values()) {
                if (Intrinsics.areEqual(orderBy.name(), name)) {
                    return orderBy;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum OrderBy");
        }

        public final List<Integer> getJsonArrayMap(List<? extends OrderBy> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((OrderBy) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }

    public static OrderBy valueOf(String str) {
        return (OrderBy) Enum.valueOf(OrderBy.class, str);
    }

    public static OrderBy[] values() {
        return (OrderBy[]) $VALUES.clone();
    }
}
