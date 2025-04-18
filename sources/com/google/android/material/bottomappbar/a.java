package com.google.android.material.bottomappbar;

import android.view.View;
import com.google.android.material.datepicker.DateSelector;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f28658b;

    public /* synthetic */ a(View view, int i2) {
        this.f28657a = i2;
        this.f28658b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28657a;
        View view = this.f28658b;
        switch (i2) {
            case 0:
                BottomAppBar.p(view);
                return;
            default:
                DateSelector.a(view);
                return;
        }
    }
}
