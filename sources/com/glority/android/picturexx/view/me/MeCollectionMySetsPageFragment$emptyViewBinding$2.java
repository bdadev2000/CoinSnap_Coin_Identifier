package com.glority.android.picturexx.view.me;

import android.view.View;
import android.widget.LinearLayout;
import com.glority.android.picturexx.business.databinding.LayoutNoneCustomSeriesEmptyViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeCollectionMySetsPageFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/glority/android/picturexx/business/databinding/LayoutNoneCustomSeriesEmptyViewBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionMySetsPageFragment$emptyViewBinding$2 extends Lambda implements Function0<LayoutNoneCustomSeriesEmptyViewBinding> {
    final /* synthetic */ MeCollectionMySetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionMySetsPageFragment$emptyViewBinding$2(MeCollectionMySetsPageFragment meCollectionMySetsPageFragment) {
        super(0);
        this.this$0 = meCollectionMySetsPageFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LayoutNoneCustomSeriesEmptyViewBinding invoke() {
        LayoutNoneCustomSeriesEmptyViewBinding inflate = LayoutNoneCustomSeriesEmptyViewBinding.inflate(this.this$0.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        LinearLayout linearLayout = inflate.llEmptySeriesCreateNew;
        final MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = this.this$0;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$emptyViewBinding$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeCollectionMySetsPageFragment$emptyViewBinding$2.invoke$lambda$0(MeCollectionMySetsPageFragment.this, view);
            }
        });
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(MeCollectionMySetsPageFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.createSeries();
    }
}
