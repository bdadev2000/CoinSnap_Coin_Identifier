package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$SingleRowTopAppBar$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7760c;
    public final /* synthetic */ TopAppBarColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextStyle f7762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f7764i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f7765j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$3(WindowInsets windowInsets, float f2, TopAppBarScrollBehavior topAppBarScrollBehavior, TopAppBarColors topAppBarColors, p pVar, TextStyle textStyle, boolean z2, p pVar2, ComposableLambdaImpl composableLambdaImpl) {
        super(2);
        this.f7758a = windowInsets;
        this.f7759b = f2;
        this.f7760c = topAppBarScrollBehavior;
        this.d = topAppBarColors;
        this.f7761f = pVar;
        this.f7762g = textStyle;
        this.f7763h = z2;
        this.f7764i = pVar2;
        this.f7765j = composableLambdaImpl;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            Modifier g2 = SizeKt.g(ClipKt.b(WindowInsetsPaddingKt.c(Modifier.Companion.f14687a, this.f7758a)), 0.0f, this.f7759b, 1);
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7760c;
            boolean I = composer.I(topAppBarScrollBehavior);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new a(topAppBarScrollBehavior, 0);
                composer.o(u2);
            }
            ScrolledOffset scrolledOffset = (ScrolledOffset) u2;
            TopAppBarColors topAppBarColors = this.d;
            long j2 = topAppBarColors.f12605c;
            long j3 = topAppBarColors.d;
            long j4 = topAppBarColors.e;
            p pVar = this.f7761f;
            TextStyle textStyle = this.f7762g;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            AppBarKt.i(g2, scrolledOffset, j2, j3, j4, pVar, textStyle, 1.0f, arrangement$Center$1, this.f7763h ? arrangement$Center$1 : Arrangement.f3772a, 0, false, this.f7764i, this.f7765j, composer, 113246208, 3126);
        }
        return b0.f30125a;
    }
}
