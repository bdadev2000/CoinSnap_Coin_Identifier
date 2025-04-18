package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FocusPropertiesImpl implements FocusProperties {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14859a;

    /* renamed from: b, reason: collision with root package name */
    public FocusRequester f14860b;

    /* renamed from: c, reason: collision with root package name */
    public FocusRequester f14861c;
    public FocusRequester d;
    public FocusRequester e;

    /* renamed from: f, reason: collision with root package name */
    public FocusRequester f14862f;

    /* renamed from: g, reason: collision with root package name */
    public FocusRequester f14863g;

    /* renamed from: h, reason: collision with root package name */
    public FocusRequester f14864h;

    /* renamed from: i, reason: collision with root package name */
    public FocusRequester f14865i;

    /* renamed from: j, reason: collision with root package name */
    public l f14866j;

    /* renamed from: k, reason: collision with root package name */
    public l f14867k;

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void a(l lVar) {
        this.f14866j = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void b(boolean z2) {
        this.f14859a = z2;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean c() {
        return this.f14859a;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void d(l lVar) {
        this.f14867k = lVar;
    }
}
