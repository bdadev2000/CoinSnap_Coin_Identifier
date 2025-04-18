package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ListItemKt$ListItemLayout$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f9690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f9691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f9692c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItemLayout$1(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2) {
        super(2);
        this.f9690a = pVar;
        this.f9691b = pVar2;
        this.f9692c = pVar3;
        this.d = pVar4;
        this.f9693f = pVar5;
        this.f9694g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ListItemKt.a(this.f9690a, this.f9691b, this.f9692c, this.d, this.f9693f, (Composer) obj, RecomposeScopeImplKt.a(this.f9694g | 1));
        return b0.f30125a;
    }
}
