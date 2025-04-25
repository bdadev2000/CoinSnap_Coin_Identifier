package com.glority.trackingconfig.generatedAPI.kotlinAPI.enums;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParamsType.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "STRING", "INT", "FLOAT", "DOUBLE", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public enum ParamsType {
    STRING(0),
    INT(1),
    FLOAT(2),
    DOUBLE(3);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    ParamsType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: ParamsType.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType$Companion;", "", "()V", "fromName", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/ParamsType;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ParamsType fromValue(int value) {
            for (ParamsType paramsType : ParamsType.values()) {
                if (paramsType.getValue() == value) {
                    return paramsType;
                }
            }
            for (ParamsType paramsType2 : ParamsType.values()) {
                if (paramsType2.getValue() == 0) {
                    return paramsType2;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum ParamsType");
        }

        public final ParamsType fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (ParamsType paramsType : ParamsType.values()) {
                if (Intrinsics.areEqual(paramsType.name(), name)) {
                    return paramsType;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum ParamsType");
        }

        public final List<Integer> getJsonArrayMap(List<? extends ParamsType> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ParamsType) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
