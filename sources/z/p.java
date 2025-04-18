package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f28444b;

    public p(Context context) {
        super(context);
        this.f28444b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f28444b = z10;
    }

    public void setGuidelineBegin(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f28444b && eVar.a == i10) {
            return;
        }
        eVar.a = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i10) {
        e eVar = (e) getLayoutParams();
        if (this.f28444b && eVar.f28314b == i10) {
            return;
        }
        eVar.f28314b = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f10) {
        e eVar = (e) getLayoutParams();
        if (this.f28444b && eVar.f28316c == f10) {
            return;
        }
        eVar.f28316c = f10;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
