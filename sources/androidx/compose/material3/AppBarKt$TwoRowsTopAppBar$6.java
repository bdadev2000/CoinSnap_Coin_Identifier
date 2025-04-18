package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AppBarKt$TwoRowsTopAppBar$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopAppBarColors f7833c;
    public final /* synthetic */ p d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextStyle f7834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f7835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f7836h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f7837i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f7838j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f7839k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TopAppBarScrollBehavior f7840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f7841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TextStyle f7842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f7843o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d0 f7844p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f7845q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$6(WindowInsets windowInsets, float f2, TopAppBarColors topAppBarColors, p pVar, TextStyle textStyle, float f3, boolean z2, p pVar2, ComposableLambdaImpl composableLambdaImpl, float f4, TopAppBarScrollBehavior topAppBarScrollBehavior, p pVar3, TextStyle textStyle2, float f5, d0 d0Var, boolean z3) {
        super(2);
        this.f7831a = windowInsets;
        this.f7832b = f2;
        this.f7833c = topAppBarColors;
        this.d = pVar;
        this.f7834f = textStyle;
        this.f7835g = f3;
        this.f7836h = z2;
        this.f7837i = pVar2;
        this.f7838j = composableLambdaImpl;
        this.f7839k = f4;
        this.f7840l = topAppBarScrollBehavior;
        this.f7841m = pVar3;
        this.f7842n = textStyle2;
        this.f7843o = f5;
        this.f7844p = d0Var;
        this.f7845q = z3;
    }

    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.material3.ScrolledOffset, java.lang.Object] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            p pVar = this.d;
            TextStyle textStyle = this.f7834f;
            float f2 = this.f7835g;
            boolean z2 = this.f7836h;
            p pVar2 = this.f7837i;
            p pVar3 = this.f7838j;
            p pVar4 = this.f7841m;
            TextStyle textStyle2 = this.f7842n;
            float f3 = this.f7843o;
            boolean z3 = this.f7845q;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar5 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar5);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            WindowInsets windowInsets = this.f7831a;
            Modifier b2 = ClipKt.b(WindowInsetsPaddingKt.c(companion, windowInsets));
            float f4 = this.f7832b;
            Modifier g2 = SizeKt.g(b2, 0.0f, f4, 1);
            ?? obj3 = new Object();
            TopAppBarColors topAppBarColors = this.f7833c;
            long j2 = topAppBarColors.f12605c;
            long j3 = topAppBarColors.d;
            long j4 = topAppBarColors.e;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            AppBarKt.i(g2, obj3, j2, j3, j4, pVar, textStyle, f2, arrangement$Center$1, arrangement$Start$1, 0, z2, pVar2, pVar3, composer, 905969712, 3078);
            Modifier g3 = SizeKt.g(ClipKt.b(WindowInsetsPaddingKt.c(companion, WindowInsetsKt.d(windowInsets, WindowInsetsSides.e))), 0.0f, this.f7839k - f4, 1);
            TopAppBarScrollBehavior topAppBarScrollBehavior = this.f7840l;
            boolean I = composer.I(topAppBarScrollBehavior);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new a(topAppBarScrollBehavior, 1);
                composer.o(u2);
            }
            AppBarKt.i(g3, (ScrolledOffset) u2, topAppBarColors.f12605c, topAppBarColors.d, topAppBarColors.e, pVar4, textStyle2, f3, Arrangement.d, arrangement$Start$1, this.f7844p.f30925a, z3, ComposableSingletons$AppBarKt.f8571q, ComposableSingletons$AppBarKt.f8572r, composer, 905969664, 3456);
            composer.p();
        }
        return b0.f30125a;
    }
}
