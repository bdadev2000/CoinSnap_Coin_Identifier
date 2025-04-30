package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum SemanticLabel {
    UNLABELED(0),
    SKY(1),
    BUILDING(2),
    TREE(3),
    ROAD(4),
    SIDEWALK(5),
    TERRAIN(6),
    STRUCTURE(7),
    OBJECT(8),
    VEHICLE(9),
    PERSON(10),
    WATER(11);

    final int nativeCode;

    SemanticLabel(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static SemanticLabel forNumber(int i9) {
        for (SemanticLabel semanticLabel : values()) {
            if (semanticLabel.nativeCode == i9) {
                return semanticLabel;
            }
        }
        throw new FatalException(A.a("Unexpected value for native SemanticLabel, value=", (byte) 49, i9));
    }
}
