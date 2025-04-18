package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o1 {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

    @NonNull
    public final View itemView;
    j0 mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    o1 mShadowedHolder = null;
    o1 mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    d1 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public o1(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i10) {
        this.mFlags = i10 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        return (this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView);
    }

    public void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
        addFlags(8);
        offsetPosition(i11, z10);
        this.mPosition = i10;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    @Nullable
    public final j0 getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        j0 adapter;
        int adapterPositionInRecyclerView;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i10 = this.mPreLayoutPosition;
        return i10 == -1 ? this.mPosition : i10;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i10 = this.mPreLayoutPosition;
        return i10 == -1 ? this.mPosition : i10;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) == 0) {
            List<Object> list = this.mPayloads;
            if (list != null && list.size() != 0) {
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int i10) {
        return (i10 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView)) {
            return true;
        }
        return false;
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i10, boolean z10) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z10) {
            this.mPreLayoutPosition += i10;
        }
        this.mPosition += i10;
        if (this.itemView.getLayoutParams() != null) {
            ((w0) this.itemView.getLayoutParams()).f2060c = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i10 = this.mPendingAccessibilityState;
        if (i10 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i10;
        } else {
            this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.getImportantForAccessibility(this.itemView);
        }
        recyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i10, int i11) {
        this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
    }

    public final void setIsRecyclable(boolean z10) {
        int i10;
        int i11 = this.mIsRecyclableCount;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.mIsRecyclableCount = i10;
        if (i10 < 0) {
            this.mIsRecyclableCount = 0;
            if (!RecyclerView.sDebugAssertionsEnabled) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z10 && i10 == 1) {
            this.mFlags |= 16;
        } else if (z10 && i10 == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
        }
    }

    public void setScrapContainer(d1 d1Var, boolean z10) {
        this.mScrapContainer = d1Var;
        this.mInChangeScrap = z10;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder n10 = eb.j.n(simpleName, "{");
        n10.append(Integer.toHexString(hashCode()));
        n10.append(" position=");
        n10.append(this.mPosition);
        n10.append(" id=");
        n10.append(this.mItemId);
        n10.append(", oldPos=");
        n10.append(this.mOldPosition);
        n10.append(", pLpos:");
        n10.append(this.mPreLayoutPosition);
        StringBuilder sb2 = new StringBuilder(n10.toString());
        if (isScrap()) {
            sb2.append(" scrap ");
            if (this.mInChangeScrap) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (isInvalid()) {
            sb2.append(" invalid");
        }
        if (!isBound()) {
            sb2.append(" unbound");
        }
        if (needsUpdate()) {
            sb2.append(" update");
        }
        if (isRemoved()) {
            sb2.append(" removed");
        }
        if (shouldIgnore()) {
            sb2.append(" ignored");
        }
        if (isTmpDetached()) {
            sb2.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb2.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }

    public void unScrap() {
        this.mScrapContainer.n(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
