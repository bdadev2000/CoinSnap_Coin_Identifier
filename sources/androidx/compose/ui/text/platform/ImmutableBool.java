package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;

/* loaded from: classes2.dex */
final class ImmutableBool implements State<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17432a;

    public ImmutableBool(boolean z2) {
        this.f17432a = z2;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return Boolean.valueOf(this.f17432a);
    }
}
