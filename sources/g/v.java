package g;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;

/* loaded from: classes3.dex */
public abstract class v {
    public static final t a(q.j jVar, f.i iVar, q0.l lVar, q0.l lVar2, ContentScale contentScale, int i2, Composer composer, int i3) {
        composer.t(1645646697);
        if ((i3 & 4) != 0) {
            lVar = g.f30536a;
        }
        if ((i3 & 8) != 0) {
            lVar2 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.Companion.f15721b;
        }
        if ((i3 & 32) != 0) {
            i2 = 1;
        }
        composer.t(952940650);
        r.e eVar = j0.f30546b;
        composer.t(1087186730);
        boolean z2 = jVar instanceof q.j;
        Object obj = Composer.Companion.f13690a;
        if (z2) {
            composer.H();
        } else {
            Context context = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
            composer.t(375474364);
            boolean I = composer.I(context) | composer.I(jVar);
            Object u2 = composer.u();
            if (I || u2 == obj) {
                q.h hVar = new q.h(context);
                hVar.f31271c = jVar;
                u2 = hVar.a();
                composer.o(u2);
            }
            jVar = (q.j) u2;
            composer.H();
            composer.H();
        }
        Object obj2 = jVar.f31292b;
        if (obj2 instanceof q.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj2 instanceof ImageBitmap) {
            b("ImageBitmap");
            throw null;
        }
        if (obj2 instanceof ImageVector) {
            b("ImageVector");
            throw null;
        }
        if (obj2 instanceof Painter) {
            b("Painter");
            throw null;
        }
        if (jVar.f31293c != null) {
            throw new IllegalArgumentException("request.target must be null.".toString());
        }
        composer.t(294038899);
        Object u3 = composer.u();
        if (u3 == obj) {
            u3 = new t(jVar, iVar);
            composer.o(u3);
        }
        t tVar = (t) u3;
        composer.H();
        tVar.f30570i = lVar;
        tVar.f30571j = lVar2;
        tVar.f30572k = contentScale;
        tVar.f30573l = i2;
        tVar.f30574m = ((Boolean) composer.K(InspectionModeKt.f16522a)).booleanValue();
        tVar.f30577p.setValue(iVar);
        tVar.f30576o.setValue(jVar);
        tVar.onRemembered();
        composer.H();
        composer.H();
        return tVar;
    }

    public static void b(String str) {
        throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.l("Unsupported type: ", str, ". ", androidx.compose.foundation.text.input.a.A("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
