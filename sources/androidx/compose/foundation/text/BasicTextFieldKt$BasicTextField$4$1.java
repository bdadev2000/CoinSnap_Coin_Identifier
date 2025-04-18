package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextFieldKt$BasicTextField$4$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f5546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f5547c;
    public final /* synthetic */ TextStyle d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5548f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5549g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5550h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f5551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f5552j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Brush f5553k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScrollState f5556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Orientation f5557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f5558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p f5559q;

    /* renamed from: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextFieldLineLimits f5560a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextLayoutState f5561b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextStyle f5562c;
        public final /* synthetic */ boolean d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f5563f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f5564g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ TransformedTextFieldState f5565h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f5566i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Brush f5567j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f5568k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f5569l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScrollState f5570m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Orientation f5571n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f5572o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ p f5573p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldLineLimits textFieldLineLimits, TextLayoutState textLayoutState, TextStyle textStyle, boolean z2, boolean z3, boolean z4, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z5, boolean z6, ScrollState scrollState, Orientation orientation, boolean z7, p pVar) {
            super(2);
            this.f5560a = textFieldLineLimits;
            this.f5561b = textLayoutState;
            this.f5562c = textStyle;
            this.d = z2;
            this.f5563f = z3;
            this.f5564g = z4;
            this.f5565h = transformedTextFieldState;
            this.f5566i = textFieldSelectionState;
            this.f5567j = brush;
            this.f5568k = z5;
            this.f5569l = z6;
            this.f5570m = scrollState;
            this.f5571n = orientation;
            this.f5572o = z7;
            this.f5573p = pVar;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            int i2;
            int i3;
            boolean z2;
            boolean z3;
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
                composer.A();
            } else {
                TextFieldLineLimits textFieldLineLimits = this.f5560a;
                if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
                    TextFieldLineLimits.MultiLine multiLine = (TextFieldLineLimits.MultiLine) textFieldLineLimits;
                    i3 = multiLine.f6303b;
                    i2 = multiLine.f6304c;
                } else {
                    i2 = 1;
                    i3 = 1;
                }
                Modifier.Companion companion = Modifier.Companion.f14687a;
                TextLayoutState textLayoutState = this.f5561b;
                Modifier g2 = SizeKt.g(companion, ((Dp) textLayoutState.f6648g.getValue()).f17486a, 0.0f, 2);
                TextStyle textStyle = this.f5562c;
                Modifier b2 = ClipKt.b(ComposedModifierKt.a(ComposedModifierKt.a(g2, new HeightInLinesModifierKt$heightInLines$2(i3, i2, textStyle)), new TextFieldSizeKt$textFieldMinSize$1(textStyle)));
                boolean z4 = this.f5563f;
                boolean z5 = this.d;
                boolean z6 = z5 && z4;
                boolean z7 = this.f5564g;
                TextLayoutState textLayoutState2 = this.f5561b;
                TransformedTextFieldState transformedTextFieldState = this.f5565h;
                TextFieldSelectionState textFieldSelectionState = this.f5566i;
                Brush brush = this.f5567j;
                boolean z8 = this.f5569l;
                boolean z9 = this.f5568k;
                if (!z9 || z8) {
                    z2 = z5;
                    z3 = false;
                } else {
                    z2 = z5;
                    z3 = true;
                }
                Modifier T0 = b2.T0(new TextFieldCoreModifier(z6, z7, textLayoutState2, transformedTextFieldState, textFieldSelectionState, brush, z3, this.f5570m, this.f5571n));
                TransformedTextFieldState transformedTextFieldState2 = this.f5565h;
                TextStyle textStyle2 = this.f5562c;
                boolean z10 = this.f5572o;
                p pVar = this.f5573p;
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, true);
                int E = composer.E();
                PersistentCompositionLocalMap m2 = composer.m();
                Modifier c2 = ComposedModifierKt.c(composer, T0);
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
                Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
                Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
                p pVar2 = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar2);
                }
                Updater.b(composer, c2, ComposeUiNode.Companion.d);
                boolean z11 = z2;
                BoxKt.a(BringIntoViewRequesterKt.b(companion, textLayoutState.f6649h).T0(new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState2, textStyle2, z10, pVar)), composer, 0);
                if (z9 && z11 && z4) {
                    TextFieldSelectionState textFieldSelectionState2 = this.f5566i;
                    if (((Boolean) textFieldSelectionState2.f6722k.getValue()).booleanValue()) {
                        composer.J(-1325530694);
                        BasicTextFieldKt.e(textFieldSelectionState2, composer, 0);
                        if (z8) {
                            composer.J(-1325177728);
                            composer.D();
                        } else {
                            composer.J(-1325351669);
                            BasicTextFieldKt.d(textFieldSelectionState2, composer, 0);
                            composer.D();
                        }
                        composer.D();
                        composer.p();
                    }
                }
                composer.J(-1325155904);
                composer.D();
                composer.p();
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$4$1(TextFieldDecorator textFieldDecorator, TextFieldLineLimits textFieldLineLimits, TextLayoutState textLayoutState, TextStyle textStyle, boolean z2, boolean z3, boolean z4, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z5, boolean z6, ScrollState scrollState, Orientation orientation, boolean z7, p pVar) {
        super(2);
        this.f5545a = textFieldDecorator;
        this.f5546b = textFieldLineLimits;
        this.f5547c = textLayoutState;
        this.d = textStyle;
        this.f5548f = z2;
        this.f5549g = z3;
        this.f5550h = z4;
        this.f5551i = transformedTextFieldState;
        this.f5552j = textFieldSelectionState;
        this.f5553k = brush;
        this.f5554l = z5;
        this.f5555m = z6;
        this.f5556n = scrollState;
        this.f5557o = orientation;
        this.f5558p = z7;
        this.f5559q = pVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextFieldDecorator textFieldDecorator = this.f5545a;
            if (textFieldDecorator == null) {
                TextFieldDecorator textFieldDecorator2 = BasicTextFieldKt.f5458a;
                textFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.f5617a;
            }
            textFieldDecorator.a(ComposableLambdaKt.c(1969169726, new AnonymousClass1(this.f5546b, this.f5547c, this.d, this.f5548f, this.f5549g, this.f5550h, this.f5551i, this.f5552j, this.f5553k, this.f5554l, this.f5555m, this.f5556n, this.f5557o, this.f5558p, this.f5559q), composer), composer, 6);
        }
        return b0.f30125a;
    }
}
