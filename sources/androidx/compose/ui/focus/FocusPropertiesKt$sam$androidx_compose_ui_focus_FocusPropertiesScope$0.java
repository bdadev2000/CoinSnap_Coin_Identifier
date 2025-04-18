package androidx.compose.ui.focus;

import d0.c;
import kotlin.jvm.internal.l;
import p0.a;

/* loaded from: classes3.dex */
public final class FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 implements FocusPropertiesScope, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.l f14870a = FocusOwnerImpl$modifier$1.f14853a;

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public final /* synthetic */ void a(FocusProperties focusProperties) {
        this.f14870a.invoke(focusProperties);
    }

    @Override // kotlin.jvm.internal.l
    public final c c() {
        return this.f14870a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FocusPropertiesScope) || !(obj instanceof l)) {
            return false;
        }
        return a.g(this.f14870a, ((l) obj).c());
    }

    public final int hashCode() {
        return this.f14870a.hashCode();
    }
}
