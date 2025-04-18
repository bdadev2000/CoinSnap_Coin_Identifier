package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.VisualTransformation;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class SearchBarDefaults$InputField$4 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f10871c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f10873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$4(String str, boolean z2, MutableInteractionSource mutableInteractionSource, p pVar, p pVar2, p pVar3, TextFieldColors textFieldColors) {
        super(3);
        this.f10869a = str;
        this.f10870b = z2;
        this.f10871c = mutableInteractionSource;
        this.d = pVar;
        this.f10872f = pVar2;
        this.f10873g = pVar3;
        this.f10874h = textFieldColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer.w(pVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && composer.i()) {
            composer.A();
        } else {
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12006a;
            String str = this.f10869a;
            boolean z2 = this.f10870b;
            androidx.compose.ui.text.input.c cVar = VisualTransformation.Companion.f17394a;
            MutableInteractionSource mutableInteractionSource = this.f10871c;
            p pVar2 = this.d;
            composer.J(-1102017390);
            p pVar3 = this.f10872f;
            ComposableLambdaImpl c2 = pVar3 == null ? null : ComposableLambdaKt.c(-1401341985, new SearchBarDefaults$InputField$4$1$1(pVar3), composer);
            composer.D();
            composer.J(-1102010155);
            p pVar4 = this.f10873g;
            ComposableLambdaImpl c3 = pVar4 != null ? ComposableLambdaKt.c(907752083, new SearchBarDefaults$InputField$4$2$1(pVar4), composer) : null;
            composer.D();
            SearchBarDefaults searchBarDefaults = SearchBarDefaults.f10859a;
            textFieldDefaults.b(str, pVar, z2, true, cVar, mutableInteractionSource, false, null, pVar2, c2, c3, null, null, null, ShapesKt.a(SearchBarTokens.f13502b, composer), this.f10874h, TextFieldDefaults.d(textFieldDefaults), ComposableSingletons$SearchBar_androidKt.f8628a, composer, ((intValue << 3) & 112) | 27648, 113246208, 14528);
        }
        return b0.f30125a;
    }
}
