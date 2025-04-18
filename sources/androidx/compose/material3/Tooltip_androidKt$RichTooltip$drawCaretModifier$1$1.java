package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f12597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Configuration f12598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12599c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tooltip_androidKt$RichTooltip$drawCaretModifier$1$1(Density density, Configuration configuration, long j2, long j3) {
        super(2);
        this.f12597a = density;
        this.f12598b = configuration;
        this.f12599c = j2;
        this.d = j3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Tooltip_androidKt.a((CacheDrawScope) obj, CaretType.f8182b, this.f12597a, this.f12598b, this.f12599c, this.d, (LayoutCoordinates) obj2);
    }
}
