package com.glority.android.namecard.base.entity;

import kotlin.Metadata;

/* compiled from: SimpleTaxonomyType.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/glority/android/namecard/base/entity/SimpleTaxonomyType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "KINDOM", "PHYLUM", "CLASS", "ORDER", "FAMILY", "GENUS", "SPECIES", "SUBSPECIES", "VARIETY", "CULTIVAR", "DOG", "DISEASE", "PEST", "SYMPTOM", "ROCK", "TERM", "JEWELLERY", "TERMDOMAIN", "BREED", "DOGTYPE", "FOOD", "ROCKTYPE", "OTHER", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public enum SimpleTaxonomyType {
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

    private final int value;

    SimpleTaxonomyType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
