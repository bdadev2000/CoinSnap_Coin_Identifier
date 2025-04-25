package com.glority.android.picturexx.extensions;

import com.glority.android.picturexx.business.R;
import com.picturecoin.generatedAPI.kotlinAPI.enums.MetalType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetalTypeExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getTitleResource", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/enums/MetalType;", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MetalTypeExtKt {

    /* compiled from: MetalTypeExt.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MetalType.values().length];
            try {
                iArr[MetalType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetalType.GOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MetalType.SILVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MetalType.PLATINUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MetalType.PALLADIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getTitleResource(MetalType metalType) {
        Intrinsics.checkNotNullParameter(metalType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[metalType.ordinal()];
        if (i == 1) {
            return R.string.text_unknown;
        }
        if (i == 2) {
            return R.string.id_price_metal_gold;
        }
        if (i == 3) {
            return R.string.id_price_metal_silver;
        }
        if (i == 4) {
            return R.string.id_price_metal_platinum;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return R.string.id_price_metal_palladium;
    }
}
