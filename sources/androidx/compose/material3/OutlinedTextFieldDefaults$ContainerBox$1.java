package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes3.dex */
final class OutlinedTextFieldDefaults$ContainerBox$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OutlinedTextFieldDefaults f10409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10411c;
    public final /* synthetic */ InteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f10412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Shape f10413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f10414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10415i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10416j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldDefaults$ContainerBox$1(OutlinedTextFieldDefaults outlinedTextFieldDefaults, boolean z2, boolean z3, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f2, float f3, int i2, int i3) {
        super(2);
        this.f10409a = outlinedTextFieldDefaults;
        this.f10410b = z2;
        this.f10411c = z3;
        this.d = interactionSource;
        this.f10412f = textFieldColors;
        this.f10413g = shape;
        this.f10414h = f2;
        this.f10415i = f3;
        this.f10416j = i2;
        this.f10417k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        OutlinedTextFieldDefaults outlinedTextFieldDefaults;
        int i3;
        int i4;
        InteractionSource interactionSource;
        TextFieldColors textFieldColors;
        Shape shape;
        float f2;
        float f3;
        ((Number) obj2).intValue();
        boolean z2 = this.f10410b;
        boolean z3 = this.f10411c;
        InteractionSource interactionSource2 = this.d;
        int a2 = RecomposeScopeImplKt.a(this.f10416j | 1);
        int i5 = this.f10417k;
        OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = this.f10409a;
        outlinedTextFieldDefaults2.getClass();
        ComposerImpl g2 = ((Composer) obj).g(1461761386);
        if ((i5 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.a(z2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i5 & 2) != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.a(z3) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(interactionSource2) ? 256 : 128;
        }
        int i6 = a2 & 3072;
        TextFieldColors textFieldColors2 = this.f10412f;
        if (i6 == 0) {
            i2 |= ((i5 & 8) == 0 && g2.I(textFieldColors2)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i7 = a2 & 24576;
        Shape shape2 = this.f10413g;
        if (i7 == 0) {
            i2 |= ((i5 & 16) == 0 && g2.I(shape2)) ? 16384 : 8192;
        }
        int i8 = 196608 & a2;
        float f4 = this.f10414h;
        if (i8 == 0) {
            i2 |= ((i5 & 32) == 0 && g2.b(f4)) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i9 = 1572864 & a2;
        float f5 = this.f10415i;
        if (i9 == 0) {
            i2 |= ((i5 & 64) == 0 && g2.b(f5)) ? 1048576 : Opcodes.ASM8;
        }
        if ((i5 & 128) != 0) {
            i2 |= 12582912;
        } else if ((a2 & 12582912) == 0) {
            i2 |= g2.I(outlinedTextFieldDefaults2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && g2.i()) {
            g2.A();
            shape = shape2;
            f2 = f4;
            outlinedTextFieldDefaults = outlinedTextFieldDefaults2;
            i3 = i5;
            i4 = a2;
            interactionSource = interactionSource2;
            f3 = f5;
            textFieldColors = textFieldColors2;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if ((i5 & 8) != 0) {
                    textFieldColors2 = OutlinedTextFieldDefaults.c(g2, (i2 >> 21) & 14);
                    i2 &= -7169;
                }
                if ((i5 & 16) != 0) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = OutlinedTextFieldDefaults.f10396a;
                    shape2 = ShapesKt.a(ShapeKeyTokens.f13511c, g2);
                    i2 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    i2 &= -458753;
                    f4 = OutlinedTextFieldDefaults.e;
                }
                if ((i5 & 64) != 0) {
                    i2 &= -3670017;
                    f5 = OutlinedTextFieldDefaults.d;
                }
            } else {
                g2.A();
                if ((i5 & 8) != 0) {
                    i2 &= -7169;
                }
                if ((i5 & 16) != 0) {
                    i2 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    i2 &= -458753;
                }
                if ((i5 & 64) != 0) {
                    i2 &= -3670017;
                }
            }
            TextFieldColors textFieldColors3 = textFieldColors2;
            Shape shape3 = shape2;
            float f6 = f4;
            float f7 = f5;
            g2.W();
            int i10 = (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896);
            int i11 = i2 << 3;
            outlinedTextFieldDefaults = outlinedTextFieldDefaults2;
            i3 = i5;
            i4 = a2;
            interactionSource = interactionSource2;
            outlinedTextFieldDefaults2.a(z2, z3, interactionSource2, Modifier.Companion.f14687a, textFieldColors3, shape3, f6, f7, g2, i10 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 0);
            textFieldColors = textFieldColors3;
            shape = shape3;
            f2 = f6;
            f3 = f7;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new OutlinedTextFieldDefaults$ContainerBox$1(outlinedTextFieldDefaults, z2, z3, interactionSource, textFieldColors, shape, f2, f3, i4, i3);
        }
        return b0.f30125a;
    }
}
