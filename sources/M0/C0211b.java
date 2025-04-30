package M0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: M0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0211b(String str, int i9, Class cls) {
        super(cls, str);
        this.f1866a = i9;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1866a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(H.f1847a.n((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f4239B);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1866a) {
            case 0:
                C0214e c0214e = (C0214e) obj;
                PointF pointF = (PointF) obj2;
                c0214e.getClass();
                c0214e.f1868a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0214e.b = round;
                int i9 = c0214e.f1872f + 1;
                c0214e.f1872f = i9;
                if (i9 == c0214e.f1873g) {
                    H.a(c0214e.f1871e, c0214e.f1868a, round, c0214e.f1869c, c0214e.f1870d);
                    c0214e.f1872f = 0;
                    c0214e.f1873g = 0;
                    return;
                }
                return;
            case 1:
                C0214e c0214e2 = (C0214e) obj;
                PointF pointF2 = (PointF) obj2;
                c0214e2.getClass();
                c0214e2.f1869c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0214e2.f1870d = round2;
                int i10 = c0214e2.f1873g + 1;
                c0214e2.f1873g = i10;
                if (c0214e2.f1872f == i10) {
                    H.a(c0214e2.f1871e, c0214e2.f1868a, c0214e2.b, c0214e2.f1869c, round2);
                    c0214e2.f1872f = 0;
                    c0214e2.f1873g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                H.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                H.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                H.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                H.f1847a.A((View) obj, floatValue);
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
