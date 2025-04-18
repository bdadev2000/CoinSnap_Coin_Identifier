package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class IconButtonKt$IconButton$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f9556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f9557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9558c;
    public final /* synthetic */ IconButtonColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f9560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9561h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9562i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$2(q0.a aVar, Modifier modifier, boolean z2, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, p pVar, int i2, int i3) {
        super(2);
        this.f9556a = aVar;
        this.f9557b = modifier;
        this.f9558c = z2;
        this.d = iconButtonColors;
        this.f9559f = mutableInteractionSource;
        this.f9560g = pVar;
        this.f9561h = i2;
        this.f9562i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        IconButtonKt.a(this.f9556a, this.f9557b, this.f9558c, this.d, this.f9559f, this.f9560g, (Composer) obj, RecomposeScopeImplKt.a(this.f9561h | 1), this.f9562i);
        return b0.f30125a;
    }
}
