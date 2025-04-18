package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.a;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {
    public static final SparseIntArray a = new SparseIntArray(0);

    @Override // androidx.databinding.a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.a
    public final e b(View view, int i10) {
        if (a.get(i10) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final e c(View[] viewArr, int i10) {
        if (viewArr.length != 0 && a.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
