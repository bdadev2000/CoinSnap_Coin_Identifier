package androidx.compose.foundation;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MagnifierNode$applySemantics$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MagnifierNode f2780a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$applySemantics$1(MagnifierNode magnifierNode) {
        super(0);
        this.f2780a = magnifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return new Offset(this.f2780a.D);
    }
}
