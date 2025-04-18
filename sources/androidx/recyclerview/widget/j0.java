package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j0 {
    private final k0 mObservable = new k0();
    private boolean mHasStableIds = false;
    private i0 mStateRestorationPolicy = i0.ALLOW;

    public final void bindViewHolder(@NonNull o1 o1Var, int i10) {
        boolean z10;
        if (o1Var.mBindingAdapter == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            o1Var.mPosition = i10;
            if (hasStableIds()) {
                o1Var.mItemId = getItemId(i10);
            }
            o1Var.setFlags(1, 519);
            int i11 = j0.n.a;
            Trace.beginSection("RV OnBindView");
        }
        o1Var.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (o1Var.itemView.getParent() == null && ViewCompat.isAttachedToWindow(o1Var.itemView) != o1Var.isTmpDetached()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + o1Var.isTmpDetached() + ", attached to window: " + ViewCompat.isAttachedToWindow(o1Var.itemView) + ", holder: " + o1Var);
            }
            if (o1Var.itemView.getParent() == null && ViewCompat.isAttachedToWindow(o1Var.itemView)) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + o1Var);
            }
        }
        onBindViewHolder(o1Var, i10, o1Var.getUnmodifiedPayloads());
        if (z10) {
            o1Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = o1Var.itemView.getLayoutParams();
            if (layoutParams instanceof w0) {
                ((w0) layoutParams).f2060c = true;
            }
            int i12 = j0.n.a;
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
    public final o1 createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        try {
            int i11 = j0.n.a;
            Trace.beginSection("RV CreateView");
            o1 onCreateViewHolder = onCreateViewHolder(viewGroup, i10);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i10;
                Trace.endSection();
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th2) {
            int i12 = j0.n.a;
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull j0 j0Var, @NonNull o1 o1Var, int i10) {
        if (j0Var == this) {
            return i10;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i10) {
        return -1L;
    }

    public int getItemViewType(int i10) {
        return 0;
    }

    @NonNull
    public final i0 getStateRestorationPolicy() {
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

    public final void notifyItemChanged(int i10) {
        this.mObservable.d(i10, 1, null);
    }

    public final void notifyItemInserted(int i10) {
        this.mObservable.e(i10, 1);
    }

    public final void notifyItemMoved(int i10, int i11) {
        this.mObservable.c(i10, i11);
    }

    public final void notifyItemRangeChanged(int i10, int i11) {
        this.mObservable.d(i10, i11, null);
    }

    public final void notifyItemRangeInserted(int i10, int i11) {
        this.mObservable.e(i10, i11);
    }

    public final void notifyItemRangeRemoved(int i10, int i11) {
        this.mObservable.f(i10, i11);
    }

    public final void notifyItemRemoved(int i10) {
        this.mObservable.f(i10, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(o1 o1Var, int i10);

    public void onBindViewHolder(@NonNull o1 o1Var, int i10, @NonNull List<Object> list) {
        onBindViewHolder(o1Var, i10);
    }

    public abstract o1 onCreateViewHolder(ViewGroup viewGroup, int i10);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(o1 o1Var) {
        return false;
    }

    public void onViewAttachedToWindow(o1 o1Var) {
    }

    public void onViewDetachedFromWindow(o1 o1Var) {
    }

    public void onViewRecycled(o1 o1Var) {
    }

    public void registerAdapterDataObserver(@NonNull l0 l0Var) {
        this.mObservable.registerObserver(l0Var);
    }

    public void setHasStableIds(boolean z10) {
        if (!hasObservers()) {
            this.mHasStableIds = z10;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(@NonNull i0 i0Var) {
        this.mStateRestorationPolicy = i0Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull l0 l0Var) {
        this.mObservable.unregisterObserver(l0Var);
    }

    public final void notifyItemChanged(int i10, @Nullable Object obj) {
        this.mObservable.d(i10, 1, obj);
    }

    public final void notifyItemRangeChanged(int i10, int i11, @Nullable Object obj) {
        this.mObservable.d(i10, i11, obj);
    }
}
