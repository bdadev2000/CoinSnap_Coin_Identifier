package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TabRowKt$ScrollableTabRowWithSubcomposeImpl$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11905c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f11907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f11908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11909i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ScrollState f11910j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11911k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11912l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRowWithSubcomposeImpl$2(float f2, int i2, int i3, int i4, long j2, long j3, ScrollState scrollState, Modifier modifier, p pVar, p pVar2, q qVar) {
        super(2);
        this.f11903a = i2;
        this.f11904b = qVar;
        this.f11905c = modifier;
        this.d = j2;
        this.f11906f = j3;
        this.f11907g = f2;
        this.f11908h = pVar;
        this.f11909i = pVar2;
        this.f11910j = scrollState;
        this.f11911k = i3;
        this.f11912l = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i2 = this.f11903a;
        q qVar = this.f11904b;
        Modifier modifier = this.f11905c;
        long j2 = this.d;
        long j3 = this.f11906f;
        float f2 = this.f11907g;
        p pVar = this.f11908h;
        p pVar2 = this.f11909i;
        ScrollState scrollState = this.f11910j;
        TabRowKt.b(f2, i2, RecomposeScopeImplKt.a(this.f11911k | 1), this.f11912l, j2, j3, scrollState, (Composer) obj, modifier, pVar, pVar2, qVar);
        return b0.f30125a;
    }
}
