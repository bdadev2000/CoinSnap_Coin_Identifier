package com.glority.widget.tooltips;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.glority.widget.R;
import com.glority.widget.databinding.ItemGlPickerBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlToolTipsAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTipsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/glority/widget/tooltips/GlToolTipsAdapter$ViewHolder;", "glToolTips", "Lcom/glority/widget/tooltips/GlToolTips;", "data", "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "selectable", "", "glToolTipsOnItemClickListener", "Lcom/glority/widget/tooltips/GlToolTipsOnItemClickListener;", "isLight", "showDivider", "(Lcom/glority/widget/tooltips/GlToolTips;Ljava/util/List;ZLcom/glority/widget/tooltips/GlToolTipsOnItemClickListener;ZZ)V", "getData", "()Ljava/util/List;", "getSelectable", "()Z", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlToolTipsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final List<GlToolTipsItem> data;
    private final GlToolTips glToolTips;
    private final GlToolTipsOnItemClickListener glToolTipsOnItemClickListener;
    private boolean isLight;
    private final boolean selectable;
    private final boolean showDivider;

    public final List<GlToolTipsItem> getData() {
        return this.data;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    public GlToolTipsAdapter(GlToolTips glToolTips, List<GlToolTipsItem> data, boolean z, GlToolTipsOnItemClickListener glToolTipsOnItemClickListener, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(glToolTips, "glToolTips");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(glToolTipsOnItemClickListener, "glToolTipsOnItemClickListener");
        this.glToolTips = glToolTips;
        this.data = data;
        this.selectable = z;
        this.glToolTipsOnItemClickListener = glToolTipsOnItemClickListener;
        this.isLight = z2;
        this.showDivider = z3;
    }

    /* compiled from: GlToolTipsAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/tooltips/GlToolTipsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/glority/widget/databinding/ItemGlPickerBinding;", "(Lcom/glority/widget/databinding/ItemGlPickerBinding;)V", "getBinding", "()Lcom/glority/widget/databinding/ItemGlPickerBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemGlPickerBinding binding;

        public final ItemGlPickerBinding getBinding() {
            return this.binding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ItemGlPickerBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemGlPickerBinding inflate = ItemGlPickerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "ItemGlPickerBinding.infl…nt.context),parent,false)");
        return new ViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final GlToolTipsItem glToolTipsItem = this.data.get(position);
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        final Context context = view.getContext();
        View view2 = holder.getBinding().divider;
        Intrinsics.checkNotNullExpressionValue(view2, "holder.binding.divider");
        view2.setVisibility((!this.showDivider || position == this.data.size() + (-1)) ? 8 : 0);
        if (glToolTipsItem.getDrawableRes() != null) {
            ImageView imageView = holder.getBinding().icon;
            Integer drawableRes = glToolTipsItem.getDrawableRes();
            Intrinsics.checkNotNull(drawableRes);
            imageView.setImageResource(drawableRes.intValue());
            ImageView imageView2 = holder.getBinding().icon;
            Intrinsics.checkNotNullExpressionValue(imageView2, "holder.binding.icon");
            imageView2.setVisibility(0);
        } else if (glToolTipsItem.getImageUrl() != null) {
            ImageView imageView3 = holder.getBinding().icon;
            Intrinsics.checkNotNullExpressionValue(imageView3, "holder.binding.icon");
            imageView3.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(Glide.with(holder.getBinding().icon).load(glToolTipsItem.getImageUrl()).into(holder.getBinding().icon), "Glide.with(holder.bindin…into(holder.binding.icon)");
        } else {
            ImageView imageView4 = holder.getBinding().icon;
            Intrinsics.checkNotNullExpressionValue(imageView4, "holder.binding.icon");
            imageView4.setVisibility(8);
        }
        TextView textView = holder.getBinding().title;
        Intrinsics.checkNotNullExpressionValue(textView, "holder.binding.title");
        textView.setText(glToolTipsItem.getText());
        if (this.selectable) {
            FrameLayout frameLayout = holder.getBinding().selectedIv;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "holder.binding.selectedIv");
            frameLayout.setVisibility(glToolTipsItem.getSelected() ? 0 : 8);
            if (this.isLight) {
                holder.getBinding().title.setTextColor(ContextCompat.getColor(context, R.color.gl_text_color1));
            } else {
                holder.getBinding().title.setTextColor(-1);
            }
            Typeface create = Typeface.create("sans-serif-medium", 0);
            Intrinsics.checkNotNullExpressionValue(create, "Typeface.create(\"sans-se…medium\", Typeface.NORMAL)");
            TextView textView2 = holder.getBinding().title;
            Intrinsics.checkNotNullExpressionValue(textView2, "holder.binding.title");
            textView2.setTypeface(create);
        } else {
            FrameLayout frameLayout2 = holder.getBinding().selectedIv;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "holder.binding.selectedIv");
            frameLayout2.setVisibility(8);
            if (this.isLight) {
                holder.getBinding().title.setTextColor(ContextCompat.getColor(context, R.color.gl_text_color1));
            } else {
                holder.getBinding().title.setTextColor(-1);
            }
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.tooltips.GlToolTipsAdapter$onBindViewHolder$$inlined$with$lambda$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                GlToolTips glToolTips;
                GlToolTipsOnItemClickListener glToolTipsOnItemClickListener;
                for (GlToolTipsItem glToolTipsItem2 : GlToolTipsAdapter.this.getData()) {
                    if (true ^ Intrinsics.areEqual(glToolTipsItem2, glToolTipsItem)) {
                        glToolTipsItem2.setSelected(false);
                    }
                }
                glToolTipsItem.setSelected(true);
                GlToolTipsAdapter.this.notifyDataSetChanged();
                glToolTips = GlToolTipsAdapter.this.glToolTips;
                glToolTips.dismiss();
                glToolTipsOnItemClickListener = GlToolTipsAdapter.this.glToolTipsOnItemClickListener;
                glToolTipsOnItemClickListener.onClick(position);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }
}
