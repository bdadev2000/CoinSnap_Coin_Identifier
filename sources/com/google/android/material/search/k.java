package com.google.android.material.search;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f28713b;

    public /* synthetic */ k(SearchView searchView, int i2) {
        this.f28712a = i2;
        this.f28713b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28712a;
        SearchView searchView = this.f28713b;
        switch (i2) {
            case 0:
                SearchView.d(searchView);
                return;
            case 1:
                searchView.show();
                return;
            case 2:
                SearchView.h(searchView);
                return;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                return;
        }
    }
}
