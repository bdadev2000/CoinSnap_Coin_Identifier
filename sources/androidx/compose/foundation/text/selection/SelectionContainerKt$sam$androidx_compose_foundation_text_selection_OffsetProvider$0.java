package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import d0.c;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 implements OffsetProvider, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f7127a;

    public SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(q0.a aVar) {
        this.f7127a = aVar;
    }

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    public final /* synthetic */ long a() {
        return ((Offset) this.f7127a.invoke()).f14913a;
    }

    @Override // kotlin.jvm.internal.l
    public final c c() {
        return this.f7127a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OffsetProvider) || !(obj instanceof l)) {
            return false;
        }
        return p0.a.g(this.f7127a, ((l) obj).c());
    }

    public final int hashCode() {
        return this.f7127a.hashCode();
    }
}
