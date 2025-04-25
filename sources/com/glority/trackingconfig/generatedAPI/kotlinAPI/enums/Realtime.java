package com.glority.trackingconfig.generatedAPI.kotlinAPI.enums;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Realtime.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/Realtime;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FALSE", "TRUE", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public enum Realtime {
    FALSE(0),
    TRUE(1);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    Realtime(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: Realtime.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/Realtime$Companion;", "", "()V", "fromName", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/enums/Realtime;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Realtime fromValue(int value) {
            for (Realtime realtime : Realtime.values()) {
                if (realtime.getValue() == value) {
                    return realtime;
                }
            }
            for (Realtime realtime2 : Realtime.values()) {
                if (realtime2.getValue() == 0) {
                    return realtime2;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum Realtime");
        }

        public final Realtime fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (Realtime realtime : Realtime.values()) {
                if (Intrinsics.areEqual(realtime.name(), name)) {
                    return realtime;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum Realtime");
        }

        public final List<Integer> getJsonArrayMap(List<? extends Realtime> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Realtime) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
