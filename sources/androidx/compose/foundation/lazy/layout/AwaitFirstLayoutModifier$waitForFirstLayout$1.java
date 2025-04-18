package androidx.compose.foundation.lazy.layout;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {35}, m = "waitForFirstLayout")
/* loaded from: classes.dex */
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public g f4652a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AwaitFirstLayoutModifier f4654c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, g gVar) {
        super(gVar);
        this.f4654c = awaitFirstLayoutModifier;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f4653b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4654c.a(this);
    }
}
