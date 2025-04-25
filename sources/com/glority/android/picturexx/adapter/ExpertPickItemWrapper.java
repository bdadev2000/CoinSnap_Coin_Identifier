package com.glority.android.picturexx.adapter;

import com.picturecoin.generatedAPI.kotlinAPI.article.ExpertPick;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpertPicksAdapter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/glority/android/picturexx/adapter/ExpertPickItemWrapper;", "", "expertPick", "Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "expand", "", "<init>", "(Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;Z)V", "getExpertPick", "()Lcom/picturecoin/generatedAPI/kotlinAPI/article/ExpertPick;", "getExpand", "()Z", "setExpand", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class ExpertPickItemWrapper {
    public static final int $stable = 8;
    private boolean expand;
    private final ExpertPick expertPick;

    /* renamed from: component1, reason: from getter */
    public final ExpertPick getExpertPick() {
        return this.expertPick;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    public final ExpertPickItemWrapper copy(ExpertPick expertPick, boolean expand) {
        Intrinsics.checkNotNullParameter(expertPick, "expertPick");
        return new ExpertPickItemWrapper(expertPick, expand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpertPickItemWrapper)) {
            return false;
        }
        ExpertPickItemWrapper expertPickItemWrapper = (ExpertPickItemWrapper) other;
        return Intrinsics.areEqual(this.expertPick, expertPickItemWrapper.expertPick) && this.expand == expertPickItemWrapper.expand;
    }

    public int hashCode() {
        return (this.expertPick.hashCode() * 31) + Boolean.hashCode(this.expand);
    }

    public String toString() {
        return "ExpertPickItemWrapper(expertPick=" + this.expertPick + ", expand=" + this.expand + ")";
    }

    public ExpertPickItemWrapper(ExpertPick expertPick, boolean z) {
        Intrinsics.checkNotNullParameter(expertPick, "expertPick");
        this.expertPick = expertPick;
        this.expand = z;
    }

    public static /* synthetic */ ExpertPickItemWrapper copy$default(ExpertPickItemWrapper expertPickItemWrapper, ExpertPick expertPick, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            expertPick = expertPickItemWrapper.expertPick;
        }
        if ((i & 2) != 0) {
            z = expertPickItemWrapper.expand;
        }
        return expertPickItemWrapper.copy(expertPick, z);
    }

    public final ExpertPick getExpertPick() {
        return this.expertPick;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final void setExpand(boolean z) {
        this.expand = z;
    }
}
