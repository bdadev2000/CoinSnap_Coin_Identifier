package com.google.android.material.search;

import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements SearchBarAnimationHelper.OnLoadAnimationInvocation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28704a;

    public /* synthetic */ e(int i2) {
        this.f28704a = i2;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.f28704a) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                return;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                return;
        }
    }
}
