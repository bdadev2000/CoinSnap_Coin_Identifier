package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidCursorHandle_androidKt$CursorHandle$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f5397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f5398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5399c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5400f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$2(OffsetProvider offsetProvider, Modifier modifier, long j2, int i2, int i3) {
        super(2);
        this.f5397a = offsetProvider;
        this.f5398b = modifier;
        this.f5399c = j2;
        this.d = i2;
        this.f5400f = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AndroidCursorHandle_androidKt.a(this.f5397a, this.f5398b, this.f5399c, (Composer) obj, RecomposeScopeImplKt.a(this.d | 1), this.f5400f);
        return b0.f30125a;
    }
}
