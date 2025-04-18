package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.tokens.ElevatedCardTokens;
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
import q0.q;

/* loaded from: classes2.dex */
final class CardKt$ElevatedCard$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.a f8155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f8156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8157c;
    public final /* synthetic */ Shape d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CardColors f8158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CardElevation f8159g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f8160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f8161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8162j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8163k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$ElevatedCard$2(q0.a aVar, Modifier modifier, boolean z2, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3) {
        super(2);
        this.f8155a = aVar;
        this.f8156b = modifier;
        this.f8157c = z2;
        this.d = shape;
        this.f8158f = cardColors;
        this.f8159g = cardElevation;
        this.f8160h = mutableInteractionSource;
        this.f8161i = qVar;
        this.f8162j = i2;
        this.f8163k = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4;
        Modifier modifier;
        MutableInteractionSource mutableInteractionSource;
        boolean z2;
        Shape shape;
        CardColors cardColors;
        CardElevation cardElevation;
        ((Number) obj2).intValue();
        q0.a aVar = this.f8155a;
        q qVar = this.f8161i;
        int a2 = RecomposeScopeImplKt.a(this.f8162j | 1);
        int i5 = this.f8163k;
        ComposerImpl g2 = ((Composer) obj).g(-1850977784);
        if ((i5 & 1) != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.w(aVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i6 = i5 & 2;
        Modifier modifier2 = this.f8156b;
        if (i6 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.I(modifier2) ? 32 : 16;
        }
        int i7 = i5 & 4;
        boolean z3 = this.f8157c;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.a(z3) ? 256 : 128;
        }
        int i8 = a2 & 3072;
        Shape shape2 = this.d;
        if (i8 == 0) {
            i2 |= ((i5 & 8) == 0 && g2.I(shape2)) ? Opcodes.ACC_STRICT : 1024;
        }
        int i9 = a2 & 24576;
        CardColors cardColors2 = this.f8158f;
        if (i9 == 0) {
            i2 |= ((i5 & 16) == 0 && g2.I(cardColors2)) ? 16384 : 8192;
        }
        int i10 = 196608 & a2;
        CardElevation cardElevation2 = this.f8159g;
        if (i10 == 0) {
            i2 |= ((i5 & 32) == 0 && g2.I(cardElevation2)) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i11 = i5 & 64;
        MutableInteractionSource mutableInteractionSource2 = this.f8160h;
        if (i11 != 0) {
            i2 |= 1572864;
        } else if ((a2 & 1572864) == 0) {
            i2 |= g2.I(mutableInteractionSource2) ? 1048576 : Opcodes.ASM8;
        }
        if ((i5 & 128) != 0) {
            i2 |= 12582912;
        } else if ((a2 & 12582912) == 0) {
            i2 |= g2.w(qVar) ? 8388608 : 4194304;
        }
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        if ((4793491 & i2) == 4793490 && g2.i()) {
            g2.A();
            modifier = modifier2;
            z2 = z3;
            shape = shape2;
            cardColors = cardColors2;
            cardElevation = cardElevation2;
            i3 = i5;
            i4 = a2;
            mutableInteractionSource = mutableInteractionSource3;
        } else {
            g2.u0();
            if ((a2 & 1) == 0 || g2.e0()) {
                if (i6 != 0) {
                    modifier2 = Modifier.Companion.f14687a;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i5 & 8) != 0) {
                    shape2 = ShapesKt.a(ElevatedCardTokens.f13326b, g2);
                    i2 &= -7169;
                }
                if ((i5 & 16) != 0) {
                    cardColors2 = CardDefaults.c(g2);
                    i2 &= -57345;
                }
                if ((i5 & 32) != 0) {
                    cardElevation2 = CardDefaults.d();
                    i2 &= -458753;
                }
                if (i11 != 0) {
                    mutableInteractionSource3 = null;
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
            }
            Modifier modifier3 = modifier2;
            boolean z4 = z3;
            Shape shape3 = shape2;
            CardColors cardColors3 = cardColors2;
            CardElevation cardElevation3 = cardElevation2;
            g2.W();
            int i12 = (i2 & 14) | 1572864 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2);
            int i13 = i2 << 3;
            i3 = i5;
            i4 = a2;
            CardKt.b(aVar, modifier3, z4, shape3, cardColors3, cardElevation3, null, mutableInteractionSource3, qVar, g2, i12 | (29360128 & i13) | (i13 & 234881024), 0);
            modifier = modifier3;
            mutableInteractionSource = mutableInteractionSource3;
            z2 = z4;
            shape = shape3;
            cardColors = cardColors3;
            cardElevation = cardElevation3;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CardKt$ElevatedCard$2(aVar, modifier, z2, shape, cardColors, cardElevation, mutableInteractionSource, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}
