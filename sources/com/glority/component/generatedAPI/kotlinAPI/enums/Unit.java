package com.glority.component.generatedAPI.kotlinAPI.enums;

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
/* compiled from: Unit.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/Unit;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "KCAL", "MCG", "G", "MG", "IU", "ML", "KJ", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class Unit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Unit[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final Unit KCAL = new Unit("KCAL", 0, 0);
    public static final Unit MCG = new Unit("MCG", 1, 1);
    public static final Unit G = new Unit("G", 2, 2);
    public static final Unit MG = new Unit("MG", 3, 3);
    public static final Unit IU = new Unit("IU", 4, 4);
    public static final Unit ML = new Unit("ML", 5, 5);
    public static final Unit KJ = new Unit("KJ", 6, 6);

    private static final /* synthetic */ Unit[] $values() {
        return new Unit[]{KCAL, MCG, G, MG, IU, ML, KJ};
    }

    public static EnumEntries<Unit> getEntries() {
        return $ENTRIES;
    }

    private Unit(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Unit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Unit.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/Unit$Companion;", "", "<init>", "()V", "fromValue", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/Unit;", "value", "", "fromName", "name", "", "getJsonArrayMap", "", "array", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Unit fromValue(int value) {
            for (Unit unit : Unit.values()) {
                if (unit.getValue() == value) {
                    return unit;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum Unit");
        }

        public final Unit fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (Unit unit : Unit.values()) {
                if (Intrinsics.areEqual(unit.name(), name)) {
                    return unit;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum Unit");
        }

        public final List<Integer> getJsonArrayMap(List<? extends Unit> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Unit) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }

    public static Unit valueOf(String str) {
        return (Unit) Enum.valueOf(Unit.class, str);
    }

    public static Unit[] values() {
        return (Unit[]) $VALUES.clone();
    }
}
