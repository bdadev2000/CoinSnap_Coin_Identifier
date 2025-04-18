package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.hl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* loaded from: classes2.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f28468a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView.Adapter f28469b;

    /* renamed from: c, reason: collision with root package name */
    private final b f28470c;
    private RecyclerView d;
    private hl e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f28471f;

    /* renamed from: g, reason: collision with root package name */
    private int f28472g;

    /* renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f28473h;

    /* loaded from: classes2.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* loaded from: classes2.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f28475a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f28475a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f28475a;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements hl.a {
        public a() {
        }

        @Override // com.applovin.impl.hl.a
        public void a(int i2, int i3) {
            MaxRecyclerAdapter.this.f28468a.updateFillablePositions(i2, Math.min(MaxRecyclerAdapter.this.f28472g + i3, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* loaded from: classes2.dex */
    public class b extends RecyclerView.AdapterDataObserver {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i2, int i3) {
            int adjustedPosition = MaxRecyclerAdapter.this.f28468a.getAdjustedPosition(i2);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f28468a.getAdjustedPosition((i2 + i3) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i2, int i3) {
            boolean z2 = i2 + i3 >= MaxRecyclerAdapter.this.f28469b.getItemCount();
            if (MaxRecyclerAdapter.this.f28473h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f28473h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f28468a.getAdjustedPosition(i2);
            for (int i4 = 0; i4 < i3; i4++) {
                MaxRecyclerAdapter.this.f28468a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i2, int i3, int i4) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i2, int i3) {
            int itemCount = MaxRecyclerAdapter.this.f28469b.getItemCount();
            boolean z2 = i2 + i3 >= itemCount;
            if (MaxRecyclerAdapter.this.f28473h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f28473h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z2)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f28468a.getAdjustedPosition(i2);
            int adjustedCount = MaxRecyclerAdapter.this.f28468a.getAdjustedCount(itemCount + i3);
            for (int i4 = 0; i4 < i3; i4++) {
                MaxRecyclerAdapter.this.f28468a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f28468a.getAdjustedCount(itemCount);
            int i5 = adjustedCount - adjustedCount2;
            Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f28468a.clearTrailingAds(adjustedCount2 - 1);
            if (!clearTrailingAds.isEmpty()) {
                i5 += clearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i5 - i3), i5);
        }

        public /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        b bVar = new b(this, null);
        this.f28470c = bVar;
        this.f28472g = 8;
        this.f28473h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f28468a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f28469b = adapter;
        adapter.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f28469b.unregisterAdapterDataObserver(this.f28470c);
        } catch (Exception unused) {
        }
        this.f28468a.destroy();
        hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f28468a;
    }

    public int getAdjustedPosition(int i2) {
        return this.f28468a.getAdjustedPosition(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f28468a.getAdjustedCount(this.f28469b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        if (this.f28469b.hasStableIds()) {
            return this.f28468a.isFilledPosition(i2) ? this.f28468a.getAdItemId(i2) : this.f28469b.getItemId(this.f28468a.getOriginalPosition(i2));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (this.f28468a.isAdPosition(i2)) {
            return -42;
        }
        return this.f28469b.getItemViewType(this.f28468a.getOriginalPosition(i2));
    }

    public int getOriginalPosition(int i2) {
        return this.f28468a.getOriginalPosition(i2);
    }

    public void loadAds() {
        this.f28468a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f28471f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i2) {
        notifyItemChanged(i2);
        MaxAdPlacer.Listener listener = this.f28471f;
        if (listener != null) {
            listener.onAdLoaded(i2);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i2) {
        MaxAdPlacer.Listener listener = this.f28471f;
        if (listener != null) {
            listener.onAdRemoved(i2);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f28471f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.d = recyclerView;
        hl hlVar = new hl(recyclerView);
        this.e = hlVar;
        hlVar.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2) {
        this.e.a(viewHolder.itemView, i2);
        if (!this.f28468a.isAdPosition(i2)) {
            this.f28469b.onBindViewHolder(viewHolder, this.f28468a.getOriginalPosition(i2));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f28468a.getAdSize(i2, a(i2));
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f28468a.renderAd(i2, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        if (i2 != -42) {
            return this.f28469b.onCreateViewHolder(viewGroup, i2);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        inflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.d = null;
        hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.a();
            this.e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f28469b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f28469b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f28469b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        hl hlVar = this.e;
        if (hlVar != null) {
            hlVar.b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof MaxAdRecyclerViewHolder)) {
            this.f28469b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f28468a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f28473h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z2) {
        super.setHasStableIds(z2);
        this.f28469b.unregisterAdapterDataObserver(this.f28470c);
        this.f28469b.setHasStableIds(z2);
        this.f28469b.registerAdapterDataObserver(this.f28470c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f28471f = listener;
    }

    public void setLookAhead(int i2) {
        this.f28472g = i2;
    }

    private int a(int i2) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.d.getContext(), this.d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).f21125a : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i3 = gridLayoutManager.f21012b;
        gridLayoutManager.f21015g.getClass();
        return pxToDp / i3;
    }
}
