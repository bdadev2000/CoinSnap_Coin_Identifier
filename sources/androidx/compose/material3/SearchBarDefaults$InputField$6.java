package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SearchBarDefaults$InputField$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBarDefaults f10880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10882c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f10884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Modifier f10885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f10886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10887j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10888k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f10889l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10890m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10891n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10892o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10893p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10894q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$6(SearchBarDefaults searchBarDefaults, String str, l lVar, l lVar2, boolean z2, l lVar3, Modifier modifier, boolean z3, p pVar, p pVar2, p pVar3, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
        super(2);
        this.f10880a = searchBarDefaults;
        this.f10881b = str;
        this.f10882c = lVar;
        this.d = lVar2;
        this.f10883f = z2;
        this.f10884g = lVar3;
        this.f10885h = modifier;
        this.f10886i = z3;
        this.f10887j = pVar;
        this.f10888k = pVar2;
        this.f10889l = pVar3;
        this.f10890m = textFieldColors;
        this.f10891n = mutableInteractionSource;
        this.f10892o = i2;
        this.f10893p = i3;
        this.f10894q = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f10880a.a(this.f10881b, this.f10882c, this.d, this.f10883f, this.f10884g, this.f10885h, this.f10886i, this.f10887j, this.f10888k, this.f10889l, this.f10890m, this.f10891n, (Composer) obj, RecomposeScopeImplKt.a(this.f10892o | 1), RecomposeScopeImplKt.a(this.f10893p), this.f10894q);
        return b0.f30125a;
    }
}
