package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.W;
import androidx.recyclerview.widget.p0;
import com.applovin.impl.el;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends J implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f12752a;
    private final J b;

    /* renamed from: c, reason: collision with root package name */
    private final b f12753c;

    /* renamed from: d, reason: collision with root package name */
    private RecyclerView f12754d;

    /* renamed from: e, reason: collision with root package name */
    private el f12755e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f12756f;

    /* renamed from: g, reason: collision with root package name */
    private int f12757g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f12758h;

    /* loaded from: classes.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* loaded from: classes.dex */
    public static class MaxAdRecyclerViewHolder extends p0 {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f12760a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f12760a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f12760a;
        }
    }

    /* loaded from: classes.dex */
    public class a implements el.a {
        public a() {
        }

        @Override // com.applovin.impl.el.a
        public void a(int i9, int i10) {
            MaxRecyclerAdapter.this.f12752a.updateFillablePositions(i9, Math.min(MaxRecyclerAdapter.this.f12757g + i10, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, J j7, Activity activity) {
        b bVar = new b(this, null);
        this.f12753c = bVar;
        this.f12757g = 8;
        this.f12758h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f12752a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(j7.hasStableIds());
        this.b = j7;
        j7.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.b.unregisterAdapterDataObserver(this.f12753c);
        } catch (Exception unused) {
        }
        this.f12752a.destroy();
        el elVar = this.f12755e;
        if (elVar != null) {
            elVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f12752a;
    }

    public int getAdjustedPosition(int i9) {
        return this.f12752a.getAdjustedPosition(i9);
    }

    @Override // androidx.recyclerview.widget.J
    public int getItemCount() {
        return this.f12752a.getAdjustedCount(this.b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.J
    public long getItemId(int i9) {
        if (!this.b.hasStableIds()) {
            return -1L;
        }
        if (this.f12752a.isFilledPosition(i9)) {
            return this.f12752a.getAdItemId(i9);
        }
        return this.b.getItemId(this.f12752a.getOriginalPosition(i9));
    }

    @Override // androidx.recyclerview.widget.J
    public int getItemViewType(int i9) {
        if (this.f12752a.isAdPosition(i9)) {
            return -42;
        }
        return this.b.getItemViewType(this.f12752a.getOriginalPosition(i9));
    }

    public int getOriginalPosition(int i9) {
        return this.f12752a.getOriginalPosition(i9);
    }

    public void loadAds() {
        this.f12752a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f12756f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i9) {
        notifyItemChanged(i9);
        MaxAdPlacer.Listener listener = this.f12756f;
        if (listener != null) {
            listener.onAdLoaded(i9);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i9) {
        MaxAdPlacer.Listener listener = this.f12756f;
        if (listener != null) {
            listener.onAdRemoved(i9);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f12756f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.J
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f12754d = recyclerView;
        el elVar = new el(recyclerView);
        this.f12755e = elVar;
        elVar.a(new a());
    }

    @Override // androidx.recyclerview.widget.J
    public void onBindViewHolder(@NonNull p0 p0Var, int i9) {
        int dpToPx;
        int dpToPx2;
        this.f12755e.a(p0Var.itemView, i9);
        if (this.f12752a.isAdPosition(i9)) {
            AppLovinSdkUtils.Size adSize = this.f12752a.getAdSize(i9, a(i9));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) p0Var).getContainerView();
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
                this.f12752a.renderAd(i9, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.b.onBindViewHolder(p0Var, this.f12752a.getOriginalPosition(i9));
    }

    @Override // androidx.recyclerview.widget.J
    @NonNull
    public p0 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i9) {
        if (i9 == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            W layoutManager = this.f12754d.getLayoutManager();
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
        return this.b.onCreateViewHolder(viewGroup, i9);
    }

    @Override // androidx.recyclerview.widget.J
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f12754d = null;
        el elVar = this.f12755e;
        if (elVar != null) {
            elVar.a();
            this.f12755e = null;
        }
    }

    @Override // androidx.recyclerview.widget.J
    public boolean onFailedToRecycleView(@NonNull p0 p0Var) {
        if (p0Var instanceof MaxAdRecyclerViewHolder) {
            return false;
        }
        return this.b.onFailedToRecycleView(p0Var);
    }

    @Override // androidx.recyclerview.widget.J
    public void onViewAttachedToWindow(@NonNull p0 p0Var) {
        if (p0Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.b.onViewAttachedToWindow(p0Var);
    }

    @Override // androidx.recyclerview.widget.J
    public void onViewDetachedFromWindow(@NonNull p0 p0Var) {
        if (p0Var instanceof MaxAdRecyclerViewHolder) {
            return;
        }
        this.b.onViewDetachedFromWindow(p0Var);
    }

    @Override // androidx.recyclerview.widget.J
    public void onViewRecycled(@NonNull p0 p0Var) {
        el elVar = this.f12755e;
        if (elVar != null) {
            elVar.b(p0Var.itemView);
        }
        if (p0Var instanceof MaxAdRecyclerViewHolder) {
            if (this.f12752a.isFilledPosition(p0Var.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) p0Var).getContainerView().removeAllViews();
                return;
            }
            return;
        }
        this.b.onViewRecycled(p0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f12758h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.J
    public void setHasStableIds(boolean z8) {
        super.setHasStableIds(z8);
        this.b.unregisterAdapterDataObserver(this.f12753c);
        this.b.setHasStableIds(z8);
        this.b.registerAdapterDataObserver(this.f12753c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f12756f = listener;
    }

    public void setLookAhead(int i9) {
        this.f12757g = i9;
    }

    /* loaded from: classes.dex */
    public class b extends L {
        private b() {
        }

        @Override // androidx.recyclerview.widget.L
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.L
        public void onItemRangeChanged(int i9, int i10) {
            int adjustedPosition = MaxRecyclerAdapter.this.f12752a.getAdjustedPosition(i9);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f12752a.getAdjustedPosition((i9 + i10) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.L
        public void onItemRangeInserted(int i9, int i10) {
            boolean z8;
            if (i9 + i10 >= MaxRecyclerAdapter.this.b.getItemCount()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (MaxRecyclerAdapter.this.f12758h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f12758h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z8)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f12752a.getAdjustedPosition(i9);
                for (int i11 = 0; i11 < i10; i11++) {
                    MaxRecyclerAdapter.this.f12752a.insertItem(adjustedPosition);
                }
                MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i10);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.L
        public void onItemRangeMoved(int i9, int i10, int i11) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.L
        public void onItemRangeRemoved(int i9, int i10) {
            boolean z8;
            int itemCount = MaxRecyclerAdapter.this.b.getItemCount();
            if (i9 + i10 >= itemCount) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (MaxRecyclerAdapter.this.f12758h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f12758h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z8)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f12752a.getAdjustedPosition(i9);
                int adjustedCount = MaxRecyclerAdapter.this.f12752a.getAdjustedCount(itemCount + i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    MaxRecyclerAdapter.this.f12752a.removeItem(adjustedPosition);
                }
                int adjustedCount2 = MaxRecyclerAdapter.this.f12752a.getAdjustedCount(itemCount);
                int i12 = adjustedCount - adjustedCount2;
                Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f12752a.clearTrailingAds(adjustedCount2 - 1);
                if (!clearTrailingAds.isEmpty()) {
                    i12 += clearTrailingAds.size();
                }
                MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i12 - i10), i12);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    private int a(int i9) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f12754d.getContext(), this.f12754d.getWidth());
        W layoutManager = this.f12754d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int spanCount = gridLayoutManager.getSpanCount();
        gridLayoutManager.getSpanSizeLookup().getClass();
        return pxToDp / spanCount;
    }
}
