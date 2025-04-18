package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
final class SearchBar_androidKt$SearchBar$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchBarColors f10982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10984c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f10986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10987h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f10988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10989j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f10990k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$4(SearchBarColors searchBarColors, String str, l lVar, l lVar2, boolean z2, l lVar3, boolean z3, p pVar, p pVar2, p pVar3, MutableInteractionSource mutableInteractionSource) {
        super(2);
        this.f10982a = searchBarColors;
        this.f10983b = str;
        this.f10984c = lVar;
        this.d = lVar2;
        this.f10985f = z2;
        this.f10986g = lVar3;
        this.f10987h = z3;
        this.f10988i = pVar;
        this.f10989j = pVar2;
        this.f10990k = pVar3;
        this.f10991l = mutableInteractionSource;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            SearchBarDefaults.f10859a.a(this.f10983b, this.f10984c, this.d, this.f10985f, this.f10986g, SizeKt.d(Modifier.Companion.f14687a, 1.0f), this.f10987h, this.f10988i, this.f10989j, this.f10990k, this.f10982a.f10858c, this.f10991l, composer, 196608, 384, 0);
        }
        return b0.f30125a;
    }
}
