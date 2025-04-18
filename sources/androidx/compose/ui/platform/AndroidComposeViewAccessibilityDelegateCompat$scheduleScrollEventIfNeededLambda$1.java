package androidx.compose.ui.platform;

import androidx.collection.MutableIntList;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f16310a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.f16310a = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ScrollObservationScope scrollObservationScope = (ScrollObservationScope) obj;
        MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.K;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f16310a;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        if (scrollObservationScope.f16590b.contains(scrollObservationScope)) {
            androidComposeViewAccessibilityDelegateCompat.f16267a.getSnapshotObserver().b(scrollObservationScope, androidComposeViewAccessibilityDelegateCompat.J, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(androidComposeViewAccessibilityDelegateCompat, scrollObservationScope));
        }
        return b0.f30125a;
    }
}
