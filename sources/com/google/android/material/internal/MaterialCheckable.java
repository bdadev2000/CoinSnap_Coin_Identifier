package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.MaterialCheckable;

@RestrictTo
/* loaded from: classes3.dex */
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    /* loaded from: classes3.dex */
    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c2, boolean z2);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener<T> onCheckedChangeListener);
}
