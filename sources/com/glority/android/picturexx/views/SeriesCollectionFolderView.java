package com.glority.android.picturexx.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.glority.android.picturexx.business.databinding.ViewSeriesCollectionFolderLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeriesCollectionFolderView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/views/SeriesCollectionFolderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewSeriesCollectionFolderLayoutBinding;", "setImage1", "", "any", "", "setImage2", "setImage3", "setImage4", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SeriesCollectionFolderView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ViewSeriesCollectionFolderLayoutBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeriesCollectionFolderView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeriesCollectionFolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SeriesCollectionFolderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesCollectionFolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewSeriesCollectionFolderLayoutBinding inflate = ViewSeriesCollectionFolderLayoutBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final void setImage1(Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        Glide.with(this.binding.ivSeriesCollectionFolder1).load(any).centerCrop().into(this.binding.ivSeriesCollectionFolder1);
    }

    public final void setImage2(Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        Glide.with(this.binding.ivSeriesCollectionFolder2).load(any).centerCrop().into(this.binding.ivSeriesCollectionFolder2);
    }

    public final void setImage3(Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        Glide.with(this.binding.ivSeriesCollectionFolder3).load(any).centerCrop().into(this.binding.ivSeriesCollectionFolder3);
    }

    public final void setImage4(Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        Glide.with(this.binding.ivSeriesCollectionFolder4).load(any).centerCrop().into(this.binding.ivSeriesCollectionFolder4);
    }
}
