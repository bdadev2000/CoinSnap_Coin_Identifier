package com.glority.android.adapterhelper.util;

import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiTypeDelegate.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0002\b&\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u001c\u0010\u0011\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00020\rJ\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\rJ\u001c\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00002\f\b\u0001\u0010\u001c\u001a\u00020\u001d\"\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/glority/android/adapterhelper/util/MultiTypeDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "", "layouts", "Landroid/util/SparseIntArray;", "(Landroid/util/SparseIntArray;)V", "()V", "autoMode", "", "selfMode", "addItemType", "", "type", "", "layoutResId", "checkMode", "mode", "getDefItemViewType", "data", "", "position", "getItemType", "t", "(Ljava/lang/Object;)I", "getLayoutId", "viewType", "registerItemType", "registerItemTypeAutoIncrease", "layoutResIds", "", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class MultiTypeDelegate<T> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    protected abstract int getItemType(T t);

    public MultiTypeDelegate(SparseIntArray sparseIntArray) {
        this.layouts = sparseIntArray;
    }

    public MultiTypeDelegate() {
    }

    public final int getDefItemViewType(List<? extends T> data, int position) {
        Intrinsics.checkNotNullParameter(data, "data");
        T t = data.get(position);
        return t == null ? DEFAULT_VIEW_TYPE : getItemType(t);
    }

    public final int getLayoutId(int viewType) {
        SparseIntArray sparseIntArray = this.layouts;
        Intrinsics.checkNotNull(sparseIntArray);
        return sparseIntArray.get(viewType, BaseMultiItemQuickAdapter.TYPE_NOT_FOUND);
    }

    private final void addItemType(int type, int layoutResId) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        SparseIntArray sparseIntArray = this.layouts;
        Intrinsics.checkNotNull(sparseIntArray);
        sparseIntArray.put(type, layoutResId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MultiTypeDelegate<?> registerItemTypeAutoIncrease(int... layoutResIds) {
        Intrinsics.checkNotNullParameter(layoutResIds, "layoutResIds");
        this.autoMode = true;
        checkMode(this.selfMode);
        int length = layoutResIds.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                addItemType(i, layoutResIds[i]);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MultiTypeDelegate<?> registerItemType(int type, int layoutResId) {
        this.selfMode = true;
        checkMode(this.autoMode);
        addItemType(type, layoutResId);
        return this;
    }

    private final void checkMode(boolean mode) {
        if (!(!mode)) {
            throw new IllegalArgumentException("Don't mess two register mode".toString());
        }
    }
}
