package com.glority.android.picturexx.views;

import com.glority.android.picturexx.business.R;
import com.picturecoin.generatedAPI.kotlinAPI.enums.BestCollectionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CollectionBestVarietiesCardView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"titleResource", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;", "getTitleResource", "(Lcom/picturecoin/generatedAPI/kotlinAPI/enums/BestCollectionType;)I", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionBestVarietiesCardViewKt {

    /* compiled from: CollectionBestVarietiesCardView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BestCollectionType.values().length];
            try {
                iArr[BestCollectionType.MOST_VALUABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BestCollectionType.MOST_ANCIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BestCollectionType.RAREST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getTitleResource(BestCollectionType bestCollectionType) {
        int i = WhenMappings.$EnumSwitchMapping$0[bestCollectionType.ordinal()];
        if (i == 1) {
            return R.string.collection_summary_mostvaluable;
        }
        if (i == 2) {
            return R.string.collection_summary_mostancient;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return R.string.collection_summary_rarest;
    }
}
