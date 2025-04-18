package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {
    public int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f28423b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f28424c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f28425d = Float.NaN;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f28450g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f28424c = obtainStyledAttributes.getFloat(index, this.f28424c);
            } else if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.a);
                this.a = i11;
                this.a = n.f28439d[i11];
            } else if (index == 4) {
                this.f28423b = obtainStyledAttributes.getInt(index, this.f28423b);
            } else if (index == 3) {
                this.f28425d = obtainStyledAttributes.getFloat(index, this.f28425d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
