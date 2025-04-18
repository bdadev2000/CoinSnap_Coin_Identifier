package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes2.dex */
public final class SheetUtils {
    private SheetUtils() {
    }

    public static boolean isSwipeMostlyHorizontal(float f2, float f3) {
        return Math.abs(f2) > Math.abs(f3);
    }
}
