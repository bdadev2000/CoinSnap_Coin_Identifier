package androidx.constraintlayout.widget;

import E.e;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean b;

    public Guideline(Context context) {
        super(context);
        this.b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z8) {
        this.b = z8;
    }

    public void setGuidelineBegin(int i9) {
        e eVar = (e) getLayoutParams();
        if (this.b && eVar.f798a == i9) {
            return;
        }
        eVar.f798a = i9;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i9) {
        e eVar = (e) getLayoutParams();
        if (this.b && eVar.b == i9) {
            return;
        }
        eVar.b = i9;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f9) {
        e eVar = (e) getLayoutParams();
        if (this.b && eVar.f801c == f9) {
            return;
        }
        eVar.f801c = f9;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        super.setVisibility(8);
    }
}
