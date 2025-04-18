package com.google.android.material.search;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f28707b;

    public /* synthetic */ h(SearchView searchView, int i2) {
        this.f28706a = i2;
        this.f28707b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f28706a;
        SearchView searchView = this.f28707b;
        switch (i2) {
            case 0:
                SearchView.g(searchView, view);
                return;
            case 1:
                SearchView.c(searchView, view);
                return;
            default:
                SearchView.b(searchView, view);
                return;
        }
    }
}
