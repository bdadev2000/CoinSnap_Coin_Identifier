package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes.dex */
final class AndroidPopup_androidKt$Popup$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Alignment f17618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.a f17620c;
    public final /* synthetic */ PopupProperties d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f17621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17623h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$1(Alignment alignment, long j2, q0.a aVar, PopupProperties popupProperties, p pVar, int i2, int i3) {
        super(2);
        this.f17618a = alignment;
        this.f17619b = j2;
        this.f17620c = aVar;
        this.d = popupProperties;
        this.f17621f = pVar;
        this.f17622g = i2;
        this.f17623h = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        Alignment alignment;
        long j2;
        PopupProperties popupProperties;
        ((Number) obj2).intValue();
        p pVar = this.f17621f;
        int a2 = RecomposeScopeImplKt.a(this.f17622g | 1);
        int i3 = this.f17623h;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f17615a;
        ComposerImpl g2 = ((Composer) obj).g(295309329);
        int i4 = i3 & 1;
        Alignment alignment2 = this.f17618a;
        if (i4 != 0) {
            i2 = a2 | 6;
        } else if ((a2 & 6) == 0) {
            i2 = (g2.I(alignment2) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i5 = i3 & 2;
        long j3 = this.f17619b;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((a2 & 48) == 0) {
            i2 |= g2.d(j3) ? 32 : 16;
        }
        int i6 = i3 & 4;
        q0.a aVar = this.f17620c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.w(aVar) ? 256 : 128;
        }
        int i7 = i3 & 8;
        PopupProperties popupProperties2 = this.d;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.I(popupProperties2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i3 & 16) != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && g2.i()) {
            g2.A();
            alignment = alignment2;
            popupProperties = popupProperties2;
            j2 = j3;
        } else {
            if (i4 != 0) {
                alignment2 = Alignment.Companion.f14659a;
            }
            Alignment alignment3 = alignment2;
            if (i5 != 0) {
                j3 = IntOffsetKt.a(0, 0);
            }
            if (i6 != 0) {
                aVar = null;
            }
            if (i7 != 0) {
                popupProperties2 = new PopupProperties(false, 15);
            }
            PopupProperties popupProperties3 = popupProperties2;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new AlignmentOffsetPositionProvider(alignment3, j3);
                g2.o(u2);
            }
            AlignmentOffsetPositionProvider alignmentOffsetPositionProvider = (AlignmentOffsetPositionProvider) u2;
            int i8 = i2 >> 3;
            AndroidPopup_androidKt.a(alignmentOffsetPositionProvider, aVar, popupProperties3, pVar, g2, (i8 & 112) | (i8 & 896) | (i8 & 7168), 0);
            alignment = alignment3;
            j2 = j3;
            popupProperties = popupProperties3;
        }
        q0.a aVar2 = aVar;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidPopup_androidKt$Popup$1(alignment, j2, aVar2, popupProperties, pVar, a2, i3);
        }
        return b0.f30125a;
    }
}
