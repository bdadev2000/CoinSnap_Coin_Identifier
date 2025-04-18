package com.google.android.material.textfield;

import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f28735b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i2) {
        this.f28734a = i2;
        this.f28735b = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f28734a;
        EndIconDelegate endIconDelegate = this.f28735b;
        switch (i2) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$new$0(view);
                return;
            case 1:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$new$0(view);
                return;
            default:
                PasswordToggleEndIconDelegate.a((PasswordToggleEndIconDelegate) endIconDelegate, view);
                return;
        }
    }
}
