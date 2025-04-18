package androidx.fragment.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class w1 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f1734c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(int i10, Fragment fragment) {
        super(0);
        this.f1733b = i10;
        this.f1734c = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f1733b;
        Fragment fragment = this.f1734c;
        switch (i10) {
            case 0:
                androidx.lifecycle.a1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            case 1:
            case 2:
            case 3:
                return fragment;
            default:
                return fragment;
        }
    }
}
