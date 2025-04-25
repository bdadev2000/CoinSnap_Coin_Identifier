package com.glority.android.cms.listener;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: ClickListener.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/cms/listener/ClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onClick", "", "view", "Landroid/view/View;", "t", "(Landroid/view/View;Ljava/lang/Object;)V", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public interface ClickListener<T> {
    void onClick(View view, T t);
}
