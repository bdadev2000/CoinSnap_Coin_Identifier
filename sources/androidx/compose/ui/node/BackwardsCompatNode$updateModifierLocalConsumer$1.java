package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BackwardsCompatNode$updateModifierLocalConsumer$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BackwardsCompatNode f15888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateModifierLocalConsumer$1(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.f15888a = backwardsCompatNode;
    }

    @Override // q0.a
    public final Object invoke() {
        BackwardsCompatNode backwardsCompatNode = this.f15888a;
        Modifier.Element element = backwardsCompatNode.f15880o;
        p0.a.q(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((ModifierLocalConsumer) element).g1(backwardsCompatNode);
        return b0.f30125a;
    }
}
