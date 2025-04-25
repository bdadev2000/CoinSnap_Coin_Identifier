package com.glority.android.core.utils.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiffLiveData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/glority/android/core/utils/data/DiffLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "(Ljava/lang/Object;)V", "postValue", "", "setValue", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DiffLiveData<T> extends MutableLiveData<T> {
    public DiffLiveData(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T value) {
        if (Intrinsics.areEqual(getValue(), value)) {
            return;
        }
        super.setValue(value);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T value) {
        if (Intrinsics.areEqual(getValue(), value)) {
            return;
        }
        super.postValue(value);
    }
}
