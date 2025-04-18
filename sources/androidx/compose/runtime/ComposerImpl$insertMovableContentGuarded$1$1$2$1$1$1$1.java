package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f13724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MovableContentStateReference f13725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.f13724a = composerImpl;
        this.f13725b = movableContentStateReference;
    }

    @Override // q0.a
    public final Object invoke() {
        MovableContentStateReference movableContentStateReference = this.f13725b;
        this.f13724a.g0(movableContentStateReference.f13833a, movableContentStateReference.f13837g, movableContentStateReference.f13834b, true);
        return b0.f30125a;
    }
}
