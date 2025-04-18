package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PullToRefreshDefaults$Indicator$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshDefaults f13127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f13128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13129c;
    public final /* synthetic */ Modifier d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13134j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshDefaults$Indicator$2(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z2, Modifier modifier, long j2, long j3, float f2, int i2, int i3) {
        super(2);
        this.f13127a = pullToRefreshDefaults;
        this.f13128b = pullToRefreshState;
        this.f13129c = z2;
        this.d = modifier;
        this.f13130f = j2;
        this.f13131g = j3;
        this.f13132h = f2;
        this.f13133i = i2;
        this.f13134j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f13127a.a(this.f13128b, this.f13129c, this.d, this.f13130f, this.f13131g, this.f13132h, (Composer) obj, RecomposeScopeImplKt.a(this.f13133i | 1), this.f13134j);
        return b0.f30125a;
    }
}
