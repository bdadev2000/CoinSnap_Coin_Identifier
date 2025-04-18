package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f16307a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.f16307a = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f16307a;
        return Boolean.valueOf(androidComposeViewAccessibilityDelegateCompat.f16267a.getParent().requestSendAccessibilityEvent(androidComposeViewAccessibilityDelegateCompat.f16267a, (AccessibilityEvent) obj));
    }
}
