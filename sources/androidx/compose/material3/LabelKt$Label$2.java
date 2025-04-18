package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.BasicTooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
final class LabelKt$Label$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f9641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f9642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f9643c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f9644f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$Label$2(q qVar, Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z2, p pVar, int i2, int i3) {
        super(2);
        this.f9641a = qVar;
        this.f9642b = modifier;
        this.f9643c = mutableInteractionSource;
        this.d = z2;
        this.f9644f = pVar;
        this.f9645g = i2;
        this.f9646h = i3;
    }

    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        MutableInteractionSource mutableInteractionSource;
        TooltipState a2;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        ((Number) obj2).intValue();
        q qVar = this.f9641a;
        p pVar = this.f9644f;
        int a3 = RecomposeScopeImplKt.a(this.f9645g | 1);
        int i3 = this.f9646h;
        ComposerImpl g2 = ((Composer) obj).g(-544399326);
        if ((i3 & 1) != 0) {
            i2 = a3 | 6;
        } else if ((a3 & 6) == 0) {
            i2 = (g2.w(qVar) ? 4 : 2) | a3;
        } else {
            i2 = a3;
        }
        int i4 = i3 & 2;
        Modifier modifier = this.f9642b;
        if (i4 != 0) {
            i2 |= 48;
        } else if ((a3 & 48) == 0) {
            i2 |= g2.I(modifier) ? 32 : 16;
        }
        int i5 = i3 & 4;
        MutableInteractionSource mutableInteractionSource3 = this.f9643c;
        if (i5 != 0) {
            i2 |= 384;
        } else if ((a3 & 384) == 0) {
            i2 |= g2.I(mutableInteractionSource3) ? 256 : 128;
        }
        int i6 = i3 & 8;
        boolean z3 = this.d;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((a3 & 3072) == 0) {
            i2 |= g2.a(z3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 16) != 0) {
            i2 |= 24576;
        } else if ((a3 & 24576) == 0) {
            i2 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && g2.i()) {
            g2.A();
            mutableInteractionSource2 = mutableInteractionSource3;
            z2 = z3;
        } else {
            if (i4 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            if (i5 != 0) {
                mutableInteractionSource3 = null;
            }
            boolean z4 = i6 != 0 ? false : z3;
            g2.J(519104973);
            Object obj3 = Composer.Companion.f13690a;
            if (mutableInteractionSource3 == null) {
                Object u2 = g2.u();
                if (u2 == obj3) {
                    u2 = InteractionSourceKt.a();
                    g2.o(u2);
                }
                mutableInteractionSource = (MutableInteractionSource) u2;
            } else {
                mutableInteractionSource = mutableInteractionSource3;
            }
            g2.V(false);
            int i7 = TooltipDefaults.f12526a;
            final int F0 = ((Density) g2.K(CompositionLocalsKt.f16434f)).F0(TooltipKt.f12528a);
            boolean c2 = g2.c(F0);
            Object u3 = g2.u();
            if (c2 || u3 == obj3) {
                u3 = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                    @Override // androidx.compose.ui.window.PopupPositionProvider
                    public final long a(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
                        int c3 = ((intRect.c() - ((int) (j3 >> 32))) / 2) + intRect.f17490a;
                        int i8 = intRect.f17491b - ((int) (j3 & 4294967295L));
                        int i9 = F0;
                        int i10 = i8 - i9;
                        if (i10 < 0) {
                            i10 = intRect.d + i9;
                        }
                        return IntOffsetKt.a(c3, i10);
                    }
                };
                g2.o(u3);
            }
            TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) u3;
            if (z4) {
                g2.J(-1087377900);
                Object u4 = g2.u();
                if (u4 == obj3) {
                    u4 = new LabelStateImpl();
                    g2.o(u4);
                }
                a2 = (LabelStateImpl) u4;
                g2.V(false);
            } else {
                g2.J(519114025);
                a2 = BasicTooltipKt.a(new MutatorMutex(), g2);
                g2.V(false);
            }
            TooltipState tooltipState = a2;
            ?? obj4 = new Object();
            Object u5 = g2.u();
            if (u5 == obj3) {
                u5 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                g2.o(u5);
            }
            obj4.f30930a = (MutableState) u5;
            Object u6 = g2.u();
            if (u6 == obj3) {
                u6 = new TooltipScopeImpl(new LabelKt$Label$scope$1$1(obj4));
                g2.o(u6);
            }
            BasicTooltip_androidKt.a(tooltipDefaults$rememberPlainTooltipPositionProvider$1$1, ComposableLambdaKt.c(784196780, new LabelKt$Label$1(qVar, (TooltipScopeImpl) u6), g2), tooltipState, modifier, false, false, ComposableLambdaKt.c(1950723216, new LabelKt$Label$wrappedContent$1(pVar, obj4), g2), g2, ((i2 << 6) & 7168) | 1794096, 0);
            LabelKt.a(!z4, tooltipState, mutableInteractionSource, g2, 0);
            mutableInteractionSource2 = mutableInteractionSource3;
            z2 = z4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LabelKt$Label$2(qVar, modifier, mutableInteractionSource2, z2, pVar, a3, i3);
        }
        return b0.f30125a;
    }
}
