package androidx.recyclerview.widget;

import android.database.Observable;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.List;

/* loaded from: classes.dex */
public abstract class J {
    private final K mObservable = new Observable();
    private boolean mHasStableIds = false;
    private I mStateRestorationPolicy = I.b;

    public final void bindViewHolder(@NonNull p0 p0Var, int i9) {
        boolean z8;
        if (p0Var.mBindingAdapter == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            p0Var.mPosition = i9;
            if (hasStableIds()) {
                p0Var.mItemId = getItemId(i9);
            }
            p0Var.setFlags(1, 519);
            int i10 = P.n.f2266a;
            Trace.beginSection("RV OnBindView");
        }
        p0Var.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (p0Var.itemView.getParent() == null && ViewCompat.isAttachedToWindow(p0Var.itemView) != p0Var.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + p0Var.isTmpDetached() + ", attached to window: " + ViewCompat.isAttachedToWindow(p0Var.itemView) + ", holder: " + p0Var);
            }
            if (p0Var.itemView.getParent() == null && ViewCompat.isAttachedToWindow(p0Var.itemView)) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + p0Var);
            }
        }
        onBindViewHolder(p0Var, i9, p0Var.getUnmodifiedPayloads());
        if (z8) {
            p0Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = p0Var.itemView.getLayoutParams();
            if (layoutParams instanceof X) {
                ((X) layoutParams).f4948c = true;
            }
            int i11 = P.n.f2266a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int ordinal = this.mStateRestorationPolicy.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            return true;
        }
        if (getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    @NonNull
    public final p0 createViewHolder(@NonNull ViewGroup viewGroup, int i9) {
        try {
            int i10 = P.n.f2266a;
            Trace.beginSection("RV CreateView");
            p0 onCreateViewHolder = onCreateViewHolder(viewGroup, i9);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i9;
                Trace.endSection();
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            int i11 = P.n.f2266a;
            Trace.endSection();
            throw th;
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull J j7, @NonNull p0 p0Var, int i9) {
        if (j7 == this) {
            return i9;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i9) {
        return -1L;
    }

    public int getItemViewType(int i9) {
        return 0;
    }

    @NonNull
    public final I getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i9) {
        this.mObservable.d(i9, 1, null);
    }

    public final void notifyItemInserted(int i9) {
        this.mObservable.e(i9, 1);
    }

    public final void notifyItemMoved(int i9, int i10) {
        this.mObservable.c(i9, i10);
    }

    public final void notifyItemRangeChanged(int i9, int i10) {
        this.mObservable.d(i9, i10, null);
    }

    public final void notifyItemRangeInserted(int i9, int i10) {
        this.mObservable.e(i9, i10);
    }

    public final void notifyItemRangeRemoved(int i9, int i10) {
        this.mObservable.f(i9, i10);
    }

    public final void notifyItemRemoved(int i9) {
        this.mObservable.f(i9, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(p0 p0Var, int i9);

    public void onBindViewHolder(@NonNull p0 p0Var, int i9, @NonNull List<Object> list) {
        onBindViewHolder(p0Var, i9);
    }

    public abstract p0 onCreateViewHolder(ViewGroup viewGroup, int i9);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(p0 p0Var) {
        return false;
    }

    public void onViewAttachedToWindow(p0 p0Var) {
    }

    public void onViewDetachedFromWindow(p0 p0Var) {
    }

    public void onViewRecycled(p0 p0Var) {
    }

    public void registerAdapterDataObserver(@NonNull L l) {
        this.mObservable.registerObserver(l);
    }

    public void setHasStableIds(boolean z8) {
        if (!hasObservers()) {
            this.mHasStableIds = z8;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(@NonNull I i9) {
        this.mStateRestorationPolicy = i9;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull L l) {
        this.mObservable.unregisterObserver(l);
    }

    public final void notifyItemChanged(int i9, @Nullable Object obj) {
        this.mObservable.d(i9, 1, obj);
    }

    public final void notifyItemRangeChanged(int i9, int i10, @Nullable Object obj) {
        this.mObservable.d(i9, i10, obj);
    }
}
