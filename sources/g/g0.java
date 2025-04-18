package g;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class g0 {
    public static final void a(q.j jVar, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Composer composer, int i2, int i3) {
        f.o oVar;
        ContentScale contentScale = ContentScale.Companion.f15724g;
        composer.t(1693837359);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.f14687a : modifier;
        Painter painter4 = (i3 & 8) != 0 ? null : painter;
        Painter painter5 = (i3 & 16) != 0 ? null : painter2;
        Painter painter6 = (i3 & 32) != 0 ? painter5 : painter3;
        BiasAlignment biasAlignment = (i3 & 512) != 0 ? Alignment.Companion.e : null;
        if ((i3 & 1024) != 0) {
            contentScale = ContentScale.Companion.f15721b;
        }
        ContentScale contentScale2 = contentScale;
        float f2 = (i3 & Opcodes.ACC_STRICT) != 0 ? 1.0f : 0.0f;
        int i4 = (i3 & 8192) != 0 ? 1 : 0;
        boolean z2 = (i3 & 16384) != 0;
        c0 c0Var = (i3 & 32768) != 0 ? d0.f30525a : null;
        f.i iVar = (f.i) composer.K(f0.f30535a);
        if (iVar == null) {
            Context context = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
            f.o oVar2 = f.a.f30376b;
            if (oVar2 == null) {
                synchronized (f.a.f30375a) {
                    oVar = f.a.f30376b;
                    if (oVar == null) {
                        context.getApplicationContext();
                        oVar = new f.h(context).a();
                        f.a.f30376b = oVar;
                    }
                }
                iVar = oVar;
            } else {
                iVar = oVar2;
            }
        }
        int i5 = i2 << 3;
        int i6 = (i2 & 112) | 2392584 | (i5 & 7168) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192);
        int i7 = ((i2 >> 27) & 14) | 48;
        composer.t(-1481548872);
        w wVar = new w(jVar, c0Var, iVar);
        r.e eVar = j0.f30546b;
        int i8 = (i6 & 112) | ((i6 >> 3) & 896);
        int i9 = i7 << 15;
        f.a(wVar, str, modifier2, (painter4 == null && painter5 == null && painter6 == null) ? g.f30536a : new i0(painter4, 1, painter6, painter5), null, biasAlignment, contentScale2, f2, null, i4, z2, composer, i8 | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024) | (i9 & 1879048192), (i7 >> 15) & 14);
        composer.H();
        composer.H();
    }
}
