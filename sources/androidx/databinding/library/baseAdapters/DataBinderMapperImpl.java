package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import d0.AbstractC2154a;
import d0.AbstractC2158e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC2154a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f4493a = new SparseIntArray(0);

    @Override // d0.AbstractC2154a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // d0.AbstractC2154a
    public final AbstractC2158e b(View view, int i9) {
        if (f4493a.get(i9) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // d0.AbstractC2154a
    public final AbstractC2158e c(View[] viewArr, int i9) {
        if (viewArr.length == 0 || f4493a.get(i9) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
