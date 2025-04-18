package f2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public final class b extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, String str, Class cls) {
        super(cls, str);
        this.a = i10;
    }

    public final Float a(View view) {
        switch (this.a) {
            case 5:
                return Float.valueOf(e0.a.m(view));
            case 6:
            default:
                return Float.valueOf(view.getPaddingEnd());
            case 7:
                return Float.valueOf(view.getLayoutParams().width);
            case 8:
                return Float.valueOf(view.getLayoutParams().height);
            case 9:
                return Float.valueOf(view.getPaddingStart());
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.a) {
            case 2:
                e0.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 3:
                e0.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                e0.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void c(View view, Float f10) {
        switch (this.a) {
            case 5:
                e0.a.w(view, f10.floatValue());
                return;
            case 6:
            default:
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
                return;
            case 7:
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
                return;
            case 8:
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
                return;
            case 9:
                view.setPaddingRelative(f10.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                return;
        }
    }

    public final void d(e eVar, PointF pointF) {
        switch (this.a) {
            case 0:
                eVar.getClass();
                eVar.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f17588b = round;
                int i10 = eVar.f17592f + 1;
                eVar.f17592f = i10;
                if (i10 == eVar.f17593g) {
                    e0.a(eVar.f17591e, eVar.a, round, eVar.f17589c, eVar.f17590d);
                    eVar.f17592f = 0;
                    eVar.f17593g = 0;
                    return;
                }
                return;
            default:
                eVar.getClass();
                eVar.f17589c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                eVar.f17590d = round2;
                int i11 = eVar.f17593g + 1;
                eVar.f17593g = i11;
                if (eVar.f17592f == i11) {
                    e0.a(eVar.f17591e, eVar.a, eVar.f17588b, eVar.f17589c, round2);
                    eVar.f17592f = 0;
                    eVar.f17593g = 0;
                    return;
                }
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
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
                return a((View) obj);
            case 6:
                return ((View) obj).getClipBounds();
            case 7:
                return a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            default:
                return a((View) obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d((e) obj, (PointF) obj2);
                return;
            case 1:
                d((e) obj, (PointF) obj2);
                return;
            case 2:
                b((View) obj, (PointF) obj2);
                return;
            case 3:
                b((View) obj, (PointF) obj2);
                return;
            case 4:
                b((View) obj, (PointF) obj2);
                return;
            case 5:
                c((View) obj, (Float) obj2);
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            case 7:
                c((View) obj, (Float) obj2);
                return;
            case 8:
                c((View) obj, (Float) obj2);
                return;
            case 9:
                c((View) obj, (Float) obj2);
                return;
            default:
                c((View) obj, (Float) obj2);
                return;
        }
    }
}
