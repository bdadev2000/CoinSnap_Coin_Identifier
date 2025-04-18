package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
final class SearchBar_androidKt$DockedSearchBar$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10924c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f10926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f10928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10929j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10930k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$DockedSearchBar$4(SearchBarColors searchBarColors, String str, l lVar, l lVar2, boolean z2, l lVar3, boolean z3, p pVar, p pVar2, p pVar3, MutableInteractionSource mutableInteractionSource) {
        super(2);
        this.f10922a = searchBarColors;
        this.f10923b = str;
        this.f10924c = lVar;
        this.d = lVar2;
        this.f10925f = z2;
        this.f10926g = lVar3;
        this.f10927h = z3;
        this.f10928i = pVar;
        this.f10929j = pVar2;
        this.f10930k = pVar3;
        this.f10931l = mutableInteractionSource;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SearchBarDefaults.f10859a.a(this.f10923b, this.f10924c, this.d, this.f10925f, this.f10926g, SizeKt.d(Modifier.Companion.f14687a, 1.0f), this.f10927h, this.f10928i, this.f10929j, this.f10930k, this.f10922a.f10858c, this.f10931l, composer, 196608, 384, 0);
        }
        return b0.f30125a;
    }
}
