package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.r;
import q0.a;
import q0.q;

/* renamed from: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Indication f2626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2628c;
    public final /* synthetic */ Role d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f2629f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a f2631h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f2632i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1(Indication indication, boolean z2, String str, Role role, a aVar, String str2, a aVar2, a aVar3) {
        super(3);
        this.f2626a = indication;
        this.f2627b = z2;
        this.f2628c = str;
        this.d = role;
        this.f2629f = aVar;
        this.f2630g = str2;
        this.f2631h = aVar2;
        this.f2632i = aVar3;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1525724089);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = InteractionSourceKt.a();
            composer.o(u2);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) u2;
        Modifier a2 = IndicationKt.a(Modifier.Companion.f14687a, mutableInteractionSource, this.f2626a);
        boolean z2 = this.f2627b;
        String str = this.f2628c;
        Modifier T0 = a2.T0(new CombinedClickableElement(null, mutableInteractionSource, this.d, str, this.f2630g, this.f2629f, this.f2631h, this.f2632i, z2));
        composer.D();
        return T0;
    }
}
