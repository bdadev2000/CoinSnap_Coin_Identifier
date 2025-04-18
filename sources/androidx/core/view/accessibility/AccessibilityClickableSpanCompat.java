package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes4.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f18822a;

    /* renamed from: b, reason: collision with root package name */
    public final AccessibilityNodeInfoCompat f18823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18824c;

    public AccessibilityClickableSpanCompat(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i3) {
        this.f18822a = i2;
        this.f18823b = accessibilityNodeInfoCompat;
        this.f18824c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f18822a);
        this.f18823b.f18826a.performAction(this.f18824c, bundle);
    }
}
