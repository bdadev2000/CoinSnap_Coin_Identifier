package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface SheetCallback {
    void onSlide(@NonNull View view, float f2);

    void onStateChanged(@NonNull View view, int i2);
}
