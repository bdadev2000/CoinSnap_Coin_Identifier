package com.glority.android.base.aws.s3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/glority/android/base/aws/s3/Scope;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ITEM", "SUPPORT", "DIAGNOSIS", "ITEM_NOTES", "GARDEN_NOTES", "INSECT", "BIRD", "TREE_RING", "COLLECTION_ORIGINAL", "USER_ORIGINAL", "USER_PROCESSED", "USER_EXPORT", "USER_OTHER", "USER_COUNTER", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public enum Scope {
    ITEM("item/original_url"),
    SUPPORT("support/support"),
    DIAGNOSIS("diagnosis/diagnosis"),
    ITEM_NOTES("item/notes"),
    GARDEN_NOTES("garden/notes"),
    INSECT("recognize/insect"),
    BIRD("recognize/bird"),
    TREE_RING("recognize/tree_ring"),
    COLLECTION_ORIGINAL("collection/original"),
    USER_ORIGINAL("user/original_url"),
    USER_PROCESSED("user/processed_url"),
    USER_EXPORT("user/export_url"),
    USER_OTHER("user/other_url"),
    USER_COUNTER("user/counter_url");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String value;

    Scope(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: Scope.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/base/aws/s3/Scope$Companion;", "", "()V", "fromValue", "Lcom/glority/android/base/aws/s3/Scope;", "value", "", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Scope fromValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Scope[] values = Scope.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                Scope scope = values[i];
                i++;
                if (Intrinsics.areEqual(scope.getValue(), value)) {
                    return scope;
                }
            }
            return null;
        }
    }
}
