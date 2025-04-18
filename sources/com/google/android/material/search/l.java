package com.google.android.material.search;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28715b;

    public /* synthetic */ l(Object obj, int i2) {
        this.f28714a = i2;
        this.f28715b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28714a;
        Object obj = this.f28715b;
        switch (i2) {
            case 0:
                SearchViewAnimationHelper.b((SearchViewAnimationHelper) obj);
                return;
            case 1:
                SearchViewAnimationHelper.e((SearchViewAnimationHelper) obj);
                return;
            default:
                SearchBar.q((SearchBar) obj);
                return;
        }
    }
}
