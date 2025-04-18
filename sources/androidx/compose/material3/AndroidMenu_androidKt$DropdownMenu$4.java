package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.window.PopupProperties;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.p;
import q0.q;

/* loaded from: classes2.dex */
final class AndroidMenu_androidKt$DropdownMenu$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.a f7632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f7633c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PopupProperties f7634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f7635g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7636h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7637i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$4(boolean z2, q0.a aVar, Modifier modifier, long j2, PopupProperties popupProperties, q qVar, int i2, int i3) {
        super(2);
        this.f7631a = z2;
        this.f7632b = aVar;
        this.f7633c = modifier;
        this.d = j2;
        this.f7634f = popupProperties;
        this.f7635g = qVar;
        this.f7636h = i2;
        this.f7637i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        int i3;
        q qVar;
        int i4;
        q0.a aVar;
        Modifier modifier;
        long j2;
        PopupProperties popupProperties;
        ((Number) obj2).intValue();
        boolean z2 = this.f7631a;
        q0.a aVar2 = this.f7632b;
        q qVar2 = this.f7635g;
        int a2 = RecomposeScopeImplKt.a(this.f7636h | 1);
        int i5 = this.f7637i;
        PopupProperties popupProperties2 = AndroidMenu_androidKt.f7599a;
        ComposerImpl g2 = ((Composer) obj).g(354826666);
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
            i2 |= g2.w(aVar2) ? 32 : 16;
        }
        int i6 = i5 & 4;
        Modifier modifier2 = this.f7633c;
        if (i6 != 0) {
            i2 |= 384;
        } else if ((a2 & 384) == 0) {
            i2 |= g2.I(modifier2) ? 256 : 128;
        }
        int i7 = i5 & 8;
        long j3 = this.d;
        if (i7 != 0) {
            i2 |= 3072;
        } else if ((a2 & 3072) == 0) {
            i2 |= g2.d(j3) ? Opcodes.ACC_STRICT : 1024;
        }
        int i8 = i5 & 16;
        PopupProperties popupProperties3 = this.f7634f;
        if (i8 != 0) {
            i2 |= 24576;
        } else if ((a2 & 24576) == 0) {
            i2 |= g2.I(popupProperties3) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i2 |= 196608;
        } else if ((a2 & 196608) == 0) {
            i2 |= g2.w(qVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i2) == 74898 && g2.i()) {
            g2.A();
            i3 = i5;
            qVar = qVar2;
            i4 = a2;
            aVar = aVar2;
            modifier = modifier2;
            j2 = j3;
            popupProperties = popupProperties3;
        } else {
            if (i6 != 0) {
                modifier2 = Modifier.Companion.f14687a;
            }
            Modifier modifier3 = modifier2;
            if (i7 != 0) {
                float f2 = 0;
                j3 = DpKt.a(f2, f2);
            }
            long j4 = j3;
            if (i8 != 0) {
                popupProperties3 = new PopupProperties(true, 14);
            }
            PopupProperties popupProperties4 = popupProperties3;
            i3 = i5;
            qVar = qVar2;
            i4 = a2;
            aVar = aVar2;
            AndroidMenu_androidKt.a(z2, aVar2, modifier3, j4, ScrollKt.b(g2), popupProperties4, null, 0L, 0.0f, 0.0f, null, qVar, g2, (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 << 3) & Opcodes.ASM7), (i2 >> 12) & 112, 1984);
            modifier = modifier3;
            j2 = j4;
            popupProperties = popupProperties4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidMenu_androidKt$DropdownMenu$4(z2, aVar, modifier, j2, popupProperties, qVar, i4, i3);
        }
        return b0.f30125a;
    }
}
