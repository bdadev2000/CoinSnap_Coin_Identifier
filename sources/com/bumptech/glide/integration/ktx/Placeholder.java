package com.bumptech.glide.integration.ktx;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flows.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bumptech/glide/integration/ktx/Placeholder;", "ResourceT", "Lcom/bumptech/glide/integration/ktx/GlideFlowInstant;", "status", "Lcom/bumptech/glide/integration/ktx/Status;", "placeholder", "Landroid/graphics/drawable/Drawable;", "(Lcom/bumptech/glide/integration/ktx/Status;Landroid/graphics/drawable/Drawable;)V", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "getStatus", "()Lcom/bumptech/glide/integration/ktx/Status;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ktx_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final /* data */ class Placeholder<ResourceT> extends GlideFlowInstant<ResourceT> {
    private final Drawable placeholder;
    private final Status status;

    /* compiled from: Flows.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCEEDED.ordinal()] = 1;
            iArr[Status.CLEARED.ordinal()] = 2;
            iArr[Status.RUNNING.ordinal()] = 3;
            iArr[Status.FAILED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Placeholder copy$default(Placeholder placeholder, Status status, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            status = placeholder.getStatus();
        }
        if ((i & 2) != 0) {
            drawable = placeholder.placeholder;
        }
        return placeholder.copy(status, drawable);
    }

    public final Status component1() {
        return getStatus();
    }

    /* renamed from: component2, reason: from getter */
    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    public final Placeholder<ResourceT> copy(Status status, Drawable placeholder) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new Placeholder<>(status, placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) other;
        return getStatus() == placeholder.getStatus() && Intrinsics.areEqual(this.placeholder, placeholder.placeholder);
    }

    public int hashCode() {
        int hashCode = getStatus().hashCode() * 31;
        Drawable drawable = this.placeholder;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public String toString() {
        return "Placeholder(status=" + getStatus() + ", placeholder=" + this.placeholder + ')';
    }

    @Override // com.bumptech.glide.integration.ktx.GlideFlowInstant
    public Status getStatus() {
        return this.status;
    }

    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placeholder(Status status, Drawable drawable) {
        super(null);
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.placeholder = drawable;
        int i = WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
