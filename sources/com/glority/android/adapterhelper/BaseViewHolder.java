package com.glority.android.adapterhelper;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseViewHolder.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0015\u001a\u00020\u00002\f\b\u0001\u0010\u0016\u001a\u00020\u0017\"\u00020\u000fJ\u0014\u0010\u0018\u001a\u00020\u00002\f\b\u0001\u0010\u0016\u001a\u00020\u0017\"\u00020\u000fJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001cJ\u001f\u0010\u001d\u001a\u0002H\u001e\"\b\b\u0000\u0010\u001e*\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u000f¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000fJ\u0018\u0010\"\u001a\u00020\u00002\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0018\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020#J\u0018\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&J\u001a\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010(\u001a\u00020\u000fJ\u001a\u0010)\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020\u000fJ\u0018\u0010+\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-J\u0018\u0010.\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020-J\u0018\u00100\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u00101\u001a\u00020-J\u001a\u00102\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000104J\u001a\u00105\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u000107J\u001a\u00108\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u00109\u001a\u00020\u000fJ\u0018\u0010:\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fJ\u0014\u0010<\u001a\u00020\u00002\f\b\u0001\u0010\u0016\u001a\u00020\u0017\"\u00020\u000fJ\u001a\u0010=\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?J\u001c\u0010@\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010AH\u0007J\u001c\u0010B\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010CH\u0007J\u001a\u0010D\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010EJ\u001a\u0010F\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010GJ\u001c\u0010H\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010IH\u0007J\u001c\u0010J\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010KH\u0007J\u0018\u0010L\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000fJ \u0010L\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fJ\u0018\u0010N\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020&J \u0010N\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020&2\u0006\u0010;\u001a\u00020\u000fJ\u001a\u0010P\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010Q\u001a\u0004\u0018\u00010\bJ\"\u0010P\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\b\u0010Q\u001a\u0004\u0018\u00010\bJ\u001a\u0010S\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010TJ\u001a\u0010S\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010U\u001a\u00020\u000fJ\u001a\u0010V\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\b\u0001\u0010W\u001a\u00020\u000fJ\u001c\u0010X\u001a\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010Z2\n\u0010\u0016\u001a\u00020\u0017\"\u00020\u000fJ\u001a\u0010X\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010ZJ\u0018\u0010[\u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\u000f2\u0006\u00101\u001a\u00020-R\u0018\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/glority/android/adapterhelper/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "adapter", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "associatedObject", "", "getAssociatedObject", "()Ljava/lang/Object;", "setAssociatedObject", "(Ljava/lang/Object;)V", "childClickViewIds", "Ljava/util/LinkedHashSet;", "", "itemChildLongClickViewIds", "nestViews", "Ljava/util/HashSet;", "views", "Landroid/util/SparseArray;", "addOnClickListener", "viewIds", "", "addOnLongClickListener", "getChildClickViewIds", "getItemChildLongClickViewIds", "getNestViews", "", "getView", ExifInterface.GPS_DIRECTION_TRUE, "viewId", "(I)Landroid/view/View;", "linkify", "setAdapter", "Landroid/widget/Adapter;", "setAlpha", "value", "", "setBackgroundColor", "color", "setBackgroundRes", "backgroundRes", "setChecked", "checked", "", "setEnabled", "enable", "setGone", "visible", "setImageBitmap", "bitmap", "Landroid/graphics/Bitmap;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageResource", "imageResId", "setMax", "max", "setNestView", "setOnCheckedChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnClickListener", "Landroid/view/View$OnClickListener;", "setOnItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "setOnItemLongClickListener", "Landroid/widget/AdapterView$OnItemLongClickListener;", "setOnItemSelectedClickListener", "Landroid/widget/AdapterView$OnItemSelectedListener;", "setOnLongClickListener", "Landroid/view/View$OnLongClickListener;", "setOnTouchListener", "Landroid/view/View$OnTouchListener;", "setProgress", "progress", "setRating", "rating", "setTag", "tag", "key", "setText", "", "strId", "setTextColor", "textColor", "setTypeface", "typeface", "Landroid/graphics/Typeface;", "setVisible", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private BaseQuickAdapter<?, ?> adapter;
    private Object associatedObject;
    private final LinkedHashSet<Integer> childClickViewIds;
    private final LinkedHashSet<Integer> itemChildLongClickViewIds;
    private final HashSet<Integer> nestViews;
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.views = new SparseArray<>();
        this.childClickViewIds = new LinkedHashSet<>();
        this.itemChildLongClickViewIds = new LinkedHashSet<>();
        this.nestViews = new HashSet<>();
    }

    public final Set<Integer> getNestViews() {
        return this.nestViews;
    }

    public final Object getAssociatedObject() {
        return this.associatedObject;
    }

    public final void setAssociatedObject(Object obj) {
        this.associatedObject = obj;
    }

    public final HashSet<Integer> getItemChildLongClickViewIds() {
        return this.itemChildLongClickViewIds;
    }

    public final HashSet<Integer> getChildClickViewIds() {
        return this.childClickViewIds;
    }

    public final BaseViewHolder setText(int viewId, CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    public final BaseViewHolder setText(int viewId, int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }

    public final BaseViewHolder setImageResource(int viewId, int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    public final BaseViewHolder setBackgroundColor(int viewId, int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    public final BaseViewHolder setBackgroundRes(int viewId, int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    public final BaseViewHolder setTextColor(int viewId, int textColor) {
        ((TextView) getView(viewId)).setTextColor(textColor);
        return this;
    }

    public final BaseViewHolder setImageDrawable(int viewId, Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    public final BaseViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    public final BaseViewHolder setAlpha(int viewId, float value) {
        getView(viewId).setAlpha(value);
        return this;
    }

    public final BaseViewHolder setGone(int viewId, boolean visible) {
        getView(viewId).setVisibility(visible ? 0 : 8);
        return this;
    }

    public final BaseViewHolder setVisible(int viewId, boolean visible) {
        getView(viewId).setVisibility(visible ? 0 : 4);
        return this;
    }

    public final BaseViewHolder linkify(int viewId) {
        Linkify.addLinks((TextView) getView(viewId), 15);
        return this;
    }

    public final BaseViewHolder setTypeface(int viewId, Typeface typeface) {
        TextView textView = (TextView) getView(viewId);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    public final BaseViewHolder setTypeface(Typeface typeface, int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i = 0;
        while (i < length) {
            int i2 = viewIds[i];
            i++;
            TextView textView = (TextView) getView(i2);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }

    public final BaseViewHolder setProgress(int viewId, int progress) {
        ((ProgressBar) getView(viewId)).setProgress(progress);
        return this;
    }

    public final BaseViewHolder setProgress(int viewId, int progress, int max) {
        ProgressBar progressBar = (ProgressBar) getView(viewId);
        progressBar.setMax(max);
        progressBar.setProgress(progress);
        return this;
    }

    public final BaseViewHolder setMax(int viewId, int max) {
        ((ProgressBar) getView(viewId)).setMax(max);
        return this;
    }

    public final BaseViewHolder setRating(int viewId, float rating) {
        ((RatingBar) getView(viewId)).setRating(rating);
        return this;
    }

    public final BaseViewHolder setRating(int viewId, float rating, int max) {
        RatingBar ratingBar = (RatingBar) getView(viewId);
        ratingBar.setMax(max);
        ratingBar.setRating(rating);
        return this;
    }

    @Deprecated(message = "")
    public final BaseViewHolder setOnClickListener(int viewId, View.OnClickListener listener) {
        getView(viewId).setOnClickListener(listener);
        return this;
    }

    public final BaseViewHolder addOnClickListener(int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i = 0;
        while (i < length) {
            int i2 = viewIds[i];
            i++;
            this.childClickViewIds.add(Integer.valueOf(i2));
            View view = getView(i2);
            if (!view.isClickable()) {
                view.setClickable(true);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.adapterhelper.BaseViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BaseViewHolder.m7692addOnClickListener$lambda0(BaseViewHolder.this, view2);
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addOnClickListener$lambda-0, reason: not valid java name */
    public static final void m7692addOnClickListener$lambda0(BaseViewHolder this$0, View v) {
        int adapterPosition;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseQuickAdapter<?, ?> baseQuickAdapter = this$0.adapter;
        if ((baseQuickAdapter == null ? null : baseQuickAdapter.getOnItemChildClickListener()) == null || (adapterPosition = this$0.getAdapterPosition()) == -1) {
            return;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter2 = this$0.adapter;
        Intrinsics.checkNotNull(baseQuickAdapter2);
        int headerLayoutCount = adapterPosition - baseQuickAdapter2.getHeaderLayoutCount();
        BaseQuickAdapter<?, ?> baseQuickAdapter3 = this$0.adapter;
        Intrinsics.checkNotNull(baseQuickAdapter3);
        BaseQuickAdapter.OnItemChildClickListener onItemChildClickListener = baseQuickAdapter3.getOnItemChildClickListener();
        Intrinsics.checkNotNull(onItemChildClickListener);
        BaseQuickAdapter<?, ?> baseQuickAdapter4 = this$0.adapter;
        Intrinsics.checkNotNull(baseQuickAdapter4);
        Intrinsics.checkNotNullExpressionValue(v, "v");
        onItemChildClickListener.onItemChildClick(baseQuickAdapter4, v, headerLayoutCount);
    }

    public final BaseViewHolder setNestView(int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i = 0;
        while (i < length) {
            int i2 = viewIds[i];
            i++;
            this.nestViews.add(Integer.valueOf(i2));
        }
        addOnClickListener(Arrays.copyOf(viewIds, viewIds.length));
        addOnLongClickListener(Arrays.copyOf(viewIds, viewIds.length));
        return this;
    }

    public final BaseViewHolder addOnLongClickListener(int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        int length = viewIds.length;
        int i = 0;
        while (i < length) {
            int i2 = viewIds[i];
            i++;
            this.itemChildLongClickViewIds.add(Integer.valueOf(i2));
            View view = getView(i2);
            if (!view.isLongClickable()) {
                view.setLongClickable(true);
            }
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.glority.android.adapterhelper.BaseViewHolder$$ExternalSyntheticLambda1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m7693addOnLongClickListener$lambda1;
                    m7693addOnLongClickListener$lambda1 = BaseViewHolder.m7693addOnLongClickListener$lambda1(BaseViewHolder.this, view2);
                    return m7693addOnLongClickListener$lambda1;
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addOnLongClickListener$lambda-1, reason: not valid java name */
    public static final boolean m7693addOnLongClickListener$lambda1(BaseViewHolder this$0, View view) {
        int adapterPosition;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseQuickAdapter<?, ?> baseQuickAdapter = this$0.adapter;
        if ((baseQuickAdapter == null ? null : baseQuickAdapter.getOnItemChildLongClickListener()) == null || (adapterPosition = this$0.getAdapterPosition()) == -1) {
            return false;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter2 = this$0.adapter;
        Intrinsics.checkNotNull(baseQuickAdapter2);
        int headerLayoutCount = adapterPosition - baseQuickAdapter2.getHeaderLayoutCount();
        BaseQuickAdapter<?, ?> baseQuickAdapter3 = this$0.adapter;
        Intrinsics.checkNotNull(baseQuickAdapter3);
        BaseQuickAdapter.OnItemChildLongClickListener onItemChildLongClickListener = baseQuickAdapter3.getOnItemChildLongClickListener();
        Intrinsics.checkNotNull(onItemChildLongClickListener);
        return onItemChildLongClickListener.onItemChildLongClick(this$0.adapter, view, headerLayoutCount);
    }

    @Deprecated(message = "")
    public final BaseViewHolder setOnTouchListener(int viewId, View.OnTouchListener listener) {
        getView(viewId).setOnTouchListener(listener);
        return this;
    }

    @Deprecated(message = "")
    public final BaseViewHolder setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        getView(viewId).setOnLongClickListener(listener);
        return this;
    }

    @Deprecated(message = "")
    public final BaseViewHolder setOnItemClickListener(int viewId, AdapterView.OnItemClickListener listener) {
        ((AdapterView) getView(viewId)).setOnItemClickListener(listener);
        return this;
    }

    public final BaseViewHolder setOnItemLongClickListener(int viewId, AdapterView.OnItemLongClickListener listener) {
        ((AdapterView) getView(viewId)).setOnItemLongClickListener(listener);
        return this;
    }

    public final BaseViewHolder setOnItemSelectedClickListener(int viewId, AdapterView.OnItemSelectedListener listener) {
        ((AdapterView) getView(viewId)).setOnItemSelectedListener(listener);
        return this;
    }

    public final BaseViewHolder setOnCheckedChangeListener(int viewId, CompoundButton.OnCheckedChangeListener listener) {
        ((CompoundButton) getView(viewId)).setOnCheckedChangeListener(listener);
        return this;
    }

    public final BaseViewHolder setTag(int viewId, Object tag) {
        getView(viewId).setTag(tag);
        return this;
    }

    public final BaseViewHolder setTag(int viewId, int key, Object tag) {
        getView(viewId).setTag(key, tag);
        return this;
    }

    public final BaseViewHolder setChecked(int viewId, boolean checked) {
        KeyEvent.Callback view = getView(viewId);
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(checked);
        }
        return this;
    }

    public final BaseViewHolder setEnabled(int viewId, boolean enable) {
        getView(viewId).setEnabled(enable);
        return this;
    }

    public final BaseViewHolder setAdapter(int viewId, Adapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        ((AdapterView) getView(viewId)).setAdapter(adapter);
        return this;
    }

    public final BaseViewHolder setAdapter(BaseQuickAdapter<?, ?> adapter) {
        this.adapter = adapter;
        return this;
    }

    public final <T extends View> T getView(int viewId) {
        T t = (T) this.views.get(viewId);
        if (t == null && (t = (T) this.itemView.findViewById(viewId)) != null) {
            this.views.put(viewId, t);
        }
        if (t != null) {
            return t;
        }
        throw new Exception("viewId " + viewId + " not found");
    }
}
