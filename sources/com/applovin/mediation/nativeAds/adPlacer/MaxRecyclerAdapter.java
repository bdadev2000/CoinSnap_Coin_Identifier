package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.l0;
import androidx.recyclerview.widget.o1;
import androidx.recyclerview.widget.v0;
import com.applovin.impl.el;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends j0 implements MaxAdPlacer.Listener {
    private final MaxAdPlacer a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f9575b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9576c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f9577d;

    /* renamed from: e, reason: collision with root package name */
    private el f9578e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f9579f;

    /* renamed from: g, reason: collision with root package name */
    private int f9580g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f9581h;

    /* loaded from: classes.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* loaded from: classes.dex */
    public static class MaxAdRecyclerViewHolder extends o1 {
        private final ViewGroup a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class a implements el.a {
        public a() {
        }

        @Override // com.applovin.impl.el.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.a.updateFillablePositions(i10, Math.min(MaxRecyclerAdapter.this.f9580g + i11, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* loaded from: classes.dex */
    public class b extends l0 {
        private b() {
        }

        @Override // androidx.recyclerview.widget.l0
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.l0
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.l0
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10;
            if (i10 + i11 >= MaxRecyclerAdapter.this.f9575b.getItemCount()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MaxRecyclerAdapter.this.f9581h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f9581h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.a.getAdjustedPosition(i10);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.a.insertItem(adjustedPosition);
                }
                MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.l0
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.l0
        public void onItemRangeRemoved(int i10, int i11) {
            boolean z10;
            int itemCount = MaxRecyclerAdapter.this.f9575b.getItemCount();
            if (i10 + i11 >= itemCount) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (MaxRecyclerAdapter.this.f9581h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f9581h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.a.getAdjustedPosition(i10);
                int adjustedCount = MaxRecyclerAdapter.this.a.getAdjustedCount(itemCount + i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.a.removeItem(adjustedPosition);
                }
                int adjustedCount2 = MaxRecyclerAdapter.this.a.getAdjustedCount(itemCount);
                int i13 = adjustedCount - adjustedCount2;
                Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.a.clearTrailingAds(adjustedCount2 - 1);
                if (!clearTrailingAds.isEmpty()) {
                    i13 += clearTrailingAds.size();
                }
                MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i13 - i11), i13);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, j0 j0Var, Activity activity) {
        b bVar = new b(this, null);
        this.f9576c = bVar;
        this.f9580g = 8;
        this.f9581h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(j0Var.hasStableIds());
        this.f9575b = j0Var;
        j0Var.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f9575b.unregisterAdapterDataObserver(this.f9576c);
        } catch (Exception unused) {
        }
        this.a.destroy();
        el elVar = this.f9578e;
        if (elVar != null) {
            elVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.a;
    }

    public int getAdjustedPosition(int i10) {
        return this.a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.j0
    public int getItemCount() {
        return this.a.getAdjustedCount(this.f9575b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.j0
    public long getItemId(int i10) {
        if (!this.f9575b.hasStableIds()) {
            return -1L;
        }
        if (this.a.isFilledPosition(i10)) {
            return this.a.getAdItemId(i10);
        }
        return this.f9575b.getItemId(this.a.getOriginalPosition(i10));
    }

    @Override // androidx.recyclerview.widget.j0
    public int getItemViewType(int i10) {
        if (this.a.isAdPosition(i10)) {
            return -42;
        }
        return this.f9575b.getItemViewType(this.a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9579f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f9579f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f9579f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9579f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.j0
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f9577d = recyclerView;
        el elVar = new el(recyclerView);
        this.f9578e = elVar;
        elVar.a(new a());
    }

    @Override // androidx.recyclerview.widget.j0
    public void onBindViewHolder(@NonNull o1 o1Var, int i10) {
        int dpToPx;
        int dpToPx2;
        this.f9578e.a(o1Var.itemView, i10);
        if (this.a.isAdPosition(i10)) {
            AppLovinSdkUtils.Size adSize = this.a.getAdSize(i10, a(i10));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) o1Var).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                if (adSize.getWidth() < 0) {
                    dpToPx = adSize.getWidth();
                } else {
                    dpToPx = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                }
                layoutParams.width = dpToPx;
                if (adSize.getHeight() < 0) {
                    dpToPx2 = adSize.getHeight();
                } else {
                    dpToPx2 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                }
                layoutParams.height = dpToPx2;
                containerView.setLayoutParams(layoutParams);
                this.a.renderAd(i10, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f9575b.onBindViewHolder(o1Var, this.a.getOriginalPosition(i10));
    }

    @Override // androidx.recyclerview.widget.j0
    @NonNull
    public o1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            v0 layoutManager = this.f9577d.getLayoutManager();
            if (layoutManager != null && layoutManager.canScrollHorizontally()) {
                layoutParams.width = -2;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            inflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(inflate);
        }
        return this.f9575b.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.j0
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f9577d = null;
        el elVar = this.f9578e;
        if (elVar != null) {
            elVar.a();
            this.f9578e = null;
        }
    }

    @Override // androidx.recyclerview.widget.j0
    public boolean onFailedToRecycleView(@NonNull o1 o1Var) {
        if (o1Var instanceof MaxAdRecyclerViewHolder) {
            return false;
        }
        return this.f9575b.onFailedToRecycleView(o1Var);
    }

    @Override // androidx.recyclerview.widget.j0
    public void onViewAttachedToWindow(@NonNull o1 o1Var) {
        if (o1Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.f9575b.onViewAttachedToWindow(o1Var);
    }

    @Override // androidx.recyclerview.widget.j0
    public void onViewDetachedFromWindow(@NonNull o1 o1Var) {
        if (o1Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.f9575b.onViewDetachedFromWindow(o1Var);
    }

    @Override // androidx.recyclerview.widget.j0
    public void onViewRecycled(@NonNull o1 o1Var) {
        el elVar = this.f9578e;
        if (elVar != null) {
            elVar.b(o1Var.itemView);
        }
        if (o1Var instanceof MaxAdRecyclerViewHolder) {
            if (this.a.isFilledPosition(o1Var.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) o1Var).getContainerView().removeAllViews();
                return;
            }
            return;
        }
        this.f9575b.onViewRecycled(o1Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f9581h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.j0
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f9575b.unregisterAdapterDataObserver(this.f9576c);
        this.f9575b.setHasStableIds(z10);
        this.f9575b.registerAdapterDataObserver(this.f9576c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f9579f = listener;
    }

    public void setLookAhead(int i10) {
        this.f9580g = i10;
    }

    private int a(int i10) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f9577d.getContext(), this.f9577d.getWidth());
        v0 layoutManager = this.f9577d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int spanCount = gridLayoutManager.getSpanCount();
        gridLayoutManager.getSpanSizeLookup().getClass();
        return (pxToDp / spanCount) * 1;
    }
}
