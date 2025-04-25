package com.glority.component.generatedAPI.kotlinAPI.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxonomyType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "KINDOM", "PHYLUM", "CLASS", "ORDER", "FAMILY", "GENUS", "SPECIES", "SUBSPECIES", "VARIETY", "CULTIVAR", "DOG", "DISEASE", "PEST", "SYMPTOM", "ROCK", "TERM", "JEWELLERY", "TERMDOMAIN", "BREED", "DOGTYPE", "FOOD", "ROCKTYPE", "OTHER", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public enum TaxonomyType {
    KINDOM(0),
    PHYLUM(1),
    CLASS(2),
    ORDER(3),
    FAMILY(4),
    GENUS(5),
    SPECIES(6),
    SUBSPECIES(7),
    VARIETY(8),
    CULTIVAR(9),
    DOG(10),
    DISEASE(11),
    PEST(12),
    SYMPTOM(13),
    ROCK(14),
    TERM(15),
    JEWELLERY(16),
    TERMDOMAIN(17),
    BREED(18),
    DOGTYPE(19),
    FOOD(20),
    ROCKTYPE(21),
    OTHER(22);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    TaxonomyType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: TaxonomyType.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType$Companion;", "", "()V", "fromName", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/TaxonomyType;", "name", "", "fromValue", "value", "", "getJsonArrayMap", "", "array", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TaxonomyType fromValue(int value) {
            TaxonomyType[] values = TaxonomyType.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                TaxonomyType taxonomyType = values[i];
                i++;
                if (taxonomyType.getValue() == value) {
                    return taxonomyType;
                }
            }
            throw new ParameterCheckFailException("incorrect value " + value + " for enum TaxonomyType");
        }

        public final TaxonomyType fromName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            TaxonomyType[] values = TaxonomyType.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                TaxonomyType taxonomyType = values[i];
                i++;
                if (Intrinsics.areEqual(taxonomyType.name(), name)) {
                    return taxonomyType;
                }
            }
            throw new ParameterCheckFailException("incorrect name " + name + " for enum TaxonomyType");
        }

        public final List<Integer> getJsonArrayMap(List<? extends TaxonomyType> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((TaxonomyType) it.next()).getValue()));
                }
            }
            return arrayList;
        }
    }
}
