package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {
    public int a;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.f17879b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public a() {
        super(-2, -2);
        this.a = 8388627;
    }

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.a = 0;
        this.a = aVar.a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
