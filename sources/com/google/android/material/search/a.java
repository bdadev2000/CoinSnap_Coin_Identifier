package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements AccessibilityManagerCompat.TouchExplorationStateChangeListener, AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28695a;

    public /* synthetic */ a(Object obj) {
        this.f28695a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public final void onAnimationEnd() {
        ((Animator) this.f28695a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        WindowInsetsCompat lambda$setUpToolbarInsetListener$4;
        lambda$setUpToolbarInsetListener$4 = ((SearchView) this.f28695a).lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
        return lambda$setUpToolbarInsetListener$4;
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        ((SearchBar) this.f28695a).lambda$new$0(z2);
    }
}
