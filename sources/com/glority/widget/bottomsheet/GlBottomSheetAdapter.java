package com.glority.widget.bottomsheet;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;
import com.glority.widget.databinding.ItemGlBottomSheetHorzBinding;
import com.glority.widget.databinding.ItemGlBottomSheetVertBinding;
import com.glority.widget.databinding.ItemGlDividerBinding;
import com.glority.widget.databinding.ItemGlGroupNameBinding;
import com.google.android.exoplayer2.C;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlBottomSheetAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001e\u001f !\"B9\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "data", "", "Lkotlin/Pair;", "", "", "glBottomSheetBuilder", "Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder;", "onItemClickListener", "Lcom/glority/widget/bottomsheet/GlBottomSheetOnClickListener;", "selectable", "", "(Ljava/util/List;Lcom/glority/widget/bottomsheet/GlBottomSheetBuilder;Lcom/glority/widget/bottomsheet/GlBottomSheetOnClickListener;Z)V", "hasIcon", "getItemCount", "getItemViewType", "position", "getRealPosition", "item", "Lcom/glority/widget/bottomsheet/GlBottomSheetItem;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "selected", "Companion", "DividerViewHolder", "GroupViewHolder", "HorzViewHolder", "VertViewHolder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlBottomSheetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int TYPE_DIVIDER = 2;
    public static final int TYPE_GROUP_NAME = 1;
    public static final int TYPE_HORZ = 4;
    public static final int TYPE_VERT = 3;
    private final List<Pair<Object, Integer>> data;
    private final GlBottomSheetBuilder glBottomSheetBuilder;
    private boolean hasIcon;
    private final GlBottomSheetOnClickListener onItemClickListener;
    private final boolean selectable;

    /* JADX WARN: Multi-variable type inference failed */
    public GlBottomSheetAdapter(List<? extends Pair<? extends Object, Integer>> data, GlBottomSheetBuilder glBottomSheetBuilder, GlBottomSheetOnClickListener glBottomSheetOnClickListener, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(glBottomSheetBuilder, "glBottomSheetBuilder");
        this.data = data;
        this.glBottomSheetBuilder = glBottomSheetBuilder;
        this.onItemClickListener = glBottomSheetOnClickListener;
        this.selectable = z;
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair.getFirst() instanceof GlBottomSheetItem) {
                Object first = pair.getFirst();
                if (first == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.widget.bottomsheet.GlBottomSheetItem");
                }
                if (((GlBottomSheetItem) first).getDrawable() != null) {
                    this.hasIcon = true;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (viewType == 1) {
            ItemGlGroupNameBinding inflate = ItemGlGroupNameBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "ItemGlGroupNameBinding.i…tInflater, parent, false)");
            return new GroupViewHolder(inflate);
        }
        if (viewType == 2) {
            ItemGlDividerBinding inflate2 = ItemGlDividerBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "ItemGlDividerBinding.inf…tInflater, parent, false)");
            return new DividerViewHolder(inflate2);
        }
        if (viewType == 3) {
            ItemGlBottomSheetVertBinding inflate3 = ItemGlBottomSheetVertBinding.inflate(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "ItemGlBottomSheetVertBin…  false\n                )");
            return new VertViewHolder(inflate3);
        }
        ItemGlBottomSheetHorzBinding inflate4 = ItemGlBottomSheetHorzBinding.inflate(from, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate4, "ItemGlBottomSheetHorzBin…  false\n                )");
        return new HorzViewHolder(inflate4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int i;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Pair<Object, Integer> pair = this.data.get(position);
        Object component1 = pair.component1();
        pair.component2().intValue();
        int itemViewType = getItemViewType(position);
        if (itemViewType == 1) {
            String str = (String) component1;
            if (str == null || str.length() == 0) {
                TextView textView = ((GroupViewHolder) holder).getItemGlGroupNameBinding().groupName;
                Intrinsics.checkNotNullExpressionValue(textView, "(holder as GroupViewHold…roupNameBinding.groupName");
                textView.setVisibility(8);
                return;
            }
            GroupViewHolder groupViewHolder = (GroupViewHolder) holder;
            TextView textView2 = groupViewHolder.getItemGlGroupNameBinding().groupName;
            Intrinsics.checkNotNullExpressionValue(textView2, "(holder as GroupViewHold…roupNameBinding.groupName");
            textView2.setVisibility(0);
            TextView textView3 = groupViewHolder.getItemGlGroupNameBinding().groupName;
            Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemGlGroupNameBinding.groupName");
            textView3.setText(str);
            return;
        }
        if (itemViewType == 3) {
            if (component1 != null) {
                final GlBottomSheetItem glBottomSheetItem = (GlBottomSheetItem) component1;
                ItemGlBottomSheetVertBinding itemGlBottomSheetVertBinding = ((VertViewHolder) holder).getItemGlBottomSheetVertBinding();
                if (!glBottomSheetItem.getEnable()) {
                    ConstraintLayout root = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "root");
                    root.setAlpha(0.5f);
                    ConstraintLayout root2 = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "root");
                    root2.setEnabled(false);
                } else {
                    ConstraintLayout root3 = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "root");
                    root3.setAlpha(1.0f);
                    ConstraintLayout root4 = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root4, "root");
                    root4.setEnabled(true);
                }
                CharSequence desc = glBottomSheetItem.getDesc();
                if (desc == null || desc.length() == 0) {
                    TextView desc2 = itemGlBottomSheetVertBinding.desc;
                    Intrinsics.checkNotNullExpressionValue(desc2, "desc");
                    i = 8;
                    desc2.setVisibility(8);
                } else {
                    TextView desc3 = itemGlBottomSheetVertBinding.desc;
                    Intrinsics.checkNotNullExpressionValue(desc3, "desc");
                    desc3.setVisibility(0);
                    TextView desc4 = itemGlBottomSheetVertBinding.desc;
                    Intrinsics.checkNotNullExpressionValue(desc4, "desc");
                    desc4.setText(glBottomSheetItem.getDesc());
                    i = 8;
                }
                TextView title = itemGlBottomSheetVertBinding.title;
                Intrinsics.checkNotNullExpressionValue(title, "title");
                title.setText(glBottomSheetItem.getText());
                if (glBottomSheetItem.getDrawable() == null) {
                    ImageView icon = itemGlBottomSheetVertBinding.icon;
                    Intrinsics.checkNotNullExpressionValue(icon, "icon");
                    icon.setVisibility(i);
                } else {
                    ImageView icon2 = itemGlBottomSheetVertBinding.icon;
                    Intrinsics.checkNotNullExpressionValue(icon2, "icon");
                    icon2.setVisibility(0);
                    itemGlBottomSheetVertBinding.icon.setImageDrawable(glBottomSheetItem.getDrawable());
                }
                if (this.selectable) {
                    if (glBottomSheetItem.getSelected()) {
                        FrameLayout selectedIv = itemGlBottomSheetVertBinding.selectedIv;
                        Intrinsics.checkNotNullExpressionValue(selectedIv, "selectedIv");
                        selectedIv.setVisibility(0);
                        Typeface create = Typeface.create("sans-serif-medium", 0);
                        Intrinsics.checkNotNullExpressionValue(create, "Typeface.create(\"sans-se…medium\", Typeface.NORMAL)");
                        TextView title2 = itemGlBottomSheetVertBinding.title;
                        Intrinsics.checkNotNullExpressionValue(title2, "title");
                        title2.setTypeface(create);
                        TextView textView4 = itemGlBottomSheetVertBinding.title;
                        TextView title3 = itemGlBottomSheetVertBinding.title;
                        Intrinsics.checkNotNullExpressionValue(title3, "title");
                        textView4.setTextColor(ContextCompat.getColor(title3.getContext(), R.color.gl_text_color1));
                    } else {
                        FrameLayout selectedIv2 = itemGlBottomSheetVertBinding.selectedIv;
                        Intrinsics.checkNotNullExpressionValue(selectedIv2, "selectedIv");
                        selectedIv2.setVisibility(4);
                        Typeface create2 = Typeface.create(C.SANS_SERIF_NAME, 0);
                        Intrinsics.checkNotNullExpressionValue(create2, "Typeface.create(\"sans-serif\", Typeface.NORMAL)");
                        TextView title4 = itemGlBottomSheetVertBinding.title;
                        Intrinsics.checkNotNullExpressionValue(title4, "title");
                        title4.setTypeface(create2);
                        TextView textView5 = itemGlBottomSheetVertBinding.title;
                        TextView title5 = itemGlBottomSheetVertBinding.title;
                        Intrinsics.checkNotNullExpressionValue(title5, "title");
                        textView5.setTextColor(ContextCompat.getColor(title5.getContext(), R.color.gl_text_color2));
                    }
                } else {
                    FrameLayout selectedIv3 = itemGlBottomSheetVertBinding.selectedIv;
                    Intrinsics.checkNotNullExpressionValue(selectedIv3, "selectedIv");
                    selectedIv3.setVisibility(8);
                }
                if (!this.hasIcon) {
                    ConstraintLayout root5 = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root5, "root");
                    Context context = root5.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "root.context");
                    Resources resources = context.getResources();
                    int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.x48);
                    int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.x24);
                    ConstraintLayout root6 = itemGlBottomSheetVertBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root6, "root");
                    root6.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
                    float f = resources.getDisplayMetrics().scaledDensity;
                    TextView title6 = itemGlBottomSheetVertBinding.title;
                    Intrinsics.checkNotNullExpressionValue(title6, "title");
                    title6.setTextSize((resources.getDimension(R.dimen.x32) / f) + 0.5f);
                }
                itemGlBottomSheetVertBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.bottomsheet.GlBottomSheetAdapter$onBindViewHolder$$inlined$with$lambda$1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GlBottomSheetBuilder glBottomSheetBuilder;
                        boolean z;
                        GlBottomSheetOnClickListener glBottomSheetOnClickListener;
                        int realPosition;
                        glBottomSheetBuilder = GlBottomSheetAdapter.this.glBottomSheetBuilder;
                        BottomSheetDialog bottomSheetDialog = glBottomSheetBuilder.getBottomSheetDialog();
                        if (bottomSheetDialog != null) {
                            z = GlBottomSheetAdapter.this.selectable;
                            if (z) {
                                GlBottomSheetAdapter.this.selected(glBottomSheetItem);
                                GlBottomSheetAdapter.this.notifyDataSetChanged();
                            }
                            glBottomSheetOnClickListener = GlBottomSheetAdapter.this.onItemClickListener;
                            if (glBottomSheetOnClickListener != null) {
                                realPosition = GlBottomSheetAdapter.this.getRealPosition(glBottomSheetItem);
                                glBottomSheetOnClickListener.onClick(realPosition, bottomSheetDialog);
                            }
                        }
                    }
                });
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.glority.widget.bottomsheet.GlBottomSheetItem");
        }
        if (itemViewType != 4) {
            return;
        }
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        int dimensionPixelOffset3 = view.getResources().getDimensionPixelOffset(R.dimen.x24);
        if (component1 != null) {
            final GlBottomSheetItem glBottomSheetItem2 = (GlBottomSheetItem) component1;
            View view2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
            Object systemService = view2.getContext().getSystemService("window");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "(holder.itemView.context…ger).currentWindowMetrics");
            int width = getItemCount() > 4 ? (int) ((r5 - dimensionPixelOffset3) / 4.3d) : (currentWindowMetrics.getBounds().width() - (dimensionPixelOffset3 * 2)) / getItemCount();
            View view3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
            View view4 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "holder.itemView");
            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            layoutParams.width = width;
            Unit unit = Unit.INSTANCE;
            view3.setLayoutParams(layoutParams);
            if (getItemCount() == 1) {
                View view5 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "holder.itemView");
                ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams2).setMarginStart(dimensionPixelOffset3);
                View view6 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "holder.itemView");
                ViewGroup.LayoutParams layoutParams3 = view6.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams3).setMarginEnd(dimensionPixelOffset3);
            } else if (position == 0) {
                View view7 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "holder.itemView");
                ViewGroup.LayoutParams layoutParams4 = view7.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams4).setMarginStart(dimensionPixelOffset3);
                View view8 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "holder.itemView");
                ViewGroup.LayoutParams layoutParams5 = view8.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams5).setMarginEnd(0);
            } else if (position == getItemCount() - 1) {
                View view9 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "holder.itemView");
                ViewGroup.LayoutParams layoutParams6 = view9.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams6).setMarginEnd(dimensionPixelOffset3);
                View view10 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "holder.itemView");
                ViewGroup.LayoutParams layoutParams7 = view10.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams7).setMarginStart(0);
            } else {
                View view11 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "holder.itemView");
                ViewGroup.LayoutParams layoutParams8 = view11.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams8).setMarginEnd(0);
                View view12 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "holder.itemView");
                ViewGroup.LayoutParams layoutParams9 = view12.getLayoutParams();
                if (layoutParams9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
                ((RecyclerView.LayoutParams) layoutParams9).setMarginStart(0);
            }
            ItemGlBottomSheetHorzBinding itemHorzBinding = ((HorzViewHolder) holder).getItemHorzBinding();
            if (!glBottomSheetItem2.getEnable()) {
                ConstraintLayout root7 = itemHorzBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root7, "root");
                root7.setAlpha(0.5f);
                ConstraintLayout root8 = itemHorzBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root8, "root");
                root8.setEnabled(false);
            } else {
                ConstraintLayout root9 = itemHorzBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root9, "root");
                root9.setAlpha(1.0f);
                ConstraintLayout root10 = itemHorzBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root10, "root");
                root10.setEnabled(true);
            }
            TextView title7 = itemHorzBinding.title;
            Intrinsics.checkNotNullExpressionValue(title7, "title");
            title7.setText(glBottomSheetItem2.getText());
            if (glBottomSheetItem2.getDrawable() == null) {
                ImageView icon3 = itemHorzBinding.icon;
                Intrinsics.checkNotNullExpressionValue(icon3, "icon");
                icon3.setVisibility(8);
            } else {
                itemHorzBinding.icon.setImageDrawable(glBottomSheetItem2.getDrawable());
            }
            itemHorzBinding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.bottomsheet.GlBottomSheetAdapter$onBindViewHolder$$inlined$with$lambda$2
                /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
                
                    r0 = r3.this$0.onItemClickListener;
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onClick(android.view.View r4) {
                    /*
                        r3 = this;
                        com.glority.widget.bottomsheet.GlBottomSheetAdapter r4 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.this
                        com.glority.widget.bottomsheet.GlBottomSheetBuilder r4 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.access$getGlBottomSheetBuilder$p(r4)
                        com.google.android.material.bottomsheet.BottomSheetDialog r4 = r4.getBottomSheetDialog()
                        if (r4 == 0) goto L1f
                        com.glority.widget.bottomsheet.GlBottomSheetAdapter r0 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.this
                        com.glority.widget.bottomsheet.GlBottomSheetOnClickListener r0 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.access$getOnItemClickListener$p(r0)
                        if (r0 == 0) goto L1f
                        com.glority.widget.bottomsheet.GlBottomSheetAdapter r1 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.this
                        com.glority.widget.bottomsheet.GlBottomSheetItem r2 = r2
                        int r1 = com.glority.widget.bottomsheet.GlBottomSheetAdapter.access$getRealPosition(r1, r2)
                        r0.onClick(r1, r4)
                    L1f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.bottomsheet.GlBottomSheetAdapter$onBindViewHolder$$inlined$with$lambda$2.onClick(android.view.View):void");
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.widget.bottomsheet.GlBottomSheetItem");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.data.get(position).getSecond().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealPosition(GlBottomSheetItem item) {
        List<Pair<Object, Integer>> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = (Pair) obj;
            if (((Number) pair.getSecond()).intValue() != 1 && ((Number) pair.getSecond()).intValue() != 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Pair) it.next()).getFirst());
        }
        return arrayList3.indexOf(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selected(GlBottomSheetItem item) {
        item.setSelected(true);
        Iterator<T> it = this.data.iterator();
        while (it.hasNext()) {
            Object first = ((Pair) it.next()).getFirst();
            if ((first instanceof GlBottomSheetItem) && (!Intrinsics.areEqual(first, item))) {
                ((GlBottomSheetItem) first).setSelected(false);
            }
        }
    }

    /* compiled from: GlBottomSheetAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemGlGroupNameBinding", "Lcom/glority/widget/databinding/ItemGlGroupNameBinding;", "(Lcom/glority/widget/databinding/ItemGlGroupNameBinding;)V", "getItemGlGroupNameBinding", "()Lcom/glority/widget/databinding/ItemGlGroupNameBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class GroupViewHolder extends RecyclerView.ViewHolder {
        private final ItemGlGroupNameBinding itemGlGroupNameBinding;

        public final ItemGlGroupNameBinding getItemGlGroupNameBinding() {
            return this.itemGlGroupNameBinding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupViewHolder(ItemGlGroupNameBinding itemGlGroupNameBinding) {
            super(itemGlGroupNameBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemGlGroupNameBinding, "itemGlGroupNameBinding");
            this.itemGlGroupNameBinding = itemGlGroupNameBinding;
        }
    }

    /* compiled from: GlBottomSheetAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetAdapter$DividerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemGlDividerBinding", "Lcom/glority/widget/databinding/ItemGlDividerBinding;", "(Lcom/glority/widget/databinding/ItemGlDividerBinding;)V", "getItemGlDividerBinding", "()Lcom/glority/widget/databinding/ItemGlDividerBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class DividerViewHolder extends RecyclerView.ViewHolder {
        private final ItemGlDividerBinding itemGlDividerBinding;

        public final ItemGlDividerBinding getItemGlDividerBinding() {
            return this.itemGlDividerBinding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DividerViewHolder(ItemGlDividerBinding itemGlDividerBinding) {
            super(itemGlDividerBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemGlDividerBinding, "itemGlDividerBinding");
            this.itemGlDividerBinding = itemGlDividerBinding;
        }
    }

    /* compiled from: GlBottomSheetAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetAdapter$VertViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemGlBottomSheetVertBinding", "Lcom/glority/widget/databinding/ItemGlBottomSheetVertBinding;", "(Lcom/glority/widget/databinding/ItemGlBottomSheetVertBinding;)V", "getItemGlBottomSheetVertBinding", "()Lcom/glority/widget/databinding/ItemGlBottomSheetVertBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class VertViewHolder extends RecyclerView.ViewHolder {
        private final ItemGlBottomSheetVertBinding itemGlBottomSheetVertBinding;

        public final ItemGlBottomSheetVertBinding getItemGlBottomSheetVertBinding() {
            return this.itemGlBottomSheetVertBinding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VertViewHolder(ItemGlBottomSheetVertBinding itemGlBottomSheetVertBinding) {
            super(itemGlBottomSheetVertBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemGlBottomSheetVertBinding, "itemGlBottomSheetVertBinding");
            this.itemGlBottomSheetVertBinding = itemGlBottomSheetVertBinding;
        }
    }

    /* compiled from: GlBottomSheetAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/bottomsheet/GlBottomSheetAdapter$HorzViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemHorzBinding", "Lcom/glority/widget/databinding/ItemGlBottomSheetHorzBinding;", "(Lcom/glority/widget/databinding/ItemGlBottomSheetHorzBinding;)V", "getItemHorzBinding", "()Lcom/glority/widget/databinding/ItemGlBottomSheetHorzBinding;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class HorzViewHolder extends RecyclerView.ViewHolder {
        private final ItemGlBottomSheetHorzBinding itemHorzBinding;

        public final ItemGlBottomSheetHorzBinding getItemHorzBinding() {
            return this.itemHorzBinding;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HorzViewHolder(ItemGlBottomSheetHorzBinding itemHorzBinding) {
            super(itemHorzBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemHorzBinding, "itemHorzBinding");
            this.itemHorzBinding = itemHorzBinding;
        }
    }
}
