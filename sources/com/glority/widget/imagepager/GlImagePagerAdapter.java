package com.glority.widget.imagepager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.glority.android.netimageadapter.ExtensionsKt;
import com.glority.android.netimageadapter.NetImageSelfAdapter;
import com.glority.imagezoomview.imagezoom.ImageViewTouch;
import com.glority.imagezoomview.imagezoom.ImageViewTouchBase;
import com.glority.widget.GlWidgetConfig;
import com.glority.widget.databinding.ItemGlImagePagerBinding;
import com.glority.widget.imagepager.GlImagePager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlImagePagerAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/glority/widget/imagepager/GlImagePagerAdapter$Holder;", "data", "", "Lcom/glority/widget/imagepager/GlImageItem;", "glImagePager", "Lcom/glority/widget/imagepager/GlImagePager;", "loadingHolder", "", "errorHolder", "(Ljava/util/List;Lcom/glority/widget/imagepager/GlImagePager;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getData", "()Ljava/util/List;", "getErrorHolder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGlImagePager", "()Lcom/glority/widget/imagepager/GlImagePager;", "getLoadingHolder", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlImagePagerAdapter extends RecyclerView.Adapter<Holder> {
    private final List<GlImageItem> data;
    private final Integer errorHolder;
    private final GlImagePager glImagePager;
    private final Integer loadingHolder;

    public final List<GlImageItem> getData() {
        return this.data;
    }

    public final GlImagePager getGlImagePager() {
        return this.glImagePager;
    }

    public final Integer getLoadingHolder() {
        return this.loadingHolder;
    }

    public final Integer getErrorHolder() {
        return this.errorHolder;
    }

    public GlImagePagerAdapter(List<GlImageItem> data, GlImagePager glImagePager, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(glImagePager, "glImagePager");
        this.data = data;
        this.glImagePager = glImagePager;
        this.loadingHolder = num;
        this.errorHolder = num2;
    }

    /* compiled from: GlImagePagerAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/imagepager/GlImagePagerAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemGlImagePagerBinding", "Lcom/glority/widget/databinding/ItemGlImagePagerBinding;", "(Lcom/glority/widget/databinding/ItemGlImagePagerBinding;)V", "getItemGlImagePagerBinding", "()Lcom/glority/widget/databinding/ItemGlImagePagerBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Holder extends RecyclerView.ViewHolder {
        private final ItemGlImagePagerBinding itemGlImagePagerBinding;

        public final ItemGlImagePagerBinding getItemGlImagePagerBinding() {
            return this.itemGlImagePagerBinding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(ItemGlImagePagerBinding itemGlImagePagerBinding) {
            super(itemGlImagePagerBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemGlImagePagerBinding, "itemGlImagePagerBinding");
            this.itemGlImagePagerBinding = itemGlImagePagerBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemGlImagePagerBinding inflate = ItemGlImagePagerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "ItemGlImagePagerBinding.…      false\n            )");
        return new Holder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(Holder holder, int position) {
        RequestBuilder requestBuilder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final GlImageItem glImageItem = this.data.get(position);
        final GlImageViewTouch glImageViewTouch = holder.getItemGlImagePagerBinding().touchImageView;
        if (glImageViewTouch.getMScaleType() != ImageViewTouchBase.DisplayType.FIT_TO_SCREEN) {
            glImageViewTouch.setDisplayType(ImageViewTouchBase.DisplayType.FIT_TO_SCREEN);
        }
        glImageViewTouch.zoomTo(1.0f, 0L);
        glImageViewTouch.setSingleTapListener(new ImageViewTouch.OnImageViewTouchSingleTapListener() { // from class: com.glority.widget.imagepager.GlImagePagerAdapter$onBindViewHolder$$inlined$with$lambda$1
            @Override // com.glority.imagezoomview.imagezoom.ImageViewTouch.OnImageViewTouchSingleTapListener
            public void onSingleTapConfirmed() {
                GlImagePager.OnSingleTapListener onSingleTapListener = GlImagePagerAdapter.this.getGlImagePager().getOnSingleTapListener();
                if (onSingleTapListener != null) {
                    onSingleTapListener.tap(glImageItem);
                }
            }
        });
        glImageViewTouch.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.widget.imagepager.GlImagePagerAdapter$onBindViewHolder$$inlined$with$lambda$2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                GlImagePager.OnLongTapListener onLongTapListener = GlImagePagerAdapter.this.getGlImagePager().getOnLongTapListener();
                if (onLongTapListener == null) {
                    return true;
                }
                onLongTapListener.tap(glImageItem);
                return true;
            }
        });
        if (NetImageSelfAdapter.INSTANCE.isOpen()) {
            RequestManager with = Glide.with(glImageViewTouch);
            Intrinsics.checkNotNullExpressionValue(with, "Glide.with(this)");
            Context context = glImageViewTouch.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Cloneable dontAnimate = ExtensionsKt.loadWithThumbnail(with, context, glImageItem.getImageUrl()).error(GlWidgetConfig.INSTANCE.getErrorImageHolder()).dontAnimate();
            Intrinsics.checkNotNullExpressionValue(dontAnimate, "Glide.with(this).loadWit…mageHolder).dontAnimate()");
            requestBuilder = (RequestBuilder) dontAnimate;
        } else {
            RequestBuilder dontAnimate2 = Glide.with(glImageViewTouch).load(glImageItem.getImageUrl()).error(GlWidgetConfig.INSTANCE.getErrorImageHolder()).dontAnimate();
            Intrinsics.checkNotNullExpressionValue(dontAnimate2, "Glide.with(this).load(it…mageHolder).dontAnimate()");
            requestBuilder = dontAnimate2;
        }
        Integer num = this.loadingHolder;
        if (num != null && num.intValue() > 0) {
            RequestBuilder placeholder = requestBuilder.placeholder(this.loadingHolder.intValue());
            Intrinsics.checkNotNullExpressionValue(placeholder, "requestBuilder.placeholder(loadingHolder)");
            requestBuilder = placeholder;
        }
        Integer num2 = this.errorHolder;
        if (num2 != null && num2.intValue() > 0) {
            RequestBuilder error = requestBuilder.error(this.errorHolder.intValue());
            Intrinsics.checkNotNullExpressionValue(error, "requestBuilder.error(errorHolder)");
            requestBuilder = error;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }
}
