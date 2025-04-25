package com.glority.android.guide.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MyBaseRecycleAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001%B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/glority/android/guide/base/MyBaseRecycleAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "mLise", "", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "itemClickListent", "Lcom/glority/android/guide/base/MyBaseRecycleAdapter$ItemClickListent;", "getItemClickListent", "()Lcom/glority/android/guide/base/MyBaseRecycleAdapter$ItemClickListent;", "setItemClickListent", "(Lcom/glority/android/guide/base/MyBaseRecycleAdapter$ItemClickListent;)V", "getMLise", "()Ljava/util/List;", "setMLise", "(Ljava/util/List;)V", "BindViewHolder", "", "view", "Landroid/view/View;", "position", "", "getItemCount", "itemLayoutResId", "viewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ItemClickListent", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public abstract class MyBaseRecycleAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ItemClickListent itemClickListent;
    private List<? extends T> mLise;

    /* compiled from: MyBaseRecycleAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/guide/base/MyBaseRecycleAdapter$ItemClickListent;", "", "OnItemClickListent", "", "position", "", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public interface ItemClickListent {
        void OnItemClickListent(int position);
    }

    public abstract void BindViewHolder(View view, int position);

    public abstract int itemLayoutResId(int viewType);

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final List<T> getMLise() {
        return this.mLise;
    }

    public final void setMLise(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mLise = list;
    }

    public MyBaseRecycleAdapter(Context context, List<? extends T> mLise) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mLise, "mLise");
        this.context = context;
        this.mLise = mLise;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final View inflate = LayoutInflater.from(this.context).inflate(itemLayoutResId(viewType), parent, false);
        return new RecyclerView.ViewHolder(inflate) { // from class: com.glority.android.guide.base.MyBaseRecycleAdapter$onCreateViewHolder$1
            final /* synthetic */ View $view;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(inflate);
                this.$view = inflate;
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.itemClickListent != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.guide.base.MyBaseRecycleAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyBaseRecycleAdapter.m7752onBindViewHolder$lambda0(MyBaseRecycleAdapter.this, position, view);
                }
            });
        }
        BindViewHolder(holder.itemView, position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0, reason: not valid java name */
    public static final void m7752onBindViewHolder$lambda0(MyBaseRecycleAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ItemClickListent itemClickListent = this$0.getItemClickListent();
        Intrinsics.checkNotNull(itemClickListent);
        itemClickListent.OnItemClickListent(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mLise.size();
    }

    public final ItemClickListent getItemClickListent() {
        return this.itemClickListent;
    }

    public final void setItemClickListent(ItemClickListent itemClickListent) {
        this.itemClickListent = itemClickListent;
    }
}
