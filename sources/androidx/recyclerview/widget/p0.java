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
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class p0 {
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
    J mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    p0 mShadowedHolder = null;
    p0 mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    C0525e0 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public p0(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(FLAG_ADAPTER_FULLUPDATE);
            return;
        }
        if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i9) {
        this.mFlags = i9 | this.mFlags;
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
        if ((this.mFlags & 16) == 0 && ViewCompat.hasTransientState(this.itemView)) {
            return true;
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int i9, int i10, boolean z8) {
        addFlags(8);
        offsetPosition(i10, z8);
        this.mPosition = i9;
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
    public final J getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        J adapter;
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
        int i9 = this.mPreLayoutPosition;
        if (i9 == -1) {
            return this.mPosition;
        }
        return i9;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i9 = this.mPreLayoutPosition;
        if (i9 == -1) {
            return this.mPosition;
        }
        return i9;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) == 0) {
            List<Object> list = this.mPayloads;
            if (list != null && list.size() != 0) {
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int i9) {
        if ((i9 & this.mFlags) != 0) {
            return true;
        }
        return false;
    }

    public boolean isAdapterPositionUnknown() {
        if ((this.mFlags & 512) == 0 && !isInvalid()) {
            return false;
        }
        return true;
    }

    public boolean isAttachedToTransitionOverlay() {
        if (this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView) {
            return true;
        }
        return false;
    }

    public boolean isBound() {
        if ((this.mFlags & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isInvalid() {
        if ((this.mFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0 && !ViewCompat.hasTransientState(this.itemView)) {
            return true;
        }
        return false;
    }

    public boolean isRemoved() {
        if ((this.mFlags & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean isScrap() {
        if (this.mScrapContainer != null) {
            return true;
        }
        return false;
    }

    public boolean isTmpDetached() {
        if ((this.mFlags & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean isUpdated() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean needsUpdate() {
        if ((this.mFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public void offsetPosition(int i9, boolean z8) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z8) {
            this.mPreLayoutPosition += i9;
        }
        this.mPosition += i9;
        if (this.itemView.getLayoutParams() != null) {
            ((X) this.itemView.getLayoutParams()).f4948c = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i9 = this.mPendingAccessibilityState;
        if (i9 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i9;
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

    public void setFlags(int i9, int i10) {
        this.mFlags = (i9 & i10) | (this.mFlags & (~i10));
    }

    public final void setIsRecyclable(boolean z8) {
        int i9;
        int i10 = this.mIsRecyclableCount;
        if (z8) {
            i9 = i10 - 1;
        } else {
            i9 = i10 + 1;
        }
        this.mIsRecyclableCount = i9;
        if (i9 < 0) {
            this.mIsRecyclableCount = 0;
            if (!RecyclerView.sDebugAssertionsEnabled) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z8 && i9 == 1) {
            this.mFlags |= 16;
        } else if (z8 && i9 == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z8 + ":" + this);
        }
    }

    public void setScrapContainer(C0525e0 c0525e0, boolean z8) {
        this.mScrapContainer = c0525e0;
        this.mInChangeScrap = z8;
    }

    public boolean shouldBeKeptAsChild() {
        if ((this.mFlags & 16) != 0) {
            return true;
        }
        return false;
    }

    public boolean shouldIgnore() {
        if ((this.mFlags & 128) != 0) {
            return true;
        }
        return false;
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
        StringBuilder c9 = AbstractC2965e.c(simpleName, "{");
        c9.append(Integer.toHexString(hashCode()));
        c9.append(" position=");
        c9.append(this.mPosition);
        c9.append(" id=");
        c9.append(this.mItemId);
        c9.append(", oldPos=");
        c9.append(this.mOldPosition);
        c9.append(", pLpos:");
        c9.append(this.mPreLayoutPosition);
        StringBuilder sb = new StringBuilder(c9.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            if (this.mInChangeScrap) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m(this);
    }

    public boolean wasReturnedFromScrap() {
        if ((this.mFlags & 32) != 0) {
            return true;
        }
        return false;
    }
}
