package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class CoreTextFieldKt$CoreTextField$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f5807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextStyle f5809c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f5811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f5813i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Modifier f5814j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Modifier f5815k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Modifier f5816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Modifier f5817m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequester f5818n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5819o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f5820p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f5821q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f5822r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f5823s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Density f5824t;

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LegacyTextFieldState f5825a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5826b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5827c;
        public final /* synthetic */ int d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ TextFieldScrollerPosition f5828f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5829g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f5830h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Modifier f5831i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Modifier f5832j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Modifier f5833k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Modifier f5834l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ BringIntoViewRequester f5835m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionManager f5836n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f5837o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f5838p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ l f5839q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5840r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Density f5841s;

        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        final class C00221 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TextFieldSelectionManager f5842a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegacyTextFieldState f5843b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f5844c;
            public final /* synthetic */ boolean d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l f5845f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ TextFieldValue f5846g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ OffsetMapping f5847h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Density f5848i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f5849j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00221(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, l lVar, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i2) {
                super(2);
                this.f5842a = textFieldSelectionManager;
                this.f5843b = legacyTextFieldState;
                this.f5844c = z2;
                this.d = z3;
                this.f5845f = lVar;
                this.f5846g = textFieldValue;
                this.f5847h = offsetMapping;
                this.f5848i = density;
                this.f5849j = i2;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                boolean z2;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                    composer.A();
                } else {
                    final LegacyTextFieldState legacyTextFieldState = this.f5843b;
                    final l lVar = this.f5845f;
                    final TextFieldValue textFieldValue = this.f5846g;
                    final OffsetMapping offsetMapping = this.f5847h;
                    final Density density = this.f5848i;
                    final int i2 = this.f5849j;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                            LegacyTextFieldState legacyTextFieldState2 = LegacyTextFieldState.this;
                            legacyTextFieldState2.f6021a.a(intrinsicMeasureScope.getLayoutDirection());
                            MultiParagraphIntrinsics multiParagraphIntrinsics = legacyTextFieldState2.f6021a.f6114j;
                            if (multiParagraphIntrinsics != null) {
                                return TextDelegateKt.a(multiParagraphIntrinsics.b());
                            }
                            throw new IllegalStateException("layoutIntrinsics must be called first");
                        }

                        /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
                        /* JADX WARN: Removed duplicated region for block: B:46:0x0200  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x020c  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
                        /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
                        /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
                        /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final androidx.compose.ui.layout.MeasureResult mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope r31, java.util.List r32, long r33) {
                            /*
                                Method dump skipped, instructions count: 616
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.AnonymousClass1.C00221.AnonymousClass2.mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                        }
                    };
                    Modifier.Companion companion = Modifier.Companion.f14687a;
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
                    Updater.b(composer, measurePolicy, ComposeUiNode.Companion.f15898g);
                    Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
                    p pVar = ComposeUiNode.Companion.f15900i;
                    if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                        d.w(E, composer, E, pVar);
                    }
                    Updater.b(composer, c2, ComposeUiNode.Companion.d);
                    composer.p();
                    LegacyTextFieldState legacyTextFieldState2 = this.f5843b;
                    HandleState a2 = legacyTextFieldState2.a();
                    HandleState handleState = HandleState.f5967a;
                    boolean z3 = this.f5844c;
                    if (a2 != handleState && legacyTextFieldState2.c() != null) {
                        LayoutCoordinates c3 = legacyTextFieldState2.c();
                        p0.a.p(c3);
                        if (c3.B() && z3) {
                            z2 = true;
                            TextFieldSelectionManager textFieldSelectionManager = this.f5842a;
                            CoreTextFieldKt.d(textFieldSelectionManager, z2, composer, 0);
                            if (legacyTextFieldState2.a() == HandleState.f5969c || this.d || !z3) {
                                composer.J(-1955394);
                                composer.D();
                            } else {
                                composer.J(-2032274);
                                CoreTextFieldKt.c(textFieldSelectionManager, composer, 0);
                                composer.D();
                            }
                        }
                    }
                    z2 = false;
                    TextFieldSelectionManager textFieldSelectionManager2 = this.f5842a;
                    CoreTextFieldKt.d(textFieldSelectionManager2, z2, composer, 0);
                    if (legacyTextFieldState2.a() == HandleState.f5969c) {
                    }
                    composer.J(-1955394);
                    composer.D();
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z2, boolean z3, l lVar, OffsetMapping offsetMapping, Density density) {
            super(2);
            this.f5825a = legacyTextFieldState;
            this.f5826b = textStyle;
            this.f5827c = i2;
            this.d = i3;
            this.f5828f = textFieldScrollerPosition;
            this.f5829g = textFieldValue;
            this.f5830h = visualTransformation;
            this.f5831i = modifier;
            this.f5832j = modifier2;
            this.f5833k = modifier3;
            this.f5834l = modifier4;
            this.f5835m = bringIntoViewRequester;
            this.f5836n = textFieldSelectionManager;
            this.f5837o = z2;
            this.f5838p = z3;
            this.f5839q = lVar;
            this.f5840r = offsetMapping;
            this.f5841s = density;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            Modifier verticalScrollLayoutModifier;
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                Modifier.Companion companion = Modifier.Companion.f14687a;
                LegacyTextFieldState legacyTextFieldState = this.f5825a;
                Modifier g2 = SizeKt.g(companion, ((Dp) legacyTextFieldState.f6025g.getValue()).f17486a, 0.0f, 2);
                int i2 = this.f5827c;
                int i3 = this.d;
                TextStyle textStyle = this.f5826b;
                Modifier a2 = ComposedModifierKt.a(g2, new HeightInLinesModifierKt$heightInLines$2(i2, i3, textStyle));
                boolean w = composer.w(legacyTextFieldState);
                Object u2 = composer.u();
                if (w || u2 == Composer.Companion.f13690a) {
                    u2 = new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1(legacyTextFieldState);
                    composer.o(u2);
                }
                q0.a aVar = (q0.a) u2;
                TextFieldScrollerPosition textFieldScrollerPosition = this.f5828f;
                Orientation orientation = (Orientation) textFieldScrollerPosition.e.getValue();
                TextFieldValue textFieldValue = this.f5829g;
                long j2 = textFieldValue.f17362b;
                int i4 = TextRange.f17057c;
                int i5 = (int) (j2 >> 32);
                long j3 = textFieldScrollerPosition.d;
                if (i5 == ((int) (j3 >> 32))) {
                    int i6 = (int) (j2 & 4294967295L);
                    i5 = i6 != ((int) (4294967295L & j3)) ? i6 : TextRange.f(j2);
                }
                textFieldScrollerPosition.d = textFieldValue.f17362b;
                TransformedText a3 = ValidatingOffsetMappingKt.a(this.f5830h, textFieldValue.f17361a);
                int ordinal = orientation.ordinal();
                if (ordinal == 0) {
                    verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, i5, a3, aVar);
                } else {
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                    verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, i5, a3, aVar);
                }
                SimpleLayoutKt.a(BringIntoViewRequesterKt.b(ComposedModifierKt.a(ClipKt.b(a2).T0(verticalScrollLayoutModifier).T0(this.f5831i).T0(this.f5832j), new TextFieldSizeKt$textFieldMinSize$1(textStyle)).T0(this.f5833k).T0(this.f5834l), this.f5835m), ComposableLambdaKt.c(-363167407, new C00221(this.f5836n, this.f5825a, this.f5837o, this.f5838p, this.f5839q, this.f5829g, this.f5840r, this.f5841s, this.d), composer), composer, 48, 0);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5(q qVar, LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z2, boolean z3, l lVar, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.f5807a = qVar;
        this.f5808b = legacyTextFieldState;
        this.f5809c = textStyle;
        this.d = i2;
        this.f5810f = i3;
        this.f5811g = textFieldScrollerPosition;
        this.f5812h = textFieldValue;
        this.f5813i = visualTransformation;
        this.f5814j = modifier;
        this.f5815k = modifier2;
        this.f5816l = modifier3;
        this.f5817m = modifier4;
        this.f5818n = bringIntoViewRequester;
        this.f5819o = textFieldSelectionManager;
        this.f5820p = z2;
        this.f5821q = z3;
        this.f5822r = lVar;
        this.f5823s = offsetMapping;
        this.f5824t = density;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            this.f5807a.invoke(ComposableLambdaKt.c(2032502107, new AnonymousClass1(this.f5808b, this.f5809c, this.d, this.f5810f, this.f5811g, this.f5812h, this.f5813i, this.f5814j, this.f5815k, this.f5816l, this.f5817m, this.f5818n, this.f5819o, this.f5820p, this.f5821q, this.f5822r, this.f5823s, this.f5824t), composer), composer, 6);
        }
        return b0.f30125a;
    }
}
