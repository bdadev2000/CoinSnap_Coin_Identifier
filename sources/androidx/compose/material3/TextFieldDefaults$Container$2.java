package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TextFieldDefaults$Container$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDefaults f12009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12010b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12011c;
    public final /* synthetic */ InteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Modifier f12012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f12013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Shape f12014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f12015i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f12016j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12017k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12018l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$Container$2(TextFieldDefaults textFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3) {
        super(2);
        this.f12009a = textFieldDefaults;
        this.f12010b = z2;
        this.f12011c = z3;
        this.d = interactionSource;
        this.f12012f = modifier;
        this.f12013g = textFieldColors;
        this.f12014h = shape;
        this.f12015i = f2;
        this.f12016j = f3;
        this.f12017k = i2;
        this.f12018l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f12009a.a(this.f12010b, this.f12011c, this.d, this.f12012f, this.f12013g, this.f12014h, this.f12015i, this.f12016j, (Composer) obj, RecomposeScopeImplKt.a(this.f12017k | 1), this.f12018l);
        return b0.f30125a;
    }
}
