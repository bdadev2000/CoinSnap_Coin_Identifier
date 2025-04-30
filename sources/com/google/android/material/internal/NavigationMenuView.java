package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p.MenuC2533l;
import p.z;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p.z
    public final void c(MenuC2533l menuC2533l) {
    }
}
