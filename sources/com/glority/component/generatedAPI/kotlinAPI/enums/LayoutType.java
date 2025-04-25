package com.glority.component.generatedAPI.kotlinAPI.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NAME_TAGS", "CUSTOM", "SUB_PAGE", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public enum LayoutType {
    NAME_TAGS(0),
    CUSTOM(1),
    SUB_PAGE(2);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    LayoutType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: LayoutType.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType$Companion;", "", "()V", "fromName", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LayoutType;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LayoutType fromValue(int value) {
            LayoutType[] values = LayoutType.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                LayoutType layoutType = values[i];
                i++;
                if (layoutType.getValue() == value) {
                    return layoutType;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum LayoutType");
        }

        public final LayoutType fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LayoutType[] values = LayoutType.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                LayoutType layoutType = values[i];
                i++;
                if (Intrinsics.areEqual(layoutType.name(), name)) {
                    return layoutType;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum LayoutType");
        }

        public final List<Integer> getJsonArrayMap(List<? extends LayoutType> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((LayoutType) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
