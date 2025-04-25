package com.glority.abtesting.generatedAPI.kotlinAPI.enums;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConditionOperator.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "EQUAL", "IN", "RANGE", "NOT_EQUAL", "GREATER_THAN", "GREATER_EQUAL", "LESS_THAN", "LESS_EQUAL", "INCLUDE_ANY", "INCLUDE_ALL", "NOT_INCLUDE_ANY", "NOT_INCLUDE_ALL", "Companion", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public enum ConditionOperator {
    EQUAL(0),
    IN(1),
    RANGE(2),
    NOT_EQUAL(3),
    GREATER_THAN(4),
    GREATER_EQUAL(5),
    LESS_THAN(6),
    LESS_EQUAL(7),
    INCLUDE_ANY(8),
    INCLUDE_ALL(9),
    NOT_INCLUDE_ANY(10),
    NOT_INCLUDE_ALL(11);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    ConditionOperator(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: ConditionOperator.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator$Companion;", "", "()V", "fromName", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/enums/ConditionOperator;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ConditionOperator fromValue(int value) {
            for (ConditionOperator conditionOperator : ConditionOperator.values()) {
                if (conditionOperator.getValue() == value) {
                    return conditionOperator;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum ConditionOperator");
        }

        public final ConditionOperator fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (ConditionOperator conditionOperator : ConditionOperator.values()) {
                if (Intrinsics.areEqual(conditionOperator.name(), name)) {
                    return conditionOperator;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum ConditionOperator");
        }

        public final List<Integer> getJsonArrayMap(List<? extends ConditionOperator> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ConditionOperator) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
