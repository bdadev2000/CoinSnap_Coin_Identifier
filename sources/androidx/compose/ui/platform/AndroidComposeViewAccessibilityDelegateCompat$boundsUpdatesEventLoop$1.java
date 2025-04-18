package androidx.compose.ui.platform;

import androidx.collection.MutableIntSet;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2244, 2277}, m = "boundsUpdatesEventLoop$ui_release")
/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public AndroidComposeViewAccessibilityDelegateCompat f16301a;

    /* renamed from: b, reason: collision with root package name */
    public MutableIntSet f16302b;

    /* renamed from: c, reason: collision with root package name */
    public d1.a f16303c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f16304f;

    /* renamed from: g, reason: collision with root package name */
    public int f16305g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, h0.g gVar) {
        super(gVar);
        this.f16304f = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f16305g |= Integer.MIN_VALUE;
        return this.f16304f.c(this);
    }
}
