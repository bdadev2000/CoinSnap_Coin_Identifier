package E;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f937a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public float f938c;

    /* renamed from: d, reason: collision with root package name */
    public float f939d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f961g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 1) {
                this.f938c = obtainStyledAttributes.getFloat(index, this.f938c);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f937a);
                this.f937a = i10;
                this.f937a = o.f951d[i10];
            } else if (index == 4) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == 3) {
                this.f939d = obtainStyledAttributes.getFloat(index, this.f939d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
