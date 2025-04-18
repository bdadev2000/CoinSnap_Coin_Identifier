package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class b {
    public static final DataBinderMapperImpl a = new DataBinderMapperImpl();

    public static e a(View view, int i10) {
        return a.b(view, i10);
    }

    public static e b(ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return a(viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return a.c(viewArr, i11);
    }

    public static e c(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(i10, viewGroup, false), i10);
    }
}
