package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;

/* loaded from: classes4.dex */
public final class VectorPainterKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.graphics.vector.VectorGroup r24, java.util.Map r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.a(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.f15463k.size();
        for (int i2 = 0; i2 < size; i2++) {
            VectorNode vectorNode = (VectorNode) vectorGroup.f15463k.get(i2);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.d = vectorPath.f15479b;
                pathComponent.f15341n = true;
                pathComponent.c();
                pathComponent.f15346s.g(vectorPath.f15480c);
                pathComponent.c();
                pathComponent.c();
                pathComponent.f15331b = vectorPath.d;
                pathComponent.c();
                pathComponent.f15332c = vectorPath.f15481f;
                pathComponent.c();
                pathComponent.f15334g = vectorPath.f15482g;
                pathComponent.c();
                pathComponent.e = vectorPath.f15483h;
                pathComponent.c();
                pathComponent.f15333f = vectorPath.f15484i;
                pathComponent.f15342o = true;
                pathComponent.c();
                pathComponent.f15335h = vectorPath.f15485j;
                pathComponent.f15342o = true;
                pathComponent.c();
                pathComponent.f15336i = vectorPath.f15486k;
                pathComponent.f15342o = true;
                pathComponent.c();
                pathComponent.f15337j = vectorPath.f15487l;
                pathComponent.f15342o = true;
                pathComponent.c();
                pathComponent.f15338k = vectorPath.f15488m;
                pathComponent.f15343p = true;
                pathComponent.c();
                pathComponent.f15339l = vectorPath.f15489n;
                pathComponent.f15343p = true;
                pathComponent.c();
                pathComponent.f15340m = vectorPath.f15490o;
                pathComponent.f15343p = true;
                pathComponent.c();
                groupComponent.e(i2, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.f15293k = vectorGroup2.f15455a;
                groupComponent2.c();
                groupComponent2.f15294l = vectorGroup2.f15456b;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15297o = vectorGroup2.f15458f;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15298p = vectorGroup2.f15459g;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15299q = vectorGroup2.f15460h;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15300r = vectorGroup2.f15461i;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15295m = vectorGroup2.f15457c;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15296n = vectorGroup2.d;
                groupComponent2.f15301s = true;
                groupComponent2.c();
                groupComponent2.f15288f = vectorGroup2.f15462j;
                groupComponent2.f15289g = true;
                groupComponent2.c();
                b(groupComponent2, vectorGroup2);
                groupComponent.e(i2, groupComponent2);
            }
        }
    }

    public static final VectorPainter c(ImageVector imageVector, Composer composer) {
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        float f2 = imageVector.f15312j;
        boolean d = composer.d((Float.floatToRawIntBits(density.getDensity()) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        Object u2 = composer.u();
        if (d || u2 == Composer.Companion.f13690a) {
            GroupComponent groupComponent = new GroupComponent();
            b(groupComponent, imageVector.f15308f);
            long a2 = SizeKt.a(density.y1(imageVector.f15306b), density.y1(imageVector.f15307c));
            float f3 = imageVector.d;
            if (Float.isNaN(f3)) {
                f3 = Size.d(a2);
            }
            float f4 = imageVector.e;
            if (Float.isNaN(f4)) {
                f4 = Size.b(a2);
            }
            long a3 = SizeKt.a(f3, f4);
            VectorPainter vectorPainter = new VectorPainter(groupComponent);
            long j2 = imageVector.f15309g;
            BlendModeColorFilter a4 = j2 != 16 ? ColorFilter.Companion.a(imageVector.f15310h, j2) : null;
            vectorPainter.f15466a.setValue(new Size(a2));
            vectorPainter.f15467b.setValue(Boolean.valueOf(imageVector.f15311i));
            VectorComponent vectorComponent = vectorPainter.f15468c;
            vectorComponent.f15393g.setValue(a4);
            vectorComponent.f15395i.setValue(new Size(a3));
            vectorComponent.f15391c = imageVector.f15305a;
            composer.o(vectorPainter);
            u2 = vectorPainter;
        }
        return (VectorPainter) u2;
    }
}
