package com.google.android.material.textfield;

import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f28737b;

    public /* synthetic */ d(EndIconDelegate endIconDelegate, int i2) {
        this.f28736a = i2;
        this.f28737b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        int i2 = this.f28736a;
        EndIconDelegate endIconDelegate = this.f28737b;
        switch (i2) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$new$1(view, z2);
                return;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$new$1(view, z2);
                return;
        }
    }
}
